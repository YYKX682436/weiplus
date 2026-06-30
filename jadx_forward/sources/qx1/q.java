package qx1;

/* loaded from: classes12.dex */
public class q implements jx1.a, mx1.b {

    /* renamed from: a, reason: collision with root package name */
    public final nx1.z f448840a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f448841b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f448842c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f448843d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f448844e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f448845f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f448846g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f448847h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f448848i = false;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f448849j = "";

    /* renamed from: k, reason: collision with root package name */
    public boolean f448850k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f448851l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f448852m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f448853n = false;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f448854o;

    public q(nx1.z zVar, android.view.View view, mx1.a aVar, long j17) {
        this.f448840a = zVar;
        this.f448841b = view;
        zVar.f422866c = this;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) view.findViewById(com.p314xaae8f345.mm.R.id.d8a);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) view.findViewById(com.p314xaae8f345.mm.R.id.d88);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) view.findViewById(com.p314xaae8f345.mm.R.id.d89);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) view.findViewById(com.p314xaae8f345.mm.R.id.d87);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f5 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) view.findViewById(com.p314xaae8f345.mm.R.id.d86);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f6 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) view.findViewById(com.p314xaae8f345.mm.R.id.d8_);
        this.f448842c = c22698xdfbd289f6;
        c22698xdfbd289f.setVisibility((j17 & 1) == 0 ? 8 : 0);
        c22698xdfbd289f2.setVisibility((j17 & 16) == 0 ? 8 : 0);
        c22698xdfbd289f3.setVisibility((j17 & 4096) == 0 ? 8 : 0);
        c22698xdfbd289f4.setVisibility((j17 & 65536) == 0 ? 8 : 0);
        c22698xdfbd289f5.setVisibility((j17 & 256) == 0 ? 8 : 0);
        c22698xdfbd289f6.setVisibility((j17 & 1048576) == 0 ? 8 : 0);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.d8z);
        this.f448843d = linearLayout;
        linearLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.pog);
        this.f448844e = linearLayout2;
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.poe);
        this.f448845f = linearLayout3;
        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.pof);
        android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.jqt);
        this.f448846g = linearLayout5;
        android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.po_);
        this.f448847h = linearLayout6;
        linearLayout2.setVisibility((j17 & 16777216) == 0 ? 8 : 0);
        linearLayout3.setVisibility((j17 & 268435456) == 0 ? 8 : 0);
        linearLayout4.setVisibility((j17 & 4294967296L) == 0 ? 8 : 0);
        linearLayout5.setVisibility((j17 & 68719476736L) == 0 ? 8 : 0);
        linearLayout6.setVisibility((j17 & 1099511627776L) == 0 ? 8 : 0);
        c22698xdfbd289f.setOnClickListener(new qx1.h(this, aVar));
        c22698xdfbd289f2.setOnClickListener(new qx1.i(this, aVar));
        this.f448854o = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jump_to_record_media, true);
        c22698xdfbd289f5.setOnClickListener(new qx1.j(this, aVar));
        c22698xdfbd289f6.setOnClickListener(new qx1.k(this, aVar, zVar));
        linearLayout2.setOnClickListener(new qx1.l(this, aVar));
        linearLayout3.setOnClickListener(new qx1.m(this, aVar));
        linearLayout4.setOnClickListener(new qx1.n(this, zVar, aVar));
        linearLayout5.setOnClickListener(new qx1.o(this, aVar));
        linearLayout6.setOnClickListener(new qx1.p(this, aVar));
        c22698xdfbd289f3.setOnClickListener(new qx1.a(this, aVar));
        c22698xdfbd289f4.setOnClickListener(new qx1.c(this, aVar));
    }

    public static void a(qx1.q qVar, android.view.View view, boolean z17) {
        qVar.getClass();
        view.postDelayed(new qx1.g(qVar, view, z17), 100L);
    }

    public static void b(qx1.q qVar, mx1.a aVar) {
        qVar.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).k7(true, 50L);
        qVar.c(1, 0L);
    }

    public void c(int i17, long j17) {
        this.f448841b.postDelayed(new qx1.d(this, i17), j17);
    }

    public void d(mx1.a aVar) {
        int i17;
        this.f448842c.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562932sa);
        if (this.f448848i) {
            this.f448848i = false;
            hx1.g a17 = hx1.g.a();
            if (a17.f367156a && !a17.f367159d) {
                a17.b();
            }
            hx1.g a18 = hx1.g.a();
            java.lang.String str = com.p314xaae8f345.mm.vfs.w6.j(a18.f367166k) ? a18.f367166k : "";
            int i18 = (int) hx1.g.a().f367158c;
            int j17 = (int) com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.j(i18);
            nx1.d q17 = nx1.d.q();
            synchronized (q17) {
                if (q17.f422815a != null) {
                    i17 = 0;
                    while (i17 < q17.f422815a.size()) {
                        if (((ix1.a) q17.f422815a.get(i17)).b() == 4 && ((ix1.n) q17.f422815a.get(i17)).f376882w.booleanValue()) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                i17 = -1;
            }
            ix1.a l17 = nx1.d.q().l(i17);
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorFooterPanel", "voicePath not exist, remove data from data list and ui.");
                nx1.d.q().w(i17, false);
                if (aVar != null) {
                    aVar.x1(i17);
                }
                ix1.l lVar = new ix1.l();
                lVar.f376871s = "";
                lVar.f376845b = true;
                lVar.f376850g = false;
                nx1.d.q().a(i17, lVar, true);
                nx1.d.q().d(i17 - 1, i17 + 1, true);
                return;
            }
            if (i17 == -1 || l17 == null || l17.b() != 4) {
                return;
            }
            ix1.n nVar = (ix1.n) l17;
            nVar.f376882w = java.lang.Boolean.FALSE;
            nVar.f376860p = 4;
            nVar.f376861q = true;
            ((java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, j17)).getClass();
            nVar.f376862r = str;
            nVar.f376878v = i18;
            mx1.a aVar2 = nx1.d.q().f422816b;
            if (aVar2 != null) {
                aVar2.j3(i17, 0L);
            }
        }
    }
}
