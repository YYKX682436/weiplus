package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class oc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 f242920d;

    public oc(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x53509592) {
        this.f242920d = activityC17424x53509592;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x53509592 = this.f242920d;
        if (!activityC17424x53509592.f241955o) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17424x53509592.mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780 = activityC17424x53509592.f241948e;
        if (c17422xce8bd780 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
            throw null;
        }
        if (c17422xce8bd780.isPlaying) {
            c17422xce8bd780.b(true);
        } else {
            c17422xce8bd780.a(true);
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce.f242442a.a();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("care_audio_play_scene", java.lang.Integer.valueOf(activityC17424x53509592.f241953m ? 1 : 4));
            hashMap.put("care_session_id", a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7802 = activityC17424x53509592.f241948e;
            if (c17422xce8bd7802 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
                throw null;
            }
            hashMap.put("audio_name", c17422xce8bd7802.getYa.b.SOURCE java.lang.String());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("care_audio_play", hashMap, 35684);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
