package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareOatUtil */
/* loaded from: classes13.dex */
public final class C26636x8cc2a345 {
    private static final java.lang.String TAG = "Tinker.OatUtil";

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareOatUtil$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet */
        static final /* synthetic */ int[] f55881x5351f0c2;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.m104661xcee59d22().length];
            f55881x5351f0c2 = iArr;
            try {
                iArr[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.kArm.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f55881x5351f0c2[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.kThumb2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f55881x5351f0c2[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.kArm64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f55881x5351f0c2[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.kX86.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f55881x5351f0c2[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.kX86_64.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f55881x5351f0c2[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.kMips.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f55881x5351f0c2[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.kMips64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f55881x5351f0c2[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.kNone.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareOatUtil$InstructionSet */
    /* loaded from: classes13.dex */
    public enum InstructionSet {
        kNone,
        kArm,
        kArm64,
        kThumb2,
        kX86,
        kX86_64,
        kMips,
        kMips64
    }

    private C26636x8cc2a345() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: getOatFileInstructionSet */
    public static java.lang.String m104657x2507645c(java.io.File file) {
        java.lang.String str;
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc c26633x8dbd5dfc = null;
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc c26633x8dbd5dfc2 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc(file);
            try {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader m104637x5c1268be = c26633x8dbd5dfc2.m104637x5c1268be(".rodata");
                if (m104637x5c1268be == null) {
                    throw new java.io.IOException("Unable to find .rodata section.");
                }
                java.nio.channels.FileChannel m104634x69d8b8cd = c26633x8dbd5dfc2.m104634x69d8b8cd();
                m104634x69d8b8cd.position(m104637x5c1268be.f55856xb44b8b48);
                byte[] bArr = new byte[8];
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.m104633x15077933(m104634x69d8b8cd, java.nio.ByteBuffer.wrap(bArr), "Failed to read oat magic and version.");
                if (bArr[0] != 111 || bArr[1] != 97 || bArr[2] != 116 || bArr[3] != 10) {
                    throw new java.io.IOException(java.lang.String.format("Bad oat magic: %x %x %x %x", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3])));
                }
                java.lang.String str2 = new java.lang.String(bArr, 4, 3, java.nio.charset.Charset.forName("ASCII"));
                try {
                    java.lang.Integer.parseInt(str2);
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(128);
                    allocate.order(c26633x8dbd5dfc2.m104635xe8e2530e());
                    m104634x69d8b8cd.position(m104637x5c1268be.f55856xb44b8b48 + 12);
                    allocate.limit(4);
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.m104633x15077933(m104634x69d8b8cd, allocate, "Failed to read isa num.");
                    int i17 = allocate.getInt();
                    if (i17 < 0 || i17 >= com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.m104661xcee59d22().length) {
                        throw new java.io.IOException("Bad isa num: " + i17);
                    }
                    switch (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.AnonymousClass1.f55881x5351f0c2[com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26636x8cc2a345.InstructionSet.m104661xcee59d22()[i17].ordinal()]) {
                        case 1:
                        case 2:
                            str = "arm";
                            break;
                        case 3:
                            str = "arm64";
                            break;
                        case 4:
                            str = "x86";
                            break;
                        case 5:
                            str = "x86_64";
                            break;
                        case 6:
                            str = "mips";
                            break;
                        case 7:
                            str = "mips64";
                            break;
                        case 8:
                            str = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
                            break;
                        default:
                            throw new java.io.IOException("Should not reach here.");
                    }
                    try {
                        c26633x8dbd5dfc2.close();
                    } catch (java.lang.Exception unused) {
                    }
                    return str;
                } catch (java.lang.NumberFormatException unused2) {
                    throw new java.io.IOException("Bad oat version: ".concat(str2));
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                c26633x8dbd5dfc = c26633x8dbd5dfc2;
                if (c26633x8dbd5dfc != null) {
                    try {
                        c26633x8dbd5dfc.close();
                    } catch (java.lang.Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
