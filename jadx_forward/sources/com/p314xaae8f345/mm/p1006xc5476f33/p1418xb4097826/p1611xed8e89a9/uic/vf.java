package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class vf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd f205833d;

    public vf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd) {
        this.f205833d = c14900x9bf524dd;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558;
        o45.ah mo13821x7f35c2d1;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c45582;
        o45.ah mo13821x7f35c2d12;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c45583;
        o45.zg mo47979x2d63726f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd = this.f205833d;
        android.app.Activity context = c14900x9bf524dd.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
        if (p2Var != null) {
            r45.xw xwVar = null;
            java.lang.Integer valueOf = (m1Var == null || (mo47948x7f0c45583 = m1Var.mo47948x7f0c4558()) == null || (mo47979x2d63726f = mo47948x7f0c45583.mo47979x2d63726f()) == null) ? null : java.lang.Integer.valueOf((int) mo47979x2d63726f.m150604x5fdf8057());
            java.lang.Integer valueOf2 = (m1Var == null || (mo47948x7f0c45582 = m1Var.mo47948x7f0c4558()) == null || (mo13821x7f35c2d12 = mo47948x7f0c45582.mo13821x7f35c2d1()) == null) ? null : java.lang.Integer.valueOf((int) mo13821x7f35c2d12.m150571x5fdf8057());
            if (m1Var != null && (mo47948x7f0c4558 = m1Var.mo47948x7f0c4558()) != null && (mo13821x7f35c2d1 = mo47948x7f0c4558.mo13821x7f35c2d1()) != null) {
                xwVar = mo13821x7f35c2d1.m150576x2b5bc573();
            }
            p2Var.Q6(8460, i18, new az2.g(valueOf, valueOf2, xwVar));
        }
        gm0.j1.d().q(8460, this);
        if (m1Var instanceof db2.e6) {
            db2.e6 e6Var = (db2.e6) m1Var;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e6Var.f309494g, c14900x9bf524dd.F7()) && i17 == 0 && i18 == 0) {
                if (e6Var.P() && ((!e6Var.K() && !e6Var.L()) || !((java.lang.Boolean) ((jz5.n) c14900x9bf524dd.f204994w).mo141623x754a37bb()).booleanValue())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkTingAudioTab onSceneEnd: remove ting audio tab items  empty");
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.hg(c14900x9bf524dd, false));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkTingAudioTab onSceneEnd: add ting audio tab items not empty, isAudioEmpty=" + e6Var.P());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a7 a7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a7(i17, i18, str);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(e6Var.M());
                a7Var.m56420x2a5f836b(linkedList);
                a7Var.m56423xd4b4a5a1(e6Var.f309497m);
                com.p314xaae8f345.mm.p944x882e457a.o oVar = e6Var.f309496i;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
                a7Var.m56419xdac5ee4d(((r45.wu0) fVar).f470998f == 1);
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
                a7Var.m56421x73095078(((r45.wu0) fVar2).f470999g);
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.af(c14900x9bf524dd, e6Var, a7Var));
            }
        }
    }
}
