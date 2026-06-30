package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.jsapi.n5 implements if1.i {
    private static final int CTRL_INDEX = 677;
    public static final java.lang.String NAME = "onImageViewLoad";

    /* renamed from: i, reason: collision with root package name */
    public final c01.l2 f80681i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.t f80682m;

    public f(int i17, c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        s("viewId", java.lang.Integer.valueOf(i17));
        this.f80681i = l2Var;
        this.f80682m = tVar;
    }

    public void u(android.graphics.BitmapFactory.Options options) {
        if (options != null) {
            s("errMsg", "ok");
            s("size", new com.tencent.mm.plugin.appbrand.jsapi.coverview.e(this, options));
        } else {
            s("errMsg", "fail");
        }
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f80682m;
        c01.l2 l2Var = this.f80681i;
        if (l2Var == null || !"webview".equals(l2Var.f("sendTo", null))) {
            tVar.i(this, null);
        } else {
            tVar.p(this);
        }
    }
}
