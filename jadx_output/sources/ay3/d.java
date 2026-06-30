package ay3;

/* loaded from: classes10.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI f15284d;

    public d(com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI) {
        this.f15284d = ringtoneHistoryUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI activity = this.f15284d;
        if (itemId == com.tencent.mm.R.id.pyz) {
            com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI.U6(activity);
            return;
        }
        if (itemId == com.tencent.mm.R.id.pyy) {
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.ringtone.uic.f fVar = (com.tencent.mm.plugin.ringtone.uic.f) zVar.a(activity).a(com.tencent.mm.plugin.ringtone.uic.f.class);
            java.util.ArrayList arrayList = ((sx3.b) zVar.a(activity).a(sx3.b.class)).f413550h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((ox3.g) next).f349749d.f415622n != null) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ox3.g gVar = (ox3.g) it6.next();
                gVar.f349753h = true;
                arrayList3.add(gVar);
            }
            final java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
            fVar.getClass();
            com.tencent.mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct voipringtonerecommendreportstruct = new com.tencent.mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct();
            voipringtonerecommendreportstruct.f63183g = 13L;
            voipringtonerecommendreportstruct.f63198v = voipringtonerecommendreportstruct.b("extrainfo", "", true);
            voipringtonerecommendreportstruct.k();
            com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(fVar.getActivity());
            androidx.appcompat.app.AppCompatActivity activity2 = fVar.getActivity();
            int i18 = a17.f197136b;
            int i19 = i18 / 2;
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(activity2, i19);
            android.view.View inflate = android.view.LayoutInflater.from(fVar.getActivity()).inflate(com.tencent.mm.R.layout.f489416dd4, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
            constraintLayout.setMaxHeight((i18 * 3) / 4);
            constraintLayout.setMinHeight(i19);
            y1Var.f212044z = true;
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.pur);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) inflate.findViewById(com.tencent.mm.R.id.q1u);
            final android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ptn);
            findViewById.setOnClickListener(new com.tencent.mm.plugin.ringtone.uic.a(y1Var));
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.ringtone.uic.d(y1Var, arrayList4, fVar));
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(fVar.getActivity(), 1, false));
            wxRecyclerView.N(new cy3.s(fVar.getActivity()));
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.ringtone.uic.RingtoneAddTingUIC$addRingtoneToTingList$3
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new ox3.s(new com.tencent.mm.plugin.ringtone.uic.e(arrayList4, findViewById2));
                }
            }, arrayList4, false);
            android.view.View inflate2 = android.view.LayoutInflater.from(fVar.getActivity()).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
            android.view.View findViewById3 = inflate2.findViewById(com.tencent.mm.R.id.ili);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC", "addRingtoneToTingList", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC", "addRingtoneToTingList", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = inflate2.findViewById(com.tencent.mm.R.id.ilg);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC", "addRingtoneToTingList", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC", "addRingtoneToTingList", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate2.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2));
            in5.n0.P(wxRecyclerAdapter, inflate2, inflate2.hashCode(), false, 4, null);
            wxRecyclerView.setAdapter(wxRecyclerAdapter);
            if (arrayList4.isEmpty()) {
                findViewById2.setEnabled(false);
            } else {
                findViewById2.setEnabled(true);
            }
            y1Var.k(inflate);
            y1Var.d(true);
            y1Var.s();
        }
    }
}
