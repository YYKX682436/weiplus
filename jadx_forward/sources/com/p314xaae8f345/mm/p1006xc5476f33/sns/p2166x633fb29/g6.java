package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g6 f245743a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g6();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f245744b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f245745c = new java.util.LinkedHashMap();

    public final void a(java.lang.String key, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.api.C4986x2b88169c c4986x2b88169c = (com.p314xaae8f345.mm.api.C4986x2b88169c) it.next();
                r45.x96 x96Var = new r45.x96();
                x96Var.f471434d = c4986x2b88169c.f134734d;
                x96Var.f471435e = c4986x2b88169c.f134735e;
                arrayList.add(x96Var);
            }
        }
        f245745c.put(key, arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
    }

    public final java.util.List b(java.lang.String path) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.util.Map map = f245744b;
        if (((java.util.LinkedHashMap) map).get(path) == null) {
            map.put(path, new java.util.ArrayList());
        }
        java.lang.Object obj = ((java.util.LinkedHashMap) map).get(path);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        java.util.List list = (java.util.List) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        return list;
    }

    public final void c(java.lang.String path, android.os.Bundle bundle, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (bundle == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(path)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsPostSafeStrategyDataHelper", "putEmotionSafeStrategyInfoList: failed, arguments error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
            return;
        }
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList == null) {
            parcelableArrayList = new java.util.ArrayList();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            android.os.Parcelable parcelable = (android.os.Parcelable) it.next();
            if (parcelable instanceof com.p314xaae8f345.mm.api.C4986x2b88169c) {
                arrayList.add(parcelable);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        f245744b.put(path, arrayList);
        arrayList.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
    }

    public final void d(java.lang.String oldKey, java.lang.String newKey) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateKeyAndMoveEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldKey, "oldKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newKey, "newKey");
        java.util.Map map = f245744b;
        java.util.Collection collection = (java.util.List) ((java.util.LinkedHashMap) map).get(oldKey);
        if (collection == null) {
            collection = new java.util.ArrayList();
        }
        map.put(newKey, collection);
        map.put(oldKey, new java.util.ArrayList());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateKeyAndMoveEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
    }
}
