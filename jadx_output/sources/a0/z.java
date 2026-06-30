package a0;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1.i f340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f344h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f345i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y1.i iVar, java.lang.String str, yz5.a aVar, java.lang.String str2, boolean z17, yz5.a aVar2) {
        super(1);
        this.f340d = iVar;
        this.f341e = str;
        this.f342f = aVar;
        this.f343g = str2;
        this.f344h = z17;
        this.f345i = aVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        y1.i iVar = this.f340d;
        if (iVar != null) {
            y1.m0.f(semantics, iVar.f458718a);
        }
        y1.m0.b(semantics, this.f341e, new a0.x(this.f345i));
        yz5.a aVar = this.f342f;
        if (aVar != null) {
            a0.y yVar = new a0.y(aVar);
            ((y1.l) semantics).g(y1.k.f458751c, new y1.a(this.f343g, yVar));
        }
        if (!this.f344h) {
            y1.m0.a(semantics);
        }
        return jz5.f0.f302826a;
    }
}
