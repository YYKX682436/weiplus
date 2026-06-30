package h36;

/* loaded from: classes13.dex */
public class i extends h36.f {
    public i(h36.h hVar) {
        this.f360125e = 2064;
        this.f360126f = 9;
        this.f360127g = hVar;
    }

    public byte[] g(long j17, int i17, long j18, int i18, byte[] bArr, byte[] bArr2, int i19, int i27, long[] jArr, int i28, long j19, int i29, int i37, int i38, int i39, int i47, byte[] bArr3) {
        byte[] bArr4;
        int i48;
        byte[] bArr5;
        byte[] bArr6;
        int i49;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        int i57;
        byte[] bArr10;
        int i58;
        byte[] bArr11;
        h36.h hVar = this.f360127g;
        int i59 = hVar.f360136i;
        hVar.f360133f = j18;
        if (bArr2 == null || bArr2.length < 16) {
            bArr4 = null;
        } else {
            byte[] bArr12 = (byte[]) bArr2.clone();
            int length = bArr12.length - 16;
            byte[] bArr13 = new byte[length];
            java.lang.System.arraycopy(bArr12, 0, bArr13, 0, length);
            byte[] bArr14 = new byte[16];
            this.f360127g.f360129b = bArr14;
            java.lang.System.arraycopy(bArr12, length, bArr14, 0, 16);
            bArr4 = bArr13;
        }
        if (bArr4 == null) {
            return null;
        }
        h36.h hVar2 = this.f360127g;
        byte[] bArr15 = hVar2.f360138k;
        byte[] d17 = hVar2.f360131d.d();
        byte[] bArr16 = this.f360127g.f360141n;
        j36.j0 j0Var = new j36.j0();
        j36.k0 k0Var = new j36.k0();
        j36.o oVar = new j36.o();
        j36.a aVar = new j36.a();
        j36.g gVar = new j36.g();
        byte[] bArr17 = new byte[128];
        byte[] bArr18 = new byte[128];
        j36.d dVar = new j36.d();
        j36.u uVar = new j36.u();
        j36.w wVar = new j36.w();
        j36.a0 a0Var = new j36.a0();
        j36.c0 c0Var = new j36.c0();
        j36.d0 d0Var = new j36.d0();
        j36.f0 f0Var = new j36.f0();
        byte[] bArr19 = new byte[128];
        byte[] i66 = j0Var.i(j17, i59, j18, i18);
        byte[] i67 = k0Var.i(j18, bArr);
        this.f360127g.f360151x = a(bArr4);
        int length2 = bArr4.length;
        int i68 = length2 + 4;
        if (i68 > 128) {
            byte[] bArr20 = new byte[i68 + 128];
            i48 = 0;
            java.lang.System.arraycopy(bArr19, 0, bArr20, 0, 4);
            bArr19 = bArr20;
        } else {
            i48 = 0;
        }
        java.lang.System.arraycopy(bArr4, i48, bArr19, 4, length2);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr19, i48, 262);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr19, 2, length2);
        byte[] bArr21 = new byte[i68];
        java.lang.System.arraycopy(bArr19, i48, bArr21, i48, i68);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.b("req2 a1:", p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.h(bArr21));
        int i69 = i48;
        byte[] i76 = aVar.i(j17, j19, i59, i28);
        byte[] i77 = gVar.i(i37, i38, i39, i47);
        byte[] i78 = oVar.i(i19, i27, jArr);
        byte[] i79 = d0Var.i(this.f360127g.f360138k);
        byte[] bArr22 = new byte[i69];
        byte[] bArr23 = new byte[i69];
        byte[] bArr24 = new byte[i69];
        byte[] bArr25 = new byte[i69];
        if (bArr3.length > 0) {
            int length3 = bArr3.length;
            byte[] bArr26 = new byte[length3];
            bArr6 = bArr23;
            bArr5 = bArr25;
            java.lang.System.arraycopy(bArr3, 0, bArr26, 0, bArr3.length);
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr17, 0, 264);
            int i86 = 0 + 2;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr17, i86, 0);
            int i87 = i86 + 2;
            if (length3 > 128 - 4) {
                bArr11 = new byte[length3 + 4 + 64];
                i58 = 0;
                java.lang.System.arraycopy(bArr17, 0, bArr11, 0, i87);
            } else {
                i58 = 0;
                bArr11 = bArr17;
            }
            java.lang.System.arraycopy(bArr26, i58, bArr11, i87, length3);
            int i88 = i87 + length3;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr11, 2, i88 - 4);
            bArr22 = new byte[i88];
            java.lang.System.arraycopy(bArr11, 0, bArr22, 0, i88);
            i49 = 8;
        } else {
            bArr5 = bArr25;
            bArr6 = bArr23;
            i49 = 7;
        }
        if (bArr15.length > 0) {
            int length4 = bArr15.length;
            byte[] bArr27 = new byte[length4];
            java.lang.System.arraycopy(bArr15, 0, bArr27, 0, bArr15.length);
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr18, 0, 265);
            int i89 = 0 + 2;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr18, i89, 0);
            int i96 = i89 + 2;
            if (length4 > 128 - 4) {
                bArr10 = new byte[length4 + 4 + 64];
                bArr7 = bArr21;
                i57 = 0;
                java.lang.System.arraycopy(bArr18, 0, bArr10, 0, i96);
            } else {
                bArr7 = bArr21;
                i57 = 0;
                bArr10 = bArr18;
            }
            java.lang.System.arraycopy(bArr27, i57, bArr10, i96, length4);
            int i97 = i96 + length4;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr10, 2, i97 - 4);
            bArr8 = new byte[i97];
            java.lang.System.arraycopy(bArr10, 0, bArr8, 0, i97);
        } else {
            bArr7 = bArr21;
            bArr8 = bArr6;
        }
        byte[] bytes = new java.lang.String(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f).getBytes();
        byte[] bytes2 = android.os.Build.VERSION.RELEASE.getBytes();
        h36.h hVar3 = this.f360127g;
        byte[] bArr28 = bArr22;
        byte[] i98 = uVar.i(bytes, bytes2, hVar3.f360140m, hVar3.f360139l, new byte[0], hVar3.f360142o);
        h36.h hVar4 = this.f360127g;
        byte[] i99 = wVar.i(hVar4.f360146s, hVar4.f360147t, hVar4.f360148u, 0, hVar4.f360145r, hVar4.f360138k);
        h36.h hVar5 = this.f360127g;
        byte[] i100 = c0Var.i(bArr8, i98, i99, f0Var.i(j17, hVar5.f360143p, hVar5.f360144q), this.f360127g.f360129b);
        byte[] i101 = a0Var.i(bArr16);
        int i102 = i49 + 1 + 1;
        if (d17.length > 0) {
            bArr9 = dVar.i(d17);
            i102++;
        } else {
            bArr9 = bArr24;
        }
        byte[] bArr29 = new byte[i66.length + i67.length + i68 + i78.length + i76.length + i77.length + bArr28.length + i100.length + bArr9.length + i101.length + 0 + i79.length];
        java.lang.System.arraycopy(i66, 0, bArr29, 0, i66.length);
        int length5 = i66.length + 0;
        java.lang.System.arraycopy(i67, 0, bArr29, length5, i67.length);
        int length6 = length5 + i67.length;
        java.lang.System.arraycopy(bArr7, 0, bArr29, length6, i68);
        int i103 = length6 + i68;
        java.lang.System.arraycopy(i78, 0, bArr29, i103, i78.length);
        int length7 = i103 + i78.length;
        java.lang.System.arraycopy(i76, 0, bArr29, length7, i76.length);
        int length8 = length7 + i76.length;
        java.lang.System.arraycopy(i77, 0, bArr29, length8, i77.length);
        int length9 = length8 + i77.length;
        java.lang.System.arraycopy(bArr28, 0, bArr29, length9, bArr28.length);
        int length10 = length9 + bArr28.length;
        java.lang.System.arraycopy(i100, 0, bArr29, length10, i100.length);
        int length11 = length10 + i100.length;
        java.lang.System.arraycopy(i101, 0, bArr29, length11, i101.length);
        int length12 = length11 + i101.length;
        java.lang.System.arraycopy(bArr5, 0, bArr29, length12, 0);
        int i104 = length12 + 0;
        java.lang.System.arraycopy(bArr9, 0, bArr29, i104, bArr9.length);
        java.lang.System.arraycopy(i79, 0, bArr29, i104 + bArr9.length, i79.length);
        d(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14514x4fe44208, this.f360125e, h36.f.f360120h, j18, 0, 0, i59, 0, b(bArr29, this.f360126f, i102));
        int i105 = this.f360122b;
        byte[] bArr30 = new byte[i105];
        java.lang.System.arraycopy(this.f360124d, 0, bArr30, 0, i105);
        return bArr30;
    }

    public byte[] h(long j17, int i17, long j18, int i18, byte[] bArr, byte[] bArr2, int i19, byte[] bArr3, int i27, int i28, long[] jArr, int i29, long j19, int i37, int i38, int i39, int i47, int i48, byte[] bArr4) {
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        int i49;
        int i57;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        byte[] bArr13;
        int i58;
        byte[] bArr14;
        int i59;
        h36.h hVar = this.f360127g;
        int i66 = hVar.f360136i;
        hVar.f360133f = j18;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.b("IMEI", p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.h(hVar.f360138k));
        h36.h hVar2 = this.f360127g;
        byte[] bArr15 = hVar2.f360129b;
        byte[] bArr16 = hVar2.f360138k;
        byte[] d17 = hVar2.f360131d.d();
        byte[] bArr17 = this.f360127g.f360141n;
        j36.j0 j0Var = new j36.j0();
        j36.k0 k0Var = new j36.k0();
        byte[] bArr18 = new byte[128];
        j36.o oVar = new j36.o();
        j36.a aVar = new j36.a();
        j36.g gVar = new j36.g();
        byte[] bArr19 = new byte[128];
        byte[] bArr20 = new byte[128];
        j36.d dVar = new j36.d();
        j36.u uVar = new j36.u();
        j36.w wVar = new j36.w();
        j36.a0 a0Var = new j36.a0();
        j36.c0 c0Var = new j36.c0();
        j36.d0 d0Var = new j36.d0();
        j36.f0 f0Var = new j36.f0();
        byte[] i67 = j0Var.i(j17, i66, j18, i18);
        byte[] i68 = k0Var.i(j18, bArr);
        h36.h hVar3 = this.f360127g;
        int i69 = hVar3.f360147t;
        byte[] bArr21 = hVar3.f360138k;
        byte[] bArr22 = new byte[90];
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr22, 0, 2);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr22, 2, p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.o());
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr22, 6, 5);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr22, 10, (int) j17);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr22, 14, i66);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.s(bArr22, 18, j18);
        java.lang.System.arraycopy(bArr2, 0, bArr22, 26, bArr2.length);
        int length = bArr2.length + 26;
        java.lang.System.arraycopy(bArr, 0, bArr22, length, bArr.length);
        int length2 = length + bArr.length;
        bArr22[length2 + 0] = (byte) 1;
        int i76 = length2 + 1;
        java.lang.System.arraycopy(bArr3, 0, bArr22, i76, bArr3.length);
        int length3 = i76 + bArr3.length;
        java.lang.System.arraycopy(bArr15, 0, bArr22, length3, bArr15.length);
        int length4 = length3 + bArr15.length;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr22, length4, 0);
        int i77 = length4 + 4;
        bArr22[i77 + 0] = (byte) (i69 >> 0);
        int i78 = i77 + 1;
        if (bArr21 == null || bArr21.length <= 0) {
            byte[] bArr23 = new byte[16];
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr23, 0, p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.o());
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr23, 4, p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.o());
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr23, 8, p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.o());
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr23, 12, p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.o());
        } else {
            java.lang.System.arraycopy(bArr21, 0, bArr22, i78, bArr21.length);
        }
        byte[] bArr24 = new byte[24];
        java.lang.System.arraycopy(bArr3, 0, bArr24, 0, bArr3.length);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.s(bArr24, 16, j18);
        byte[] b17 = k36.e.b(bArr22, 0, 90, k36.d.k(bArr24));
        int length5 = b17.length;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr18, 0, 262);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr18, 2, 0);
        if (length5 > 124) {
            bArr5 = new byte[length5 + 4 + 64];
            java.lang.System.arraycopy(bArr18, 0, bArr5, 0, 4);
        } else {
            bArr5 = bArr18;
        }
        java.lang.System.arraycopy(b17, 0, bArr5, 4, length5);
        int i79 = length5 + 4;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr5, 2, i79 - 4);
        byte[] bArr25 = new byte[i79];
        java.lang.System.arraycopy(bArr5, 0, bArr25, 0, i79);
        h36.h hVar4 = this.f360127g;
        byte[] bArr26 = new byte[length5];
        java.lang.System.arraycopy(bArr5, 4, bArr26, 0, length5);
        hVar4.f360151x = a(bArr26);
        byte[] i86 = aVar.i(j17, j19, i66, i29);
        byte[] i87 = gVar.i(i38, i39, i47, i48);
        byte[] i88 = oVar.i(i27, i28, jArr);
        byte[] i89 = d0Var.i(this.f360127g.f360138k);
        byte[] bArr27 = new byte[0];
        byte[] bArr28 = new byte[0];
        byte[] bArr29 = new byte[0];
        byte[] bArr30 = new byte[0];
        if (bArr4.length > 0) {
            int length6 = bArr4.length;
            bArr6 = bArr28;
            byte[] bArr31 = new byte[length6];
            bArr7 = bArr29;
            i49 = i66;
            java.lang.System.arraycopy(bArr4, 0, bArr31, 0, bArr4.length);
            byte[] bArr32 = bArr19;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr32, 0, 264);
            int i96 = 0 + 2;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr32, i96, 0);
            int i97 = i96 + 2;
            if (length6 > 128 - 4) {
                byte[] bArr33 = new byte[length6 + 4 + 64];
                bArr8 = bArr30;
                i59 = 0;
                java.lang.System.arraycopy(bArr32, 0, bArr33, 0, i97);
                bArr32 = bArr33;
            } else {
                bArr8 = bArr30;
                i59 = 0;
            }
            java.lang.System.arraycopy(bArr31, i59, bArr32, i97, length6);
            int i98 = i97 + length6;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr32, 2, i98 - 4);
            bArr9 = new byte[i98];
            java.lang.System.arraycopy(bArr32, 0, bArr9, 0, i98);
            bArr10 = bArr16;
            i57 = 8;
        } else {
            bArr6 = bArr28;
            bArr7 = bArr29;
            bArr8 = bArr30;
            i49 = i66;
            i57 = 7;
            bArr9 = bArr27;
            bArr10 = bArr16;
        }
        if (bArr10.length > 0) {
            int length7 = bArr10.length;
            byte[] bArr34 = new byte[length7];
            bArr12 = bArr25;
            java.lang.System.arraycopy(bArr10, 0, bArr34, 0, bArr10.length);
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr20, 0, 265);
            int i99 = 0 + 2;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr20, i99, 0);
            int i100 = i99 + 2;
            if (length7 > 128 - 4) {
                bArr14 = new byte[length7 + 4 + 64];
                bArr11 = i89;
                i58 = 0;
                java.lang.System.arraycopy(bArr20, 0, bArr14, 0, i100);
            } else {
                bArr11 = i89;
                i58 = 0;
                bArr14 = bArr20;
            }
            java.lang.System.arraycopy(bArr34, i58, bArr14, i100, length7);
            int i101 = i100 + length7;
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr14, 2, i101 - 4);
            byte[] bArr35 = new byte[i101];
            java.lang.System.arraycopy(bArr14, 0, bArr35, 0, i101);
            bArr6 = bArr35;
        } else {
            bArr11 = i89;
            bArr12 = bArr25;
        }
        byte[] bytes = new java.lang.String(com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f).getBytes();
        byte[] bytes2 = android.os.Build.VERSION.RELEASE.getBytes();
        h36.h hVar5 = this.f360127g;
        byte[] bArr36 = bArr9;
        byte[] i102 = uVar.i(bytes, bytes2, hVar5.f360140m, hVar5.f360139l, new byte[0], hVar5.f360142o);
        h36.h hVar6 = this.f360127g;
        byte[] i103 = wVar.i(hVar6.f360146s, hVar6.f360147t, hVar6.f360148u, 0, hVar6.f360145r, hVar6.f360138k);
        h36.h hVar7 = this.f360127g;
        byte[] i104 = c0Var.i(bArr6, i102, i103, f0Var.i(j17, hVar7.f360143p, hVar7.f360144q), this.f360127g.f360129b);
        byte[] i105 = a0Var.i(bArr17);
        int i106 = i57 + 1 + 1;
        if (d17.length > 0) {
            bArr13 = dVar.i(d17);
            i106++;
        } else {
            bArr13 = bArr7;
        }
        byte[] bArr37 = bArr11;
        byte[] bArr38 = new byte[i67.length + i68.length + i79 + i88.length + i86.length + i87.length + bArr36.length + i104.length + bArr13.length + i105.length + 0 + bArr37.length];
        java.lang.System.arraycopy(i67, 0, bArr38, 0, i67.length);
        int length8 = i67.length + 0;
        java.lang.System.arraycopy(i68, 0, bArr38, length8, i68.length);
        int length9 = length8 + i68.length;
        java.lang.System.arraycopy(bArr12, 0, bArr38, length9, i79);
        int i107 = length9 + i79;
        java.lang.System.arraycopy(i88, 0, bArr38, i107, i88.length);
        int length10 = i107 + i88.length;
        java.lang.System.arraycopy(i86, 0, bArr38, length10, i86.length);
        int length11 = length10 + i86.length;
        java.lang.System.arraycopy(i87, 0, bArr38, length11, i87.length);
        int length12 = length11 + i87.length;
        java.lang.System.arraycopy(bArr36, 0, bArr38, length12, bArr36.length);
        int length13 = length12 + bArr36.length;
        java.lang.System.arraycopy(i104, 0, bArr38, length13, i104.length);
        int length14 = length13 + i104.length;
        java.lang.System.arraycopy(i105, 0, bArr38, length14, i105.length);
        int length15 = length14 + i105.length;
        java.lang.System.arraycopy(bArr8, 0, bArr38, length15, 0);
        int i108 = length15 + 0;
        java.lang.System.arraycopy(bArr13, 0, bArr38, i108, bArr13.length);
        java.lang.System.arraycopy(bArr37, 0, bArr38, i108 + bArr13.length, bArr37.length);
        d(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14514x4fe44208, this.f360125e, h36.f.f360120h, j18, 0, 0, i49, 0, b(bArr38, this.f360126f, i106));
        int i109 = this.f360122b;
        byte[] bArr39 = new byte[i109];
        java.lang.System.arraycopy(this.f360124d, 0, bArr39, 0, i109);
        return bArr39;
    }
}
