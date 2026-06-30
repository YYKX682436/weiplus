package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29;

/* loaded from: classes13.dex */
public class k extends dm.j8 {

    /* renamed from: y0, reason: collision with root package name */
    public static final l75.e0 f233911y0 = dm.j8.m125147x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k.class);

    public k() {
    }

    @Override // dm.j8, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f233911y0;
    }

    /* renamed from: toString */
    public java.lang.String m67456x9616526c() {
        java.lang.String str;
        java.util.LinkedList linkedList;
        r45.sm6 sm6Var = this.f67142x4548bac4;
        if (sm6Var == null || (linkedList = sm6Var.f467382d) == null || linkedList.size() <= 0) {
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = this.f67142x4548bac4.f467382d.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(",");
            }
            str = sb6.toString();
        }
        return "NewTipsInfo{field_uniqueId='" + this.f67151xc35ee71 + "', field_path='" + this.f67143x2260084a + "', field_showType=" + this.f67146x991217c + ", field_title='" + this.f67150x29dd02d3 + "', field_icon_url='" + this.f67137xf1cc564e + "', field_parents=" + str + ", field_tipId=" + this.f67148x29dcef91 + ", field_priority=" + this.f67144xd84b8349 + ", field_tipType=" + this.f67149x2664ac30 + ", field_beginShowTime=" + this.f67131x8fbc34ae + ", field_overdueTime=" + this.f67141xcd55f7c8 + ", field_disappearTime=" + this.f67132x1a23a28b + ", field_minClientVersion=" + this.f67140xf3cd6a00 + ", field_maxClientVersion=" + this.f67139xf79bf82e + ", field_lang=" + this.f67138x225e3613 + ", field_reg=" + this.f67145x68c45cc7 + ", field_state=" + this.f67147x29d3a50c + ", field_dynamicPath='" + this.f67133x5c52593f + "'}";
    }

    public k(java.lang.String str, int i17, int i18, int i19, long j17, long j18, long j19, int i27, int i28, java.lang.String str2) {
        this.f67151xc35ee71 = str;
        this.f67148x29dcef91 = i17;
        this.f67144xd84b8349 = i18;
        this.f67149x2664ac30 = i19;
        this.f67131x8fbc34ae = j17;
        this.f67141xcd55f7c8 = j18;
        this.f67132x1a23a28b = j19;
        this.f67140xf3cd6a00 = i27;
        this.f67139xf79bf82e = i28;
        this.f67136x26b3182a = str2;
    }
}
