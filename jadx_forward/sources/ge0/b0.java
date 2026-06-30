package ge0;

/* loaded from: classes4.dex */
public class b0 implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsCommentSceneEnd");
        if (m1Var.mo808xfb85f7b0() == 213) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentSceneEnd", "snsUploadSceneEnd, errType:%s, errCode:%s, errMsg:%s, hashCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(hashCode()));
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().k(0, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsCommentSceneEnd");
    }
}
