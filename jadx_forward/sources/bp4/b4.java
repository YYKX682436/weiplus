package bp4;

/* loaded from: classes3.dex */
public final class b4 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f104646f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f104647g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(android.view.View layout, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104646f = layout;
        android.view.View findViewById = layout.findViewById(com.p314xaae8f345.mm.R.id.f565702d81);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f104647g = imageView;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(layout.getContext(), com.p314xaae8f345.mm.R.raw.f79694xc84cada8, i65.a.d(layout.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a9z)));
        imageView.setOnClickListener(new bp4.a4(status));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f104647g.setVisibility(i17);
    }
}
