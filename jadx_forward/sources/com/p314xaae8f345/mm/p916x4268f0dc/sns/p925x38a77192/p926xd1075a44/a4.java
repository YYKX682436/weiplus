package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f151376d;

    /* renamed from: e, reason: collision with root package name */
    public int f151377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 f151378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f151379g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 c4121xb12fb285, n0.v2 v2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f151378f = c4121xb12fb285;
        this.f151379g = v2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.a4(this.f151378f, this.f151379g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.a4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        n0.v2 v2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f151377e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 c4121xb12fb285 = this.f151378f;
            java.lang.String m33902x1350c239 = c4121xb12fb285.m33902x1350c239();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33902x1350c239, "getPreviewImageWxAMURL(...)");
            java.lang.String m33900x89b8d154 = c4121xb12fb285.m33900x89b8d154();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33900x89b8d154, "getPreviewImageGifURL(...)");
            n0.v2 v2Var2 = this.f151379g;
            this.f151376d = v2Var2;
            this.f151377e = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new lz0.c(m33900x89b8d154, m33902x1350c239, null), this);
            if (obj == aVar) {
                return aVar;
            }
            v2Var = v2Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v2Var = (n0.v2) this.f151376d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        v2Var.mo148714x53d8522f((com.p314xaae8f345.mm.p1006xc5476f33.gif.b) obj);
        return jz5.f0.f384359a;
    }
}
