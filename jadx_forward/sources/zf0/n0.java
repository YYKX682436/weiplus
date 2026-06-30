package zf0;

/* loaded from: classes12.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f554020d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f554021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f554022f;

    /* renamed from: g, reason: collision with root package name */
    public int f554023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(zf0.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f554022f = v0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f554021e = obj;
        this.f554023g |= Integer.MIN_VALUE;
        return this.f554022f.B(this);
    }
}
