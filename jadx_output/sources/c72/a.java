package c72;

/* loaded from: classes8.dex */
public abstract class a extends com.tencent.mm.modelbase.m1 {
    @Override // com.tencent.mm.modelbase.m1
    public int dispatch(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_fix_device_type, true);
        if ((v0Var instanceof com.tencent.mm.modelbase.o) && fj6) {
            com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
            if (oVar.getReqObj() != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceNetSceneBase", "Build.MODEL:%s", wo.w0.m());
                oVar.getReqObj().setDeviceType(wo.w0.m());
            }
        }
        return super.dispatch(sVar, v0Var, l0Var);
    }
}
