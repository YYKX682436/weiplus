package com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29;

/* loaded from: classes15.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f236484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w60.k f236485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f236486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f236487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f236488h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f236489i;

    public e(android.content.Intent intent, w60.k kVar, int i17, int i18, android.os.Bundle bundle, android.content.Context context) {
        this.f236484d = intent;
        this.f236485e = kVar;
        this.f236486f = i17;
        this.f236487g = i18;
        this.f236488h = bundle;
        this.f236489i = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        w60.k kVar = this.f236485e;
        com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var = (com.p314xaae8f345.mm.p957x53236a1b.k0) kVar;
        java.lang.String str = ((r45.s83) k0Var.f152889e.f152244b.f152233a).f467081g;
        android.content.Intent intent = this.f236484d;
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str);
        intent.putExtra("rawUrl", k0Var.Q());
        int i18 = this.f236486f;
        if (e04.p.y(i18)) {
            intent.putExtra("stastic_scene", 13);
        } else if (i18 == 1) {
            intent.putExtra("stastic_scene", 14);
        } else {
            intent.putExtra("stastic_scene", 11);
        }
        intent.putExtra("pay_channel", com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.p.a(this.f236487g));
        intent.putExtra("geta8key_session_id", k0Var.O());
        intent.putExtra("geta8key_cookie", k0Var.J());
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.p.g(intent, kVar, this.f236488h);
        ((com.p314xaae8f345.mm.app.y7) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.i1.a()).D(intent, this.f236489i);
    }
}
