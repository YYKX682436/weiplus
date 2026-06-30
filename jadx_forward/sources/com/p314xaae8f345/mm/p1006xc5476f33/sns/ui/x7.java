package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class x7 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f253025a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f253026b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f253027c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f253028d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f253029e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f253030f = new java.util.HashMap();

    public x7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var) {
    }

    public static /* synthetic */ java.util.ArrayList a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x7 x7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        java.util.ArrayList arrayList = x7Var.f253025a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return arrayList;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x7 b(java.lang.String str, int i17, boolean z17, com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 c11131x285e79f8, r45.h96 h96Var, r45.vb1 vb1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        this.f253025a.add(str);
        ((java.util.HashMap) this.f253027c).put(str, java.lang.Integer.valueOf(i17));
        ((java.util.HashMap) this.f253026b).put(str, java.lang.Boolean.valueOf(z17));
        if (c11131x285e79f8 != null) {
            ((java.util.HashMap) this.f253028d).put(str, c11131x285e79f8);
        }
        if (h96Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PicWidget", "addMedia snsMediaEcsInfo path: %s", str);
            ((java.util.HashMap) this.f253029e).put(str, h96Var);
        }
        if (vb1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PicWidget", "addMedia snsMediaEcsInfo path: %s", str);
            ((java.util.HashMap) this.f253030f).put(str, vb1Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return this;
    }

    public int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaSize", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        int size = this.f253025a.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaSize", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return size;
    }

    public java.util.ArrayList d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        java.util.ArrayList arrayList = this.f253025a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return arrayList;
    }

    /* renamed from: toString */
    public java.lang.String m71364x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        java.util.Iterator it = this.f253025a.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            java.util.Map map = this.f253027c;
            str = str + str2 + "," + (map != null ? ((java.lang.Integer) ((java.util.HashMap) map).get(str2)).intValue() : 0) + ";";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        return str;
    }
}
