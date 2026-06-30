package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class n8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f286439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f286440e = dVar;
        this.f286441f = f9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n8(this.f286440e, this.f286441f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f286439d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            yb5.d dVar = this.f286440e;
            android.app.Activity g17 = dVar.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
            java.lang.String d17 = dVar.u().d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286441f;
            bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_CONVERSATION;
            this.f286439d = 1;
            if (((b00.r) z2Var).oj(g17, d17, f9Var, x8Var, this) == aVar) {
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
