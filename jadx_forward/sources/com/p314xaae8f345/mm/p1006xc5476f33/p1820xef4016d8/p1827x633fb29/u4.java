package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class u4 implements dn.k {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t4 f227189e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f227190f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f227188d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f227191g = true;

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (hVar != null && this.f227188d.equals(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69522xf9dbbe9c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer success, sceneResult.field_retCode:" + hVar.f69553xb5f54fe9);
            if (i17 == 0 && hVar.f69553xb5f54fe9 == 0) {
                if (this.f227191g) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, upload callback success");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, download callback success");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd:transfer done, mediaid=%s, completeInfo=%s", str, hVar.m125799x9616526c());
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t4 t4Var = this.f227189e;
                if (t4Var != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u0) t4Var).a(str, hVar, this.f227190f, true);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t4 t4Var2 = this.f227189e;
                if (t4Var2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u0) t4Var2).a(str, hVar, this.f227190f, false);
                }
            }
        } else if (hVar != null && this.f227188d.equals(str) && hVar.f69553xb5f54fe9 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail, sceneResult.field_retCode:" + hVar.f69553xb5f54fe9);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t4 t4Var3 = this.f227189e;
            if (t4Var3 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u0) t4Var3).a(str, hVar, this.f227190f, false);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
