package wu;

/* loaded from: classes9.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f531172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.y1 f531173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(hu.b bVar, wu.y1 y1Var) {
        super(2);
        this.f531172d = bVar;
        this.f531173e = y1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView contentIv = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentIv, "contentIv");
        pt.l0 l0Var = (pt.l0) i95.n0.c(pt.l0.class);
        android.content.Context context = contentIv.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        s15.h hVar = this.f531172d.f366530e;
        wu.y1 y1Var = this.f531173e;
        zt.k kVar = new zt.k("RecordDetailVideo", hVar, y1Var.f531143e.j());
        kVar.f557080d = y1Var.f531143e.f366537d;
        ((ot.w) l0Var).Zi(context, kVar, contentIv, new gk0.k(i65.a.B(contentIv.getContext()), i65.a.k(contentIv.getContext())), new wu.v1((yz5.a) obj2));
        return jz5.f0.f384359a;
    }
}
