package um2;

/* loaded from: classes3.dex */
public final class q5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(fm2.c cVar) {
        super(0);
        this.f510465d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.c cVar = this.f510465d;
        android.view.View findViewById = cVar.findViewById(com.p314xaae8f345.mm.R.id.fpb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.leftMargin = relativeLayout.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams.rightMargin = relativeLayout.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(relativeLayout.getContext());
        frameLayout.setId(com.p314xaae8f345.mm.R.id.eqw);
        relativeLayout.addView(frameLayout, layoutParams);
        frameLayout.setPadding(0, 0, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb.f194202s);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb(frameLayout, cVar);
    }
}
