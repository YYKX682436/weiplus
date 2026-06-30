package gg2;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f353193d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f353194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg2.b f353195f;

    /* renamed from: g, reason: collision with root package name */
    public int f353196g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gg2.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f353195f = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f353194e = obj;
        this.f353196g |= Integer.MIN_VALUE;
        return this.f353195f.b(this);
    }
}
