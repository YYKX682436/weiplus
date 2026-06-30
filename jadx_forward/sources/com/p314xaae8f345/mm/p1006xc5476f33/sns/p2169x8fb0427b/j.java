package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f247556a = new java.util.ArrayList();

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.j a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.f38128xfcc9a9d6);
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
                return this;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.TAG, "card ad tag %s", map.get(sb7));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(sb7))) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k();
                java.lang.String str2 = (java.lang.String) map.get(sb7);
                if (str2 == null) {
                    str2 = "";
                }
                kVar.f247561a = str2;
                java.lang.Object obj = sb7 + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.f38135xb61dbdeb;
                java.lang.Object obj2 = sb7 + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.f38134x51bbbd6d;
                java.lang.Object obj3 = sb7 + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.f38131x48626e0a;
                java.lang.Object obj4 = sb7 + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.f38130x626e5156;
                java.lang.Object obj5 = sb7 + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.f38133xb31b79cd;
                java.lang.Object obj6 = sb7 + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.f38132x34534133;
                java.lang.String str3 = (java.lang.String) map.get(obj);
                if (str3 == null) {
                    str3 = "";
                }
                kVar.f247562b = str3;
                java.lang.String str4 = (java.lang.String) map.get(obj2);
                if (str4 == null) {
                    str4 = "";
                }
                kVar.f247563c = str4;
                java.lang.String str5 = (java.lang.String) map.get(obj3);
                if (str5 == null) {
                    str5 = "";
                }
                kVar.f247564d = str5;
                java.lang.String str6 = (java.lang.String) map.get(obj4);
                if (str6 == null) {
                    str6 = "";
                }
                kVar.f247565e = str6;
                java.lang.String str7 = (java.lang.String) map.get(obj5);
                if (str7 == null) {
                    str7 = "";
                }
                kVar.f247566f = str7;
                java.lang.String str8 = (java.lang.String) map.get(obj6);
                kVar.f247567g = str8 != null ? str8 : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.TAG, "Tag content = ", kVar.f247561a + ", Tag light iconUrl = " + kVar.f247562b + ", Tag dark iconUrl = " + kVar.f247563c + ", Tag background light color = " + kVar.f247564d + ", Tag background dark color = " + kVar.f247565e + ", Tag content light color = " + kVar.f247566f + ", Tag content dark color = " + kVar.f247567g);
                ((java.util.ArrayList) this.f247556a).add(kVar);
            }
            i17++;
        }
    }

    /* renamed from: equals */
    public boolean m70500xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
            return true;
        }
        if (obj == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.j.class != obj.getClass()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
            return false;
        }
        boolean equals = java.util.Objects.equals(this.f247556a, ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.j) obj).f247556a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        return equals;
    }

    /* renamed from: hashCode */
    public int m70501x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        int hash = java.util.Objects.hash(this.f247556a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
        return hash;
    }
}
