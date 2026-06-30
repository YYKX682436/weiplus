package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class l2 implements com.tencent.mm.plugin.fav.ui.gallery.y1, com.tencent.mm.plugin.fav.ui.gallery.e1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.z1 f100993a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f100994b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f100995c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.x1 f100996d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.GridLayoutManager f100997e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.gallery.l1 f100998f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f100999g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f101000h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f101001i;

    /* renamed from: j, reason: collision with root package name */
    public int f101002j;

    public l2(android.content.Context context) {
        this.f100994b = null;
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f101000h = 0;
        this.f101001i = new java.util.ArrayList();
        this.f101002j = 0;
        this.f100995c = context;
        this.f100994b = new java.util.ArrayList();
    }

    public static java.util.List a(com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var, java.util.List list) {
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
                java.util.ArrayList wa6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().wa(list.subList(i17, i18), null, null, null, false);
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

    public static java.util.List b(com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var, o72.r2 r2Var) {
        l2Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (r2Var != null && r2Var.field_favProto.f370964f.size() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[getFavMediaItemFromFavItemInfo] id = " + r2Var.field_id + ", dataList size = " + r2Var.field_favProto.f370964f.size());
            int size = r2Var.field_favProto.f370964f.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                r45.gp0 gp0Var = (r45.gp0) r2Var.field_favProto.f370964f.get(size);
                int i17 = gp0Var.I;
                if (i17 == 2 || i17 == 4 || i17 == 15) {
                    arrayList.add(new com.tencent.mm.plugin.fav.ui.gallery.o1(new com.tencent.mm.plugin.fav.ui.gallery.b1(r2Var, gp0Var)));
                }
            }
        }
        return arrayList;
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutManager c(android.content.Context context) {
        if (this.f100997e == null) {
            com.tencent.mm.plugin.fav.ui.gallery.a2 a2Var = new com.tencent.mm.plugin.fav.ui.gallery.a2(this, context, 4);
            this.f100997e = a2Var;
            a2Var.B = new com.tencent.mm.plugin.fav.ui.gallery.b2(this);
        }
        return this.f100997e;
    }

    public boolean d() {
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var;
        r45.gp0 gp0Var;
        java.lang.String str;
        java.util.ArrayList arrayList = this.f100994b;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.fav.ui.gallery.o1 o1Var = (com.tencent.mm.plugin.fav.ui.gallery.o1) it.next();
            if (o1Var.f101037c != Integer.MAX_VALUE && (b1Var = o1Var.f101036b) != null && (gp0Var = b1Var.f100898b) != null && (str = gp0Var.T) != null && !str.isEmpty() && hashSet.add(str)) {
                hashMap.put(str, b1Var);
            }
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var2 = (com.tencent.mm.plugin.fav.ui.gallery.b1) hashMap.get((java.lang.String) it6.next());
            if (b1Var2 == null || !com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.d(b1Var2)) {
                return false;
            }
        }
        return true;
    }

    public void e(boolean z17, int i17) {
        this.f100996d.f101106i = true;
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = (com.tencent.mm.plugin.fav.ui.gallery.h0) this.f100993a;
        if (z17) {
            h0Var.f(true, null);
        } else {
            ((androidx.recyclerview.widget.GridLayoutManager) h0Var.f100942b.getLayoutManager()).y();
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.fav.ui.gallery.i2(this, z17, i17));
    }
}
