package wa4;

/* loaded from: classes4.dex */
public class m extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f525792d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l76 f525793e;

    /* renamed from: f, reason: collision with root package name */
    public int f525794f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f525795g;

    /* renamed from: h, reason: collision with root package name */
    public int f525796h;

    /* renamed from: i, reason: collision with root package name */
    public int f525797i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
        if (fVar == null || !(fVar instanceof wa4.m)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        wa4.m mVar = (wa4.m) fVar;
        if (!n51.f.a(this.f525792d, mVar.f525792d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (!n51.f.a(this.f525793e, mVar.f525793e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f525794f), java.lang.Integer.valueOf(mVar.f525794f))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (!n51.f.a(this.f525795g, mVar.f525795g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f525796h), java.lang.Integer.valueOf(mVar.f525796h))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (n51.f.a(java.lang.Integer.valueOf(this.f525797i), java.lang.Integer.valueOf(mVar.f525797i))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f525792d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.l76 l76Var = this.f525793e;
            if (l76Var != null) {
                fVar.i(2, l76Var.mo75928xcd1e8d8());
                this.f525793e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f525794f);
            java.lang.String str2 = this.f525795g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f525796h);
            fVar.e(6, this.f525797i);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f525792d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.l76 l76Var2 = this.f525793e;
            if (l76Var2 != null) {
                j17 += b36.f.i(2, l76Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(3, this.f525794f);
            java.lang.String str4 = this.f525795g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            int e18 = e17 + b36.f.e(5, this.f525796h) + b36.f.e(6, this.f525797i);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return 0;
        }
        if (i17 != 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.m mVar = (wa4.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mVar.f525792d = aVar2.k(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.l76 l76Var3 = new r45.l76();
                    if (bArr != null && bArr.length > 0) {
                        l76Var3.mo11468x92b714fd(bArr);
                    }
                    mVar.f525793e = l76Var3;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 3:
                mVar.f525794f = aVar2.g(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 4:
                mVar.f525795g = aVar2.k(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 5:
                mVar.f525796h = aVar2.g(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 6:
                mVar.f525797i = aVar2.g(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return -1;
        }
    }
}
