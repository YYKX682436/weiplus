package rk2;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final tk2.a f478003a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d f478004b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f478005c;

    /* renamed from: d, reason: collision with root package name */
    public final rk2.b f478006d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14258x2652fdcb f478007e;

    /* renamed from: f, reason: collision with root package name */
    public int f478008f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f478009g;

    /* renamed from: h, reason: collision with root package name */
    public int f478010h;

    /* renamed from: i, reason: collision with root package name */
    public int f478011i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f478012j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f478013k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f478014l;

    /* renamed from: m, reason: collision with root package name */
    public int f478015m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f478016n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f478017o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager, androidx.recyclerview.widget.RecyclerView$LayoutManager, com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1, androidx.recyclerview.widget.LinearLayoutManager] */
    public q(android.view.ViewGroup root, tk2.a service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f478003a = service;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d c14259xb044a81d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d) root.findViewById(com.p314xaae8f345.mm.R.id.ig6);
        this.f478004b = c14259xb044a81d;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f478005c = linkedList;
        rk2.b bVar = new rk2.b(linkedList, service);
        this.f478006d = bVar;
        ?? r66 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1(root.getContext()) { // from class: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r2, 0, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2);
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: canScrollHorizontally */
            public boolean getF180019n() {
                rk2.q qVar = rk2.q.this;
                if (!qVar.f478013k) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) qVar.f478003a;
                return !((mm2.w) zzVar.P0(mm2.w.class)).O6() && !((mm2.c1) zzVar.P0(mm2.c1.class)).f8();
            }
        };
        this.f478007e = r66;
        jz5.g b17 = jz5.h.b(rk2.p.f478002d);
        this.f478008f = -1;
        this.f478010h = -1;
        this.f478011i = -1;
        this.f478014l = "";
        this.f478016n = true;
        c14259xb044a81d.mo7967x900dcbe1(r66);
        r66.f197525z = new rk2.k(this);
        r66.A = new rk2.l(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6) ((jz5.n) b17).mo141623x754a37bb()).b(c14259xb044a81d);
        c14259xb044a81d.m7963x830bc99d(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea.i1(c14259xb044a81d, r66, null, 2, null);
        c14259xb044a81d.m55763x737778f5(new rk2.m(this));
        c14259xb044a81d.m56887x69836747(new rk2.n(this));
        c14259xb044a81d.m56888x2b2c2ab6(new rk2.o(this));
        c14259xb044a81d.mo7960x6cab2c8d(bVar);
    }

    public static final void a(rk2.q qVar, int i17) {
        int c17 = qVar.c(i17);
        android.view.View mo7935xa188593e = qVar.f478007e.mo7935xa188593e(i17);
        if (mo7935xa188593e == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6 c14257x862705f6 = mo7935xa188593e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6) mo7935xa188593e : null;
        if (c14257x862705f6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14257x862705f6.f193278d, "startPreload " + c14257x862705f6.f193281g + " lastPlayer: " + c14257x862705f6.f193283i);
            c14257x862705f6.d(true);
            mn0.b0 b0Var = c14257x862705f6.f193283i;
            if (b0Var != null) {
                mn0.b0.C(b0Var, true, false, false, 6, null);
            }
            c14257x862705f6.e();
            mn0.b0 b0Var2 = c14257x862705f6.f193283i;
            if (b0Var2 != null) {
                ((mn0.y) b0Var2).G(true);
            }
        }
        qVar.f478009g = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamWidget", "pre startPlay pos = " + c17);
    }

    public static final void b(rk2.q qVar, int i17) {
        int c17 = qVar.c(i17);
        uk2.b x17 = qVar.f478006d.x(c17);
        if (x17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamWidget", "pre stopPlay pos = " + c17 + " position: " + i17);
        java.util.HashMap hashMap = rk2.d.f477983a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlayer: ");
        sb6.append(x17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlayerManager", sb6.toString());
        mn0.b0 b0Var = (mn0.b0) rk2.d.f477983a.get(x17.a());
        if (b0Var != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
        }
    }

    public final int c(int i17) {
        int size = this.f478005c.size();
        if (size == 0) {
            return i17;
        }
        int i18 = i17 % size;
        if (i18 >= size) {
            return size - 1;
        }
        if (i18 < 0) {
            return 0;
        }
        return i18;
    }
}
