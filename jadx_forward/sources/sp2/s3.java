package sp2;

/* loaded from: classes2.dex */
public final class s3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f492740d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f492741e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f492742f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f492743g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f492744h;

    /* renamed from: i, reason: collision with root package name */
    public int f492745i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(sp2.x3 x3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f492744h = x3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f492743g = obj;
        this.f492745i |= Integer.MIN_VALUE;
        return sp2.x3.P6(this.f492744h, null, null, this);
    }
}
