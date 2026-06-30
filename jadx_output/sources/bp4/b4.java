package bp4;

/* loaded from: classes3.dex */
public final class b4 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f23113f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f23114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(android.view.View layout, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23113f = layout;
        android.view.View findViewById = layout.findViewById(com.tencent.mm.R.id.f484169d81);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f23114g = imageView;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(layout.getContext(), com.tencent.mm.R.raw.icons_filled_crop, i65.a.d(layout.getContext(), com.tencent.mm.R.color.a9z)));
        imageView.setOnClickListener(new bp4.a4(status));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f23114g.setVisibility(i17);
    }
}
