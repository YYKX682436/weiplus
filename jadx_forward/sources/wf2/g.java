package wf2;

/* loaded from: classes10.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f527111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.h f527112e;

    /* renamed from: f, reason: collision with root package name */
    public int f527113f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wf2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f527112e = hVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f527111d = obj;
        this.f527113f |= Integer.MIN_VALUE;
        return this.f527112e.d(null, this);
    }
}
