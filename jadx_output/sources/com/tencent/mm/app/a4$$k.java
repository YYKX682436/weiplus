package com.tencent.mm.app;

/* loaded from: classes7.dex */
public final /* synthetic */ class a4$$k implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((com.tencent.mm.plugin.magicbrush.d7) ((jc3.q) i95.n0.c(jc3.q.class))).getClass();
        fe3.j.b().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "getMagicPkgVersion:%s", fe3.j.f261555b);
        java.lang.String str = fe3.j.f261555b;
        kotlin.jvm.internal.o.f(str, "getMagicPkgVersion(...)");
        arrayList.add(new android.util.Pair("mbpkg", str));
        arrayList.add(new android.util.Pair("rt", com.tencent.mm.plugin.magicbrush.a5.f147836a.b()));
        return arrayList;
    }
}
