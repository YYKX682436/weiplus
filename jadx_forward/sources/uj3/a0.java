package uj3;

/* loaded from: classes14.dex */
public final class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final uj3.b0 f509743d;

    /* renamed from: e, reason: collision with root package name */
    public final uj3.b f509744e;

    /* renamed from: f, reason: collision with root package name */
    public final uj3.h1 f509745f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f509746g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f509747h;

    public a0(uj3.b0 contentView, uj3.b statusManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f509743d = contentView;
        this.f509744e = statusManager;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().q().e(this);
        uj3.h1 h1Var = new uj3.h1(statusManager);
        this.f509745f = h1Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = h1Var.f509817b;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = h1Var.f509817b;
        if (b4Var2 != null) {
            b4Var2.m77787xbe88f509();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = h1Var.f509817b;
        if (b4Var3 != null) {
            b4Var3.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var4 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new uj3.g1(h1Var), true);
        h1Var.f509817b = b4Var4;
        b4Var4.c(20L, 20L);
        this.f509746g = zj3.j.h();
        this.f509747h = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 b(java.lang.String wxUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
        uj3.b0 b0Var = this.f509743d;
        if (android.text.TextUtils.isEmpty(b0Var.getF231877m()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b0Var.getF231877m(), wxUserName)) {
            return b0Var;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0
    public void c() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a0 d(int i17) {
        return null;
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.t0 Bi;
        java.util.ArrayList arrayList;
        int i17;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri;
        java.util.List p17;
        java.util.List p18;
        uj3.b0 b0Var = this.f509743d;
        java.lang.String d17 = b0Var.d();
        if (!r26.n0.N(d17)) {
            uj3.z zVar = b0Var.f509752g;
            java.lang.Long l17 = zVar != null ? zVar.f509935i : null;
            if (l17 != null) {
                long longValue = l17.longValue();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (android.os.SystemClock.elapsedRealtime() - longValue >= 3000) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
                    if ((Ri2 == null || (p18 = Ri2.p()) == null || !p18.contains(d17)) ? false : true) {
                        b0Var.c(true);
                        uj3.z zVar2 = b0Var.f509752g;
                        if (zVar2 != null) {
                            zVar2.f509935i = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
                            zVar2.f509933g = d17;
                        }
                        b0Var.h(d17);
                    } else {
                        uj3.b.a(this.f509744e, uj3.a.f509732m, null, 2, null);
                        b0Var.c(false);
                        uj3.z zVar3 = b0Var.f509752g;
                        if (zVar3 != null) {
                            zVar3.f509935i = null;
                            zVar3.f509933g = null;
                        }
                        z17 = true;
                        Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
                        if ((Ri == null && (p17 = Ri.p()) != null && p17.contains(d17)) || z17) {
                            b0Var.i(false);
                        } else {
                            b0Var.i(true);
                        }
                    }
                } else {
                    b0Var.h(d17);
                }
                z17 = false;
                Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
                if (Ri == null && (p17 = Ri.p()) != null && p17.contains(d17)) {
                }
                b0Var.i(false);
            }
        }
        if (this.f509746g || (Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi()) == null) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = Bi.f231667b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!(copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) && 1 <= copyOnWriteArrayList.size() - 1) {
            java.util.List<java.util.Map.Entry> subList = copyOnWriteArrayList.subList(1, copyOnWriteArrayList.size());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
            for (java.util.Map.Entry entry : subList) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectAvatarManager", "screen big are not allow to refresh decode");
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (this.f509747h.isEmpty()) {
            this.f509747h.addAll(arrayList2);
        } else {
            if (arrayList2.size() < 3 - this.f509747h.size()) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = this.f509747h.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()));
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    int intValue = ((java.lang.Number) it6.next()).intValue();
                    if (!arrayList.contains(java.lang.Integer.valueOf(intValue))) {
                        arrayList.add(java.lang.Integer.valueOf(intValue));
                    }
                }
            } else {
                arrayList = arrayList2;
            }
            this.f509747h = arrayList;
        }
        java.util.ArrayList arrayList3 = this.f509747h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri3 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
        if (Ri3.P.j()) {
            sj3.j jVar = Ri3.P.f231541h;
            if (jVar == null || (c16587x33e31ed = jVar.f490110d) == null || (str = c16587x33e31ed.getF231877m()) == null) {
                str = "";
            }
            i17 = zj3.j.c(str);
        } else {
            i17 = -1;
        }
        arrayList3.remove(java.lang.Integer.valueOf(i17));
        if (this.f509747h.size() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            java.lang.Integer num = (java.lang.Integer) kz5.n0.X(this.f509747h);
            i4Var.getClass();
            i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.h3(i4Var, num, false));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            java.util.ArrayList arrayList4 = this.f509747h;
            i4Var2.getClass();
            i4Var2.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g3(i4Var2, arrayList4, false));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectAvatarManager", "ilink subscribeByUserMids ok, mids:" + arrayList2 + " and subscribe one is " + this.f509747h);
    }
}
