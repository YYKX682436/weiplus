package o23;

/* loaded from: classes10.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f423960a;

    /* renamed from: b, reason: collision with root package name */
    public int f423961b;

    /* renamed from: c, reason: collision with root package name */
    public int f423962c;

    /* renamed from: d, reason: collision with root package name */
    public int f423963d;

    /* renamed from: e, reason: collision with root package name */
    public int f423964e;

    /* renamed from: f, reason: collision with root package name */
    public int f423965f;

    /* renamed from: g, reason: collision with root package name */
    public int f423966g;

    /* renamed from: h, reason: collision with root package name */
    public int f423967h;

    /* renamed from: i, reason: collision with root package name */
    public int f423968i;

    /* renamed from: j, reason: collision with root package name */
    public int f423969j;

    /* renamed from: k, reason: collision with root package name */
    public int f423970k;

    /* renamed from: l, reason: collision with root package name */
    public int f423971l;

    /* renamed from: m, reason: collision with root package name */
    public int f423972m;

    /* renamed from: n, reason: collision with root package name */
    public int f423973n;

    /* renamed from: o, reason: collision with root package name */
    public int f423974o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f423975p;

    /* renamed from: q, reason: collision with root package name */
    public long f423976q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f423977r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f423978s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f423979t = "";

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f423980u = new java.util.ArrayList(9);

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f423981v = new java.util.ArrayList(9);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f423982w = new java.util.ArrayList(9);

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f423983x = new java.util.ArrayList(9);

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f423984y = new java.util.ArrayList(9);

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f423985z = new java.util.HashMap(9);
    public final java.util.Set A = new java.util.HashSet();
    public final java.lang.ThreadLocal B = new o23.k(this);
    public boolean C = false;
    public o23.l D = new o23.l();

    public n(o23.k kVar) {
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryReporter", "path: %s.", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((java.util.ArrayList) this.f423980u).remove(str);
        ((java.util.ArrayList) this.f423981v).remove(str);
        ((java.util.ArrayList) this.f423982w).remove(str);
        ((java.util.ArrayList) this.f423983x).remove(str);
        ((java.util.ArrayList) this.f423984y).remove(str);
        this.f423985z.remove(str);
        ((java.util.HashSet) this.A).remove(str);
    }

    public void b() {
        java.util.List list = this.f423980u;
        this.f423964e = ((java.util.ArrayList) list).size();
        java.util.List list2 = this.f423981v;
        this.f423965f = ((java.util.ArrayList) list2).size();
        java.util.List list3 = this.f423982w;
        this.f423966g = ((java.util.ArrayList) list3).size();
        java.util.List list4 = this.f423983x;
        this.f423967h = ((java.util.ArrayList) list4).size();
        java.util.List list5 = this.f423984y;
        this.f423968i = ((java.util.ArrayList) list5).size();
        long max = java.lang.Math.max(c01.id.c() - this.f423976q, 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashMap hashMap = this.f423985z;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            sb6.append(((java.util.Map.Entry) it.next()).getValue());
            sb6.append("|");
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6629x7b8a615b c6629x7b8a615b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6629x7b8a615b();
        c6629x7b8a615b.f139803d = this.f423960a;
        c6629x7b8a615b.f139804e = this.f423961b;
        c6629x7b8a615b.f139805f = this.f423962c;
        c6629x7b8a615b.f139806g = this.f423963d;
        c6629x7b8a615b.f139807h = this.f423964e;
        c6629x7b8a615b.f139808i = this.f423965f;
        c6629x7b8a615b.f139809j = this.f423966g;
        c6629x7b8a615b.f139810k = this.f423967h;
        c6629x7b8a615b.f139811l = this.f423968i;
        c6629x7b8a615b.f139812m = c6629x7b8a615b.b("sendMediaPoi", sb6.toString(), true);
        c6629x7b8a615b.f139813n = this.f423969j;
        c6629x7b8a615b.f139814o = this.f423970k;
        c6629x7b8a615b.f139815p = this.f423973n;
        c6629x7b8a615b.f139816q = this.f423974o;
        c6629x7b8a615b.f139817r = c6629x7b8a615b.b("SendSessionID", this.f423975p, true);
        c6629x7b8a615b.f139820u = max;
        c6629x7b8a615b.f139818s = this.f423971l;
        c6629x7b8a615b.f139819t = this.f423972m;
        c6629x7b8a615b.f139823x = this.C ? 1 : 0;
        c6629x7b8a615b.f139821v = this.f423977r ? 1L : 0L;
        c6629x7b8a615b.f139824y = c6629x7b8a615b.b("FinalSelectedImageCountDetail", this.f423979t, true);
        if (this.f423978s) {
            c6629x7b8a615b.B = c6629x7b8a615b.b("QuickSendActionCount", this.D.b(), true);
            this.D.b();
        } else {
            c6629x7b8a615b.A = c6629x7b8a615b.b("BigPhotoActionCount", this.D.b(), true);
            this.D.b();
        }
        c6629x7b8a615b.k();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            c6629x7b8a615b.n().replace(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ");
        }
        this.f423960a = 0;
        this.f423961b = 0;
        this.f423962c = 0;
        this.f423963d = 0;
        this.f423964e = 0;
        this.f423965f = 0;
        this.f423966g = 0;
        this.f423967h = 0;
        this.f423968i = 0;
        this.f423969j = 0;
        this.f423970k = 0;
        this.f423973n = 0;
        this.f423974o = 0;
        this.f423975p = "";
        this.C = false;
        this.f423977r = false;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list3).clear();
        ((java.util.ArrayList) list4).clear();
        ((java.util.ArrayList) list5).clear();
        this.f423979t = "";
        this.D = new o23.l();
        hashMap.clear();
        ((java.util.HashSet) this.A).clear();
        this.f423978s = false;
    }

    public void c(java.lang.String str, int i17, int i18) {
        if (i17 < 0 || i17 > 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryReporter", "type error, %d.", java.lang.Integer.valueOf(i17));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryReporter", "path is invalid!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryReporter", "type: %d, path: %s.", java.lang.Integer.valueOf(i17), str);
        java.util.List list = this.f423980u;
        boolean contains = ((java.util.ArrayList) list).contains(str);
        java.util.Set set = this.A;
        java.util.HashMap hashMap = this.f423985z;
        boolean z17 = true;
        if (contains) {
            ((java.util.ArrayList) list).remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryReporter", "sendCountFromSearchUnOCRList, remove.");
        } else {
            java.util.List list2 = this.f423981v;
            if (((java.util.ArrayList) list2).contains(str)) {
                ((java.util.ArrayList) list2).remove(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryReporter", "sendCountFromSearchOCRList, remove.");
            } else {
                java.util.List list3 = this.f423982w;
                if (((java.util.ArrayList) list3).contains(str)) {
                    ((java.util.ArrayList) list3).remove(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryReporter", "sendCountFromClassifyList, remove.");
                } else {
                    java.util.List list4 = this.f423983x;
                    if (((java.util.ArrayList) list4).contains(str)) {
                        ((java.util.ArrayList) list4).remove(str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryReporter", "sendCountFromDefaultList, remove.");
                    } else {
                        java.util.List list5 = this.f423984y;
                        if (((java.util.ArrayList) list5).contains(str)) {
                            ((java.util.ArrayList) list5).remove(str);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryReporter", "sendCountFromOtherList, remove.");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryReporter", "add!!!");
                            if (i17 == 0) {
                                ((java.util.ArrayList) list).add(str);
                            } else if (i17 == 1) {
                                ((java.util.ArrayList) list2).add(str);
                            } else if (i17 == 2) {
                                ((java.util.ArrayList) list3).add(str);
                            } else if (i17 == 3) {
                                ((java.util.ArrayList) list4).add(str);
                            } else if (i17 == 4) {
                                ((java.util.ArrayList) list5).add(str);
                            }
                            hashMap.put(str, java.lang.Integer.valueOf(i18));
                            if (((java.lang.Boolean) this.B.get()).booleanValue()) {
                                ((java.util.HashSet) set).add(str);
                            }
                            z17 = false;
                        }
                    }
                }
            }
        }
        if (z17) {
            hashMap.remove(str);
            ((java.util.HashSet) set).remove(str);
        }
    }
}
