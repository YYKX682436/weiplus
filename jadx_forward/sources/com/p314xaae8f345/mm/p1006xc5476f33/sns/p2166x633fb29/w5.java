package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f246269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f246270b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u5 f246271c;

    public w5(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u5 u5Var) {
        this.f246269a = null;
        this.f246271c = null;
        this.f246270b = i17;
        this.f246269a = new java.util.HashMap();
        this.f246271c = u5Var;
    }

    public void a() {
        java.lang.String str;
        java.util.Iterator it;
        boolean z17;
        boolean z18;
        android.graphics.Bitmap bitmap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w5 w5Var = this;
        java.lang.String str2 = "tryToRecycle";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryToRecycle", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        java.util.HashMap hashMap = (java.util.HashMap) w5Var.f246269a;
        int size = hashMap.size();
        int i17 = w5Var.f246270b;
        if (size > i17) {
            java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.entrySet());
            java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t5(w5Var));
            int size2 = hashMap.size() - i17;
            if (size2 <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryToRecycle", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                return;
            }
            java.util.Iterator it6 = arrayList.iterator();
            int i18 = size2;
            while (it6.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                java.lang.Object key = entry.getKey();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("remove", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r1 r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r1) w5Var.f246271c;
                r1Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeObj", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$3");
                java.lang.String str3 = (java.lang.String) key;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var = r1Var.f246156a;
                i1Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkRecycle", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = i1Var.f245793i;
                if (copyOnWriteArraySet == null || copyOnWriteArraySet.size() == 0) {
                    it = it6;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkRecycle", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) i1Var.f245789e;
                    java.util.Iterator it7 = concurrentHashMap2.keySet().iterator();
                    while (it7.hasNext()) {
                        int intValue = ((java.lang.Integer) it7.next()).intValue();
                        java.util.Iterator it8 = it6;
                        if (((java.lang.ref.WeakReference) concurrentHashMap2.get(java.lang.Integer.valueOf(intValue))).get() == null) {
                            java.util.Iterator it9 = copyOnWriteArraySet.iterator();
                            while (it9.hasNext()) {
                                java.util.Iterator it10 = it9;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2) it9.next();
                                concurrentHashMap = concurrentHashMap2;
                                if (b2Var.f245619b == intValue) {
                                    copyOnWriteArraySet.remove(b2Var);
                                    break;
                                } else {
                                    concurrentHashMap2 = concurrentHashMap;
                                    it9 = it10;
                                }
                            }
                        }
                        concurrentHashMap = concurrentHashMap2;
                        it6 = it8;
                        concurrentHashMap2 = concurrentHashMap;
                    }
                    it = it6;
                    java.util.Iterator it11 = copyOnWriteArraySet.iterator();
                    while (it11.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2) it11.next();
                        if (str3 != null) {
                            b2Var2.getClass();
                            java.util.Iterator it12 = it11;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                            if (str3.equals(b2Var2.f245618a)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkRecycle", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                z17 = false;
                                break;
                            }
                            it11 = it12;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkRecycle", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                if (z17) {
                    java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.a(i1Var).f246269a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("forceRemove", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    try {
                        java.lang.Object obj = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v5) ((java.util.HashMap) map).get(str3)).f246253a;
                        if (obj instanceof android.graphics.Bitmap) {
                            bitmap = (android.graphics.Bitmap) obj;
                        } else {
                            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v5) ((java.util.HashMap) map).get(str3)).f246253a;
                            bitmap = weakReference != null ? (android.graphics.Bitmap) weakReference.get() : null;
                        }
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        str = str2;
                    } catch (java.lang.Exception e17) {
                        str = str2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsLRUMap", e17, "", new java.lang.Object[0]);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLRUMap", "can not recycled forceRemove ");
                    }
                    java.util.HashMap hashMap2 = (java.util.HashMap) map;
                    hashMap2.size();
                    hashMap2.remove(str3);
                    hashMap2.size();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("forceRemove", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keys ");
                    sb6.append(str3);
                    sb6.append(" deRef ok  Big:size:");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.a(i1Var);
                    a17.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSize", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    int size3 = ((java.util.HashMap) a17.f246269a).size();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSize", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                    sb6.append(size3);
                    sb6.append(" listPaitSize:");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    sb6.append(copyOnWriteArraySet.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", sb6.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeObj", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$3");
                    z18 = true;
                } else {
                    str = str2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeObj", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$3");
                    z18 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("remove", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
                if (z18) {
                    java.util.Objects.toString(entry.getKey());
                    i18--;
                }
                if (i18 <= 0) {
                    break;
                }
                w5Var = this;
                str2 = str;
                it6 = it;
            }
        }
        str = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.model.SnsLRUMap");
    }

    public void b(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        java.util.Map map = this.f246269a;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v5) ((java.util.HashMap) map).get(obj)) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insert", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            ((java.util.HashMap) map).put(obj, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v5(this, obj2));
            a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insert", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v5) ((java.util.HashMap) map).get(obj)).a();
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v5) ((java.util.HashMap) map).get(obj)).f246253a = obj2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
    }
}
