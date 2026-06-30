package o72;

/* loaded from: classes8.dex */
public class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.qq0 f424893a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f424894b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f424895c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f424896d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f424897e;

    public i3() {
        r45.qq0 qq0Var = new r45.qq0();
        this.f424893a = qq0Var;
        this.f424894b = new java.util.HashMap();
        this.f424895c = new java.util.HashSet();
        this.f424896d = true;
        this.f424897e = new java.util.LinkedList();
        try {
            qq0Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) gm0.j1.u().c().l(225283, "")));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavTagSetMgr", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTagSetMgr", "init tag info set fail, %s", e17.getMessage());
            this.f424893a = new r45.qq0();
            java.util.Iterator it = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().V7().iterator();
            while (it.hasNext()) {
                o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(((java.lang.Long) it.next()).longValue());
                if (F != null) {
                    for (java.lang.String str : F.f67653xef67d413.f466629e) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagSetMgr", "recover tag from db:%s", str);
                        a(str);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagSetMgr", "tag:\n%s", this.f424893a.f465734d);
    }

    public void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(str.hashCode());
        java.util.HashSet hashSet = this.f424895c;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(java.lang.Integer.valueOf(str.hashCode()));
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new o72.f3(this, str));
        } else {
            b(str);
        }
    }

    public final void b(java.lang.String str) {
        r45.pq0 pq0Var;
        java.lang.String a17 = x51.k.a(str.toLowerCase());
        int i17 = 0;
        char charAt = (a17 == null || a17.length() <= 0) ? '#' : a17.charAt(0);
        r45.qq0 qq0Var = this.f424893a;
        java.util.Iterator it = qq0Var.f465734d.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                pq0Var = null;
                break;
            }
            pq0Var = (r45.pq0) it.next();
            int i19 = pq0Var.f464833d;
            if (i19 == charAt) {
                break;
            }
            if (i19 > charAt) {
                pq0Var = new r45.pq0();
                pq0Var.f464833d = charAt;
                qq0Var.f465734d.add(i18, pq0Var);
                break;
            }
            i18++;
        }
        if (pq0Var == null) {
            pq0Var = new r45.pq0();
            pq0Var.f464833d = charAt;
            qq0Var.f465734d.add(pq0Var);
        }
        java.util.Iterator it6 = pq0Var.f464834e.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            java.util.LinkedList linkedList = pq0Var.f464834e;
            if (!hasNext) {
                r45.oq0 oq0Var = new r45.oq0();
                oq0Var.f463971d = str;
                oq0Var.f463972e = a17;
                linkedList.add(oq0Var);
                d(str, true);
                i();
                return;
            }
            r45.oq0 oq0Var2 = (r45.oq0) it6.next();
            int compareTo = oq0Var2.f463972e.compareTo(a17);
            if (compareTo == 0) {
                compareTo = oq0Var2.f463971d.compareTo(str);
            }
            if (compareTo == 0) {
                return;
            }
            if (compareTo > 0) {
                r45.oq0 oq0Var3 = new r45.oq0();
                oq0Var3.f463971d = str;
                oq0Var3.f463972e = a17;
                linkedList.add(i17, oq0Var3);
                i();
                d(str, true);
                return;
            }
            i17++;
        }
    }

    public int c() {
        java.util.Iterator it = this.f424893a.f465734d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((r45.pq0) it.next()).f464834e.size();
        }
        return i17;
    }

    public final void d(java.lang.String str, boolean z17) {
        for (java.lang.ref.WeakReference weakReference : this.f424894b.values()) {
            if (weakReference != null && weakReference.get() != null) {
                if (z17) {
                    ((o72.h3) weakReference.get()).getClass();
                } else {
                    ((o72.h3) weakReference.get()).getClass();
                }
            }
        }
    }

    public void e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.f424895c.remove(java.lang.Integer.valueOf(str.hashCode()));
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new o72.g3(this, str));
        } else {
            h(str);
        }
    }

    public void f(o72.r2 r2Var) {
        if (r2Var == null) {
            return;
        }
        java.util.Iterator it = r2Var.f67653xef67d413.f466629e.iterator();
        while (it.hasNext()) {
            e((java.lang.String) it.next());
        }
    }

    public void g(java.util.Set set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            e((java.lang.String) it.next());
        }
    }

    public final void h(java.lang.String str) {
        r45.pq0 pq0Var;
        java.lang.String a17 = x51.k.a(str.toLowerCase());
        char charAt = (a17 == null || a17.length() <= 0) ? '#' : a17.charAt(0);
        r45.qq0 qq0Var = this.f424893a;
        java.util.Iterator it = qq0Var.f465734d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                pq0Var = null;
                break;
            }
            pq0Var = (r45.pq0) it.next();
            int i18 = pq0Var.f464833d;
            if (i18 == charAt) {
                break;
            } else if (i18 > charAt) {
                return;
            } else {
                i17++;
            }
        }
        if (pq0Var == null) {
            return;
        }
        java.util.Iterator it6 = pq0Var.f464834e.iterator();
        int i19 = 0;
        while (it6.hasNext()) {
            r45.oq0 oq0Var = (r45.oq0) it6.next();
            int compareTo = oq0Var.f463972e.compareTo(a17);
            if (compareTo == 0) {
                compareTo = oq0Var.f463971d.compareTo(str);
            }
            if (compareTo == 0) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().J5(oq0Var.f463971d)) {
                    return;
                }
                java.util.LinkedList linkedList = pq0Var.f464834e;
                linkedList.remove(i19);
                if (linkedList.isEmpty()) {
                    qq0Var.f465734d.remove(i17);
                }
                d(str, false);
                i();
                return;
            }
            if (compareTo > 0) {
                return;
            } else {
                i19++;
            }
        }
    }

    public void i() {
        byte[] bArr;
        try {
            bArr = this.f424893a.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavTagSetMgr", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTagSetMgr", "save tag info set fail, %s", e17.getMessage());
            bArr = null;
        }
        gm0.j1.e().j(new o72.e3(this, bArr));
        this.f424896d = true;
    }
}
