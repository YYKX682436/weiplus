package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f275023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f275024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f275025f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f275026g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r45.jj4 jj4Var, boolean z17, n0.v2 v2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f275024e = jj4Var;
        this.f275025f = z17;
        this.f275026g = v2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.i(this.f275024e, this.f275025f, this.f275026g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f275023d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f275023d = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlatformOp", "getSnsMediaBitmap() called with: mediaId = " + this.f275024e.f459388d + ", thumb = " + this.f275025f);
            obj = null;
            if (aVar == null) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            this.f275026g.mo148714x53d8522f(e1.e.b(bitmap));
        }
        return jz5.f0.f384359a;
    }
}
