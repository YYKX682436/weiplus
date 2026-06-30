package ht2;

/* loaded from: classes2.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f366382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366383e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, ht2.y0 y0Var, zy2.p6 p6Var) {
        super(2);
        this.f366382d = c22699x3dcdb352;
        this.f366383e = y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((java.lang.String) obj, "<anonymous parameter 0>");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f366382d;
        if (bitmap != null) {
            c22699x3dcdb352.setAlpha(0.8f);
            c22699x3dcdb352.setImageDrawable(new android.graphics.drawable.BitmapDrawable(c22699x3dcdb352.getResources(), bitmap));
        } else {
            c22699x3dcdb352.setAlpha(1.0f);
            this.f366383e.getClass();
            c22699x3dcdb352.setImageDrawable(m95.a.e(c22699x3dcdb352.getContext().getResources(), com.p314xaae8f345.mm.R.raw.f79562xfeb10c8c, 0.0f));
        }
        return jz5.f0.f384359a;
    }
}
