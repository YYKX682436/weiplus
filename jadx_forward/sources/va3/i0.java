package va3;

/* loaded from: classes12.dex */
public class i0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f515840m = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyl) + "/api?size=%d*%d&center=%f,%f&zoom=%d&referer=weixin";

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f515841d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(1, "location_worker", 1);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f515842e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public w25.m f515843f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f515844g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f515845h = 300;

    /* renamed from: i, reason: collision with root package name */
    public int f515846i = 300;

    public i0() {
        gm0.j1.d().a(me1.b.f72880x366c91de, this);
    }

    public static java.lang.String a(w25.m mVar) {
        java.lang.String g17 = kk.k.g((mVar.m173170x9616526c() + "").getBytes());
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("StaticMap") + '/' + g17.charAt(0) + g17.charAt(1) + "/" + g17.charAt(3) + g17.charAt(4) + "/";
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                m17.f294799a.r(m17.f294800b);
            }
        }
        return str + "static_map_" + g17;
    }

    public final void b(boolean z17, int i17) {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapServer", "httpgetStaticmapDone %b", java.lang.Boolean.valueOf(z17));
        java.util.List list = this.f515844g;
        if (z17) {
            if (this.f515843f != null) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    w25.i iVar = (w25.i) it.next();
                    if (iVar != null) {
                        java.lang.String a17 = a(this.f515843f);
                        w25.m mVar = this.f515843f;
                        va3.g0 g0Var = (va3.g0) iVar;
                        if (mVar != null) {
                            java.util.HashMap hashMap = g0Var.f515823b;
                            long j17 = mVar.f524189d;
                            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) g0Var.f515826e.remove((com.p314xaae8f345.mm.p2621x8fb0427b.b9) hashMap.get(java.lang.Long.valueOf(j17)));
                                if (f9Var != null && (weakReference = (java.lang.ref.WeakReference) g0Var.f515822a.get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) != null && weakReference.get() != null) {
                                    java.util.HashMap hashMap2 = g0Var.f515827f;
                                    if (hashMap2.containsKey(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
                                        int intValue = ((java.lang.Integer) hashMap2.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))).intValue();
                                        boolean z18 = f9Var.A0() == 0;
                                        android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
                                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                                        imageView.setImageBitmap(m11.b1.Di().O2(f9Var.m124847x74d37ac6(), a17, intValue, g0Var.f515829h, g0Var.f515830i, z18));
                                        java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) g0Var.f515824c.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                                        if (weakReference2 != null && weakReference2.get() != null) {
                                            ((android.widget.ProgressBar) weakReference2.get()).setVisibility(8);
                                        }
                                        java.lang.ref.WeakReference weakReference3 = (java.lang.ref.WeakReference) g0Var.f515825d.remove(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                                        if (weakReference3 != null && weakReference3.get() != null) {
                                            ((android.widget.ImageView) weakReference3.get()).setVisibility(0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (this.f515843f != null) {
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                w25.i iVar2 = (w25.i) it6.next();
                if (iVar2 != null) {
                    w25.m mVar2 = this.f515843f;
                    va3.g0 g0Var2 = (va3.g0) iVar2;
                    if (mVar2 != null) {
                        java.util.HashMap hashMap3 = g0Var2.f515823b;
                        long j18 = mVar2.f524189d;
                        if (hashMap3.containsKey(java.lang.Long.valueOf(j18))) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) g0Var2.f515826e.remove((com.p314xaae8f345.mm.p2621x8fb0427b.b9) hashMap3.get(java.lang.Long.valueOf(j18)));
                            if (f9Var2 != null) {
                                if (f9Var2.c2() < 0 || f9Var2.c2() > 5) {
                                    pt0.e0 e0Var = pt0.f0.f439742b1;
                                    if (e0Var.h()) {
                                        com.p314xaae8f345.mm.p2621x8fb0427b.i9 a18 = tg3.p1.f500739a.a(f9Var2);
                                        a18.f276563h = 0;
                                        tg3.q1.a(a18, f9Var2);
                                    }
                                    f9Var2.M = 0;
                                    f9Var2.f317711r = true;
                                    int c27 = f9Var2.c2() + 1;
                                    if (e0Var.h()) {
                                        com.p314xaae8f345.mm.p2621x8fb0427b.i9 a19 = tg3.p1.f500739a.a(f9Var2);
                                        a19.f276563h = c27;
                                        tg3.q1.a(a19, f9Var2);
                                    }
                                    f9Var2.M = c27;
                                    f9Var2.f317711r = true;
                                    if (gm0.j1.a()) {
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var2.m124847x74d37ac6(), f9Var2, true);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapMsgLogic", "on error count %d", java.lang.Integer.valueOf(f9Var2.c2()));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f515843f = null;
        d();
    }

    public void c(w25.i iVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f515844g;
        arrayList.remove(iVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapServer", "removeCallback " + arrayList.size());
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapServer", "clean task");
            this.f515842e.clear();
            this.f515843f = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapServer", "stop static map server");
            gm0.j1.d().q(me1.b.f72880x366c91de, this);
        }
    }

    public final void d() {
        int i17;
        if (this.f515843f == null) {
            java.util.LinkedList linkedList = this.f515842e;
            if (linkedList.size() > 0) {
                this.f515843f = (w25.m) linkedList.removeFirst();
                try {
                    java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("StaticMapGetClient");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (d17 == null) {
                        d17 = "";
                    }
                    i17 = java.lang.Integer.valueOf(d17).intValue();
                } catch (java.lang.Exception unused) {
                    i17 = 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapServer", "run local %d", java.lang.Integer.valueOf(i17));
                if (i17 == 0) {
                    w25.m mVar = this.f515843f;
                    gm0.j1.d().g(new va3.z(mVar.f524186a, mVar.f524187b, mVar.f524188c + 1, 0, this.f515845h, this.f515846i, a(mVar), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
                    return;
                }
                int i18 = this.f515845h;
                int i19 = this.f515846i;
                while (i18 * i19 > 270000) {
                    i18 = (int) (i18 / 1.2d);
                    i19 = (int) (i19 / 1.2d);
                }
                boolean P0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = this.f515841d;
                if (P0) {
                    i6Var.a(new va3.h0(this, true, java.lang.String.format("https://maps.googleapis.com/maps/api/staticmap?size=%dx%d&center=%f,%f&zoom=%d&format=jpg&language=%s&sensor=true", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Float.valueOf(this.f515843f.f524186a), java.lang.Float.valueOf(this.f515843f.f524187b), java.lang.Integer.valueOf(this.f515843f.f524188c), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()), a(this.f515843f)));
                } else {
                    i6Var.a(new va3.h0(this, false, java.lang.String.format(f515840m, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Float.valueOf(this.f515843f.f524187b), java.lang.Float.valueOf(this.f515843f.f524186a), java.lang.Integer.valueOf(this.f515843f.f524188c)), a(this.f515843f)));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 648) {
            if (i17 == 0 && i18 == 0 && this.f515843f != null) {
                b(true, i17);
            } else {
                b(false, i17);
            }
        }
    }
}
