package rk4;

/* loaded from: classes.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f478249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478246e = context;
        this.f478247f = str;
        this.f478248g = str2;
        this.f478249h = intent;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.i3(this.f478246e, this.f478247f, this.f478248g, this.f478249h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.i3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478245d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rk4.u6 u6Var = rk4.k8.f478321r;
            al4.a aVar2 = rk4.k8.f478323t;
            if (aVar2 != null) {
                this.f478245d = 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        j45.l.j(this.f478246e, this.f478247f, this.f478248g, this.f478249h, null);
        return f0Var;
    }
}
