package bm1;

/* loaded from: classes9.dex */
public final class a implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final bm1.a f21742d = new bm1.a();

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WMPFVoip.CgiUpdateWmpfCallInVoipRoomStatus", "onResp, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        return 0;
    }
}
