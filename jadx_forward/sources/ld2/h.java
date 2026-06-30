package ld2;

/* loaded from: classes15.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399630d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f399631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f399632f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ld2.i f399634h;

    /* renamed from: i, reason: collision with root package name */
    public int f399635i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ld2.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f399634h = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f399633g = obj;
        this.f399635i |= Integer.MIN_VALUE;
        return this.f399634h.c(null, null, this);
    }
}
