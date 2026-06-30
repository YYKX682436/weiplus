package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f266629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f266630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266631f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266632g;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, android.os.Bundle bundle, java.util.Map map, nw4.y2 y2Var) {
        this.f266632g = c1Var;
        this.f266629d = bundle;
        this.f266630e = map;
        this.f266631f = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f266630e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266632g;
        try {
            c1Var.f266531y.ec();
            c1Var.f266531y.b(this.f266629d);
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6267x36e7f58b().e();
            map.put("err_code", 0);
            map.put("err_msg", "ok");
            c1Var.i5(this.f266631f, "close window and next:ok", map);
        } catch (java.lang.Exception e17) {
            c1Var.A5(e17, map);
        }
    }
}
