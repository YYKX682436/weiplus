package aq5;

/* loaded from: classes5.dex */
public final class d0 implements aq5.i {
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f a(int i17, byte[] bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f proto, boolean z17, java.lang.String logMsg, int i18, boolean z18) {
        r45.j87 j87Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logMsg, "logMsg");
        aq5.p0 p0Var = aq5.p0.f94806a;
        i95.m c17 = i95.n0.c(gz.l.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        byte[] g17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        if (g17.length == 0) {
            g17 = null;
        }
        if (g17 == null) {
            j87Var = null;
        } else {
            j87Var = new r45.j87();
            try {
                j87Var.mo11468x92b714fd(g17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeDrop.F2FTransportHelper", th6, "decryptAndParse err", new java.lang.Object[0]);
            }
        }
        if (j87Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.F2FService", "receive ".concat(logMsg));
            if (!z18) {
                return null;
            }
            p0Var.e(i18);
            return null;
        }
        if (j87Var.f459186d != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeDrop.F2FService", "receiveProto unexpected func: " + j87Var.f459186d + ", expected: " + i17);
            return null;
        }
        if (z17) {
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    byte[] bArr2 = j87Var.f459187e.f273689a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr2, "getBytes(...)");
                    byte[] a17 = kk.a.f389997a.a(bArr2, bArr);
                    if (a17 == null) {
                        a17 = new byte[0];
                    }
                    try {
                        proto.mo11468x92b714fd(a17);
                    } catch (java.lang.Throwable th7) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeDrop.F2FTransportHelper", th7, "decryptAndParse err", new java.lang.Object[0]);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeDrop.F2FService", "receiveProto decrypt key is empty");
            return null;
        }
        try {
            proto.mo11468x92b714fd(j87Var.f459187e.f273689a);
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeDrop.F2FTransportHelper", th8, "decryptAndParse err", new java.lang.Object[0]);
        }
        return proto;
    }
}
