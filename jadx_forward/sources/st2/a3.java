package st2;

/* loaded from: classes3.dex */
public final class a3 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f493750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f493751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493752c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f493753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f493754e;

    public a3(android.content.Context context, int i17, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f493750a = context;
        this.f493751b = i17;
        this.f493752c = str;
        this.f493753d = c0Var;
        this.f493754e = interfaceC29045xdcb5ca57;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f493754e;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f493753d;
        if (bitmap != null) {
            android.text.style.ImageSpan j17 = st2.g3.f493859a.j(this.f493750a, bitmap, this.f493751b);
            st2.g3.f493862d.put(this.f493752c, bitmap);
            st2.g3.m(c0Var, interfaceC29045xdcb5ca57, j17);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            st2.g3.m(c0Var, interfaceC29045xdcb5ca57, null);
        }
    }
}
