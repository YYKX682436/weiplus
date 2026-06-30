package t23;

/* loaded from: classes10.dex */
public final class x1 implements e60.f1 {

    /* renamed from: e, reason: collision with root package name */
    public t23.n1 f496829e;

    /* renamed from: f, reason: collision with root package name */
    public int f496830f = 3;

    /* renamed from: g, reason: collision with root package name */
    public int f496831g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f496825a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f496826b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f496827c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f496828d = new java.util.HashSet();

    public static void a(t23.x1 x1Var, java.util.LinkedList linkedList, long j17, boolean z17) {
        int i17;
        t23.l1[] l1VarArr;
        int i18;
        long j18 = j17;
        int size = x1Var.f496828d.size();
        t23.l1[] l1VarArr2 = new t23.l1[size];
        x1Var.f496828d.toArray(l1VarArr2);
        int i19 = 0;
        while (i19 < size) {
            e33.k0 k0Var = (e33.k0) l1VarArr2[i19];
            if (j18 != k0Var.f328834b.f220044a2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlbumPreviewUI", "%s %s, not my query, ignore.", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(k0Var.f328834b.f220044a2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlbumPreviewUI", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
            } else if (linkedList != null && !linkedList.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = k0Var.f328834b;
                    double d17 = activityC15653x403456cd.f220085y1;
                    int i27 = i19;
                    double d18 = activityC15653x403456cd.f220087z1;
                    int i28 = size;
                    t23.l1[] l1VarArr3 = l1VarArr2;
                    if (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4223x8502b2d7.m34966x69db0a53(d17, d18, abstractC15633xee433078.f219973r, abstractC15633xee433078.f219972q) <= k0Var.f328833a) {
                        abstractC15633xee433078.f219974s = "album_business_bubble_media_by_coordinate";
                        arrayList.add(abstractC15633xee433078);
                    }
                    size = i28;
                    i19 = i27;
                    l1VarArr2 = l1VarArr3;
                }
                i17 = size;
                l1VarArr = l1VarArr2;
                i18 = i19;
                linkedList.removeAll(arrayList);
                arrayList.size();
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it6.next()).mo63661x9616526c();
                }
                if (!linkedList.isEmpty() && !arrayList.isEmpty()) {
                    linkedList.addAll(0, arrayList);
                    i19 = i18 + 1;
                    j18 = j17;
                    size = i17;
                    l1VarArr2 = l1VarArr;
                }
                i19 = i18 + 1;
                j18 = j17;
                size = i17;
                l1VarArr2 = l1VarArr;
            }
            i17 = size;
            l1VarArr = l1VarArr2;
            i18 = i19;
            i19 = i18 + 1;
            j18 = j17;
            size = i17;
            l1VarArr2 = l1VarArr;
        }
        int size2 = x1Var.f496827c.size();
        t23.m1[] m1VarArr = new t23.m1[size2];
        x1Var.f496827c.toArray(m1VarArr);
        for (int i29 = 0; i29 < size2; i29++) {
            m1VarArr[i29].u5(linkedList, j17, z17);
        }
    }

    public void b(t23.m1 m1Var) {
        this.f496827c.add(m1Var);
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaQueryService", "initQueryType: %d", java.lang.Integer.valueOf(this.f496831g));
        int i17 = this.f496831g;
        if (i17 == 1) {
            this.f496829e = new t23.r1();
        } else if (i17 != 2) {
            this.f496829e = new t23.e();
        } else {
            this.f496829e = new t23.s2();
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaQueryService", "queryAlbums, %s.", this);
        if (this.f496829e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MediaQueryService", "media query not init, init again");
            c();
        }
        t23.y0 n17 = t23.p0.n();
        t23.u1 u1Var = new t23.u1(this);
        java.util.concurrent.ExecutorService executorService = n17.f496838f;
        if (executorService != null) {
            ((ku5.f) executorService).execute(u1Var);
        }
    }

    public void e(java.lang.String str, int i17, long j17) {
        if (this.f496829e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaQueryService", "media query not init, init again");
            c();
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaQueryService", "queryMediaInAlbums, albumName: %s ticket: %d, stack: %s.", str, valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        ((t23.f) this.f496829e).f496677g = true;
        t23.p0.n().d(new t23.w1(this, str, i17, j17));
    }

    public void f(t23.m1 m1Var) {
        this.f496827c.remove(m1Var);
    }

    public void g(int i17) {
        this.f496831g = i17;
        c();
    }
}
