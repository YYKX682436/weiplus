package aq5;

/* loaded from: classes5.dex */
public final class d0 implements aq5.i {
    public com.tencent.mm.protobuf.f a(int i17, byte[] bArr, com.tencent.mm.protobuf.f proto, boolean z17, java.lang.String logMsg, int i18, boolean z18) {
        r45.j87 j87Var;
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(logMsg, "logMsg");
        aq5.p0 p0Var = aq5.p0.f13273a;
        i95.m c17 = i95.n0.c(gz.l.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        byte[] g17 = com.tencent.wechat.aff.local_connection.d.f217358c.g();
        kotlin.jvm.internal.o.d(g17);
        if (g17.length == 0) {
            g17 = null;
        }
        if (g17 == null) {
            j87Var = null;
        } else {
            j87Var = new r45.j87();
            try {
                j87Var.parseFrom(g17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeDrop.F2FTransportHelper", th6, "decryptAndParse err", new java.lang.Object[0]);
            }
        }
        if (j87Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.F2FService", "receive ".concat(logMsg));
            if (!z18) {
                return null;
            }
            p0Var.e(i18);
            return null;
        }
        if (j87Var.f377653d != i17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeDrop.F2FService", "receiveProto unexpected func: " + j87Var.f377653d + ", expected: " + i17);
            return null;
        }
        if (z17) {
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    byte[] bArr2 = j87Var.f377654e.f192156a;
                    kotlin.jvm.internal.o.f(bArr2, "getBytes(...)");
                    byte[] a17 = kk.a.f308464a.a(bArr2, bArr);
                    if (a17 == null) {
                        a17 = new byte[0];
                    }
                    try {
                        proto.parseFrom(a17);
                    } catch (java.lang.Throwable th7) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeDrop.F2FTransportHelper", th7, "decryptAndParse err", new java.lang.Object[0]);
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WeDrop.F2FService", "receiveProto decrypt key is empty");
            return null;
        }
        try {
            proto.parseFrom(j87Var.f377654e.f192156a);
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeDrop.F2FTransportHelper", th8, "decryptAndParse err", new java.lang.Object[0]);
        }
        return proto;
    }
}
