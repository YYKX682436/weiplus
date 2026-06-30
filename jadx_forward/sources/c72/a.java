package c72;

/* loaded from: classes8.dex */
public abstract class a extends com.p314xaae8f345.mm.p944x882e457a.m1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: dispatch */
    public int mo9409x10f9447a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_fix_device_type, true);
        if ((v0Var instanceof com.p314xaae8f345.mm.p944x882e457a.o) && fj6) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
            if (oVar.mo47979x2d63726f() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceNetSceneBase", "Build.MODEL:%s", wo.w0.m());
                oVar.mo47979x2d63726f().m150623x4af50cb2(wo.w0.m());
            }
        }
        return super.mo9409x10f9447a(sVar, v0Var, l0Var);
    }
}
