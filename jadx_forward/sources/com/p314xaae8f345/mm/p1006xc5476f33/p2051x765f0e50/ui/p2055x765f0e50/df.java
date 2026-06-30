package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class df implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 f242477d;

    public df(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891) {
        this.f242477d = activityC17429xf3011891;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setNegativeBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891 = this.f242477d;
        if (!activityC17429xf3011891.G) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17429xf3011891.mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setNegativeBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (activityC17429xf3011891.f242009y) {
            activityC17429xf3011891.W6("hearing_level_test_result", 12, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243271h.h(), false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d = activityC17429xf3011891.f241993f;
            if (c17423x715c600d == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardManager");
                throw null;
            }
            c17423x715c600d.m68983xcc520c05(activityC17429xf3011891.getIntent().getBooleanExtra("audio_auto_play", false));
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780 = activityC17429xf3011891.f241995h;
            if (c17422xce8bd780 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView2");
                throw null;
            }
            c17422xce8bd780.m68980x22dcbf1d(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243270g.h());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = activityC17429xf3011891.f241999o;
            if (c22661xa3a2b3c0 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("positiveBtn");
                throw null;
            }
            c22661xa3a2b3c0.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bf(activityC17429xf3011891, c17422xce8bd780));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = activityC17429xf3011891.f241998n;
            if (c22661xa3a2b3c02 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("negativeBtn");
                throw null;
            }
            c22661xa3a2b3c02.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.cf(activityC17429xf3011891, c17422xce8bd780));
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7802 = activityC17429xf3011891.f241995h;
            if (c17422xce8bd7802 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView2");
                throw null;
            }
            c17422xce8bd7802.m68972x45f06fcb(false);
            activityC17429xf3011891.X6(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d2 = activityC17429xf3011891.f241993f;
            if (c17423x715c600d2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardManager");
                throw null;
            }
            c17423x715c600d2.d(true);
            activityC17429xf3011891.a7(false);
        } else {
            android.widget.TextView textView = activityC17429xf3011891.f241992e;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                throw null;
            }
            textView.removeCallbacks(activityC17429xf3011891.f242008x);
            android.widget.TextView textView2 = activityC17429xf3011891.f241992e;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                throw null;
            }
            textView2.setText(activityC17429xf3011891.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5c));
            android.widget.TextView textView3 = activityC17429xf3011891.f241992e;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                throw null;
            }
            textView3.setVisibility(0);
            android.widget.TextView textView4 = activityC17429xf3011891.f241992e;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
                throw null;
            }
            textView4.postDelayed(activityC17429xf3011891.f242008x, 3000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setNegativeBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
