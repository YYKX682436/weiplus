package wf2;

/* loaded from: classes10.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f527108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.j f527109e;

    /* renamed from: f, reason: collision with root package name */
    public int f527110f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wf2.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f527109e = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f527108d = obj;
        this.f527110f |= Integer.MIN_VALUE;
        return wf2.j.a7(this.f527109e, this);
    }
}
