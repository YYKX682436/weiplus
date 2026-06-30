package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class l2 implements com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y1, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.e1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z1 f182526a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f182527b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f182528c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 f182529d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f182530e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l1 f182531f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f182532g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f182533h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f182534i;

    /* renamed from: j, reason: collision with root package name */
    public int f182535j;

    public l2(android.content.Context context) {
        this.f182527b = null;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f182533h = 0;
        this.f182534i = new java.util.ArrayList();
        this.f182535j = 0;
        this.f182528c = context;
        this.f182527b = new java.util.ArrayList();
    }

    public static java.util.List a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var, java.util.List list) {
        l2Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null && list.size() != 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 20;
                if (i18 >= list.size()) {
                    i18 = list.size();
                }
                list.size();
                java.util.ArrayList wa6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().wa(list.subList(i17, i18), null, null, null, false);
                if (wa6 != null && wa6.size() > 0) {
                    arrayList.addAll(wa6);
                }
                if (i18 >= list.size()) {
                    break;
                }
                i17 = i18;
            }
        }
        return arrayList;
    }

    public static java.util.List b(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2 l2Var, o72.r2 r2Var) {
        l2Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (r2Var != null && r2Var.f67640x5ab01132.f452497f.size() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[getFavMediaItemFromFavItemInfo] id = " + r2Var.f67643xc8a07680 + ", dataList size = " + r2Var.f67640x5ab01132.f452497f.size());
            int size = r2Var.f67640x5ab01132.f452497f.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                r45.gp0 gp0Var = (r45.gp0) r2Var.f67640x5ab01132.f452497f.get(size);
                int i17 = gp0Var.I;
                if (i17 == 2 || i17 == 4 || i17 == 15) {
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1(r2Var, gp0Var)));
                }
            }
        }
        return arrayList;
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager c(android.content.Context context) {
        if (this.f182530e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a2(this, context, 4);
            this.f182530e = a2Var;
            a2Var.B = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b2(this);
        }
        return this.f182530e;
    }

    public boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var;
        r45.gp0 gp0Var;
        java.lang.String str;
        java.util.ArrayList arrayList = this.f182527b;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1) it.next();
            if (o1Var.f182570c != Integer.MAX_VALUE && (b1Var = o1Var.f182569b) != null && (gp0Var = b1Var.f182431b) != null && (str = gp0Var.T) != null && !str.isEmpty() && hashSet.add(str)) {
                hashMap.put(str, b1Var);
            }
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) hashMap.get((java.lang.String) it6.next());
            if (b1Var2 == null || !com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.d(b1Var2)) {
                return false;
            }
        }
        return true;
    }

    public void e(boolean z17, int i17) {
        this.f182529d.f182639i = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) this.f182526a;
        if (z17) {
            h0Var.f(true, null);
        } else {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) h0Var.f182475b.getLayoutManager()).y();
        }
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.i2(this, z17, i17));
    }
}
