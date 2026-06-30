package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes16.dex */
public final class zzl {

    /* renamed from: zzhb */
    private final java.nio.ByteBuffer f7307x394c3a;

    private zzl(java.nio.ByteBuffer byteBuffer) {
        this.f7307x394c3a = byteBuffer;
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

    public static int zzb(int i17, long j17) {
        return zzk(i17) + (((-128) & j17) == 0 ? 1 : ((-16384) & j17) == 0 ? 2 : ((-2097152) & j17) == 0 ? 3 : ((-268435456) & j17) == 0 ? 4 : ((-34359738368L) & j17) == 0 ? 5 : ((-4398046511104L) & j17) == 0 ? 6 : ((-562949953421312L) & j17) == 0 ? 7 : ((-72057594037927936L) & j17) == 0 ? 8 : (j17 & Long.MIN_VALUE) == 0 ? 9 : 10);
    }

    public static int zze(int i17, int i18) {
        return zzk(i17) + zzi(i18);
    }

    public static int zzg(java.lang.String str) {
        int zza = zza(str);
        return zzm(zza) + zza;
    }

    public static int zzi(int i17) {
        if (i17 >= 0) {
            return zzm(i17);
        }
        return 10;
    }

    private final void zzj(int i17) {
        byte b17 = (byte) i17;
        if (!this.f7307x394c3a.hasRemaining()) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzm(this.f7307x394c3a.position(), this.f7307x394c3a.limit());
        }
        this.f7307x394c3a.put(b17);
    }

    public static int zzk(int i17) {
        return zzm(i17 << 3);
    }

    public static int zzm(int i17) {
        if ((i17 & (-128)) == 0) {
            return 1;
        }
        if ((i17 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i17) == 0) {
            return 3;
        }
        return (i17 & com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55823x6f7d4830) == 0 ? 4 : 5;
    }

    public static int zzn(int i17) {
        return (i17 >> 31) ^ (i17 << 1);
    }

    public final void zzc(byte[] bArr) {
        int length = bArr.length;
        if (this.f7307x394c3a.remaining() < length) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzm(this.f7307x394c3a.position(), this.f7307x394c3a.limit());
        }
        this.f7307x394c3a.put(bArr, 0, length);
    }

    public final void zzd(int i17, int i18) {
        zzf(i17, 0);
        if (i18 >= 0) {
            zzl(i18);
        } else {
            zza(i18);
        }
    }

    public final void zzf(int i17, int i18) {
        zzl((i17 << 3) | i18);
    }

    public final void zzl(int i17) {
        while ((i17 & (-128)) != 0) {
            zzj((i17 & 127) | 128);
            i17 >>>= 7;
        }
        zzj(i17);
    }

    public final void zzr() {
        if (this.f7307x394c3a.remaining() != 0) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Did not write as much data as expected, %s bytes remaining.", java.lang.Integer.valueOf(this.f7307x394c3a.remaining())));
        }
    }

    private zzl(byte[] bArr, int i17, int i18) {
        this(java.nio.ByteBuffer.wrap(bArr, i17, i18));
    }

    public static int zzb(int i17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt zztVar) {
        int zzk = zzk(i17);
        int zzx = zztVar.zzx();
        return zzk + zzm(zzx) + zzx;
    }

    public final void zza(byte b17) {
        if (!this.f7307x394c3a.hasRemaining()) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzm(this.f7307x394c3a.position(), this.f7307x394c3a.limit());
        }
        this.f7307x394c3a.put(b17);
    }

    public static int zzb(int i17, java.lang.String str) {
        return zzk(i17) + zzg(str);
    }

    public final void zza(int i17, float f17) {
        zzf(i17, 5);
        int floatToIntBits = java.lang.Float.floatToIntBits(f17);
        if (this.f7307x394c3a.remaining() < 4) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzm(this.f7307x394c3a.position(), this.f7307x394c3a.limit());
        }
        this.f7307x394c3a.putInt(floatToIntBits);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl zzb(byte[] bArr) {
        return zzb(bArr, 0, bArr.length);
    }

    public final void zza(int i17, long j17) {
        zzf(i17, 0);
        zza(j17);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl zzb(byte[] bArr, int i17, int i18) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzl(bArr, 0, i18);
    }

    public final void zza(int i17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzt zztVar) {
        zzf(i17, 2);
        if (zztVar.f7321x394c44 < 0) {
            zztVar.zzx();
        }
        zzl(zztVar.f7321x394c44);
        zztVar.zza(this);
    }

    public final void zza(int i17, java.lang.String str) {
        zzf(i17, 2);
        try {
            int zzm = zzm(str.length());
            if (zzm != zzm(str.length() * 3)) {
                zzl(zza(str));
                zza(str, this.f7307x394c3a);
                return;
            }
            int position = this.f7307x394c3a.position();
            if (this.f7307x394c3a.remaining() < zzm) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzm(position + zzm, this.f7307x394c3a.limit());
            }
            this.f7307x394c3a.position(position + zzm);
            zza(str, this.f7307x394c3a);
            int position2 = this.f7307x394c3a.position();
            this.f7307x394c3a.position(position);
            zzl((position2 - position) - zzm);
            this.f7307x394c3a.position(position2);
        } catch (java.nio.BufferOverflowException e17) {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzm zzmVar = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzm(this.f7307x394c3a.position(), this.f7307x394c3a.limit());
            zzmVar.initCause(e17);
            throw zzmVar;
        }
    }

    public final void zzb(long j17) {
        if (this.f7307x394c3a.remaining() < 8) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzm(this.f7307x394c3a.position(), this.f7307x394c3a.limit());
        }
        this.f7307x394c3a.putLong(j17);
    }

    private final void zza(long j17) {
        while (((-128) & j17) != 0) {
            zzj((((int) j17) & 127) | 128);
            j17 >>>= 7;
        }
        zzj((int) j17);
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
                        i19 = (charAt2 >>> 6) | com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761;
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
                            array[i17] = (byte) ((charAt4 >>> 6) | com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761);
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
