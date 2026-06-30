package qd0;

/* loaded from: classes11.dex */
public class n0 implements rd0.a1, rd0.c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f443083a;

    /* renamed from: b, reason: collision with root package name */
    public int f443084b;

    /* renamed from: c, reason: collision with root package name */
    public int f443085c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f443086d;

    /* renamed from: e, reason: collision with root package name */
    public int f443087e;

    /* renamed from: f, reason: collision with root package name */
    public int f443088f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f443089g;

    /* renamed from: h, reason: collision with root package name */
    public int f443090h;

    /* renamed from: i, reason: collision with root package name */
    public int f443091i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f443092j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f443093k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f443094l;

    /* renamed from: m, reason: collision with root package name */
    public p13.c f443095m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f443096n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f443097o;

    /* renamed from: p, reason: collision with root package name */
    public p13.r f443098p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f443099q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f443100r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f443101s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f443102t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.o4 f443103u;

    /* renamed from: v, reason: collision with root package name */
    public rd0.b1 f443104v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f443105w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f443106x;

    /* renamed from: y, reason: collision with root package name */
    public final o13.x f443107y;

    /* renamed from: z, reason: collision with root package name */
    public int f443108z;

    public n0(com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var, java.util.List list) {
        this.f443083a = Integer.MAX_VALUE;
        this.f443084b = Integer.MAX_VALUE;
        this.f443085c = Integer.MAX_VALUE;
        this.f443086d = true;
        this.f443087e = Integer.MAX_VALUE;
        this.f443088f = Integer.MAX_VALUE;
        this.f443089g = true;
        this.f443090h = Integer.MAX_VALUE;
        this.f443091i = Integer.MAX_VALUE;
        this.f443092j = null;
        this.f443093k = null;
        this.f443094l = null;
        this.f443100r = false;
        this.f443101s = false;
        this.f443102t = false;
        this.f443106x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f443107y = new qd0.m0(this);
        this.f443108z = 0;
        this.f443103u = o4Var;
        h(list);
    }

    public static void a(qd0.n0 n0Var, java.util.List list, int i17) {
        if (n0Var.f443092j == null) {
            n0Var.f443092j = new java.util.LinkedList();
        }
        java.util.Iterator it = n0Var.f443092j.iterator();
        while (it.hasNext()) {
            if (((p13.y) it.next()).f432717b == i17) {
                it.remove();
            }
        }
        if (list != null) {
            n0Var.f443092j.addAll(list);
        }
    }

    public final boolean b() {
        if (((java.util.ArrayList) this.f443097o).size() <= 0) {
            return true;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int intValue = ((java.lang.Integer) ((java.util.ArrayList) this.f443097o).remove(0)).intValue();
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f443096n;
        uVar.f432678g = new int[]{intValue};
        uVar.f432681j = hashSet;
        uVar.f432684m = this.f443107y;
        uVar.f432685n = this.f443106x;
        if (intValue == 131075) {
            uVar.f432673b = 32;
            uVar.f432683l = r13.a.f450134d;
        } else {
            uVar.f432673b = 16;
            uVar.f432683l = r13.b.f450135d;
        }
        this.f443095m = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        return false;
    }

    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d c(int i17) {
        int i18 = (i17 - this.f443088f) - 1;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h hVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h(i17);
        p13.y yVar = (p13.y) this.f443093k.get(i18);
        hVar.C = yVar;
        hVar.f288369e = this.f443103u.f288611f;
        hVar.f288388x = true;
        hVar.f288387w = i18 + 1;
        int i19 = yVar.f432717b;
        int i27 = yVar.f432718c;
        hVar.f288386v = i19;
        hVar.f288385u = i27;
        return hVar;
    }

    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d d(int i17) {
        int i18 = (i17 - this.f443088f) - 1;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.p pVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.p(i17);
        p13.y yVar = (p13.y) this.f443093k.get(i18);
        pVar.C = yVar;
        pVar.f288369e = this.f443103u.f288611f;
        pVar.f288388x = true;
        pVar.f288387w = i18 + 1;
        int i19 = yVar.f432717b;
        int i27 = yVar.f432718c;
        pVar.f288386v = i19;
        pVar.f288385u = i27;
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d e(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1 a1Var;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d c17;
        int i18 = this.f443083a;
        com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var = this.f443103u;
        if (i17 == i18) {
            c17 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i0(i17);
            c17.f288388x = true;
        } else {
            int i19 = this.f443084b;
            if (i17 == i19) {
                c17 = ((rd0.z0) o4Var).a(com.p314xaae8f345.mm.R.C30867xcad56011.fg7, i17);
            } else {
                int i27 = this.f443085c;
                if (i17 == i27) {
                    c17 = ((rd0.z0) o4Var).a(com.p314xaae8f345.mm.R.C30867xcad56011.ffq, i17);
                } else {
                    int i28 = this.f443088f;
                    if (i17 == i28) {
                        c17 = ((rd0.z0) o4Var).a(com.p314xaae8f345.mm.R.C30867xcad56011.ffp, i17);
                    } else {
                        int i29 = this.f443091i;
                        if (i17 == i29) {
                            c17 = ((rd0.z0) o4Var).a(com.p314xaae8f345.mm.R.C30867xcad56011.ffo, i17);
                        } else {
                            if (i17 == this.f443087e) {
                                boolean z17 = this.f443086d;
                                a1Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1(i17);
                                a1Var.C = com.p314xaae8f345.mm.R.C30867xcad56011.ffq;
                                a1Var.D = z17;
                            } else if (i17 == this.f443090h) {
                                boolean z18 = this.f443089g;
                                a1Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1(i17);
                                a1Var.C = com.p314xaae8f345.mm.R.C30867xcad56011.ffp;
                                a1Var.D = z18;
                            } else {
                                if (i17 > i29) {
                                    int i37 = (i17 - i29) - 1;
                                    uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
                                    p13.y yVar = (p13.y) this.f443094l.get(i37);
                                    uVar.C = yVar;
                                    uVar.f288369e = o4Var.f288611f;
                                    uVar.f288388x = true;
                                    uVar.f288387w = i37 + 1;
                                    int i38 = yVar.f432717b;
                                    int i39 = yVar.f432718c;
                                    uVar.f288386v = i38;
                                    uVar.f288385u = i39;
                                } else if (i17 > i28) {
                                    c17 = this.f443105w ? ((rd0.z0) o4Var).c(i17) : ((rd0.z0) o4Var).d(i17);
                                } else if (i17 > i27) {
                                    int i47 = (i17 - i27) - 1;
                                    uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
                                    p13.y yVar2 = (p13.y) ((java.util.LinkedList) this.f443092j).get(i47);
                                    uVar.C = yVar2;
                                    uVar.f288369e = o4Var.f288611f;
                                    uVar.f288388x = true;
                                    uVar.f288387w = i47 + 1;
                                    int i48 = yVar2.f432717b;
                                    int i49 = yVar2.f432718c;
                                    uVar.f288386v = i48;
                                    uVar.f288385u = i49;
                                    uVar.f288367c = this.f443100r;
                                    uVar.G = this.f443101s;
                                } else {
                                    a1Var = null;
                                    if (i17 > i19) {
                                        throw null;
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSearchContactAdapter", "unkown position=%d", java.lang.Integer.valueOf(i17));
                                }
                                c17 = uVar;
                            }
                            c17 = a1Var;
                        }
                    }
                }
            }
        }
        if (c17 != null) {
            c17.f288381q = this.f443096n;
            if (c17 instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) {
                ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) c17).A = this.f443098p;
            }
            c17.f288384t = o4Var.f288613h;
        }
        return c17;
    }

    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d f(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i18);
        n0Var.f288436y = this.f443103u.f288609d.mo8774x19263085().getResources().getString(i17);
        return n0Var;
    }

    public void g(java.lang.String str, int[] iArr, boolean z17) {
        if (this.f443095m != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f443095m);
            this.f443095m = null;
        }
        this.f443096n = str;
        ((java.util.ArrayList) this.f443097o).clear();
        for (int i17 : iArr) {
            ((java.util.ArrayList) this.f443097o).add(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "doSearch: query=%s", this.f443096n);
        b();
    }

    public final void h(java.util.List list) {
        this.f443099q = list;
        this.f443097o = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "Create!");
        i();
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "initData!");
        this.f443096n = null;
        this.f443084b = Integer.MAX_VALUE;
        this.f443085c = Integer.MAX_VALUE;
        this.f443086d = true;
        this.f443087e = Integer.MAX_VALUE;
        this.f443088f = Integer.MAX_VALUE;
        this.f443089g = true;
        this.f443090h = Integer.MAX_VALUE;
        this.f443091i = Integer.MAX_VALUE;
        this.f443092j = null;
        this.f443093k = null;
        this.f443094l = null;
        this.f443098p = null;
        this.f443108z = 0;
        com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var = this.f443103u;
        o4Var.h();
        o4Var.notifyDataSetChanged();
        if (this.f443095m != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f443095m);
            this.f443095m = null;
        }
        o4Var.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(java.lang.String str, boolean z17, boolean z18) {
        int i17;
        int i18;
        java.util.List list = this.f443092j;
        int i19 = 0;
        int size = list == null ? 0 : ((java.util.LinkedList) list).size();
        java.util.List list2 = this.f443093k;
        int size2 = list2 == null ? 0 : list2.size();
        java.util.List list3 = this.f443094l;
        int size3 = list3 == null ? 0 : list3.size();
        this.f443084b = Integer.MAX_VALUE;
        if (size > 0) {
            this.f443085c = 0;
            if (size <= 3 || (size2 <= 0 && size3 <= 0)) {
                this.f443087e = Integer.MAX_VALUE;
                i19 = 0 + size + 1;
            } else {
                if (this.f443086d) {
                    i18 = 4;
                    this.f443087e = 4;
                } else {
                    i18 = size + 1 + 0;
                    this.f443087e = i18;
                }
                i19 = i18 + 1;
            }
        } else {
            this.f443085c = Integer.MAX_VALUE;
        }
        p13.r rVar = this.f443098p;
        com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var = this.f443103u;
        if (rVar == null || rVar.f432664c.length <= 1 || o4Var.f288611f) {
            this.f443083a = Integer.MAX_VALUE;
        } else {
            this.f443083a = i19;
            i19++;
        }
        if (size2 > 0) {
            this.f443088f = i19;
            if (size2 <= 3 || size3 <= 0) {
                this.f443090h = Integer.MAX_VALUE;
                i19 += size2 + 1;
            } else {
                if (this.f443089g) {
                    i17 = i19 + 4;
                    this.f443090h = i17;
                } else {
                    i17 = i19 + size2 + 1;
                    this.f443090h = i17;
                }
                i19 = i17 + 1;
            }
        } else {
            this.f443088f = Integer.MAX_VALUE;
        }
        if (size3 > 0) {
            this.f443091i = i19;
            i19 += size3 + 1;
        } else {
            this.f443091i = Integer.MAX_VALUE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "setCount %d", java.lang.Integer.valueOf(i19));
        this.f443108z = i19;
        if (z18) {
            ((rd0.z0) o4Var).f(str, z17);
        }
        o4Var.h();
        o4Var.notifyDataSetChanged();
    }

    public n0(com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var, java.util.List list, boolean z17, int i17) {
        this.f443083a = Integer.MAX_VALUE;
        this.f443084b = Integer.MAX_VALUE;
        this.f443085c = Integer.MAX_VALUE;
        this.f443086d = true;
        this.f443087e = Integer.MAX_VALUE;
        this.f443088f = Integer.MAX_VALUE;
        this.f443089g = true;
        this.f443090h = Integer.MAX_VALUE;
        this.f443091i = Integer.MAX_VALUE;
        this.f443092j = null;
        this.f443093k = null;
        this.f443094l = null;
        this.f443100r = false;
        this.f443101s = false;
        this.f443102t = false;
        this.f443106x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f443107y = new qd0.m0(this);
        this.f443108z = 0;
        this.f443103u = o4Var;
        this.f443100r = z17;
        this.f443101s = i17 == 1;
        h(list);
    }

    public n0(com.p314xaae8f345.mm.ui.p2690x38b72420.o4 o4Var, java.util.List list, boolean z17, boolean z18) {
        this.f443083a = Integer.MAX_VALUE;
        this.f443084b = Integer.MAX_VALUE;
        this.f443085c = Integer.MAX_VALUE;
        this.f443086d = true;
        this.f443087e = Integer.MAX_VALUE;
        this.f443088f = Integer.MAX_VALUE;
        this.f443089g = true;
        this.f443090h = Integer.MAX_VALUE;
        this.f443091i = Integer.MAX_VALUE;
        this.f443092j = null;
        this.f443093k = null;
        this.f443094l = null;
        this.f443100r = false;
        this.f443101s = false;
        this.f443102t = false;
        this.f443106x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f443107y = new qd0.m0(this);
        this.f443108z = 0;
        this.f443103u = o4Var;
        this.f443100r = z17;
        h(list);
        this.f443105w = z18;
    }
}
