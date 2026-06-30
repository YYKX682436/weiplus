package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public final class e0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 f260899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260900b;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43, java.lang.String str) {
        this.f260899a = activityC19073xb523d43;
        this.f260900b = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String username = this.f260900b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "$username");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43 = this.f260899a;
        activityC19073xb523d43.getClass();
        if (z17) {
            if (!(username.length() == 0)) {
                if (activityC19073xb523d43.getIntent().getBooleanExtra("under_age_verify_from_liteapp", false)) {
                    java.lang.String stringExtra = activityC19073xb523d43.getIntent().getStringExtra("under_age_session_id");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    if (str == null) {
                        str = "";
                    }
                    ys4.i iVar = new ys4.i(username, stringExtra, str);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19073xb523d43.mo55332x76847179();
                    iVar.f295437m = true;
                    iVar.f295439o = mo55332x76847179;
                    iVar.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.f0(activityC19073xb523d43, username));
                } else {
                    java.lang.String stringExtra2 = activityC19073xb523d43.getIntent().getStringExtra("under_age_session_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = "";
                    }
                    if (str == null) {
                        str = "";
                    }
                    ys4.h hVar = new ys4.h(username, stringExtra2, str);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC19073xb523d43.mo55332x76847179();
                    hVar.f295437m = true;
                    hVar.f295439o = mo55332x768471792;
                    hVar.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.d0(activityC19073xb523d43, username));
                }
            }
        }
        activityC19073xb523d43.mo48674x36654fab();
    }
}
