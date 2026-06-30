package bk4;

/* loaded from: classes11.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.k f21488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f21490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bk4.k kVar, java.lang.String str, boolean z17) {
        super(1);
        this.f21488d = kVar;
        this.f21489e = str;
        this.f21490f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        bk4.k kVar = this.f21488d;
        android.widget.ImageView imageView = (android.widget.ImageView) kVar.f21501f.get();
        if (imageView != null) {
            if (kotlin.jvm.internal.o.b(this.f21489e, imageView.getTag(com.tencent.mm.R.id.nwm))) {
                imageView.setImageDrawable(bk4.i.a().i(bitmap, this.f21490f, kVar.f21497b, kVar.f21498c));
            }
        }
        return jz5.f0.f302826a;
    }
}
