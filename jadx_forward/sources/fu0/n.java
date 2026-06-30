package fu0;

/* loaded from: classes5.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f348335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fu0.p f348336e;

    /* renamed from: f, reason: collision with root package name */
    public int f348337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(fu0.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f348336e = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f348335d = obj;
        this.f348337f |= Integer.MIN_VALUE;
        return fu0.p.a(this.f348336e, null, this);
    }
}
