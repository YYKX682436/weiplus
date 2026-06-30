package zh1;

/* loaded from: classes8.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        java.util.List appBrandOpenMaterialDetailModels = openMaterialCollection.f167785g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
        return !appBrandOpenMaterialDetailModels.isEmpty();
    }

    public zh1.v0 b(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection, zh1.c1 c1Var, zh1.w0 w0Var) {
        zh1.w0 w0Var2;
        zh1.w0 w0Var3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        boolean a17 = a(openMaterialCollection);
        zh1.v0 v0Var = zh1.v0.f554486s1;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "create, can not create, use dummy");
            return v0Var;
        }
        if (!zh1.w.a(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "create, context is invalid, use dummy");
            return v0Var;
        }
        if (((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).m131177xdac2174d()) {
            if (w0Var == null) {
                long j17 = zh1.n.f554444q;
                bi1.g gVar = zh1.n.f554443p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
                w0Var3 = new di1.f(j17, gVar, openMaterialCollection, null, 8, null);
            } else {
                w0Var3 = w0Var;
            }
            return new zh1.o(context, openMaterialCollection, w0Var3);
        }
        zh1.c1 c1Var2 = c1Var == null ? zh1.c1.f554402a : c1Var;
        if (w0Var == null) {
            long j18 = zh1.n.f554444q;
            bi1.g gVar2 = zh1.n.f554443p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
            w0Var2 = new di1.f(j18, gVar2, openMaterialCollection, null, 8, null);
        } else {
            w0Var2 = w0Var;
        }
        return new zh1.n(context, k0Var, openMaterialCollection, c1Var2, w0Var2);
    }
}
