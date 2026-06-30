package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public class e1 implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v6 {

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2614xca6eae71.e1 f274772f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f274773g = rr.s.f480682a.a() + "panel/";

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f274774a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f274775b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f274776c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f274777d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f274778e;

    public e1(android.content.Context context) {
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f274776c = synchronizedList;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f274777d = sparseArray;
        synchronizedList.clear();
        sparseArray.clear();
        this.f274778e = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
    }

    public static com.p314xaae8f345.mm.p2614xca6eae71.e1 b() {
        if (f274772f == null) {
            synchronized (com.p314xaae8f345.mm.p2614xca6eae71.e1.class) {
                if (f274772f == null) {
                    f274772f = new com.p314xaae8f345.mm.p2614xca6eae71.e1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                }
            }
        }
        com.p314xaae8f345.mm.p2614xca6eae71.e1 e1Var = f274772f;
        synchronized (e1Var) {
            if (!e1Var.f274775b) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    e1Var.e();
                } else if (gm0.j1.a()) {
                    e1Var.e();
                }
            }
        }
        return f274772f;
    }

    public boolean a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        synchronized (this.f274776c) {
            java.util.Iterator it = this.f274776c.iterator();
            while (it.hasNext()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563) it.next()).f67353x4b6e619a, str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public android.graphics.drawable.Drawable c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df f17 = com.p314xaae8f345.mm.p2614xca6eae71.t1.a().f(str);
        if (f17 != null) {
            com.p314xaae8f345.mm.p2614xca6eae71.t1 a17 = com.p314xaae8f345.mm.p2614xca6eae71.t1.a();
            a17.getClass();
            int i17 = f17.f67255x4a55a2ce;
            return i17 >= 0 ? a17.c(i17) : a17.b(f17.f67252xf1e8cfcc);
        }
        com.p314xaae8f345.mm.p2614xca6eae71.g b17 = com.p314xaae8f345.mm.p2614xca6eae71.g.b();
        com.p314xaae8f345.mm.p2614xca6eae71.b2 c17 = com.p314xaae8f345.mm.p2614xca6eae71.g.b().c(str);
        b17.getClass();
        boolean z17 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
        com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.getClass();
        int i18 = com.p314xaae8f345.mm.p2614xca6eae71.e.f274769b;
        return com.p314xaae8f345.mm.p2614xca6eae71.d.f274766a.a(c17, true);
    }

    public java.lang.String d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df f17 = com.p314xaae8f345.mm.p2614xca6eae71.t1.a().f(str);
        if (f17 == null) {
            return str;
        }
        java.lang.String str2 = this.f274778e;
        return (!str2.equals("zh_CN") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.f67249xaa3a4d81)) ? ((str2.equals("zh_TW") || str2.equals("zh_HK")) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17.f67258x3cdfda69)) ? f17.f67258x3cdfda69 : f17.f67251x1406c403 : f17.f67249xaa3a4d81;
    }

    public synchronized void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo");
        this.f274776c.clear();
        this.f274774a = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().A();
        new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f274773g;
        sb6.append(str);
        sb6.append("config.conf");
        int d17 = rr.t.d(sb6.toString());
        int d18 = rr.t.d("assets:///panel/config.conf");
        final java.lang.String str2 = str + this.f274774a;
        final java.lang.String str3 = "assets:///panel/" + this.f274774a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: local:%s, asset:%s", java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(d18));
        if (d17 > 0 && d17 >= d18 && com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            arrayList = rr.t.a(new com.p314xaae8f345.mm.vfs.r6(str2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: localSize %s", java.lang.Integer.valueOf(arrayList.size()));
        }
        if (arrayList.size() <= 0) {
            arrayList = rr.t.a(new com.p314xaae8f345.mm.vfs.r6(str3));
            if (arrayList.size() < 50) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: from asset xml %s", java.lang.Integer.valueOf(arrayList.size()));
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: %s", com.p314xaae8f345.mm.vfs.w6.M("assets:///panel/" + this.f274774a));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MergerSmileyManager", e17, "", new java.lang.Object[0]);
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MergerSmileyManager", "smiley panel list is null.");
        } else {
            java.util.Set keySet = com.p314xaae8f345.mm.p2614xca6eae71.t1.a().f274925i.keySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
            java.util.List S0 = kz5.n0.S0(keySet);
            int size = arrayList.size();
            int i17 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563 c21055x16b9a563 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563) arrayList.get(i18);
                java.lang.String str4 = c21055x16b9a563.f67353x4b6e619a;
                if (str4.matches("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")) {
                    java.lang.String str5 = new java.lang.String(android.util.Base64.decode(str4, 0));
                    c21055x16b9a563.f67353x4b6e619a = str5;
                    str4 = str5;
                }
                if (!str4.startsWith("[") || S0.contains(str4)) {
                    this.f274776c.add(c21055x16b9a563);
                    this.f274777d.put(i17, c21055x16b9a563);
                    i17++;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MergerSmileyManager", "no smiley info. key:%s", str4);
                }
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.smiley.e1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.p2614xca6eae71.e1.f274773g)) {
                            com.p314xaae8f345.mm.vfs.w6.c(str3, str2);
                        }
                    }
                });
            }
        }
        this.f274775b = true;
    }
}
