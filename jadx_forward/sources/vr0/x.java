package vr0;

/* loaded from: classes14.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f521057d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f521058e;

    /* renamed from: f, reason: collision with root package name */
    public long f521059f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f521060g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521061h;

    /* renamed from: i, reason: collision with root package name */
    public int f521062i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(vr0.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f521061h = zVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f521060g = obj;
        this.f521062i |= Integer.MIN_VALUE;
        return this.f521061h.l(0, 0, 0, false, this);
    }
}
