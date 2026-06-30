package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class z0 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 f199088a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var) {
        this.f199088a = a1Var;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        android.graphics.Point point;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        mv2.n0 n0Var = (mv2.n0) task;
        if (status != fp0.u.f346823f || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var.f413142h)) {
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e();
        c19788xd7cfd73e.m76678xca029dad(n0Var.f413142h);
        c19788xd7cfd73e.m76666xdb5612fc(9);
        c19788xd7cfd73e.m76676xd3f7e23b(n0Var.f413143i);
        c19788xd7cfd73e.m76682xc9923ded(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var = this.f199088a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a1Var.S6().f200154i)) {
            a1Var.S6();
            point = new android.graphics.Point(300, 400);
        } else {
            w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
            java.lang.String filePath = a1Var.S6().f200154i;
            ((qs2.q) eVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
            point = mv2.f0.f413094a.h(filePath);
        }
        c19788xd7cfd73e.m76685x53e9ee84(point.x);
        c19788xd7cfd73e.m76658xf84e829(point.y);
        dn.h hVar = n0Var.f413144m;
        if (hVar == null || (str = hVar.f69526x419c9c3d) == null) {
            str = "";
        }
        c19788xd7cfd73e.m76665x17e7970f(str);
        c19788xd7cfd73e.m76638x619ae8ba(n0Var.f413142h);
        a1Var.R6(c19788xd7cfd73e);
    }
}
