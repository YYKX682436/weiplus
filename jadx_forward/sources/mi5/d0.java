package mi5;

/* loaded from: classes9.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.e0 f408346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f408348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l15.c f408349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(mi5.e0 e0Var, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, l15.c cVar) {
        super(1);
        this.f408346d = e0Var;
        this.f408347e = context;
        this.f408348f = f9Var;
        this.f408349g = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        android.content.Context context = this.f408347e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f408348f;
        mi5.e0 e0Var = this.f408346d;
        android.graphics.Bitmap i17 = e0Var.i(context, f9Var);
        if (i17 == null || i17.isRecycled()) {
            l15.c cVar = this.f408349g;
            v05.b k17 = cVar.k();
            java.lang.String m75945x2fec8307 = k17 != null ? k17.m75945x2fec8307(k17.f513848e + 14) : null;
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                imageView.setVisibility(8);
            } else if (r26.i0.A(m75945x2fec8307, "http", false, 2, null)) {
                e0Var.g(m75945x2fec8307, cVar, imageView);
            } else {
                imageView.setImageBitmap(com.p314xaae8f345.mm.p786x600aa8b.e.c(m75945x2fec8307));
            }
        } else {
            imageView.setImageBitmap(i17);
        }
        return jz5.f0.f384359a;
    }
}
