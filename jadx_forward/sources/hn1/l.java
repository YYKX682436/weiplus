package hn1;

/* loaded from: classes11.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn1.s f363993e;

    /* renamed from: f, reason: collision with root package name */
    public int f363994f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hn1.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f363993e = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f363992d = obj;
        this.f363994f |= Integer.MIN_VALUE;
        return this.f363993e.fj(null, 0.0f, this);
    }
}
