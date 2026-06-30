package af5;

/* loaded from: classes9.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22086xe2efad81 f86111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22086xe2efad81 c22086xe2efad81) {
        super(1);
        this.f86111d = c22086xe2efad81;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String m80103x6c03c64c;
        java.lang.String m80103x6c03c64c2;
        java.lang.String m80103x6c03c64c3;
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22086xe2efad81 c22086xe2efad81 = this.f86111d;
        int h17 = i65.a.h(c22086xe2efad81.getContext(), c22086xe2efad81.h() ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd : com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = h17;
        layoutParams.height = h17;
        imageView.setLayoutParams(layoutParams);
        m80103x6c03c64c = c22086xe2efad81.m80103x6c03c64c();
        if (r26.n0.N(m80103x6c03c64c)) {
            imageView.setImageResource(c22086xe2efad81.h() ? com.p314xaae8f345.mm.R.C30861xcebc809e.bgo : com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else if (c22086xe2efad81.h()) {
            kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
            m80103x6c03c64c3 = c22086xe2efad81.m80103x6c03c64c();
            hn1.s sVar = (hn1.s) b0Var;
            sVar.getClass();
            sVar.Bi(imageView, m80103x6c03c64c3, null, 0.5f);
        } else {
            kv.b0 b0Var2 = (kv.b0) i95.n0.c(kv.b0.class);
            m80103x6c03c64c2 = c22086xe2efad81.m80103x6c03c64c();
            ((hn1.s) b0Var2).Ai(imageView, m80103x6c03c64c2);
        }
        return jz5.f0.f384359a;
    }
}
