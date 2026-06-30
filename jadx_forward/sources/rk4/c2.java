package rk4;

/* loaded from: classes.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25010xf04c5f7a f478110f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.content.Context context, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25010xf04c5f7a c25010xf04c5f7a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478109e = context;
        this.f478110f = c25010xf04c5f7a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.c2(this.f478109e, this.f478110f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.c2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478108d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rk4.u6 u6Var = rk4.k8.f478321r;
            al4.a aVar2 = rk4.k8.f478323t;
            if (aVar2 != null) {
                this.f478108d = 1;
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
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_profile_tab", 8);
        intent.putExtra("finder_username", this.f478110f.m92760x6c03c64c());
        intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        e1Var.w(this.f478109e, intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true));
        return f0Var;
    }
}
