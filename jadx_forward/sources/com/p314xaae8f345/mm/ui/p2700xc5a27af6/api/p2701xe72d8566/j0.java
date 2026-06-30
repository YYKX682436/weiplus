package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class j0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qj5.n f290025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f290027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qj5.q f290028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290029g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jd5.a f290030h;

    public j0(java.lang.String str, android.app.Activity activity, qj5.n nVar, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var, java.util.HashMap hashMap, qj5.q qVar, java.lang.String str2, jd5.a aVar) {
        this.f290023a = str;
        this.f290024b = activity;
        this.f290025c = nVar;
        this.f290026d = j1Var;
        this.f290027e = hashMap;
        this.f290028f = qVar;
        this.f290029g = str2;
        this.f290030h = aVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String str2;
        if (!z17 || (str2 = this.f290023a) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "recentForward, onDialogClick, forwarding imgMsg");
        g45.a aVar = g45.b.f350379a;
        if (str == null) {
            str = "";
        }
        aVar.a(str2, str, 0);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.f66875xa013b0d5, str2);
        bundle.putString("image_path", this.f290029g);
        bundle.putString("model", this.f290030h.m126747x696739c());
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f290026d;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str3, bundle, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.l.class, new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.i0(str2, j1Var));
        android.app.Activity activity = this.f290024b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3v), null, activity, null, null);
        this.f290025c.u();
        j1Var.f290033f = null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("quick_forward_btn", "view_clk", kz5.c1.n(kz5.c1.n(this.f290027e, new jz5.l("forward_method", 1)), new jz5.l("is_with_jump", java.lang.Integer.valueOf(qj5.q.g(this.f290028f, false, 1, null) == null ? 2 : 1))), 36458);
    }
}
