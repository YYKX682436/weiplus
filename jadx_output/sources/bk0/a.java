package bk0;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static volatile bk0.a f21259e;

    /* renamed from: a, reason: collision with root package name */
    public final bk0.g f21260a = new bk0.g();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f21261b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f21262c = false;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f21263d = new bk0.b(this, android.os.Looper.getMainLooper());

    public static bk0.a g() {
        if (f21259e == null) {
            synchronized (bk0.a.class) {
                if (f21259e == null) {
                    f21259e = new bk0.a();
                }
            }
        }
        if (!f21259e.f21262c && gm0.j1.a()) {
            bk0.a aVar = f21259e;
            if (!aVar.f21262c) {
                aVar.f21262c = true;
                bk0.g gVar = aVar.f21260a;
                gVar.getClass();
                gVar.f21283f = gm0.j1.u().c();
            }
        }
        return f21259e;
    }

    public void a(d70.j jVar) {
        if (this.f21262c) {
            this.f21261b.add(new java.lang.ref.WeakReference(jVar));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "addWatch NewBadge has not initialized");
        }
    }

    public boolean b(int i17, int i18) {
        if (this.f21262c) {
            bk0.e f17 = this.f21260a.f(i17, i18, 2);
            return (f17 == null || k(f17.f21272d) == 0) ? false : true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
        return false;
    }

    public boolean c(com.tencent.mm.storage.u3 u3Var, int i17) {
        if (!this.f21262c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
            return false;
        }
        bk0.g gVar = this.f21260a;
        bk0.e b17 = gVar.b(u3Var);
        if (b17 != null && (b17.f21271c & 2) != 0) {
            bk0.f c17 = gVar.c(i17);
            if (c17 != null) {
                java.util.HashMap hashMap = c17.f21277d;
                java.lang.String str = (java.lang.String) hashMap.get(u3Var.name());
                if (str == null || !str.equals(b17.f21273e)) {
                    if (str == null) {
                        hashMap.put(u3Var.name(), gVar.e());
                        gVar.i(c17);
                    }
                    return b17 == null && k(b17.f21272d) != 0;
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
            }
        }
        b17 = null;
        if (b17 == null) {
            return false;
        }
    }

    public boolean d(com.tencent.mm.storage.u3 u3Var, com.tencent.mm.storage.u3 u3Var2) {
        if (this.f21262c) {
            bk0.e g17 = this.f21260a.g(u3Var, u3Var2, 2);
            return (g17 == null || k(g17.f21272d) == 0) ? false : true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
        return false;
    }

    public boolean e(int i17, int i18) {
        if (this.f21262c) {
            bk0.e f17 = this.f21260a.f(i17, i18, 1);
            return (f17 == null || k(f17.f21272d) == 0) ? false : true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "hasNew NewBadge has not initialized");
        return false;
    }

    public boolean f(com.tencent.mm.storage.u3 u3Var, com.tencent.mm.storage.u3 u3Var2) {
        if (this.f21262c) {
            bk0.e g17 = this.f21260a.g(u3Var, u3Var2, 1);
            return (g17 == null || k(g17.f21272d) == 0) ? false : true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "hasNew NewBadge has not initialized");
        return false;
    }

    public void h(int i17, int i18) {
        if (!this.f21262c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
            return;
        }
        bk0.g gVar = this.f21260a;
        bk0.e a17 = gVar.a(i17);
        if (a17 != null) {
            bk0.f c17 = gVar.c(i18);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
                c17 = new bk0.f(gVar);
                c17.f21274a = i18;
                gVar.f21280c.put(i18, c17);
            }
            c17.f21276c.put(i17, a17.f21273e);
            gVar.i(c17);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f21263d;
        n3Var.sendMessage(n3Var.obtainMessage(1, new bk0.d(this, i18, i17)));
    }

    public void i(com.tencent.mm.storage.u3 u3Var, int i17) {
        if (!this.f21262c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
            return;
        }
        bk0.g gVar = this.f21260a;
        bk0.e b17 = gVar.b(u3Var);
        if (b17 != null) {
            bk0.f c17 = gVar.c(i17);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
                c17 = new bk0.f(gVar);
                c17.f21274a = i17;
                gVar.f21280c.put(i17, c17);
            }
            c17.f21277d.put(u3Var.name(), b17.f21273e);
            gVar.i(c17);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f21263d;
        n3Var.sendMessage(n3Var.obtainMessage(1, new bk0.d(this, i17, u3Var)));
    }

    public void j(com.tencent.mm.storage.u3 u3Var, com.tencent.mm.storage.u3 u3Var2) {
        if (!this.f21262c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
            return;
        }
        bk0.g gVar = this.f21260a;
        bk0.e b17 = gVar.b(u3Var);
        if (b17 != null) {
            bk0.f d17 = gVar.d(u3Var2);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
                d17 = new bk0.f(gVar);
                d17.f21275b = u3Var2;
                gVar.f21281d.put(u3Var2, d17);
            }
            d17.f21277d.put(u3Var.name(), b17.f21273e);
            gVar.i(d17);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f21263d;
        n3Var.sendMessage(n3Var.obtainMessage(1, new bk0.d(this, u3Var2, u3Var)));
    }

    public final int k(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        return com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
    }

    public boolean l(int i17) {
        if (this.f21262c) {
            bk0.e a17 = this.f21260a.a(i17);
            return (a17 == null || k(a17.f21272d) == 0) ? false : true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "queryHasDotSourceValue NewBadge has not initialized");
        return false;
    }

    public void m(d70.j jVar) {
        java.util.ArrayList arrayList;
        if (!this.f21262c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "removeWatch NewBadge has not initialized");
            return;
        }
        java.util.ArrayList arrayList2 = null;
        int i17 = 0;
        while (true) {
            arrayList = this.f21261b;
            if (i17 >= arrayList.size()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) arrayList.get(i17);
            if (weakReference == null || weakReference.get() == null || weakReference.get() == jVar) {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                arrayList2.add(weakReference);
            }
            i17++;
        }
        if (arrayList2 != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.remove((java.lang.ref.WeakReference) it.next());
            }
            arrayList2.clear();
        }
    }

    public final void n(int i17, int i18, java.lang.String str) {
        if (!this.f21262c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "updateDataSource NewBadge has not initialized");
            return;
        }
        bk0.g gVar = this.f21260a;
        bk0.e a17 = gVar.a(i17);
        if (a17 == null) {
            a17 = new bk0.e(gVar);
            a17.f21269a = i17;
            a17.f21271c = i18;
            a17.f21272d = "";
            a17.f21273e = "";
            gVar.f21278a.put(i17, a17);
            gVar.h(a17);
        }
        a17.f21272d = str;
        a17.f21271c = i18;
        a17.f21273e = gVar.e();
        gVar.h(a17);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f21263d;
        n3Var.sendMessage(n3Var.obtainMessage(0, new bk0.c(this, i17, i18, str)));
    }

    public final void o(com.tencent.mm.storage.u3 u3Var, int i17, java.lang.String str) {
        if (!this.f21262c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewBadge", "updateDataSource NewBadge has not initialized");
            return;
        }
        bk0.g gVar = this.f21260a;
        bk0.e b17 = gVar.b(u3Var);
        if (b17 == null) {
            b17 = new bk0.e(gVar);
            b17.f21270b = u3Var;
            b17.f21271c = i17;
            b17.f21272d = "";
            b17.f21273e = "";
            gVar.f21279b.put(u3Var, b17);
            gVar.h(b17);
        }
        b17.f21272d = str;
        b17.f21271c = i17;
        b17.f21273e = gVar.e();
        gVar.h(b17);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f21263d;
        n3Var.sendMessage(n3Var.obtainMessage(0, new bk0.c(this, u3Var, i17, str)));
    }

    public void p(int i17, boolean z17) {
        n(i17, 2, !z17 ? "0" : "1");
    }

    public void q(com.tencent.mm.storage.u3 u3Var, boolean z17) {
        o(u3Var, 2, !z17 ? "0" : "1");
    }

    public void r(int i17, boolean z17) {
        n(i17, 1, !z17 ? "0" : "1");
    }

    public void s(com.tencent.mm.storage.u3 u3Var, boolean z17) {
        o(u3Var, 1, !z17 ? "0" : "1");
    }
}
