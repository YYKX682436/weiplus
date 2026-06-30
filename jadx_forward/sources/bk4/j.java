package bk4;

/* loaded from: classes11.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.k f103021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f103023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bk4.k kVar, java.lang.String str, boolean z17) {
        super(1);
        this.f103021d = kVar;
        this.f103022e = str;
        this.f103023f = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        bk4.k kVar = this.f103021d;
        android.widget.ImageView imageView = (android.widget.ImageView) kVar.f103034f.get();
        if (imageView != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103022e, imageView.getTag(com.p314xaae8f345.mm.R.id.nwm))) {
                imageView.setImageDrawable(bk4.i.a().i(bitmap, this.f103023f, kVar.f103030b, kVar.f103031c));
            }
        }
        return jz5.f0.f384359a;
    }
}
