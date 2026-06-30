package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class qj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj f214432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar) {
        super(0);
        this.f214432d = ujVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uj ujVar = this.f214432d;
        int i17 = ujVar.f214715a.getResources().getDisplayMetrics().heightPixels;
        android.content.Context context = ujVar.f214715a;
        int i18 = context.getResources().getDisplayMetrics().widthPixels;
        int i19 = (int) (i17 * 0.8d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorMoreActionBottomSheet", "peekHeight:" + i19);
        if (i19 <= 0) {
            i19 = -2;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i18, -2);
        android.view.View view = ujVar.f214721g;
        e3Var.g(view, layoutParams);
        if (i19 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15323x32d424ae c15323x32d424ae = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15323x32d424ae ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15323x32d424ae) view : null;
            if (c15323x32d424ae != null) {
                c15323x32d424ae.m62194x25bfb969(i19);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorMoreActionBottomSheet", "setMaxHeight");
        }
        e3Var.f213498o = true;
        e3Var.c(true);
        e3Var.a();
        return e3Var;
    }
}
