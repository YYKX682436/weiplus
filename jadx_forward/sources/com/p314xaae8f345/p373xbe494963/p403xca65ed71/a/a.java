package com.p314xaae8f345.p373xbe494963.p403xca65ed71.a;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f128459a = false;

    /* renamed from: com.tencent.liteav.videoconsumer.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes14.dex */
    public interface InterfaceC30882a {
        boolean a(int i17, int i18, int i19, int i27);
    }

    public static byte[] a(byte[] bArr) {
        byte b17;
        byte[] bArr2 = new byte[(bArr.length * 3) / 2];
        int i17 = 0;
        int i18 = 0;
        while (i17 < bArr.length) {
            if (i17 < bArr.length - 2 && (b17 = bArr[i17]) == 0) {
                int i19 = i17 + 1;
                if (bArr[i19] == 0) {
                    int i27 = i17 + 2;
                    if (bArr[i27] <= 3) {
                        int i28 = i18 + 1;
                        bArr2[i18] = b17;
                        int i29 = i28 + 1;
                        bArr2[i28] = bArr[i19];
                        bArr2[i29] = 3;
                        i18 = i29 + 1;
                        i17 = i27;
                    }
                }
            }
            bArr2[i18] = bArr[i17];
            i17++;
            i18++;
        }
        if (i18 == bArr.length) {
            return bArr;
        }
        byte[] bArr3 = new byte[i18];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i18);
        return bArr3;
    }

    public final byte[] a(java.io.InputStream inputStream, com.p314xaae8f345.p373xbe494963.p403xca65ed71.a.a.InterfaceC30882a interfaceC30882a) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.b bVar = new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.b(inputStream, byteArrayOutputStream);
        bVar.b(8);
        int a17 = (int) bVar.a();
        bVar.b(8);
        bVar.a();
        bVar.d();
        boolean z17 = false;
        if (a17 == 100 || a17 == 110 || a17 == 122 || a17 == 144) {
            if (bVar.c() == 3) {
                bVar.b(1);
            }
            bVar.d();
            bVar.d();
            bVar.b(1);
            if (bVar.a(true)) {
                for (int i17 = 0; i17 < 8; i17++) {
                    if (bVar.a(true)) {
                        if (i17 < 6) {
                            bVar.c(16);
                        } else {
                            bVar.c(64);
                        }
                    }
                }
            }
        }
        bVar.d();
        int c17 = bVar.c();
        if (c17 == 0) {
            bVar.d();
        } else if (c17 == 1) {
            bVar.b(1);
            bVar.d();
            bVar.d();
            int c18 = bVar.c();
            for (int i18 = 0; i18 < c18; i18++) {
                bVar.d();
            }
        }
        bVar.c();
        bVar.b(1);
        bVar.d();
        bVar.d();
        if (!bVar.a(true)) {
            bVar.b(1);
        }
        bVar.b(1);
        if (bVar.a(true) && !interfaceC30882a.a(bVar.c(), bVar.c(), bVar.c(), bVar.c())) {
            return null;
        }
        if (bVar.a(false)) {
            bVar.b(true);
            if (bVar.a(true) && ((int) bVar.a()) == 255) {
                bVar.b(16);
                bVar.b(16);
            }
            if (bVar.a(true)) {
                bVar.b(1);
            }
            if (bVar.a(true)) {
                bVar.b(3);
                bVar.b(1);
                if (bVar.a(true)) {
                    bVar.b(8);
                    bVar.b(8);
                    bVar.b(8);
                }
            }
            if (bVar.a(true)) {
                bVar.d();
                bVar.d();
            }
            if (bVar.a(true)) {
                bVar.b(32);
                bVar.b(32);
                bVar.b(1);
            }
            boolean a18 = bVar.a(true);
            if (a18) {
                a(bVar);
            }
            boolean a19 = bVar.a(true);
            if (a19) {
                a(bVar);
            }
            if (a18 || a19) {
                bVar.b(1);
            }
            bVar.b(1);
            if (bVar.a(false)) {
                bVar.b(true);
                bVar.a(true);
                bVar.d();
                bVar.d();
                bVar.d();
                bVar.d();
                bVar.d();
                if (!this.f128459a) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("H264SPSModifier", "decode: do not add max_dec_frame_buffering when it is ".concat(java.lang.String.valueOf(bVar.b())));
                    this.f128459a = true;
                }
            } else {
                bVar.b(true);
                bVar.b(true);
                bVar.d(0);
                bVar.d(0);
                bVar.d(10);
                bVar.d(10);
                bVar.d(0);
                bVar.d(1);
                if (!this.f128459a) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("H264SPSModifier", "decode: add max_dec_frame_buffering 1 when it is no exist");
                    this.f128459a = true;
                }
                z17 = true;
            }
            if (!z17) {
                return null;
            }
        } else {
            bVar.b(true);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(false);
            bVar.b(true);
            bVar.b(true);
            bVar.d(0);
            bVar.d(0);
            bVar.d(10);
            bVar.d(10);
            bVar.d(0);
            bVar.d(1);
            if (!this.f128459a) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("H264SPSModifier", "decode: add max_dec_frame_buffering 1 when vui is no exist");
                this.f128459a = true;
            }
        }
        bVar.e();
        return byteArrayOutputStream.toByteArray();
    }

    private static void a(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.b bVar) {
        int c17 = bVar.c();
        bVar.a(4);
        bVar.a(4);
        for (int i17 = 0; i17 <= c17; i17++) {
            bVar.d();
            bVar.d();
            bVar.a(1);
        }
        bVar.a(5);
        bVar.a(5);
        bVar.a(5);
        bVar.a(5);
    }
}
