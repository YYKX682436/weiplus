package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class s6 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f198928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 f198930c;

    public s6(p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var) {
        this.f198928a = qVar;
        this.f198929b = str;
        this.f198930c = b8Var;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        mv2.n0 n0Var = (mv2.n0) task;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "[dealWithCoverUrl] upload end, resultUrl:" + n0Var.f413142h + ", task.resultThumbUrl:" + n0Var.f413143i);
        fp0.u uVar = fp0.u.f346823f;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f198928a;
        if (status == uVar && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var.f413142h)) {
            java.lang.String str = n0Var.f413142h;
            java.lang.String str2 = n0Var.f413143i;
            dn.h hVar = n0Var.f413144m;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b6(str, str2, this.f198929b, hVar != null ? hVar.f69526x419c9c3d : null)));
            return;
        }
        qo0.c cVar = this.f198930c.f198469d;
        boolean z17 = false;
        if (cVar != null && cVar.mo11219xd0598cf8() == 1) {
            z17 = true;
        }
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            ml2.z3[] z3VarArr = ml2.z3.f409875d;
            zy2.zb.j5(zbVar, 4L, java.lang.String.valueOf(1), null, 4, null);
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            fp0.u uVar2 = fp0.u.f346821d;
            j0Var.getClass();
            ml2.j0.f409116i.N = 3;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Yj(ml2.w1.f409709f);
        }
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }
}
