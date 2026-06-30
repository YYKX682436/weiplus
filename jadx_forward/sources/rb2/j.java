package rb2;

/* loaded from: classes10.dex */
public final class j extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4 f475188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f475189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475191d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4 c15267xd9054be4, long j17, in5.s0 s0Var, so2.y0 y0Var) {
        this.f475188a = c15267xd9054be4;
        this.f475189b = j17;
        this.f475190c = s0Var;
        this.f475191d = y0Var;
    }

    @Override // ym5.n0
    /* renamed from: getAdditionalCondition */
    public boolean mo55689xe831ad7e(android.view.View target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        android.content.Context context = target.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha haVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.class);
        int O6 = haVar != null ? haVar.O6() : -1;
        android.content.Context context2 = this.f475190c.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (O6 == -1 || O6 == 1) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a17).f206907f;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        so2.y0 y0Var = this.f475191d;
        in5.s0 s0Var = this.f475190c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4 c15267xd9054be4 = this.f475188a;
        if (!z17) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a17).V6(y0Var.f492236d.f68959xf9a02e3e, y0Var);
            rh3.o m66744x2a55bdd7 = c15267xd9054be4.m66744x2a55bdd7();
            if (m66744x2a55bdd7 != null ? m66744x2a55bdd7.mo162437xc00617a4() : false) {
                c15267xd9054be4.q();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCommentConvert", "onViewExposed: ad video view is not playing, do not pause");
                return;
            }
        }
        c15267xd9054be4.m61771xc809512f().e(this.f475189b);
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a18).T6(y0Var.f492236d.f68959xf9a02e3e, y0Var);
        c15267xd9054be4.m61787x764d819b(true);
        if (c15267xd9054be4.m61780xfa6224fa() == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.r(this.f475188a, null, 0L, 3, null);
        } else {
            c15267xd9054be4.curStartPlayTime = c01.id.c();
            c15267xd9054be4.m66744x2a55bdd7().b(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.r(this.f475188a, null, 0L, 3, null);
        }
        s0Var.f374657h = java.lang.Boolean.TRUE;
    }
}
