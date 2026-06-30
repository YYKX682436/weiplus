package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class zc implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f f243356a;

    public zc(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f activityC17426xe0b6118f) {
        this.f243356a = activityC17426xe0b6118f;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f.f241957r;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f activityC17426xe0b6118f = this.f243356a;
            activityC17426xe0b6118f.getClass();
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).fj(v65.m.b(activityC17426xe0b6118f), wd0.g1.f526246e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", "updateXWebAudioHAidConfig, enable:false, haidType:o, haidDevice:0");
            com.p314xaae8f345.p3210x3857dc.a3.D(false, 0, 0, null);
            if (!j65.e.g() && !j65.e.f() && !j65.e.e()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC17426xe0b6118f.mo55332x76847179());
                u1Var.g(activityC17426xe0b6118f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574513ij4));
                u1Var.n(activityC17426xe0b6118f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                u1Var.a(true);
                u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sc(activityC17426xe0b6118f));
                u1Var.q(false);
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17426xe0b6118f.mo55332x76847179();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.o5b);
            e4Var.c();
            android.widget.Button button = activityC17426xe0b6118f.f241964m;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
                throw null;
            }
            button.setVisibility(8);
            android.widget.Button button2 = activityC17426xe0b6118f.f241963i;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startBtn");
                throw null;
            }
            button2.setVisibility(0);
            activityC17426xe0b6118f.U6();
        }
    }
}
