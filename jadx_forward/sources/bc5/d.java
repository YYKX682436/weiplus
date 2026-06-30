package bc5;

/* loaded from: classes9.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f100712d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f100713e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100714f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f100715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bc5.e f100716h;

    /* renamed from: i, reason: collision with root package name */
    public int f100717i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bc5.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f100716h = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f100715g = obj;
        this.f100717i |= Integer.MIN_VALUE;
        return this.f100716h.f(false, false, false, false, this);
    }
}
