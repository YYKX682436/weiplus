package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class z1 implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f226038d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f226039e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f226040f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f226041g;

    public z1(android.content.Context context, int i17, java.util.Map map, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f226038d = c28688xe8dbe4c2;
        this.f226039e = "WxaLiteAppPlatformView." + hashCode();
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(this);
        }
        java.lang.Object obj = map != null ? map.get("viewId") : null;
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteAppBaseView", "reused view viewId: " + (num != null ? num.intValue() : -1));
        java.lang.Object obj2 = map != null ? map.get("appId") : null;
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        str = str == null ? "" : str;
        java.lang.Object obj3 = map != null ? map.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f) : null;
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        str2 = str2 == null ? "" : str2;
        java.lang.Object obj4 = map != null ? map.get("query") : null;
        java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.String str4 = str3 != null ? str3 : "";
        android.view.View oj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(context, false, false, null);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", str);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        bundle.putString("query", str4);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) oj6).f127583q = true;
        this.f226040f = new java.lang.ref.WeakReference(oj6);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).qk(oj6, bundle, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.x1(this));
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
        if (mo31848xfb86a31b() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226047q;
            android.view.View mo31848xfb86a31b = mo31848xfb86a31b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo31848xfb86a31b, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.ui.WxaLiteAppView");
            hashMap.remove(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) mo31848xfb86a31b).mo28563xe7b2546()));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispose uuid:");
            android.view.View mo31848xfb86a31b2 = mo31848xfb86a31b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo31848xfb86a31b2, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.ui.WxaLiteAppView");
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) mo31848xfb86a31b2).mo28563xe7b2546());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f226039e, sb6.toString());
            android.view.View mo31848xfb86a31b3 = mo31848xfb86a31b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo31848xfb86a31b3, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.ui.WxaLiteAppView");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) mo31848xfb86a31b3).a();
            this.f226041g = false;
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f226038d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        java.lang.ref.WeakReference weakReference = this.f226040f;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onFlutterViewAttached */
    public void mo65795x5e3a4146(android.view.View flutterView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterView, "flutterView");
        super.mo65795x5e3a4146(flutterView);
        if (this.f226041g) {
            java.lang.ref.WeakReference weakReference = this.f226040f;
            android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38 c16266x3ede7a38 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) view : null;
            if (c16266x3ede7a38 == null) {
                return;
            }
            java.lang.Object context = flutterView.getContext();
            p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
            if (yVar == null) {
                return;
            }
            yVar.mo273xed6858b4().a(c16266x3ede7a38);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: onFlutterViewDetached */
    public void mo65796x7c604f14() {
        super.mo65796x7c604f14();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (call.f71610xbfc5d0e1.equals("onBackPressed")) {
            java.lang.ref.WeakReference weakReference = this.f226040f;
            android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
            if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65389xc55eddf8(((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) view).mo28563xe7b2546(), true);
            }
        }
    }
}
