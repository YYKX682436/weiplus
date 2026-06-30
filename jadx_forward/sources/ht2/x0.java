package ht2;

/* loaded from: classes2.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f366465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.n6 f366467f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, ht2.y0 y0Var, zy2.n6 n6Var) {
        super(2);
        this.f366465d = c22699x3dcdb352;
        this.f366466e = y0Var;
        this.f366467f = n6Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String url = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f366465d;
        if (bitmap != null) {
            c22699x3dcdb352.setAlpha(0.8f);
            c22699x3dcdb352.setImageDrawable(new android.graphics.drawable.BitmapDrawable(c22699x3dcdb352.getResources(), bitmap));
        } else {
            c22699x3dcdb352.setAlpha(1.0f);
            this.f366466e.uj(c22699x3dcdb352, this.f366467f);
        }
        return jz5.f0.f384359a;
    }
}
