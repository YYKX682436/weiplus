package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class pe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 f242969d;

    public pe(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891) {
        this.f242969d = activityC17429xf3011891;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$initAudioTestDisable$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891 = this.f242969d;
        if (!activityC17429xf3011891.G) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17429xf3011891.mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$initAudioTestDisable$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780 = activityC17429xf3011891.f241994g;
        if (c17422xce8bd780 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView1");
            throw null;
        }
        if (c17422xce8bd780.isPlaying) {
            if (c17422xce8bd780 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView1");
                throw null;
            }
            c17422xce8bd780.b(true);
        } else {
            if (c17422xce8bd780 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView1");
                throw null;
            }
            c17422xce8bd780.a(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7802 = activityC17429xf3011891.f241994g;
            if (c17422xce8bd7802 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView1");
                throw null;
            }
            activityC17429xf3011891.W6("care_audio_play", -1, c17422xce8bd7802.getYa.b.SOURCE java.lang.String(), true);
        }
        activityC17429xf3011891.a7(true);
        activityC17429xf3011891.V6(1);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$initAudioTestDisable$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
