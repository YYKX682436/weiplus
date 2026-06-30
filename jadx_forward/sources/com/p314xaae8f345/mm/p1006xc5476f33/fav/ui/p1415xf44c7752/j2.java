package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f182518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.k2 f182519e;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.k2 k2Var, java.util.LinkedList linkedList) {
        this.f182519e = k2Var;
        this.f182518d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.k2 k2Var = this.f182519e;
        k2Var.f182524d.f182527b.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var = k2Var.f182524d;
        l2Var.f182527b.addAll(this.f182518d);
        l2Var.f182529d.m8146xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.b();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = l2Var.f182527b.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1) it6.next();
            if (o1Var.f182570c != Integer.MAX_VALUE) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = o1Var.f182569b;
                if (b1Var == null) {
                    i18++;
                    arrayList.add("item is null");
                } else {
                    o72.r2 r2Var = b1Var.f182430a;
                    r45.gp0 gp0Var = b1Var.f182431b;
                    if (gp0Var == null) {
                        i18++;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("favDataItem is null, favId=");
                        sb6.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.f67643xc8a07680) : "null");
                        arrayList.add(sb6.toString());
                    } else {
                        java.lang.String str = gp0Var.T;
                        if (str == null || str.isEmpty()) {
                            it = it6;
                            i18++;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dataId is null or empty, favId=");
                            sb7.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.f67643xc8a07680) : "null");
                            arrayList.add(sb7.toString());
                        } else {
                            long j17 = r2Var != null ? r2Var.f67643xc8a07680 : -1L;
                            int i27 = r2Var != null ? r2Var.f67657x2262335f : -1;
                            if (!hashMap.containsKey(str)) {
                                hashMap.put(str, new java.util.ArrayList());
                            }
                            if (hashSet.contains(str)) {
                                i19++;
                                ((java.util.List) hashMap.get(str)).add("favId=" + j17 + ", type=" + i27);
                            } else {
                                it = it6;
                                ((java.util.List) hashMap.get(str)).add("favId=" + j17 + ", type=" + i27);
                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.f1 f1Var = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a;
                                int size = f1Var.f182451a.size();
                                f1Var.a(b1Var);
                                if (f1Var.f182451a.size() == size) {
                                    i19++;
                                } else {
                                    hashSet.add(str);
                                    i17++;
                                }
                            }
                        }
                    }
                }
            } else {
                it = it6;
            }
            it6 = it;
        }
        int size2 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182451a.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Selected %d items, valid=%d, invalid=%d, duplicate=%d", java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Invalid items (%d):", java.lang.Integer.valueOf(i18));
            for (int i28 = 0; i28 < java.lang.Math.min(arrayList.size(), 10); i28++) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll]   - %s", arrayList.get(i28));
            }
            if (arrayList.size() > 10) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll]   ... and %d more invalid items", java.lang.Integer.valueOf(arrayList.size() - 10));
            }
        }
        if (i19 > 0) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (((java.util.List) entry.getValue()).size() > 1) {
                    hashMap2.put((java.lang.String) entry.getKey(), (java.util.List) entry.getValue());
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Duplicate dataIds: %d duplicate items (affecting %d unique dataIds)", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(hashMap2.size()));
            int i29 = 0;
            for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
                if (i29 >= 10) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) entry2.getKey();
                java.util.List list = (java.util.List) entry2.getValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll]   - dataId=%s, appears %d times: %s", str2, java.lang.Integer.valueOf(list.size()), list.toString());
                i29++;
            }
            if (hashMap2.size() > 10) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll]   ... and %d more duplicate dataIds", java.lang.Integer.valueOf(hashMap2.size() - 10));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z1 z1Var = l2Var.f182526a;
        if (z1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) z1Var).k(size2);
            java.lang.String format = java.lang.String.format(l2Var.f182528c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxi), java.lang.Integer.valueOf(size2));
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z0 z0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) l2Var.f182526a).f182496w;
            if (z0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t9) z0Var).c(format);
            }
        }
    }
}
