package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class g5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 f179576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f179577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 f179578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f179579g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f179576d = g2Var;
        this.f179577e = bitmap;
        this.f179578f = activityC13326xc73ec7a9;
        this.f179579g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g5(this.f179576d, this.f179577e, this.f179578f, this.f179579g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g5 g5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g5Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f179576d.f179571j = this.f179577e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x4 x4Var = this.f179578f.G;
        if (x4Var != null) {
            x4Var.m8147xed6e4d18(this.f179579g);
        }
        return jz5.f0.f384359a;
    }
}
