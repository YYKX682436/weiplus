package h0;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1.i f359328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.a f359329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f359330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f359331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y1.i iVar, z1.a aVar, boolean z17, yz5.a aVar2) {
        super(1);
        this.f359328d = iVar;
        this.f359329e = aVar;
        this.f359330f = z17;
        this.f359331g = aVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semantics, "$this$semantics");
        y1.i iVar = this.f359328d;
        if (iVar != null) {
            y1.m0.f(semantics, iVar.f540251a);
        }
        f06.v[] vVarArr = y1.m0.f540303a;
        z1.a aVar = this.f359329e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        y1.m0.f540314l.a(semantics, y1.m0.f540303a[15], aVar);
        y1.m0.b(semantics, null, new h0.g(this.f359331g));
        if (!this.f359330f) {
            y1.m0.a(semantics);
        }
        return jz5.f0.f384359a;
    }
}
