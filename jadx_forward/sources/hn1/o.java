package hn1;

/* loaded from: classes11.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f364001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn1.s f364002e;

    /* renamed from: f, reason: collision with root package name */
    public int f364003f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hn1.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f364002e = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f364001d = obj;
        this.f364003f |= Integer.MIN_VALUE;
        return this.f364002e.nj(null, null, 0.0f, null, this);
    }
}
