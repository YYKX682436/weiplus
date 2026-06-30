package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ya implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f229264d;

    public ya(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f229264d = activityC16373x8a110f13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f229264d;
        if (activityC16373x8a110f13.isFinishing() || activityC16373x8a110f13.isDestroyed()) {
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[onClickEnvelopeLayout] isFinishing() || isDestroyed()");
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16373x8a110f13.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld ldVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld) zVar.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = ldVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        android.widget.TextView textView = activityC16373x8a110f132 != null ? activityC16373x8a110f132.G : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = ldVar.f228669d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout2 = ldVar.f228673h;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        ldVar.P6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = ldVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f133 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
        if (activityC16373x8a110f133 != null && activityC16373x8a110f133.f227785g2) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = ldVar.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f134 = m158354x192630853 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630853 : null;
            if (activityC16373x8a110f134 != null) {
                activityC16373x8a110f134.f227785g2 = false;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = ldVar.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f135 = m158354x192630854 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630854 : null;
            r45.lm5 g76 = activityC16373x8a110f135 != null ? activityC16373x8a110f135.g7() : null;
            if (g76 != null) {
                g76.f461158g = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.a(g76.f461156e);
                ldVar.R6(g76);
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC16373x8a110f13.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd qdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd) zVar.a(mo55332x768471792).a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630855 = qdVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f136 = m158354x192630855 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630855 : null;
        boolean z17 = activityC16373x8a110f136 != null ? activityC16373x8a110f136.f227789i2 : false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630856 = qdVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f137 = m158354x192630856 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630856 : null;
        if ((activityC16373x8a110f137 != null ? activityC16373x8a110f137.j7() : false) && z17) {
            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) qdVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udg);
            if (linearLayout3 != null && linearLayout3.getVisibility() == 8) {
                android.widget.TextView Q6 = qdVar.Q6();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(Q6 != null ? Q6.getText() : null)) {
                    return;
                }
                android.widget.TextView Q62 = qdVar.Q6();
                if (Q62 != null) {
                    Q62.setVisibility(0);
                }
                android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) qdVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udg);
                if (linearLayout4 == null) {
                    return;
                }
                linearLayout4.setVisibility(0);
            }
        }
    }
}
