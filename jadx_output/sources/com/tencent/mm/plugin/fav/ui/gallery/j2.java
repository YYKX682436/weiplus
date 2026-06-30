package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f100985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.k2 f100986e;

    public j2(com.tencent.mm.plugin.fav.ui.gallery.k2 k2Var, java.util.LinkedList linkedList) {
        this.f100986e = k2Var;
        this.f100985d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it;
        com.tencent.mm.plugin.fav.ui.gallery.k2 k2Var = this.f100986e;
        k2Var.f100991d.f100994b.clear();
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = k2Var.f100991d;
        l2Var.f100994b.addAll(this.f100985d);
        l2Var.f100996d.notifyDataSetChanged();
        com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.b();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = l2Var.f100994b.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (it6.hasNext()) {
            com.tencent.mm.plugin.fav.ui.gallery.o1 o1Var = (com.tencent.mm.plugin.fav.ui.gallery.o1) it6.next();
            if (o1Var.f101037c != Integer.MAX_VALUE) {
                com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = o1Var.f101036b;
                if (b1Var == null) {
                    i18++;
                    arrayList.add("item is null");
                } else {
                    o72.r2 r2Var = b1Var.f100897a;
                    r45.gp0 gp0Var = b1Var.f100898b;
                    if (gp0Var == null) {
                        i18++;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("favDataItem is null, favId=");
                        sb6.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.field_id) : "null");
                        arrayList.add(sb6.toString());
                    } else {
                        java.lang.String str = gp0Var.T;
                        if (str == null || str.isEmpty()) {
                            it = it6;
                            i18++;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dataId is null or empty, favId=");
                            sb7.append(r2Var != null ? java.lang.Integer.valueOf(r2Var.field_id) : "null");
                            arrayList.add(sb7.toString());
                        } else {
                            long j17 = r2Var != null ? r2Var.field_id : -1L;
                            int i27 = r2Var != null ? r2Var.field_type : -1;
                            if (!hashMap.containsKey(str)) {
                                hashMap.put(str, new java.util.ArrayList());
                            }
                            if (hashSet.contains(str)) {
                                i19++;
                                ((java.util.List) hashMap.get(str)).add("favId=" + j17 + ", type=" + i27);
                            } else {
                                it = it6;
                                ((java.util.List) hashMap.get(str)).add("favId=" + j17 + ", type=" + i27);
                                com.tencent.mm.plugin.fav.ui.gallery.f1 f1Var = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a;
                                int size = f1Var.f100918a.size();
                                f1Var.a(b1Var);
                                if (f1Var.f100918a.size() == size) {
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
        int size2 = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100918a.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Selected %d items, valid=%d, invalid=%d, duplicate=%d", java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 > 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Invalid items (%d):", java.lang.Integer.valueOf(i18));
            for (int i28 = 0; i28 < java.lang.Math.min(arrayList.size(), 10); i28++) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll]   - %s", arrayList.get(i28));
            }
            if (arrayList.size() > 10) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll]   ... and %d more invalid items", java.lang.Integer.valueOf(arrayList.size() - 10));
            }
        }
        if (i19 > 0) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (((java.util.List) entry.getValue()).size() > 1) {
                    hashMap2.put((java.lang.String) entry.getKey(), (java.util.List) entry.getValue());
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Duplicate dataIds: %d duplicate items (affecting %d unique dataIds)", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(hashMap2.size()));
            int i29 = 0;
            for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
                if (i29 >= 10) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) entry2.getKey();
                java.util.List list = (java.util.List) entry2.getValue();
                com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll]   - dataId=%s, appears %d times: %s", str2, java.lang.Integer.valueOf(list.size()), list.toString());
                i29++;
            }
            if (hashMap2.size() > 10) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll]   ... and %d more duplicate dataIds", java.lang.Integer.valueOf(hashMap2.size() - 10));
            }
        }
        com.tencent.mm.plugin.fav.ui.gallery.z1 z1Var = l2Var.f100993a;
        if (z1Var != null) {
            ((com.tencent.mm.plugin.fav.ui.gallery.h0) z1Var).k(size2);
            java.lang.String format = java.lang.String.format(l2Var.f100995c.getString(com.tencent.mm.R.string.nxi), java.lang.Integer.valueOf(size2));
            com.tencent.mm.plugin.fav.ui.gallery.z0 z0Var = ((com.tencent.mm.plugin.fav.ui.gallery.h0) l2Var.f100993a).f100963w;
            if (z0Var != null) {
                ((com.tencent.mm.plugin.fav.ui.t9) z0Var).c(format);
            }
        }
    }
}
