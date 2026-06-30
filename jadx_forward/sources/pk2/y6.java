package pk2;

/* loaded from: classes3.dex */
public final class y6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.c7 f437934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(pk2.c7 c7Var) {
        super(0);
        this.f437934d = c7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pk2.c7 c7Var = this.f437934d;
        int i17 = c7Var.f437151a.getResources().getDisplayMetrics().heightPixels;
        android.content.Context context = c7Var.f437151a;
        int i18 = context.getResources().getDisplayMetrics().widthPixels;
        int i19 = (int) (i17 * 0.6d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(context);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isLandscape:");
        boolean z17 = c7Var.f437152b;
        sb6.append(z17);
        sb6.append(", peekHeight:");
        sb6.append(i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorMoreActionBottomSheet", sb6.toString());
        android.view.View view = c7Var.f437157g;
        if (z17) {
            e3Var.g(view, new android.widget.FrameLayout.LayoutParams(i17, -2));
        } else {
            if (i19 <= 0) {
                i19 = -2;
            }
            e3Var.g(view, new android.widget.FrameLayout.LayoutParams(i18, -2));
            if (i19 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15323x32d424ae c15323x32d424ae = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15323x32d424ae ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15323x32d424ae) view : null;
                if (c15323x32d424ae != null) {
                    c15323x32d424ae.m62194x25bfb969(i19);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorMoreActionBottomSheet", "setMaxHeight");
            }
        }
        e3Var.f213498o = true;
        e3Var.c(true);
        e3Var.a();
        return e3Var;
    }
}
