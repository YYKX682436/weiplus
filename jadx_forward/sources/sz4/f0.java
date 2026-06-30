package sz4;

/* loaded from: classes12.dex */
public class f0 extends sz4.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a f495728f;

    public f0(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.m8b);
        this.f495728f = c19515x154ec45a;
        if (j0Var.f414842q != 2 || !this.f495715d.f414843r) {
            c19515x154ec45a.setKeyListener(null);
            c19515x154ec45a.setFocusable(false);
            c19515x154ec45a.setClickable(true);
        }
        c19515x154ec45a.E = this;
        c19515x154ec45a.m74974xf2d19fb3(0);
        this.f495715d.k(c19515x154ec45a);
        c19515x154ec45a.getViewTreeObserver().addOnGlobalLayoutListener(new sz4.c0(this));
    }

    @Override // sz4.a
    public int i() {
        return 1;
    }

    @Override // sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = this.f495728f;
        c19515x154ec45a.m74976xaf1e83df(i17);
        iz4.i iVar = (iz4.i) cVar;
        iVar.f377641f = c19515x154ec45a;
        android.os.Bundle bundle = null;
        iVar.f377639d = null;
        iVar.f377640e = null;
        mz4.d dVar = this.f495716e;
        iz4.c l17 = dVar.l(i17 - 1);
        int i19 = 0;
        if (l17 != null && l17.d() == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) c19515x154ec45a.getLayoutParams();
            layoutParams.topMargin = 0;
            c19515x154ec45a.setLayoutParams(layoutParams);
        }
        iz4.c l18 = dVar.l(i17 + 1);
        if (l18 != null && l18.d() == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) c19515x154ec45a.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            c19515x154ec45a.setLayoutParams(layoutParams2);
        }
        mz4.j0 j0Var = this.f495715d;
        int i27 = j0Var.f414842q;
        if (i27 == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(j0Var.f414828c, j0Var.f414827b);
            java.lang.String Q0 = Li.Q0();
            long I0 = Li.I0();
            if (j0Var.f414826a) {
                bundle = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272793q.a(Q0 != null ? k01.d.a(Q0) : -1);
            } else {
                bundle = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272792p.a(Q0 != null ? k01.d.a(Q0) : -1);
            }
            bundle.putInt("geta8key_scene", 73);
            bundle.putLong("msgSvrId", I0);
            bundle.putString("msgUsername", j0Var.f414829d);
            bundle.putInt("KMsgType", 49);
            bundle.putString("geta8key_username", j0Var.f414828c);
        } else if (i27 == 2) {
            bundle = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272791o.a(-1);
        } else if (i27 == 4) {
            bundle = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272794r.a(-1);
            bundle.putString("serverMsgID", j0Var.f414830e);
            bundle.putInt("geta8key_scene", 97);
            bundle.putString("msgUsername", j0Var.f414831f);
            bundle.putString("geta8key_username", j0Var.f414831f);
        }
        if (j0Var.f414842q == 2 && j0Var.f414843r) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new sz4.e0(this, iVar, bundle));
        } else {
            c19515x154ec45a.m74978xe08d546d(iVar.f377688t);
            le0.r rVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272726c;
            int i28 = j0Var.f414842q;
            if (i28 == 2) {
                i19 = 9;
            } else if (i28 == 1) {
                i19 = 8;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.q(c19515x154ec45a, bundle, rVar, i19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteTextItemHolder", "TextItemHolder position is " + m8186xceeefb69());
    }
}
