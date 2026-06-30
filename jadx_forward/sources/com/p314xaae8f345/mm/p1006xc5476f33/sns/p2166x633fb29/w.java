package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes.dex */
public class w extends java.util.LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeEldestEntry", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$2");
        if (size() > 500 && entry != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "remove eldest ad snsId " + entry.getKey());
        }
        boolean z17 = size() > 500;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeEldestEntry", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic$2");
        return z17;
    }
}
