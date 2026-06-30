package wa4;

/* loaded from: classes4.dex */
public class q extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f525808d;

    /* renamed from: e, reason: collision with root package name */
    public int f525809e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f525810f;

    /* renamed from: g, reason: collision with root package name */
    public long f525811g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        if (fVar == null || !(fVar instanceof wa4.q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        }
        wa4.q qVar = (wa4.q) fVar;
        if (!n51.f.a(this.f525808d, qVar.f525808d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f525809e), java.lang.Integer.valueOf(qVar.f525809e))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        }
        if (!n51.f.a(this.f525810f, qVar.f525810f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        }
        if (n51.f.a(java.lang.Long.valueOf(this.f525811g), java.lang.Long.valueOf(qVar.f525811g))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f525808d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f525809e);
            java.lang.String str2 = this.f525810f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f525811g);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f525808d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f525809e);
            java.lang.String str4 = this.f525810f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            int h17 = j17 + b36.f.h(4, this.f525811g);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return h17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (i17 != 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.q qVar = (wa4.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qVar.f525808d = aVar2.k(intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (intValue == 2) {
            qVar.f525809e = aVar2.g(intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (intValue == 3) {
            qVar.f525810f = aVar2.k(intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (intValue != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return -1;
        }
        qVar.f525811g = aVar2.i(intValue);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        return 0;
    }
}
