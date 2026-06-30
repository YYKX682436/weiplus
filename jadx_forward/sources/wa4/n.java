package wa4;

/* loaded from: classes4.dex */
public class n extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f525798d;

    /* renamed from: e, reason: collision with root package name */
    public int f525799e;

    /* renamed from: f, reason: collision with root package name */
    public int f525800f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f525801g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f525802h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        if (fVar == null || !(fVar instanceof wa4.n)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        wa4.n nVar = (wa4.n) fVar;
        if (!n51.f.a(java.lang.Long.valueOf(this.f525798d), java.lang.Long.valueOf(nVar.f525798d))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f525799e), java.lang.Integer.valueOf(nVar.f525799e))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f525800f), java.lang.Integer.valueOf(nVar.f525800f))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        if (!n51.f.a(this.f525801g, nVar.f525801g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        if (n51.f.a(this.f525802h, nVar.f525802h)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f525798d);
            fVar.e(2, this.f525799e);
            fVar.e(3, this.f525800f);
            java.lang.String str = this.f525801g;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f525802h;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f525798d) + 0 + b36.f.e(2, this.f525799e) + b36.f.e(3, this.f525800f);
            java.lang.String str3 = this.f525801g;
            if (str3 != null) {
                h17 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f525802h;
            if (str4 != null) {
                h17 += b36.f.j(7, str4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return h17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (i17 != 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.n nVar = (wa4.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nVar.f525798d = aVar2.i(intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (intValue == 2) {
            nVar.f525799e = aVar2.g(intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (intValue == 3) {
            nVar.f525800f = aVar2.g(intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (intValue == 6) {
            nVar.f525801g = aVar2.k(intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (intValue != 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return -1;
        }
        nVar.f525802h = aVar2.k(intValue);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        return 0;
    }
}
