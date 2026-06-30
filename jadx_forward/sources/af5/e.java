package af5;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.b f86101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, java.lang.String str2, z01.b bVar) {
        super(1);
        this.f86099d = str;
        this.f86100e = str2;
        this.f86101f = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        if (r26.n0.N(this.f86099d)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgo);
        } else {
            l01.b bVar = l01.d0.f396294a;
            java.lang.String str = this.f86100e;
            if (android.text.TextUtils.isEmpty(str)) {
                str = "file://" + this.f86101f.f550478e;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            }
            bVar.b(imageView, str, l01.a.h(), l01.q0.f396320d);
        }
        return jz5.f0.f384359a;
    }
}
