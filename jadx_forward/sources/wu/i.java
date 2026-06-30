package wu;

/* loaded from: classes9.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f531118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.k f531119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(hu.b bVar, wu.k kVar) {
        super(2);
        this.f531118d = bVar;
        this.f531119e = kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView thumb = (android.widget.ImageView) obj;
        yz5.l successCallback = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumb, "thumb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successCallback, "successCallback");
        pt.l0 l0Var = (pt.l0) i95.n0.c(pt.l0.class);
        android.content.Context context = thumb.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        zt.k kVar = new zt.k("RecordDetailUrl", this.f531118d.f366530e, this.f531119e.f531143e.j());
        kVar.f557081e = false;
        ((ot.w) l0Var).Zi(context, kVar, thumb, new gk0.k(i65.a.B(thumb.getContext()), i65.a.k(thumb.getContext())), new wu.h(successCallback));
        return jz5.f0.f384359a;
    }
}
