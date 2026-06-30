package ws2;

/* loaded from: classes3.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f530634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        super(0);
        this.f530634d = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f530634d.findViewById(com.p314xaae8f345.mm.R.id.fk6);
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        return jz5.f0.f384359a;
    }
}
