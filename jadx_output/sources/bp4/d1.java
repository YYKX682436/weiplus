package bp4;

/* loaded from: classes3.dex */
public final class d1 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f23139f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f23140g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23139f = parent;
        android.widget.ImageView imageView = (android.widget.ImageView) parent.findViewById(com.tencent.mm.R.id.f484169d81);
        this.f23140g = imageView;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(parent.getContext(), com.tencent.mm.R.raw.icons_filled_scissor, -1));
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
        this.f465332d.w(ju3.c0.f301894p0, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f23140g.setVisibility(i17);
    }
}
