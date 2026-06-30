package pk2;

/* loaded from: classes3.dex */
public final class n0 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437555i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f437556j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f437557k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437555i = "";
        this.f437556j = "AnchorDefinitionOption";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437555i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        r45.oa4 oa4Var = ((mm2.e1) this.f445960a.c(mm2.e1.class)).f410529z;
        java.util.LinkedList linkedList = oa4Var != null ? oa4Var.I : null;
        return !(linkedList == null || linkedList.isEmpty());
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        r45.oa4 oa4Var = ((mm2.e1) this.f445960a.c(mm2.e1.class)).f410529z;
        java.util.LinkedList linkedList = oa4Var != null ? oa4Var.I : null;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "anchorVideoLevels is empty, skip add");
            return;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        int i17 = dk2.ef.f314909c;
        int i18 = oa4Var.f463608J;
        if (i17 <= 0) {
            i17 = i18;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.nz6) obj).f463311d == i17) {
                    break;
                }
            }
        }
        r45.nz6 nz6Var = (r45.nz6) obj;
        java.lang.String str = nz6Var != null ? nz6Var.f463316i : null;
        if (str == null) {
            str = "";
        }
        android.view.View view = bottomSheet.f213492f;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f567028u93);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorDefinitionOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorDefinitionOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.vhg);
        if ((str.length() > 0) && textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        this.f437557k = textView;
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.l0(this, view, linkedList));
        }
    }
}
