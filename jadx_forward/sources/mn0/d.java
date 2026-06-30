package mn0;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.y f411240e;

    /* renamed from: f, reason: collision with root package name */
    public int f411241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mn0.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f411240e = yVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f411239d = obj;
        this.f411241f |= Integer.MIN_VALUE;
        mn0.y.c(this.f411240e, null, this);
        return pz5.a.f440719d;
    }
}
