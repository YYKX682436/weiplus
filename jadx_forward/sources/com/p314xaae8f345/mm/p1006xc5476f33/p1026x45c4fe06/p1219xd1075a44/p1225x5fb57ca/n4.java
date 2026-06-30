package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n4 f173089a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n4();

    static {
        com.p3249xcbb51f6b.ndk.C28016x3e94900d.m121821x16e18715(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m4.f173081a);
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, java.lang.String certPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(certPath, "certPath");
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = env.mo50354x59eafec1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832 = mo50354x59eafec1 != null ? mo50354x59eafec1.mo49307xcc440832(certPath, b0Var) : null;
        if (mo49307xcc440832 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.FitRelativeLogic", "readCertPem, opResult is null");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o4("env error");
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK != mo49307xcc440832) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.FitRelativeLogic", "getEncryptedData, opResult: " + mo49307xcc440832);
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o4("certPath is illegal");
        }
        java.lang.Object value = b0Var.f373357a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) value;
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new java.lang.String(bArr, r26.c.f450398a);
    }
}
