package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes12.dex */
public class w0 implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.x0 f152088a;

    public w0(com.p314xaae8f345.mm.p943x351df9c2.x0 x0Var) {
        this.f152088a = x0Var;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        int ordinal = n1Var.f152636a.ordinal();
        com.p314xaae8f345.mm.p943x351df9c2.x0 x0Var = this.f152088a;
        if (ordinal == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "OnUploadCallbackError, SceneResult: %s", n1Var.f152641f);
            x0Var.f152089d.mo815x76e0bfae(3, -2, "", x0Var);
            return;
        }
        if (ordinal != 4) {
            if (ordinal != 16 && ordinal != 17) {
                switch (ordinal) {
                    case 12:
                    case 13:
                    case 14:
                        break;
                    default:
                        return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "action:%s", n1Var.f152636a);
            x0Var.f152089d.mo815x76e0bfae(3, -1, "", x0Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "OnUploadCallbackSuccess, SceneResult: %s", n1Var.f152641f);
        dn.h hVar = n1Var.f152641f;
        if (hVar == null) {
            x0Var.f152089d.mo815x76e0bfae(3, -1, "", x0Var);
        } else {
            x0Var.f152097o = hVar.f69524x419c440e;
            x0Var.mo807x6c193ac1(x0Var.f152099q, x0Var.f152089d);
        }
    }
}
