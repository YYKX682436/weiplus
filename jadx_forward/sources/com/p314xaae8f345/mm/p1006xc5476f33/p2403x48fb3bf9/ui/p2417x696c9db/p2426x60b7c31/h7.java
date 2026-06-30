package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class h7 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266703c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f266706f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266707g;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, nw4.y2 y2Var, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        this.f266707g = c1Var;
        this.f266701a = str;
        this.f266702b = y2Var;
        this.f266703c = str2;
        this.f266704d = str3;
        this.f266705e = str4;
        this.f266706f = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266707g;
        if (!z17) {
            c1Var.i5(this.f266702b, "send_app_msg:cancel", null);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f266701a)) {
            pq5.h.a().q(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g7(this, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b7(this))).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e7(this, str));
            return;
        }
        this.f266707g.Q5(null, "", this.f266703c, this.f266701a, this.f266704d, this.f266705e, str, null);
        android.content.Context context = c1Var.f266508d;
        if (context instanceof android.app.Activity) {
            db5.t7.h(context, j65.q.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
            ((android.app.Activity) c1Var.f266508d).finish();
            c1Var.f266531y = c1Var.f266534z;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().g(this.f266703c);
    }
}
