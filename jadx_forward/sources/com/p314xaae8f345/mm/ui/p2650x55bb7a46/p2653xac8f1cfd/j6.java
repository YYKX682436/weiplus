package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class j6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f280787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u6 f280789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u6 u6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f280788e = str;
        this.f280789f = u6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.j6(this.f280788e, this.f280789f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.j6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f280787d;
        java.lang.String talker = this.f280788e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gc0.y0 y0Var = gc0.y0.f351898a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talker, "$talker");
            this.f280787d = 1;
            obj = y0Var.b(talker, true, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        uc0.t tVar = (uc0.t) obj;
        if (tVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(talker);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u6.m0(this.f280789f, talker, true, tVar);
        }
        return jz5.f0.f384359a;
    }
}
