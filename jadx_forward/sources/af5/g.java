package af5;

/* loaded from: classes2.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22072x5721f1cc f86109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22072x5721f1cc c22072x5721f1cc, java.lang.String str) {
        super(1);
        this.f86109d = c22072x5721f1cc;
        this.f86110e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        int h17 = i65.a.h(this.f86109d.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = h17;
        layoutParams.height = h17;
        imageView.setLayoutParams(layoutParams);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        a17.c(ya2.l.f542035a.e(this.f86110e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411495p));
        return jz5.f0.f384359a;
    }
}
