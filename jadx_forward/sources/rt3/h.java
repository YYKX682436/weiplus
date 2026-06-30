package rt3;

/* loaded from: classes5.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt3.j f481068e;

    /* renamed from: f, reason: collision with root package name */
    public int f481069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rt3.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481068e = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481067d = obj;
        this.f481069f |= Integer.MIN_VALUE;
        return this.f481068e.c(false, null, null, this);
    }
}
