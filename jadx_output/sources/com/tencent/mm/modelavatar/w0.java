package com.tencent.mm.modelavatar;

/* loaded from: classes12.dex */
public class w0 implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.x0 f70555a;

    public w0(com.tencent.mm.modelavatar.x0 x0Var) {
        this.f70555a = x0Var;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 n1Var) {
        int ordinal = n1Var.f71103a.ordinal();
        com.tencent.mm.modelavatar.x0 x0Var = this.f70555a;
        if (ordinal == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "OnUploadCallbackError, SceneResult: %s", n1Var.f71108f);
            x0Var.f70556d.onSceneEnd(3, -2, "", x0Var);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "action:%s", n1Var.f71103a);
            x0Var.f70556d.onSceneEnd(3, -1, "", x0Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "OnUploadCallbackSuccess, SceneResult: %s", n1Var.f71108f);
        dn.h hVar = n1Var.f71108f;
        if (hVar == null) {
            x0Var.f70556d.onSceneEnd(3, -1, "", x0Var);
        } else {
            x0Var.f70564o = hVar.field_fileUrl;
            x0Var.doScene(x0Var.f70566q, x0Var.f70556d);
        }
    }
}
