package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzabw {
    private final java.nio.ByteBuffer zzbwv;

    private zzabw(java.nio.ByteBuffer byteBuffer) {
        this.zzbwv = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private static int zza(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i17 = 0;
        int i18 = 0;
        while (i18 < length && charSequence.charAt(i18) < 128) {
            i18++;
        }
        int i19 = length;
        while (true) {
            if (i18 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i18);
            if (charAt < 2048) {
                i19 += (127 - charAt) >>> 31;
                i18++;
            } else {
                int length2 = charSequence.length();
                while (i18 < length2) {
                    char charAt2 = charSequence.charAt(i18);
                    if (charAt2 < 2048) {
                        i17 += (127 - charAt2) >>> 31;
                    } else {
                        i17 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(charSequence, i18) < 65536) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(39);
                                sb6.append("Unpaired surrogate at index ");
                                sb6.append(i18);
                                throw new java.lang.IllegalArgumentException(sb6.toString());
                            }
                            i18++;
                        }
                    }
                    i18++;
                }
                i19 += i17;
            }
        }
        if (i19 >= length) {
            return i19;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(54);
        sb7.append("UTF-8 length does not fit in int: ");
        sb7.append(i19 + 4294967296L);
        throw new java.lang.IllegalArgumentException(sb7.toString());
    }

    private final void zzan(long j17) {
        while (((-128) & j17) != 0) {
            zzap((((int) j17) & 127) | 128);
            j17 >>>= 7;
        }
        zzap((int) j17);
    }

    public static int zzao(int i17) {
        if (i17 >= 0) {
            return zzas(i17);
        }
        return 10;
    }

    private final void zzap(int i17) {
        byte b17 = (byte) i17;
        if (!this.zzbwv.hasRemaining()) {
            throw new com.google.android.gms.internal.measurement.zzabx(this.zzbwv.position(), this.zzbwv.limit());
        }
        this.zzbwv.put(b17);
    }

    public static int zzaq(int i17) {
        return zzas(i17 << 3);
    }

    public static int zzas(int i17) {
        if ((i17 & (-128)) == 0) {
            return 1;
        }
        if ((i17 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i17) == 0) {
            return 3;
        }
        return (i17 & com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHF_MASKPROC) == 0 ? 4 : 5;
    }

    public static int zzb(int i17, com.google.android.gms.internal.measurement.zzace zzaceVar) {
        int zzaq = zzaq(i17);
        int zzvm = zzaceVar.zzvm();
        return zzaq + zzas(zzvm) + zzvm;
    }

    public static int zzc(int i17, long j17) {
        return zzaq(i17) + zzao(j17);
    }

    public static int zzf(int i17, int i18) {
        return zzaq(i17) + zzao(i18);
    }

    public static int zzfm(java.lang.String str) {
        int zza = zza(str);
        return zzas(zza) + zza;
    }

    public static com.google.android.gms.internal.measurement.zzabw zzj(byte[] bArr) {
        return zzb(bArr, 0, bArr.length);
    }

    public final void zzar(int i17) {
        while ((i17 & (-128)) != 0) {
            zzap((i17 & 127) | 128);
            i17 >>>= 7;
        }
        zzap(i17);
    }

    public final void zze(int i17, int i18) {
        zzg(i17, 0);
        if (i18 >= 0) {
            zzar(i18);
        } else {
            zzan(i18);
        }
    }

    public final void zzg(int i17, int i18) {
        zzar((i17 << 3) | i18);
    }

    public final void zzk(byte[] bArr) {
        int length = bArr.length;
        if (this.zzbwv.remaining() < length) {
            throw new com.google.android.gms.internal.measurement.zzabx(this.zzbwv.position(), this.zzbwv.limit());
        }
        this.zzbwv.put(bArr, 0, length);
    }

    public final void zzve() {
        if (this.zzbwv.remaining() != 0) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Did not write as much data as expected, %s bytes remaining.", java.lang.Integer.valueOf(this.zzbwv.remaining())));
        }
    }

    private zzabw(byte[] bArr, int i17, int i18) {
        this(java.nio.ByteBuffer.wrap(bArr, i17, i18));
    }

    public static int zzao(long j17) {
        if (((-128) & j17) == 0) {
            return 1;
        }
        if (((-16384) & j17) == 0) {
            return 2;
        }
        if (((-2097152) & j17) == 0) {
            return 3;
        }
        if (((-268435456) & j17) == 0) {
            return 4;
        }
        if (((-34359738368L) & j17) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j17) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j17) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j17) == 0) {
            return 8;
        }
        return (j17 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static com.google.android.gms.internal.measurement.zzabw zzb(byte[] bArr, int i17, int i18) {
        return new com.google.android.gms.internal.measurement.zzabw(bArr, 0, i18);
    }

    public static int zzc(int i17, java.lang.String str) {
        return zzaq(i17) + zzfm(str);
    }

    public final void zza(int i17, double d17) {
        zzg(i17, 1);
        long doubleToLongBits = java.lang.Double.doubleToLongBits(d17);
        if (this.zzbwv.remaining() < 8) {
            throw new com.google.android.gms.internal.measurement.zzabx(this.zzbwv.position(), this.zzbwv.limit());
        }
        this.zzbwv.putLong(doubleToLongBits);
    }

    public final void zza(int i17, float f17) {
        zzg(i17, 5);
        int floatToIntBits = java.lang.Float.floatToIntBits(f17);
        if (this.zzbwv.remaining() < 4) {
            throw new com.google.android.gms.internal.measurement.zzabx(this.zzbwv.position(), this.zzbwv.limit());
        }
        this.zzbwv.putInt(floatToIntBits);
    }

    public final void zzb(int i17, long j17) {
        zzg(i17, 0);
        zzan(j17);
    }

    public final void zza(int i17, long j17) {
        zzg(i17, 0);
        zzan(j17);
    }

    public final void zzb(int i17, java.lang.String str) {
        zzg(i17, 2);
        try {
            int zzas = zzas(str.length());
            if (zzas != zzas(str.length() * 3)) {
                zzar(zza(str));
                zza(str, this.zzbwv);
                return;
            }
            int position = this.zzbwv.position();
            if (this.zzbwv.remaining() < zzas) {
                throw new com.google.android.gms.internal.measurement.zzabx(position + zzas, this.zzbwv.limit());
            }
            this.zzbwv.position(position + zzas);
            zza(str, this.zzbwv);
            int position2 = this.zzbwv.position();
            this.zzbwv.position(position);
            zzar((position2 - position) - zzas);
            this.zzbwv.position(position2);
        } catch (java.nio.BufferOverflowException e17) {
            com.google.android.gms.internal.measurement.zzabx zzabxVar = new com.google.android.gms.internal.measurement.zzabx(this.zzbwv.position(), this.zzbwv.limit());
            zzabxVar.initCause(e17);
            throw zzabxVar;
        }
    }

    public final void zza(int i17, com.google.android.gms.internal.measurement.zzace zzaceVar) {
        zzg(i17, 2);
        zzb(zzaceVar);
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzace zzaceVar) {
        zzar(zzaceVar.zzvl());
        zzaceVar.zza(this);
    }

    public final void zza(int i17, boolean z17) {
        zzg(i17, 0);
        byte b17 = z17 ? (byte) 1 : (byte) 0;
        if (!this.zzbwv.hasRemaining()) {
            throw new com.google.android.gms.internal.measurement.zzabx(this.zzbwv.position(), this.zzbwv.limit());
        }
        this.zzbwv.put(b17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v26 */
    private static void zza(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        int i17;
        int i18;
        char charAt;
        int i19;
        if (byteBuffer.isReadOnly()) {
            throw new java.nio.ReadOnlyBufferException();
        }
        int i27 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i27 < length) {
                char charAt2 = charSequence.charAt(i27);
                char c17 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        i19 = (charAt2 >>> 6) | com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT;
                    } else {
                        if (charAt2 >= 55296 && 57343 >= charAt2) {
                            int i28 = i27 + 1;
                            if (i28 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i28);
                                if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i27 = i28;
                                    i27++;
                                } else {
                                    i27 = i28;
                                }
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(39);
                            sb6.append("Unpaired surrogate at index ");
                            sb6.append(i27 - 1);
                            throw new java.lang.IllegalArgumentException(sb6.toString());
                        }
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        i19 = ((charAt2 >>> 6) & 63) | 128;
                    }
                    byteBuffer.put((byte) i19);
                    c17 = (charAt2 & '?') | 128;
                }
                byteBuffer.put((byte) c17);
                i27++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i29 = remaining + arrayOffset;
            while (i27 < length2) {
                int i37 = i27 + arrayOffset;
                if (i37 >= i29 || (charAt = charSequence.charAt(i27)) >= 128) {
                    break;
                }
                array[i37] = (byte) charAt;
                i27++;
            }
            if (i27 == length2) {
                i17 = arrayOffset + length2;
            } else {
                i17 = arrayOffset + i27;
                while (i27 < length2) {
                    char charAt4 = charSequence.charAt(i27);
                    if (charAt4 >= 128 || i17 >= i29) {
                        if (charAt4 < 2048 && i17 <= i29 - 2) {
                            int i38 = i17 + 1;
                            array[i17] = (byte) ((charAt4 >>> 6) | com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT);
                            i17 = i38 + 1;
                            array[i38] = (byte) ((charAt4 & '?') | 128);
                        } else {
                            if ((charAt4 >= 55296 && 57343 >= charAt4) || i17 > i29 - 3) {
                                if (i17 > i29 - 4) {
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(37);
                                    sb7.append("Failed writing ");
                                    sb7.append(charAt4);
                                    sb7.append(" at index ");
                                    sb7.append(i17);
                                    throw new java.lang.ArrayIndexOutOfBoundsException(sb7.toString());
                                }
                                int i39 = i27 + 1;
                                if (i39 != charSequence.length()) {
                                    char charAt5 = charSequence.charAt(i39);
                                    if (java.lang.Character.isSurrogatePair(charAt4, charAt5)) {
                                        int codePoint2 = java.lang.Character.toCodePoint(charAt4, charAt5);
                                        int i47 = i17 + 1;
                                        array[i17] = (byte) ((codePoint2 >>> 18) | 240);
                                        int i48 = i47 + 1;
                                        array[i47] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                        int i49 = i48 + 1;
                                        array[i48] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                        i17 = i49 + 1;
                                        array[i49] = (byte) ((codePoint2 & 63) | 128);
                                        i27 = i39;
                                    } else {
                                        i27 = i39;
                                    }
                                }
                                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(39);
                                sb8.append("Unpaired surrogate at index ");
                                sb8.append(i27 - 1);
                                throw new java.lang.IllegalArgumentException(sb8.toString());
                            }
                            int i57 = i17 + 1;
                            array[i17] = (byte) ((charAt4 >>> '\f') | 480);
                            int i58 = i57 + 1;
                            array[i57] = (byte) (((charAt4 >>> 6) & 63) | 128);
                            i18 = i58 + 1;
                            array[i58] = (byte) ((charAt4 & '?') | 128);
                        }
                        i27++;
                    } else {
                        i18 = i17 + 1;
                        array[i17] = (byte) charAt4;
                    }
                    i17 = i18;
                    i27++;
                }
            }
            byteBuffer.position(i17 - byteBuffer.arrayOffset());
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            java.nio.BufferOverflowException bufferOverflowException = new java.nio.BufferOverflowException();
            bufferOverflowException.initCause(e17);
            throw bufferOverflowException;
        }
    }
}
