package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class t3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 f284224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f284226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f284227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f284228h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f284229i;

    public t3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 w3Var, java.lang.String str, android.content.Context context, boolean z17, boolean z18, java.lang.Runnable runnable) {
        this.f284224d = w3Var;
        this.f284225e = str;
        this.f284226f = context;
        this.f284227g = z17;
        this.f284228h = z18;
        this.f284229i = runnable;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        java.util.List list;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 w3Var = this.f284224d;
        if (w3Var == null || (list = w3Var.f287734a) == null) {
            return false;
        }
        java.lang.String f17 = list.size() > 1 ? dh3.c.f314022a.f(this.f284225e, dh3.d.f314029e) : "";
        java.util.Iterator it = w3Var.f287734a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.h(this.f284226f, this.f284225e, (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next(), w3Var.f287735b, this.f284227g, f17);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        int i17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 w3Var = this.f284224d;
        java.util.List list = w3Var.f287734a;
        if (list != null) {
            long size = list.size();
            long size2 = w3Var.f287734a.size() - com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.f(w3Var.f287734a);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w3 w3Var2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f287761a;
            pm0.v.K(null, new yd5.l(5L, size, size2, w3Var2.f287740g, w3Var2.f287741h, w3Var2.f287742i));
        }
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list2 = w3Var.f287734a;
        if (list2 != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list2) {
                if (f9Var.k2()) {
                    java.lang.String j17 = f9Var.j();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    ot0.q v17 = ot0.q.v(j17);
                    if (v17 != null && ((i17 = v17.f430199i) == 51 || i17 == 129)) {
                        zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
                        if (iVar != null) {
                            linkedList.add(new android.util.Pair(iVar.f558944b.m75945x2fec8307(0), iVar.f558944b.m75945x2fec8307(8)));
                        }
                    }
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList, false);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList2, true);
            }
        }
        if (this.f284228h) {
            java.lang.Runnable runnable = this.f284229i;
            if (runnable != null) {
                runnable.run();
            }
            java.lang.ref.WeakReference weakReference = w3Var.f287736c;
            if (weakReference != null && weakReference.get() != null) {
                ((ot0.f3) w3Var.f287736c.get()).f2(ot0.e3.trans);
            }
            w3Var.f287734a = null;
            w3Var.f287735b = false;
            w3Var.f287736c = null;
            w3Var.f287737d = null;
            w3Var.f287738e = null;
            w3Var.f287739f = null;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.a();
        }
        return true;
    }
}
