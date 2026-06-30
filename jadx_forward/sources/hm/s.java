package hm;

/* loaded from: classes12.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363702d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f363703e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hm.u f363705g;

    /* renamed from: h, reason: collision with root package name */
    public int f363706h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hm.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f363705g = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f363704f = obj;
        this.f363706h |= Integer.MIN_VALUE;
        return this.f363705g.U6(null, this);
    }
}
