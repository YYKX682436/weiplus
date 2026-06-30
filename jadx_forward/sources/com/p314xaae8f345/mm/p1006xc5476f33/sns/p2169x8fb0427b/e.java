package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f247499a = new java.util.ArrayList();

    public e(java.util.Map map) {
        java.lang.String str;
        int i17 = 0;
        while (true) {
            java.lang.String str2 = ".ADInfo.adActionExt.adVoteInfoExt.voteItemList.voteResultInfo";
            if (i17 != 0) {
                str2 = ".ADInfo.adActionExt.adVoteInfoExt.voteItemList.voteResultInfo" + i17;
            }
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".id");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str3 = str3 == null ? "" : str3;
            if (android.text.TextUtils.isEmpty(str3)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f();
            fVar.f247506a = str3;
            fVar.f247507b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str2 + ".scoring"), 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".friends"));
            java.lang.String str4 = str2 + ".friendsList.userName";
            int i18 = 0;
            while (true) {
                if (i18 == 0) {
                    str = str4;
                } else {
                    str = str4 + i18;
                }
                java.lang.String str5 = (java.lang.String) map.get(str);
                str5 = str5 == null ? "" : str5;
                if (android.text.TextUtils.isEmpty(str5)) {
                    break;
                }
                fVar.f247508c.add(str5);
                i18++;
            }
            this.f247499a.add(fVar);
            i17++;
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
            return null;
        }
        java.util.Iterator it = this.f247499a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f) it.next();
            if (str.equals(fVar.f247506a)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                return fVar;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
        return null;
    }

    public e() {
    }
}
