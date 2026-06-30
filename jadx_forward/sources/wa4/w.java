package wa4;

/* loaded from: classes4.dex */
public class w extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public long f525824e;

    /* renamed from: f, reason: collision with root package name */
    public int f525825f;

    /* renamed from: h, reason: collision with root package name */
    public int f525827h;

    /* renamed from: i, reason: collision with root package name */
    public int f525828i;

    /* renamed from: m, reason: collision with root package name */
    public int f525829m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f525823d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f525826g = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f525830n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f525831o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
        if (fVar == null || !(fVar instanceof wa4.w)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        wa4.w wVar = (wa4.w) fVar;
        if (!n51.f.a(this.f525823d, wVar.f525823d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Long.valueOf(this.f525824e), java.lang.Long.valueOf(wVar.f525824e))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f525825f), java.lang.Integer.valueOf(wVar.f525825f))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(this.f525826g, wVar.f525826g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f525827h), java.lang.Integer.valueOf(wVar.f525827h))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f525828i), java.lang.Integer.valueOf(wVar.f525828i))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f525829m), java.lang.Integer.valueOf(wVar.f525829m))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(this.f525830n, wVar.f525830n)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (n51.f.a(this.f525831o, wVar.f525831o)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
        java.util.LinkedList linkedList = this.f525826g;
        java.util.LinkedList linkedList2 = this.f525823d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 3, linkedList2);
            fVar.h(2, this.f525824e);
            fVar.e(3, this.f525825f);
            fVar.g(4, 3, linkedList);
            fVar.e(5, this.f525827h);
            fVar.e(6, this.f525828i);
            fVar.e(7, this.f525829m);
            fVar.g(8, 1, this.f525830n);
            fVar.g(9, 3, this.f525831o);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 3, linkedList2) + 0 + b36.f.h(2, this.f525824e) + b36.f.e(3, this.f525825f) + b36.f.g(4, 3, linkedList) + b36.f.e(5, this.f525827h) + b36.f.e(6, this.f525828i) + b36.f.e(7, this.f525829m) + b36.f.g(8, 1, this.f525830n) + b36.f.g(9, 3, this.f525831o);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            this.f525830n.clear();
            this.f525831o.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return 0;
        }
        if (i17 != 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.w wVar = (wa4.w) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wVar.f525823d.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 2:
                wVar.f525824e = aVar2.i(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 3:
                wVar.f525825f = aVar2.g(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 4:
                wVar.f525826g.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 5:
                wVar.f525827h = aVar2.g(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 6:
                wVar.f525828i = aVar2.g(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 7:
                wVar.f525829m = aVar2.g(intValue);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 8:
                wVar.f525830n.add(aVar2.k(intValue));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 9:
                wVar.f525831o.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return -1;
        }
    }
}
