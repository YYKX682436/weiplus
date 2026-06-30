package gu1;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13041xc416088b f357422d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13041xc416088b activityC13041xc416088b) {
        this.f357422d = activityC13041xc416088b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13041xc416088b activityC13041xc416088b = this.f357422d;
        if (id6 == com.p314xaae8f345.mm.R.id.f563868bp) {
            fu1.g gVar = activityC13041xc416088b.f176242p;
            if (gVar == null || (arrayList = gVar.f348373a) == null || arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list == null || mConsumedInfo.list.isEmpty()!");
            } else {
                activityC13041xc416088b.X6(true);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i17 = 0; i17 < activityC13041xc416088b.f176242p.f348373a.size(); i17++) {
                    r45.vu vuVar = ((fu1.o) activityC13041xc416088b.f176242p.f348373a.get(i17)).f348397a;
                    r45.a46 a46Var = new r45.a46();
                    if (vuVar != null) {
                        java.lang.String str = vuVar.f470078d;
                        a46Var.f451252e = str;
                        activityC13041xc416088b.f176245s = str;
                    }
                    a46Var.f451253f = ((fu1.o) activityC13041xc416088b.f176242p.f348373a.get(i17)).f348398b;
                    a46Var.f451255h = "";
                    a46Var.f451254g = "";
                    a46Var.f451256i = activityC13041xc416088b.f176248v;
                    linkedList.add(a46Var);
                }
                java.lang.String str2 = activityC13041xc416088b.f176247u == 1 ? activityC13041xc416088b.f176242p.f348374b : activityC13041xc416088b.f176243q;
                r45.o46 o17 = lu1.a0.o(activityC13041xc416088b.f176249w, activityC13041xc416088b.f176252z, activityC13041xc416088b.A);
                fu1.e eVar = activityC13041xc416088b.f176241o.isChecked() ? new fu1.e(0, linkedList, activityC13041xc416088b.f176242p.f348376d, str2, o17, 20, null) : new fu1.e(0, linkedList, "", str2, o17, 20, null);
                android.widget.CheckBox checkBox = activityC13041xc416088b.f176241o;
                if (checkBox != null && checkBox.getVisibility() == 0) {
                    if (activityC13041xc416088b.f176241o.isChecked()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardConsumeSuccessFollowServices", 0, "", "", 0, 0, "", 0, "");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardConsumeSuccessView", 0, "", "", 0, 0, "", 0, "");
                    }
                }
                gm0.j1.n().f354821b.g(eVar);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.nrt) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KLabel_range_index", activityC13041xc416088b.f176249w);
            intent.putExtra("Klabel_name_list", activityC13041xc416088b.f176250x);
            intent.putExtra("Kother_user_name_list", activityC13041xc416088b.f176251y);
            intent.putExtra("k_sns_label_ui_title", activityC13041xc416088b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.av9));
            intent.putExtra("k_sns_label_ui_style", 0);
            intent.putExtra("KLabel_is_filter_private", true);
            j45.l.n(activityC13041xc416088b, "sns", ".ui.SnsLabelUI", intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
