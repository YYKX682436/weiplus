package d83;

/* loaded from: classes2.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f308531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d83.o f308532e;

    /* renamed from: f, reason: collision with root package name */
    public int f308533f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d83.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f308532e = oVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f308531d = obj;
        this.f308533f |= Integer.MIN_VALUE;
        return this.f308532e.b(null, 0, false, null, false, this);
    }
}
