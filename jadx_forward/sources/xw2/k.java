package xw2;

/* loaded from: classes2.dex */
public final class k implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f539235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f539236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xw2.s f539237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f539238g;

    public k(int i17, int i18, xw2.s sVar, android.view.View view) {
        this.f539235d = i17;
        this.f539236e = i18;
        this.f539237f = sVar;
        this.f539238g = view;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public final java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.Objects.toString(obj);
        xw2.u m176119xa0ab20ce = this.f539237f.m176119xa0ab20ce();
        android.view.View slot = this.f539238g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(slot, "$slot");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 h00Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00) m176119xa0ab20ce;
        h00Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz lzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) slot.findViewById(com.p314xaae8f345.mm.R.id.a9m);
        android.widget.TextView textView = (android.widget.TextView) slot.findViewById(com.p314xaae8f345.mm.R.id.kbf);
        android.view.View findViewById = slot.findViewById(com.p314xaae8f345.mm.R.id.d2f);
        if (lzVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FollowFreqReport] attach_avatar_personal_center view_id=person_center_frequently_read position=");
            int i17 = this.f539235d;
            sb6.append(i17);
            sb6.append(" positionInGroup=");
            int i18 = this.f539236e;
            sb6.append(i18);
            sb6.append(" avatar_finder_username=");
            sb6.append(lzVar.f216633d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfOftenReadAuthorUIC", sb6.toString());
            hc2.v0.e(slot, "person_center_frequently_read", 40, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vz(h00Var, lzVar, i17, i18), 60, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(slot, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            slot.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(slot, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            java.lang.String str = lzVar.f216631b;
            if (str == null) {
                str = "";
            }
            mn2.n nVar = new mn2.n(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.V);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = h00Var.m158354x19263085();
            java.lang.String str2 = lzVar.f216630a;
            if (str2 == null) {
                str2 = "";
            }
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m158354x19263085, str2));
            int i19 = lzVar.f216632c ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(slot, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            slot.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(slot, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText("");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC", "onItemBind", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderSelfOftenReadAuthorUIC$AuthorItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
