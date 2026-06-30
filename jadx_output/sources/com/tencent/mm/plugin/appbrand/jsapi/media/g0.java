package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class g0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f81811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t0 f81812b;

    public g0(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var) {
        this.f81811a = c0Var;
        this.f81812b = t0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str = android.os.Build.VERSION.SDK_INT >= 29 ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.WRITE_EXTERNAL_STORAGE";
        com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var = this.f81812b;
        boolean b17 = nf.t.b(t0Var.f82060a.getContext(), t0Var.f82060a, str);
        kotlin.jvm.internal.c0 c0Var = this.f81811a;
        c0Var.f310112d = b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ChooseMediaWorkFlow", "has external storage permission: " + c0Var.f310112d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("android.permission.RECORD_AUDIO");
        arrayList.add("android.permission.CAMERA");
        pq5.g h17 = pq5.h.a().h(new com.tencent.mm.plugin.appbrand.jsapi.media.c0(arrayList, t0Var));
        kotlin.jvm.internal.o.f(h17, "$ui(...)");
        km5.u.a(h17);
        return java.lang.Boolean.FALSE;
    }
}
