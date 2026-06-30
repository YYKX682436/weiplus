package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class a3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b3 f245607a;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b3 b3Var) {
        this.f245607a = b3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b3 b3Var = this.f245607a;
        java.util.LinkedList linkedList = b3Var.f245622a;
        if (linkedList != null && !linkedList.isEmpty()) {
            r45.b50 b50Var = (r45.b50) b3Var.f245622a.getFirst();
            int i17 = b50Var.f452063d;
            b3Var.f245622a.removeFirst();
            int i18 = b50Var.f452063d;
            if (i18 == 45) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y2(this, b50Var));
            } else if (i18 != 46) {
                b3Var.f245623b.mo50305x3d8a09a2(0);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z2(this, b50Var));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3 c3Var = b3Var.f245624c;
        c3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p944x882e457a.o oVar = c3Var.f245650e;
        r45.la6 la6Var = (r45.la6) oVar.f152244b.f152233a;
        r45.ka6 ka6Var = (r45.ka6) oVar.f152243a.f152217a;
        byte[] c17 = o45.qi.c(ka6Var.f460100e.f453374f.g(), la6Var.f460814f.f453374f.g());
        if (c17 != null && c17.length > 0) {
            w11.c2.f523524a.d(c17, true);
        }
        ka6Var.f460100e.d(c17);
        if ((ka6Var.f460099d & la6Var.f460813e) == 0) {
            c3Var.f245651f.mo815x76e0bfae(0, 0, "", c3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        } else {
            c3Var.mo807x6c193ac1(c3Var.m47995xb7ba1aa7(), c3Var.f245651f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
    }
}
