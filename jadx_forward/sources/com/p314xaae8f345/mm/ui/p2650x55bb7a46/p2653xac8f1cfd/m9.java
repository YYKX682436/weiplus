package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class m9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f281022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f281023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f281024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f f281025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f281026i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f281027m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f281022e = context;
        this.f281023f = list;
        this.f281024g = z3Var;
        this.f281025h = fVar;
        this.f281026i = c0Var;
        this.f281027m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m9(this.f281022e, this.f281023f, this.f281024g, this.f281025h, this.f281026i, this.f281027m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f281021d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bc5.e eVar = new bc5.e(this.f281022e, this.f281023f, this.f281024g);
            this.f281021d = 1;
            obj = eVar.f(false, false, true, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l9 l9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l9(this.f281025h, this.f281026i, this.f281027m, booleanValue, null);
        this.f281021d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, l9Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
