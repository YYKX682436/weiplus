package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 f233513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bq.z1 f233514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f233515f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 c16702xded4f4e3, bq.z1 z1Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f233513d = c16702xded4f4e3;
        this.f233514e = z1Var;
        this.f233515f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w3(this.f233513d, this.f233514e, this.f233515f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w3 w3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        w3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bq.z1 z1Var = this.f233514e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g E = z1Var.E();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 c16702xded4f4e3 = this.f233513d;
        c16702xded4f4e3.f233263w = E;
        java.util.List<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> K = z1Var.K();
        if (K != null) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : K) {
                jm3.h1.f381855a.a(c19792x256d2725);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                if (c19792x256d2725.m76815x4f546659() != 1 ? m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null || c19788xd7cfd73e.m76613x7f025288() != 2 : false) {
                    long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                    java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
                    if (!c16702xded4f4e3.m67348x9c35b48d().contains(new java.lang.Long(m76784x5db1b11))) {
                        c16702xded4f4e3.m67345xe6796cde().add(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.q3(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3(m76784x5db1b11, m76803x6c285d75, c19792x256d2725, false, 8, null)));
                    }
                }
            }
            c16702xded4f4e3.m67343xf939df19().m8146xced61ae5();
            yz5.a onSceneEndListener = c16702xded4f4e3.getOnSceneEndListener();
            if (onSceneEndListener != null) {
                onSceneEndListener.mo152xb9724478();
            }
        }
        c16702xded4f4e3.m67361xdac5ee4d(z1Var.f105081z);
        this.f233515f.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
