package ty2;

/* loaded from: classes2.dex */
public final class l implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f504610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f504611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f504612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f504613d;

    public l(int i17, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f504610a = i17;
        this.f504611b = context;
        this.f504612c = c0Var;
        this.f504613d = interfaceC29045xdcb5ca57;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f504613d;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f504612c;
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            if (c0Var.f391645d) {
                return;
            }
            c0Var.f391645d = true;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        int i17 = this.f504610a;
        android.content.res.Resources resources = this.f504611b.getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, bitmap);
        bitmapDrawable.setBounds(0, 0, (int) (((i17 * 1.0f) * bitmap.getWidth()) / bitmap.getHeight()), i17);
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(wVar));
    }
}
