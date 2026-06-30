package qg5;

/* loaded from: classes12.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f444784e;

    /* renamed from: f, reason: collision with root package name */
    public int f444785f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(qg5.l0 l0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f444784e = l0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f444783d = obj;
        this.f444785f |= Integer.MIN_VALUE;
        return this.f444784e.bj(null, this);
    }
}
