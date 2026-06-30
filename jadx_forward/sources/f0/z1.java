package f0;

/* loaded from: classes14.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f339817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f339818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y1.j f339819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f339820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f339821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y1.b f339822i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(yz5.l lVar, boolean z17, y1.j jVar, yz5.p pVar, yz5.l lVar2, y1.b bVar) {
        super(1);
        this.f339817d = lVar;
        this.f339818e = z17;
        this.f339819f = jVar;
        this.f339820g = pVar;
        this.f339821h = lVar2;
        this.f339822i = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semantics, "$this$semantics");
        f06.v[] vVarArr = y1.m0.f540303a;
        yz5.l mapping = this.f339817d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mapping, "mapping");
        y1.l lVar = (y1.l) semantics;
        lVar.g(y1.i0.f540277z, mapping);
        boolean z17 = this.f339818e;
        y1.j jVar = this.f339819f;
        if (z17) {
            y1.m0.g(semantics, jVar);
        } else {
            y1.m0.e(semantics, jVar);
        }
        yz5.p pVar = this.f339820g;
        if (pVar != null) {
            y1.m0.c(semantics, null, pVar, 1, null);
        }
        yz5.l lVar2 = this.f339821h;
        if (lVar2 != null) {
            lVar.g(y1.k.f540286e, new y1.a(null, lVar2));
        }
        y1.b bVar = this.f339822i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<set-?>");
        y1.m0.f540313k.a(semantics, y1.m0.f540303a[13], bVar);
        return jz5.f0.f384359a;
    }
}
