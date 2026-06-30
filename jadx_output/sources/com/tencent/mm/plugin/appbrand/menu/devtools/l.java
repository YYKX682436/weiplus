package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class l implements nh1.b {
    @Override // nh1.b
    public void a(final android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        final com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) v5Var;
        dp.a.makeText(context, com.tencent.mm.R.string.f490221oc, 0).show();
        final com.tencent.mm.plugin.appbrand.performance.a aVar = (com.tencent.mm.plugin.appbrand.performance.a) bVar.b(com.tencent.mm.plugin.appbrand.performance.a.class);
        new android.os.Handler(com.tencent.mm.plugin.appbrand.performance.i.INST.h().getLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.l$$a
            @Override // java.lang.Runnable
            public final void run() {
                final boolean b17 = com.tencent.mm.plugin.appbrand.performance.h.b(com.tencent.luggage.sdk.jsapi.component.b.this.getRuntime(), aVar);
                final android.content.Context context2 = context;
                ik1.h0.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.menu.devtools.l$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        dp.a.makeText(context2, b17 ? com.tencent.mm.R.string.f490222od : com.tencent.mm.R.string.f490220ob, 0).show();
                    }
                });
            }
        });
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return context.getString(com.tencent.mm.R.string.f490219oa);
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.performance.h.f(((com.tencent.luggage.sdk.jsapi.component.b) v5Var).getRuntime());
    }
}
