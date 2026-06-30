package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class d0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t0 f81756a;

    public d0(com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var) {
        this.f81756a = t0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        } else {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var = this.f81756a;
        t0Var.getClass();
        pq5.g h17 = pq5.h.a().h(new com.tencent.mm.plugin.appbrand.jsapi.media.c0(arrayList, t0Var));
        kotlin.jvm.internal.o.f(h17, "$ui(...)");
        km5.u.a(h17);
        return java.lang.Boolean.FALSE;
    }
}
