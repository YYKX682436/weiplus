package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class ff implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 f242568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 f242569e;

    public ff(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780) {
        this.f242568d = activityC17429xf3011891;
        this.f242569e = c17422xce8bd780;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setPositiveBtn$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891 = this.f242568d;
        boolean z17 = activityC17429xf3011891.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780 = this.f242569e;
        if (!z17) {
            android.content.Context context = c17422xce8bd780.getContext();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setPositiveBtn$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (activityC17429xf3011891.f242009y) {
            activityC17429xf3011891.W6("hearing_level_test_result", 12, c17422xce8bd780.getYa.b.SOURCE java.lang.String(), false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d = activityC17429xf3011891.f241993f;
            if (c17423x715c600d == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardManager");
                throw null;
            }
            c17423x715c600d.c();
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activityC17429xf3011891, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891.class);
            intent.putExtra("audio_auto_play", activityC17429xf3011891.getIntent().getBooleanExtra("audio_auto_play", false));
            intent.putExtra("audio_snr", 1);
            intent.putExtra("audio_test_type", 3);
            activityC17429xf3011891.startActivityForResult(intent, activityC17429xf3011891.I);
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
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setPositiveBtn$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
