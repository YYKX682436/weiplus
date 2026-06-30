package f;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f.a f339505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h f339506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h.b f339508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f339509h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f.a aVar, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h hVar, java.lang.String str, h.b bVar, n0.e5 e5Var) {
        super(1);
        this.f339505d = aVar;
        this.f339506e = hVar;
        this.f339507f = str;
        this.f339508g = bVar;
        this.f339509h = e5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        f.b bVar = new f.b(this.f339509h);
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c e17 = this.f339506e.e(this.f339507f, this.f339508g, bVar);
        f.a aVar = this.f339505d;
        aVar.f339502a = e17;
        return new f.c(aVar);
    }
}
