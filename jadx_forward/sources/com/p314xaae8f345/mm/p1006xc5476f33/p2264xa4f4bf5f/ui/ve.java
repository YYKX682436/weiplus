package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class ve implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6 f255907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18660xc55cefc0 f255908e;

    public ve(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6 activityC18656x65fa26e6, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18660xc55cefc0 c18660xc55cefc0) {
        this.f255907d = activityC18656x65fa26e6;
        this.f255908e = c18660xc55cefc0;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Object obj2;
        ym3.o oVar = (ym3.o) obj;
        ym3.p pVar = oVar.f544710a;
        ym3.p pVar2 = ym3.p.f544713e;
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6 activityC18656x65fa26e6 = this.f255907d;
        if (pVar == pVar2) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = activityC18656x65fa26e6.f255193g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(activityC18656x65fa26e6);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            activityC18656x65fa26e6.f255193g = p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.se(activityC18656x65fa26e6, null), 2, null);
        }
        if (oVar.f544710a == ym3.p.f544714f) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = activityC18656x65fa26e6.f255193g;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            activityC18656x65fa26e6.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.te(activityC18656x65fa26e6));
            java.util.Iterator it = this.f255908e.f233598o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((nj4.i) obj2) instanceof nj4.e) {
                        break;
                    }
                }
            }
            boolean z18 = obj2 == null;
            jz5.g gVar = activityC18656x65fa26e6.f255200q;
            if (!z18) {
                activityC18656x65fa26e6.W6().setVisibility(0);
                java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                ((android.view.ViewGroup) mo141623x754a37bb).setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg.P6((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg) activityC18656x65fa26e6.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg.class), 0, 1, null);
                return;
            }
            boolean z19 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20715x2c77302f()) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicExptConfig", "getTopicStrengthHistoryEntrance >> " + z19);
            if (!z19) {
                activityC18656x65fa26e6.W6().setVisibility(8);
            }
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((android.view.ViewGroup) mo141623x754a37bb2).setVisibility(0);
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            ((android.view.ViewGroup) mo141623x754a37bb3).setPadding(0, 0, 0, (com.p314xaae8f345.mm.ui.bl.a(activityC18656x65fa26e6.mo55332x76847179()) + com.p314xaae8f345.mm.ui.bl.h(activityC18656x65fa26e6.mo55332x76847179())) / 2);
            java.lang.Object mo141623x754a37bb4 = ((jz5.n) activityC18656x65fa26e6.f255201r).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
            com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) mo141623x754a37bb4).getPaint());
            mj4.h E = ai4.m0.f86706a.E();
            java.lang.String h17 = E != null ? ((mj4.k) E).h() : null;
            if (h17 != null && !r26.n0.N(h17)) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6.U6(activityC18656x65fa26e6).setVisibility(8);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6.U6(activityC18656x65fa26e6).setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6.U6(activityC18656x65fa26e6).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ue(activityC18656x65fa26e6));
            qj4.s sVar = qj4.s.f445491a;
            qj4.s.l(sVar, 35L, null, null, 0L, null, 0L, 62, null);
            java.lang.String a17 = en1.a.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            sVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6.U6(activityC18656x65fa26e6), new qj4.l(a17, false, 15L, null, null, null, null, 120, null));
        }
    }
}
