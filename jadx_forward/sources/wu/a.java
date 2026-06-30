package wu;

/* loaded from: classes9.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f531071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.b f531072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(hu.b bVar, wu.b bVar2) {
        super(1);
        this.f531071d = bVar;
        this.f531072e = bVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.ImageView contentIv = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentIv, "contentIv");
        i95.m c17 = i95.n0.c(pt.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pt.l0 l0Var = (pt.l0) c17;
        android.content.Context context = contentIv.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        s15.h hVar = this.f531071d.f366530e;
        wu.b bVar = this.f531072e;
        zt.k kVar = new zt.k("RecordDetailAppBrandFakeNative", hVar, bVar.f531143e.j());
        kVar.f557080d = bVar.f531143e.f366537d;
        pt.l0.zg(l0Var, context, kVar, contentIv, new gk0.k(i65.a.B(contentIv.getContext()), i65.a.k(contentIv.getContext())), null, 16, null);
        return jz5.f0.f384359a;
    }
}
