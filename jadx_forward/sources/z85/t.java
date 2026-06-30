package z85;

/* loaded from: classes4.dex */
public class t extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f552354e = {l75.n0.m145250x3fdc6f77(z85.s.f552353r, "EmotionDetailInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f552355d;

    public t(l75.k0 k0Var) {
        super(k0Var, z85.s.f552353r, "EmotionDetailInfo", null);
        this.f552355d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: getTableName */
    public java.lang.String mo145255x88e404c3() {
        return "EmotionDetailInfo";
    }

    public z85.s y0(java.lang.String str) {
        z85.s sVar = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmotionDetailInfoStorage", "getEmotionDetailRespnseByPID failed. productID is null.");
            return null;
        }
        android.database.Cursor D = this.f552355d.D("EmotionDetailInfo", new java.lang.String[]{"content", "lan"}, "productID=?", new java.lang.String[]{str}, null, null, null, 2);
        if (D != null && D.moveToFirst()) {
            sVar = new z85.s();
            sVar.f65848xad49e234 = D.getBlob(0);
            sVar.f65849x4b6e64d4 = D.getString(1);
            sVar.f65850x5bec8145 = str;
        }
        if (D != null) {
            D.close();
        }
        return sVar;
    }

    public void z0(java.lang.String str, r45.se3 se3Var, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || se3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
        }
        try {
            z85.s sVar = new z85.s();
            sVar.f65850x5bec8145 = str;
            sVar.f65848xad49e234 = se3Var.mo14344x5f01b1f6();
            sVar.f65849x4b6e64d4 = str2;
            if (this.f552355d.m("EmotionDetailInfo", "productID", sVar.mo9763xeb27878e()) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID success. ProductId:%s", str);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID failed. ProductId:%s", str);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
