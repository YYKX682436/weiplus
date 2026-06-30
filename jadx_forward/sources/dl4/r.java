package dl4;

/* loaded from: classes3.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f316992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f316993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.widget.ImageView imageView, int i17) {
        super(0);
        this.f316992d = imageView;
        this.f316993e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f316992d;
        if (imageView != null) {
            imageView.setImageResource(this.f316993e);
        }
        return jz5.f0.f384359a;
    }
}
