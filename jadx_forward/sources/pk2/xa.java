package pk2;

/* loaded from: classes3.dex */
public final class xa extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437911i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437911i = "audience.more.morefunction.p2pswitch";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437911i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f213492f;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.uo8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) view.findViewById(com.p314xaae8f345.mm.R.id.uo6);
        pk2.o9 o9Var2 = this.f445960a;
        r45.q82 q82Var = (r45.q82) ((mm2.e1) o9Var2.c(mm2.e1.class)).f410521r.m75936x14adae67(9);
        boolean z17 = q82Var != null && q82Var.m75939xb282bd08(2) == 1;
        r45.q82 q82Var2 = (r45.q82) ((mm2.e1) o9Var2.c(mm2.e1.class)).f410521r.m75936x14adae67(9);
        boolean z18 = q82Var2 != null && q82Var2.m75939xb282bd08(1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorP2PSwitchOption", "isP2PEnabled: " + z18 + ", isAudienceP2PSwitchOpen: " + z17);
        int i17 = z18 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/VisitorP2PSwitchOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/VisitorP2PSwitchOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new pk2.wa(this, o9Var));
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.uo_);
    }
}
