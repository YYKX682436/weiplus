package b31;

/* loaded from: classes3.dex */
public class d implements com.tencent.mm.modelbase.u0 {
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.d().q(228, this);
        if (m1Var instanceof b31.a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewVoiceInputReportManager", "onSceneEnd errType = %s, errCode = %s, errMsg = %s ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
    }
}
