package v65;

/* loaded from: classes16.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f515082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f515083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f515084f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f515085g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.h f515086h;

    /* renamed from: i, reason: collision with root package name */
    public int f515087i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v65.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f515086h = hVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f515085g = obj;
        this.f515087i |= Integer.MIN_VALUE;
        return this.f515086h.a(this);
    }
}
