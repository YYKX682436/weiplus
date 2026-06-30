package cn4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final cn4.a f43677a = new cn4.a();

    public final tm4.b a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        tm4.b bVar = new tm4.b();
        if (!((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            bVar.l(false);
            return bVar;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(path)) {
            bVar.l(false);
        } else {
            bVar.j(path);
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0(path);
            r45.f03 I0 = nk6.I0(path);
            if (I0 == null || L0 == null) {
                bVar.l(false);
            } else {
                tm4.c cVar = new tm4.c();
                try {
                    java.lang.String str = I0.f373892i;
                    if (str == null) {
                        str = "";
                    }
                    cVar.o(str);
                    java.lang.String field_tipsId = L0.field_tipsId;
                    kotlin.jvm.internal.o.f(field_tipsId, "field_tipsId");
                    cVar.r(field_tipsId);
                    cVar.p(I0.f373887d);
                    java.lang.String str2 = I0.f373889f;
                    if (str2 == null) {
                        str2 = "";
                    }
                    cVar.s(str2);
                    java.lang.String str3 = I0.f373890g;
                    cVar.l(str3 != null ? str3 : "");
                    cVar.n(I0.f373888e);
                    if (L0.D0() != null) {
                        r45.ez2 D0 = L0.D0();
                        kotlin.jvm.internal.o.d(D0);
                        if (D0.getByteString(4) != null) {
                            r45.ez2 D02 = L0.D0();
                            kotlin.jvm.internal.o.d(D02);
                            com.tencent.mm.protobuf.g byteString = D02.getByteString(4);
                            kotlin.jvm.internal.o.d(byteString);
                            cVar.k(byteString.i());
                        }
                    }
                    r45.xs2 xs2Var = new r45.xs2();
                    com.tencent.mm.protobuf.g gVar = L0.field_ctrInfo.f388488f;
                    if (gVar != null) {
                        xs2Var.parseFrom(gVar.f192156a);
                    }
                    cVar.q(xs2Var.getInteger(9));
                    cVar.j(L0.Q0(false));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStoryRedDotUtils", e17, "createRedDotDetail", new java.lang.Object[0]);
                }
                bVar.k(cVar);
                bVar.l(true);
            }
        }
        return bVar;
    }
}
