package xh1;

/* loaded from: classes7.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final xh1.g a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 component) {
        xh1.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = component.t3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(t37, "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU");
        ze.n nVar = (ze.n) t37;
        if (nVar.Z1[0] == null) {
            if (nVar.L0() || nVar.S) {
                gVar = null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "getCgiServiceImplByLibServer(...)");
                return gVar;
            }
            synchronized (nVar.Z1) {
                xh1.g[] gVarArr = nVar.Z1;
                if (gVarArr[0] == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nVar.K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class);
                    java.util.Objects.requireNonNull(c0Var);
                    gVarArr[0] = new xh1.g(nVar, c0Var);
                }
            }
        }
        gVar = nVar.Z1[0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "getCgiServiceImplByLibServer(...)");
        return gVar;
    }
}
