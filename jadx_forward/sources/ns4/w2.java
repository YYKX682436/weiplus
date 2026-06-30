package ns4;

/* loaded from: classes8.dex */
public final class w2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421205d;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f421205d = activityC19068x49d5e62b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        boolean z17 = ((ms4.k0) obj).f412590b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421205d;
        if (z17) {
            ms4.o0 o0Var = activityC19068x49d5e62b.f260718d;
            if (o0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            if (o0Var.f412628q) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.T6(activityC19068x49d5e62b);
            return;
        }
        ms4.o0 o0Var2 = activityC19068x49d5e62b.f260718d;
        if (o0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        if (o0Var2.f412628q) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WECOIN_PAGE_HAS_SHOW_TUTORIAL_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.Object m17 = c17.m(u3Var, bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.U6(activityC19068x49d5e62b);
        if (bool != null) {
            android.widget.TextView textView = activityC19068x49d5e62b.f260730s;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSwitchDeviceTipsView");
                throw null;
            }
            textView.setText(activityC19068x49d5e62b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_2));
        }
        if (activityC19068x49d5e62b.f260718d != null) {
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
    }
}
