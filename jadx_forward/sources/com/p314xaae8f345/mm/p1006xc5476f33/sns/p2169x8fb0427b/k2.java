package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class k2 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f247570e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.j2.f247559w, "SnsReportKv")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f247571d;

    public k2(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.j2.f247559w, "SnsReportKv", dm.wa.f322420m);
        this.f247571d = k0Var;
    }

    public int y0(r45.e96 e96Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        r45.e96 e96Var2 = new r45.e96();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int size = e96Var.f454713d.size();
            linkedList = e96Var2.f454713d;
            if (i17 >= size) {
                break;
            }
            r45.e44 e44Var = (r45.e44) e96Var.f454713d.get(i17);
            byte[] bArr = e44Var.f454541e.f273689a;
            if (bArr.length + i18 > 51200) {
                z0(e96Var2, i18);
                i19++;
                linkedList.clear();
                i18 = 0;
            } else {
                i18 += bArr.length;
                linkedList.add(e44Var);
            }
            i17++;
        }
        if (linkedList.size() > 0) {
            i19++;
            z0(e96Var2, i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        return i19;
    }

    public final int z0(r45.e96 e96Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addKvImpl", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        try {
            byte[] mo14344x5f01b1f6 = e96Var.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.j2();
            j2Var.f69037x29f571ec = mo14344x5f01b1f6;
            j2Var.f69035x88ff61cc = java.lang.System.currentTimeMillis();
            j2Var.f69034x88feef00 = i17;
            j2Var.f69036x90a9378 = 0;
            int l17 = (int) this.f247571d.l("SnsReportKv", "", j2Var.mo9763xeb27878e());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addKvImpl", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
            return l17;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addKvImpl", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
            return 0;
        }
    }
}
