package jg0;

/* loaded from: classes12.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f381140d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f381141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381142f;

    /* renamed from: g, reason: collision with root package name */
    public int f381143g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jg0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f381142f = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f381141e = obj;
        this.f381143g |= Integer.MIN_VALUE;
        return this.f381142f.B(this);
    }
}
