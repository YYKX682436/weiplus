package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b4 f171923a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b4();

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(ze.n r43, k01.l r44) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b4.b(ze.n, k01.l):java.lang.String");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a4 a(ze.n nVar, java.lang.String str, java.lang.String str2) {
        if (r26.i0.y(str, "http://", false) || r26.i0.y(str, "https://", false)) {
            return null;
        }
        java.lang.String d17 = (r26.i0.y(str2, "image", false) || r26.i0.y(str2, "video", false)) ? "" : s46.c.d(str);
        java.lang.String c17 = s46.c.c(str);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            return null;
        }
        int C = (int) r6Var.C();
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = nVar.mo48802x59eafec1().mo49619x6aa75256(r6Var, c17, false, b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49619x6aa75256, "createTempFileFrom(...)");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK != mo49619x6aa75256) {
            return null;
        }
        java.lang.Object value = b0Var.f373357a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a4((java.lang.String) value, d17, C);
    }
}
