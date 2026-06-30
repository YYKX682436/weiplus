package ut2;

/* loaded from: classes3.dex */
public final class f5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(ut2.j5 j5Var) {
        super(0);
        this.f512418d = j5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f512418d.t().findViewById(com.p314xaae8f345.mm.R.id.muh);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i65.a.a(imageView.getContext(), 16.0f);
        }
        return imageView;
    }
}
