package af5;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.b f4568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, java.lang.String str2, z01.b bVar) {
        super(1);
        this.f4566d = str;
        this.f4567e = str2;
        this.f4568f = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        if (r26.n0.N(this.f4566d)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bgo);
        } else {
            l01.b bVar = l01.d0.f314761a;
            java.lang.String str = this.f4567e;
            if (android.text.TextUtils.isEmpty(str)) {
                str = "file://" + this.f4568f.f468945e;
            } else {
                kotlin.jvm.internal.o.d(str);
            }
            bVar.b(imageView, str, l01.a.h(), l01.q0.f314787d);
        }
        return jz5.f0.f302826a;
    }
}
