package a0;

/* loaded from: classes14.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1.i f81873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f81875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f81877h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f81878i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y1.i iVar, java.lang.String str, yz5.a aVar, java.lang.String str2, boolean z17, yz5.a aVar2) {
        super(1);
        this.f81873d = iVar;
        this.f81874e = str;
        this.f81875f = aVar;
        this.f81876g = str2;
        this.f81877h = z17;
        this.f81878i = aVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semantics, "$this$semantics");
        y1.i iVar = this.f81873d;
        if (iVar != null) {
            y1.m0.f(semantics, iVar.f540251a);
        }
        y1.m0.b(semantics, this.f81874e, new a0.x(this.f81878i));
        yz5.a aVar = this.f81875f;
        if (aVar != null) {
            a0.y yVar = new a0.y(aVar);
            ((y1.l) semantics).g(y1.k.f540284c, new y1.a(this.f81876g, yVar));
        }
        if (!this.f81877h) {
            y1.m0.a(semantics);
        }
        return jz5.f0.f384359a;
    }
}
