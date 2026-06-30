package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t0 f81732b;

    public c0(java.util.ArrayList arrayList, com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var) {
        this.f81731a = arrayList;
        this.f81732b = t0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var;
        java.util.ArrayList arrayList = this.f81731a;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            t0Var = this.f81732b;
            if (!hasNext) {
                break;
            }
            if (nf.t.b(t0Var.f82060a.getContext(), t0Var.f82060a, (java.lang.String) it.next())) {
                it.remove();
            }
        }
        if (arrayList.isEmpty()) {
            return java.lang.Boolean.TRUE;
        }
        android.app.Activity a17 = q75.a.a(t0Var.f82060a.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:requestPermission, context !is Activity");
            km5.u.b().a(new java.lang.IllegalStateException("fail:internal error invalid android context"));
            return java.lang.Boolean.FALSE;
        }
        km5.b b17 = km5.u.b();
        b17.b();
        nf.g.a(a17).i(t0Var.f82060a, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), new com.tencent.mm.plugin.appbrand.jsapi.media.b0(b17, arrayList));
        return java.lang.Boolean.FALSE;
    }
}
