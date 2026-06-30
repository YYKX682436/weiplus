package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public abstract class k3 extends android.widget.BaseAdapter {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f290549u = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.f3 f290552f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashMap f290553g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f290554h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.d3 f290555i;

    /* renamed from: q, reason: collision with root package name */
    public int f290560q;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f290562s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.j3 f290563t;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f290550d = "MicroMsg.CursorDataAdapter";

    /* renamed from: e, reason: collision with root package name */
    public boolean f290551e = true;

    /* renamed from: m, reason: collision with root package name */
    public final int f290556m = 1000;

    /* renamed from: n, reason: collision with root package name */
    public final int f290557n = 3000;

    /* renamed from: o, reason: collision with root package name */
    public boolean f290558o = true;

    /* renamed from: p, reason: collision with root package name */
    public int f290559p = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f290561r = 0;

    public k3(boolean z17, android.content.Context context, int i17) {
        this.f290554h = context;
        this.f290562s = z17;
        this.f290560q = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CursorDataAdapter", "newCursor setPageSize %d", java.lang.Integer.valueOf(i17));
    }

    public final void a(java.lang.String str, boolean z17) {
        if (this.f290559p == 0) {
            return;
        }
        boolean z18 = this.f290558o;
        if (z18 || z17) {
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor cache needRefresh : needRefreshInfront :%b from : %s", java.lang.Boolean.valueOf(z18), str);
            }
            o(false, true);
        }
    }

    public final void c() {
        boolean z17;
        if (this.f290562s) {
            int i17 = this.f290552f.f331971a.y() ? 1 : 2;
            int i18 = this.f290561r;
            if (i17 != i18 && i18 != 0) {
                com.p314xaae8f345.mm.ui.j3 j3Var = this.f290563t;
                if (j3Var != null) {
                    synchronized (j3Var) {
                        z17 = j3Var.f290527d != 0;
                    }
                    if (z17) {
                        m(h(f()), true, false);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor change update stats  %d ", java.lang.Integer.valueOf(i17));
            }
            this.f290561r = i17;
        }
    }

    public void d(boolean z17) {
        com.p314xaae8f345.mm.ui.j3 j3Var;
        com.p314xaae8f345.mm.ui.f3 f3Var = this.f290552f;
        if (f3Var != null) {
            f3Var.f331971a.close();
            f3Var.f331971a = null;
            this.f290552f = null;
        }
        if (z17 && (j3Var = this.f290563t) != null) {
            synchronized (j3Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j3Var.f290528e.f290550d, "newcursor quit ");
                j3Var.b();
            }
            this.f290563t = null;
            java.util.HashMap hashMap = this.f290553g;
            if (hashMap != null) {
                hashMap.clear();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor closeCursor,clear events");
            }
        }
        this.f290559p = 0;
        this.f290561r = 0;
    }

    public abstract e95.h f();

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f290552f == null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            q(f());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor createCursor last : %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        a("getcount", false);
        com.p314xaae8f345.mm.ui.f3 f3Var = this.f290552f;
        if (f3Var != null) {
            return f3Var.a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f290550d, "[getCount] is zero!");
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    public abstract com.p314xaae8f345.mm.ui.f3 h(e95.h hVar);

    public int j() {
        java.util.HashMap hashMap = this.f290553g;
        if (hashMap == null || hashMap.size() == 0) {
            return 0;
        }
        return this.f290553g.containsKey(null) ? 2 : 1;
    }

    public int k(int i17) {
        e95.h hVar;
        com.p314xaae8f345.mm.ui.f3 f3Var = this.f290552f;
        if (f3Var == null || (hVar = f3Var.f331971a) == null) {
            return 0;
        }
        if (hVar instanceof e95.j) {
            return ((e95.j) hVar).f331956f[i17].getCount();
        }
        throw new java.lang.RuntimeException("the cursor is not instanceof MergeHeapCursor ,please call getCount() instead ");
    }

    public final void l() {
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.ui.f3 f3Var = this.f290552f;
        if (f3Var == null || f3Var.f331971a.isClosed() || !((hashMap = this.f290553g) == null || hashMap.size() == 0)) {
            r(new com.p314xaae8f345.mm.ui.y2(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "events size is 0  ");
        }
    }

    public final void m(com.p314xaae8f345.mm.ui.f3 f3Var, boolean z17, boolean z18) {
        boolean z19;
        if (z17) {
            com.p314xaae8f345.mm.ui.j3 j3Var = this.f290563t;
            if (j3Var != null) {
                synchronized (j3Var) {
                    z19 = j3Var.f290527d != 0;
                }
                if (z19) {
                    com.p314xaae8f345.mm.ui.j3 j3Var2 = this.f290563t;
                    synchronized (j3Var2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j3Var2.f290528e.f290550d, "newcursor resetQueue ");
                        j3Var2.b();
                        j3Var2.c();
                    }
                }
            }
            java.util.HashMap hashMap = this.f290553g;
            if (hashMap != null) {
                hashMap.clear();
            }
        }
        if (z18 && f3Var != null && !f3Var.f331972b) {
            r(new com.p314xaae8f345.mm.ui.z2(this, f3Var));
        } else if (f3Var != null && f3Var.f331972b && z18) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.c3(this, f3Var));
        } else {
            p(f3Var);
        }
    }

    public void n(java.lang.Object obj, int i17) {
        boolean z17;
        if (this.f290552f == null) {
            return;
        }
        if (this.f290553g == null) {
            this.f290553g = new java.util.HashMap();
        }
        boolean containsKey = this.f290553g.containsKey(null);
        if (i17 == 5 || !this.f290562s || i17 == 1) {
            if (i17 != 5) {
                this.f290553g.clear();
                this.f290553g.put(null, null);
            } else if (!containsKey) {
                this.f290553g.put(obj, new com.p314xaae8f345.mm.ui.e3(obj, i17, null));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor syncHandle is true ,changeType is %d  ", java.lang.Integer.valueOf(i17));
            z17 = true;
        } else {
            if (containsKey) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor need reset ,return ");
                return;
            }
            if (this.f290561r != 1) {
                this.f290553g.clear();
                this.f290553g.put(null, null);
            } else if (this.f290552f.f331971a.n0(obj) || i17 == 2) {
                java.util.HashMap hashMap = this.f290553g;
                com.p314xaae8f345.mm.ui.e3 e3Var = new com.p314xaae8f345.mm.ui.e3(obj, i17, null);
                if (e3Var.f289895b == 2 && this.f290552f.f331971a.n0(obj)) {
                    e3Var.f289895b = 3;
                }
                com.p314xaae8f345.mm.ui.e3 e3Var2 = (com.p314xaae8f345.mm.ui.e3) hashMap.get(obj);
                if (e3Var2 != null) {
                    hashMap.remove(e3Var2);
                    int i18 = e3Var.f289895b;
                    if (i18 == 2) {
                        int i19 = e3Var2.f289895b;
                        if (i19 == 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor processEvent last insert, now insert, impossible");
                            e3Var.f289895b = 2;
                        } else if (i19 != 5) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor processEvent last update, now insert, impossible");
                            e3Var.f289895b = 2;
                        } else {
                            e3Var.f289895b = 3;
                        }
                    } else if (i18 != 5) {
                        int i27 = e3Var2.f289895b;
                        if (i27 == 2) {
                            e3Var.f289895b = 2;
                        } else if (i27 != 5) {
                            e3Var.f289895b = 3;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor processEvent last delete, now update, impossible");
                            e3Var.f289895b = 3;
                        }
                    } else {
                        int i28 = e3Var2.f289895b;
                        if (i28 != 2) {
                            if (i28 != 5) {
                                e3Var.f289895b = 5;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor processEvent last delete, now delete, impossible");
                                e3Var.f289895b = 5;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor add event events size %d", java.lang.Integer.valueOf(this.f290553g.size()));
                    }
                    hashMap.put(obj, e3Var);
                } else {
                    hashMap.put(obj, e3Var);
                }
                if (!this.f290552f.f331971a.I0(hashMap.size())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor events size exceed limit :size is :  %d", java.lang.Integer.valueOf(hashMap.size()));
                    hashMap.clear();
                    hashMap.put(null, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor add event events size %d", java.lang.Integer.valueOf(this.f290553g.size()));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor event pass ");
            }
            z17 = false;
        }
        int j17 = j();
        this.f290559p = j17;
        java.lang.String str = this.f290550d;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(j17);
        objArr[1] = java.lang.Boolean.valueOf(this.f290561r == 1);
        objArr[2] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "newcursor refreshStatus: %d ,hasLoadedAllDataStatus %b changeType :%d ", objArr);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor event is refresh sync ");
            o(true, true);
        } else if (this.f290551e && this.f290558o) {
            o(false, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        if (r2 == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.k3.o(boolean, boolean):void");
    }

    public final void p(com.p314xaae8f345.mm.ui.f3 f3Var) {
        d(false);
        this.f290552f = f3Var;
        f3Var.a();
        c();
    }

    public void q(e95.h hVar) {
        d(true);
        com.p314xaae8f345.mm.ui.f3 f3Var = this.f290552f;
        if (f3Var == null || f3Var.f331971a != hVar) {
            if (f3Var != null && !f3Var.f331971a.isClosed()) {
                com.p314xaae8f345.mm.ui.f3 f3Var2 = this.f290552f;
                f3Var2.f331971a.close();
                f3Var2.f331971a = null;
                this.f290552f = null;
            }
            com.p314xaae8f345.mm.ui.f3 h17 = h(hVar);
            this.f290552f = h17;
            h17.a();
            c();
            notifyDataSetChanged();
        }
    }

    public final void r(com.p314xaae8f345.mm.ui.g3 g3Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.d3 d3Var = this.f290555i;
        if (d3Var != null) {
            d3Var.a(this);
        }
        if (g3Var != null) {
            g3Var.a();
        }
        notifyDataSetChanged();
        com.p314xaae8f345.mm.ui.d3 d3Var2 = this.f290555i;
        if (d3Var2 != null) {
            d3Var2.b(this);
        }
        com.p314xaae8f345.mm.ui.j3 j3Var = this.f290563t;
        if (j3Var != null) {
            synchronized (j3Var) {
                com.p314xaae8f345.mm.ui.i3 i3Var = j3Var.f290525b;
                int i17 = com.p314xaae8f345.mm.ui.i3.f290430g;
                i3Var.getClass();
                i3Var.f290431a = java.lang.System.currentTimeMillis();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f290550d, "newcursor update callback last :%d ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
