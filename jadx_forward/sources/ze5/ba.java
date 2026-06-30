package ze5;

/* loaded from: classes9.dex */
public class ba implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f553388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f553389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk4.k f553390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fk4.k f553391g;

    public ba(t21.v2 v2Var, t21.v2 v2Var2, fk4.k kVar, fk4.k kVar2) {
        this.f553388d = v2Var;
        this.f553389e = v2Var2;
        this.f553390f = kVar;
        this.f553391g = kVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        java.util.Map map = ze5.ia.f553541o;
        t21.v2 v2Var = this.f553388d;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) map).get(v2Var.d());
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoItemHolder", "update status, filename %s, holder not found", v2Var.d());
            return;
        }
        final ze5.ia iaVar = (ze5.ia) weakReference.get();
        if (iaVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoItemHolder", "update status, filename %s, holder gc!", v2Var.d());
            return;
        }
        z01.j0 m48328xa0ab20ce = iaVar.f553542b.m48328xa0ab20ce();
        if (m48328xa0ab20ce == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoItemHolder", "videoViewModel is null,filename:" + v2Var.d());
            return;
        }
        iaVar.f553543c.setVisibility(8);
        int i19 = v2Var.f496544i;
        m48328xa0ab20ce.f550600h = i19;
        m48328xa0ab20ce.f550599g = i19 == 198;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoItemHolder", "updateStatus videoStatus : " + i19, ",fileName : " + v2Var.d());
        boolean b17 = ze5.ia.b();
        t21.v2 v2Var2 = this.f553389e;
        if (b17) {
            iaVar.f553545e.setVisibility(8);
            if (v2Var2 != null && this.f553390f != null) {
                int m17 = t21.d3.m(v2Var);
                if (v2Var2.f496544i == 199) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.d(v2Var.f496549n);
                    z01.i0 i0Var = m48328xa0ab20ce.f550607r;
                    if (i0Var.f550587d && i0Var.f550590g == z01.h0.f550581e) {
                        m48328xa0ab20ce.f550600h = i19;
                        i0Var.f550587d = false;
                        i0Var.a(true);
                        m48328xa0ab20ce.f550607r = i0Var;
                        iaVar.f553542b.postDelayed(new java.lang.Runnable() { // from class: ze5.ba$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ze5.ia iaVar2 = ze5.ia.this;
                                z01.j0 m48328xa0ab20ce2 = iaVar2.f553542b.m48328xa0ab20ce();
                                m48328xa0ab20ce2.f550607r.a(false);
                                iaVar2.f553542b.m48330xfcfee142(m48328xa0ab20ce2);
                            }
                        }, 3000L);
                    }
                } else {
                    z01.i0 i0Var2 = m48328xa0ab20ce.f550607r;
                    i0Var2.f550587d = true;
                    i0Var2.f550590g = z01.h0.f550581e;
                    i0Var2.a(false);
                    m48328xa0ab20ce.f550607r.f550591h = m17;
                }
            } else if (this.f553391g == null || !((i17 = v2Var.f496544i) == 120 || i17 == 199 || i17 == 121 || i17 == 122)) {
                if (t21.d3.s()) {
                    iaVar.f553545e.setVisibility(8);
                    iaVar.f553542b.m80112xb4e2a3e4(0);
                    m48328xa0ab20ce.f550610u = t21.d3.n(v2Var);
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = iaVar.f553545e;
                    int i27 = v2Var.f496541f;
                    c22626x3e1b8dda.m81381x3ae760af(i27 == 0 ? 0 : (int) ((v2Var.f496539d * 100) / i27));
                }
                m48328xa0ab20ce.f550607r.f550587d = false;
            } else {
                int g17 = t21.d3.g(v2Var);
                if (v2Var.f496544i == 199) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282787a.c(v2Var.f496549n);
                    z01.i0 i0Var3 = m48328xa0ab20ce.f550607r;
                    if (i0Var3.f550587d && i0Var3.f550590g == z01.h0.f550582f) {
                        m48328xa0ab20ce.f550600h = i19;
                        i0Var3.f550587d = false;
                        i0Var3.a(true);
                        m48328xa0ab20ce.f550607r = i0Var3;
                        iaVar.f553542b.postDelayed(new ze5.da(this, iaVar), 3000L);
                    }
                } else {
                    z01.i0 i0Var4 = m48328xa0ab20ce.f550607r;
                    i0Var4.f550587d = true;
                    i0Var4.f550590g = z01.h0.f550582f;
                    i0Var4.a(false);
                    m48328xa0ab20ce.f550607r.f550591h = g17;
                }
            }
        } else {
            iaVar.f553545e.setVisibility(0);
            if (i19 == 112 || i19 == 122 || i19 == 120 || (v2Var2 != null && ((i18 = v2Var2.f496544i) == 120 || i18 == 199))) {
                if (v2Var2 != null) {
                    iaVar.f553545e.setVisibility(8);
                    if (v2Var2.f496544i == 120) {
                        m48328xa0ab20ce.f550606q = t21.d3.m(v2Var);
                        m48328xa0ab20ce.f550604o = true;
                    }
                    if (v2Var2.f496544i == 199) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.d(v2Var.f496549n);
                        if (m48328xa0ab20ce.f550604o) {
                            m48328xa0ab20ce.f550600h = i19;
                            m48328xa0ab20ce.f550604o = false;
                            m48328xa0ab20ce.f550605p = true;
                            iaVar.f553542b.postDelayed(new ze5.ca(this, iaVar), 2000L);
                        }
                    }
                } else {
                    iaVar.f553545e.m81381x3ae760af(t21.d3.g(v2Var));
                }
            } else if (t21.d3.s()) {
                iaVar.f553545e.setVisibility(8);
                iaVar.f553542b.m80112xb4e2a3e4(0);
                m48328xa0ab20ce.f550610u = t21.d3.n(v2Var);
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda2 = iaVar.f553545e;
                int i28 = v2Var.f496541f;
                c22626x3e1b8dda2.m81381x3ae760af(i28 != 0 ? (int) ((v2Var.f496539d * 100) / i28) : 0);
            }
        }
        iaVar.f553542b.m48330xfcfee142(m48328xa0ab20ce);
    }
}
