package v65;

/* loaded from: classes16.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f515089d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f515090e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f515091f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f515092g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.h f515093h;

    /* renamed from: i, reason: collision with root package name */
    public int f515094i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v65.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f515093h = hVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f515092g = obj;
        this.f515094i |= Integer.MIN_VALUE;
        return this.f515093h.c(null, this);
    }
}
