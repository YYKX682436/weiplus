package u26;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f505689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.k f505690e;

    /* renamed from: f, reason: collision with root package name */
    public int f505691f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u26.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f505690e = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f505689d = obj;
        this.f505691f |= Integer.MIN_VALUE;
        java.lang.Object i17 = this.f505690e.i(this);
        return i17 == pz5.a.f440719d ? i17 : new u26.c0(i17);
    }
}
