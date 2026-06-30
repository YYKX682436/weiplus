package bp4;

/* loaded from: classes3.dex */
public final class d1 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f104672f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f104673g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104672f = parent;
        android.widget.ImageView imageView = (android.widget.ImageView) parent.findViewById(com.p314xaae8f345.mm.R.id.f565702d81);
        this.f104673g = imageView;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(parent.getContext(), com.p314xaae8f345.mm.R.raw.f79897x479e21c4, -1));
        imageView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        this.f546865d.w(ju3.c0.f383427p0, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f104673g.setVisibility(i17);
    }
}
