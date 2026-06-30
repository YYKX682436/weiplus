package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class sf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f214568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c f214569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f214570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 f214571g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c c15329xd3ad392c, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f214569e = c15329xd3ad392c;
        this.f214570f = s0Var;
        this.f214571g = k8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sf(this.f214569e, this.f214570f, this.f214571g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f214568d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c c15329xd3ad392c = this.f214569e;
            r45.yk2 yk2Var = c15329xd3ad392c.f212870m;
            r45.zk2 zk2Var = (yk2Var == null || (m75941xfb821914 = yk2Var.m75941xfb821914(1)) == null) ? null : (r45.zk2) m75941xfb821914.getFirst();
            if (zk2Var != null) {
                c15329xd3ad392c.f212866f = this.f214570f;
                c15329xd3ad392c.f212865e = new java.lang.ref.WeakReference(this.f214571g);
                if (c15329xd3ad392c.getContext() instanceof android.app.Activity) {
                    android.content.Context context = c15329xd3ad392c.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    c15329xd3ad392c.f212867g = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
                }
                this.f214568d = 1;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c.a(c15329xd3ad392c, zk2Var, false, this) == aVar) {
                    return aVar;
                }
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
