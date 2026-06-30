package o24;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17635x14f80d0b f423988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2076x229fdf4d.C17635x14f80d0b c17635x14f80d0b) {
        super(1);
        this.f423988d = c17635x14f80d0b;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 imageView = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int h17 = i65.a.h(this.f423988d.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        layoutParams.width = h17;
        layoutParams.height = h17;
        imageView.setLayoutParams(layoutParams);
        ng5.a.a(imageView, c01.z1.r());
        return jz5.f0.f384359a;
    }
}
