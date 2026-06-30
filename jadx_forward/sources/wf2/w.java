package wf2;

/* loaded from: classes10.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f527156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f527157e;

    /* renamed from: f, reason: collision with root package name */
    public int f527158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(wf2.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f527157e = a0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f527156d = obj;
        this.f527158f |= Integer.MIN_VALUE;
        return this.f527157e.c7(this);
    }
}
