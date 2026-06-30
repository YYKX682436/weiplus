package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class f4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f80874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.i4 f80875f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(int i17, java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.appbrand.jsapi.i4 i4Var) {
        super(1);
        this.f80873d = i17;
        this.f80874e = weakReference;
        this.f80875f = i4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Loader(");
        int i17 = this.f80873d;
        sb6.append(i17);
        sb6.append(").onError, errMsg:");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.e("Luggage.FULL.JsApiBatchGetContact", sb6.toString());
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) this.f80874e.get();
        if (yVar != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fail");
            if (str2 == null || str2.length() == 0) {
                str = "";
            } else {
                str = ":" + str2;
            }
            sb7.append(str);
            yVar.a(i17, this.f80875f.o(sb7.toString()));
        }
        return jz5.f0.f302826a;
    }
}
