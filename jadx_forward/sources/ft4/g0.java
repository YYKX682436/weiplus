package ft4;

/* loaded from: classes14.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f f348147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.j f348148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f348149f;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f, ft4.j jVar, int i17) {
        this.f348147d = activityC19138xce65e38f;
        this.f348148e = jVar;
        this.f348149f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        java.util.List m17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348147d;
        dt4.p pVar = activityC19138xce65e38f.f261977w;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
            throw null;
        }
        int i17 = activityC19138xce65e38f.f261970p;
        int i18 = this.f348148e.f348165b.f348171c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = "";
        java.lang.String[] strArr = {pVar.f324801a, java.lang.String.valueOf(i18), java.lang.String.valueOf(1)};
        if (i17 > 0) {
            str = "AND tradeType = ?";
            strArr = new java.lang.String[]{pVar.f324801a, java.lang.String.valueOf(i18), java.lang.String.valueOf(i17), java.lang.String.valueOf(1)};
        }
        java.lang.String format = java.lang.String.format("SELECT DISTINCT msgDate FROM WalletLedgerRecord WHERE ((talker = ?) AND msgDate %s ?) AND tradeAmount > 0 %s ORDER BY msgTime DESC LIMIT ? OFFSET 0", java.util.Arrays.copyOf(new java.lang.Object[]{">", str}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
        }
        l75.k0 Q4 = ((xs4.b) a17).Q4();
        android.database.Cursor B = Q4 != null ? Q4.B(format, strArr) : null;
        if (B != null) {
            while (B.moveToNext()) {
                try {
                    dm.ec ecVar = new dm.ec();
                    ecVar.mo9015xbf5d97fd(B);
                    dt4.u uVar = new dt4.u();
                    uVar.f324825a = ecVar.t0();
                    arrayList.add(uVar);
                } finally {
                }
            }
            vz5.b.a(B, null);
        }
        if (!arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "loadTopMore pos:" + this.f348149f + ", more > " + this.f348148e.f348165b.f348171c + " tradeData:" + ((dt4.u) kz5.n0.X(arrayList)).f324825a);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            dt4.t tVar = new dt4.t();
            int i19 = (((dt4.u) kz5.n0.X(arrayList)).f324825a / 100) * 100;
            tVar.f324820a = i19 + 1;
            tVar.f324821b = i19 + 31;
            arrayList2.add(tVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f2 = this.f348147d;
            if (activityC19138xce65e38f2.f261969o == 1) {
                dt4.p pVar2 = activityC19138xce65e38f2.f261977w;
                if (pVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
                    throw null;
                }
                m17 = pVar2.l(activityC19138xce65e38f2.f261970p, arrayList2);
            } else {
                dt4.p pVar3 = activityC19138xce65e38f2.f261977w;
                if (pVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
                    throw null;
                }
                m17 = pVar3.m(activityC19138xce65e38f2.f261970p, arrayList2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f3 = this.f348147d;
            int V6 = activityC19138xce65e38f3.V6(m17, activityC19138xce65e38f3.f261974t);
            if (V6 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLedgerMainUI", "loadTopMore pos:" + this.f348149f + ", getSectionData count is 0");
                ft4.i iVar = this.f348147d.f261975u;
                if (iVar != null) {
                    iVar.f348158g = 0;
                }
                if (iVar != null) {
                    iVar.m8155x27702c4(this.f348149f);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f4 = this.f348147d;
                ft4.i iVar2 = activityC19138xce65e38f4.f261975u;
                if (iVar2 != null) {
                    java.util.List list = activityC19138xce65e38f4.f261974t;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
                    iVar2.f348156e = list;
                }
                ft4.i iVar3 = this.f348147d.f261975u;
                if (iVar3 != null) {
                    iVar3.m8153xd399a4d9(this.f348149f, V6);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "loadTopMore pos:" + this.f348149f + ", more > " + this.f348148e.f348165b.f348171c);
            ft4.i iVar4 = this.f348147d.f261975u;
            if (iVar4 != null) {
                iVar4.f348158g = 0;
            }
            if (iVar4 != null) {
                iVar4.m8155x27702c4(this.f348149f);
            }
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        ft4.f0 f0Var = new ft4.f0(this.f348147d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(f0Var, 20L, false);
    }
}
