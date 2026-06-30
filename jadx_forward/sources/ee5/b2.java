package ee5;

/* loaded from: classes9.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f333366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae5.g f333367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f333368g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(android.view.View view, ae5.g gVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333366e = view;
        this.f333367f = gVar;
        this.f333368g = f9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ee5.b2(this.f333366e, this.f333367f, this.f333368g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.b2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f333365d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            android.content.Context context = this.f333366e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String str = this.f333367f.f85934e;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f333368g;
            bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_SEARCH;
            this.f333365d = 1;
            if (((b00.r) z2Var).oj(context, str, f9Var, x8Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
