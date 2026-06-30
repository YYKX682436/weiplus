package wu;

/* loaded from: classes9.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f531109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.k f531110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hu.b bVar, wu.k kVar) {
        super(1);
        this.f531109d = bVar;
        this.f531110e = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.ImageView thumb = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumb, "thumb");
        i95.m c17 = i95.n0.c(pt.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = thumb.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        zt.k kVar = new zt.k("RecordDetailUrl", this.f531109d.f366530e, this.f531110e.f531143e.j());
        kVar.f557081e = false;
        pt.l0.zg((pt.l0) c17, context, kVar, thumb, new gk0.k(i65.a.B(thumb.getContext()), i65.a.k(thumb.getContext())), null, 16, null);
        return jz5.f0.f384359a;
    }
}
