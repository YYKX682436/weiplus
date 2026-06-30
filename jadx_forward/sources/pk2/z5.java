package pk2;

/* loaded from: classes3.dex */
public final class z5 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437958i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f437959j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437958i = "";
        this.f437959j = true;
    }

    @Override // qk2.f
    public boolean h() {
        return this.f437959j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437958i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return ((mm2.c1) this.f445960a.c(mm2.c1.class)).D;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f213492f;
        boolean m76 = ((mm2.c1) o9Var.c(mm2.c1.class)).m7();
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f567040hx3);
        if (findViewById != null) {
            int i17 = m76 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantHonorOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantHonorOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc g17 = o9Var.g(view, com.p314xaae8f345.mm.R.id.ntw, zl2.r4.f555483a.X1(o9Var.f437607b));
        p3325xe03a0797.p3326xc267989b.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.w5(o9Var), new pk2.y5(o9Var, null));
        }
    }
}
