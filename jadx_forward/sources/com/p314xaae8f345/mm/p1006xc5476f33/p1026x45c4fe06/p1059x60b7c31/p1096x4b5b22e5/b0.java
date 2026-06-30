package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class b0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g f163728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ze.n f163729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f163730c;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0 i0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g gVar, ze.n nVar, ik1.b0 b0Var) {
        this.f163728a = gVar;
        this.f163729b = nVar;
        this.f163730c = b0Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        java.lang.String obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g gVar = this.f163728a;
        if (gVar != null) {
            boolean z17 = false;
            if (obj instanceof java.lang.Exception) {
                obj2 = ((java.lang.Exception) obj).getMessage();
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.e.IGNORE == obj) {
                obj2 = "ok";
                z17 = true;
            } else {
                obj2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.e.CANCEL == obj ? "cancel" : obj == null ? com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16697x69dc35be : obj.toString();
            }
            gVar.a(z17, obj2);
        }
        this.f163729b.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.a0(this));
    }
}
