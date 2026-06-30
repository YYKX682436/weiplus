package h71;

/* loaded from: classes15.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4 f360916a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4 activityC11391x705f5af4) {
        this.f360916a = activityC11391x705f5af4;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4 activityC11391x705f5af4 = this.f360916a;
        android.app.ProgressDialog progressDialog = activityC11391x705f5af4.f154739q;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        activityC11391x705f5af4.f154739q = null;
        if (fVar.b()) {
            activityC11391x705f5af4.X6();
        } else {
            activityC11391x705f5af4.f154734i = !activityC11391x705f5af4.f154734i;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC11391x705f5af4.m79336x8b97809d()).h("detail_device_autologin_switch");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17;
            activityC11391x705f5af4.m79333x58c0be88().edit().putBoolean(c21541x1c1b08fe.f279313q, activityC11391x705f5af4.f154734i).commit();
            c21541x1c1b08fe.S(activityC11391x705f5af4.f154734i);
            if (fVar.f152149b == 6) {
                dp.a.m125854x26a183b(activityC11391x705f5af4.mo55332x76847179(), activityC11391x705f5af4.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pho), 0).show();
            } else {
                dp.a.m125854x26a183b(activityC11391x705f5af4.mo55332x76847179(), activityC11391x705f5af4.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.phn), 0).show();
            }
        }
        return java.lang.Boolean.valueOf(e71.k.wi().mo9952xce0038c9(activityC11391x705f5af4.V6(), new java.lang.String[0]));
    }
}
