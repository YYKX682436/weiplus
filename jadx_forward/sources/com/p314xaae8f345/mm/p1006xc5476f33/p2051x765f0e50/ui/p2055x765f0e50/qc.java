package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class qc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 f243004d;

    public qc(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x53509592) {
        this.f243004d = activityC17424x53509592;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x53509592 = this.f243004d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780 = activityC17424x53509592.f241948e;
        if (c17422xce8bd780 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
            throw null;
        }
        c17422xce8bd780.b(true);
        if (!activityC17424x53509592.f241953m) {
            android.content.Intent intent = new android.content.Intent(activityC17424x53509592, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f.class);
            intent.putExtra("result_code", 0);
            intent.putExtra("audio_test_abandon", true);
            intent.addFlags(603979776);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x535095922 = this.f243004d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            str = "(Landroid/view/View;)V";
            yj0.a.d(activityC17424x535095922, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17424x535095922.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC17424x535095922, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17424x53509592.finish();
        } else {
            if (!activityC17424x53509592.f241955o) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17424x53509592.mo55332x76847179();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p1i);
                e4Var.c();
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
            long n17 = j62.e.g().n();
            if (n17 == 0) {
                str2 = "0";
            } else if (n17 > 0) {
                str2 = java.lang.Long.toString(n17, 10);
            } else {
                char[] cArr = new char[64];
                str = "(Landroid/view/View;)V";
                long j17 = (n17 >>> 1) / 5;
                long j18 = 10;
                char forDigit = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
                int i18 = 63;
                cArr[63] = forDigit;
                for (long j19 = 0; j17 > j19; j19 = 0) {
                    i18--;
                    cArr[i18] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                    j17 /= j18;
                }
                str2 = new java.lang.String(cArr, i18, 64 - i18);
                sb6.append(str2);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(sb6.toString()).putString("hearing_aid_mode_local_old", "CLOSE");
                java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce.f242442a.a();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("enter_method_detection", 2);
                hashMap.put("care_session_id", a17);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("enter_detection_process", hashMap, 35684);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(activityC17424x53509592, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa.class);
                intent2.putExtra("audio_test_type", 1);
                intent2.putExtra("audio_auto_play", activityC17424x53509592.f241954n);
                activityC17424x53509592.m78751x5dc77fb5(intent2);
            }
            str = "(Landroid/view/View;)V";
            sb6.append(str2);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(sb6.toString()).putString("hearing_aid_mode_local_old", "CLOSE");
            java.lang.String a172 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce.f242442a.a();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("enter_method_detection", 2);
            hashMap2.put("care_session_id", a172);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("enter_detection_process", hashMap2, 35684);
            android.content.Intent intent22 = new android.content.Intent();
            intent22.setClass(activityC17424x53509592, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa.class);
            intent22.putExtra("audio_test_type", 1);
            intent22.putExtra("audio_auto_play", activityC17424x53509592.f241954n);
            activityC17424x53509592.m78751x5dc77fb5(intent22);
        }
        if (activityC17424x53509592.f241953m) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_reuse_page_cancel");
        } else {
            wd0.g1 g1Var = activityC17424x53509592.f241947d;
            if (g1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finalMode");
                throw null;
            }
            if (g1Var == wd0.g1.f526247f) {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_normal_page_cancel");
            } else {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_mode_page_cancel");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$5", "android/view/View$OnClickListener", "onClick", str);
    }
}
