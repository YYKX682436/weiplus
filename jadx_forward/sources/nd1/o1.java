package nd1;

/* loaded from: classes7.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f417901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f417903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417904g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417905h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417906i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417907m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ nd1.p1 f417908n;

    public o1(nd1.p1 p1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f417908n = p1Var;
        this.f417901d = e9Var;
        this.f417902e = i17;
        this.f417903f = i18;
        this.f417904g = str;
        this.f417905h = str2;
        this.f417906i = str3;
        this.f417907m = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f417901d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = e9Var.mo32091x9a3f0ba2().x0().m52169xfdaa7672();
        boolean z17 = m52169xfdaa7672 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1;
        nd1.p1 p1Var = this.f417908n;
        int i19 = this.f417902e;
        if (!z17) {
            e9Var.a(i19, p1Var.o("fail:not TabBar page"));
            return;
        }
        zl1.t m52251x308dc334 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) m52169xfdaa7672).m52251x308dc334();
        java.lang.String str = this.f417906i;
        java.lang.String str2 = this.f417907m;
        m52251x308dc334.getClass();
        try {
            i17 = ik1.w.l(str);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        try {
            i18 = ik1.w.l(str2);
        } catch (java.lang.Exception unused2) {
            i18 = -1;
        }
        int i27 = 0;
        while (true) {
            java.util.LinkedList linkedList = m52251x308dc334.f555153i;
            if (i27 >= linkedList.size()) {
                m52251x308dc334.e(new zl1.b(m52251x308dc334));
                e9Var.a(i19, p1Var.o("ok"));
                return;
            }
            if (i27 == this.f417903f) {
                zl1.r rVar = (zl1.r) linkedList.get(i27);
                rVar.f555143f = false;
                rVar.f555144g = "";
                rVar.f555145h = 0;
                rVar.f555146i = -1;
                java.lang.String str3 = this.f417904g;
                if ("redDot".equals(str3)) {
                    ((zl1.r) linkedList.get(i27)).f555143f = true;
                } else if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24.equals(str3)) {
                    ((zl1.r) linkedList.get(i27)).f555144g = this.f417905h;
                    ((zl1.r) linkedList.get(i27)).f555145h = i17;
                    ((zl1.r) linkedList.get(i27)).f555146i = i18;
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc.equals(str3)) {
                    ((zl1.r) linkedList.get(i27)).f555143f = false;
                    ((zl1.r) linkedList.get(i27)).f555144g = "";
                }
            }
            i27++;
        }
    }
}
