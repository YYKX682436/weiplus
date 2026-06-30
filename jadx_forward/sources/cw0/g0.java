package cw0;

/* loaded from: classes5.dex */
public final class g0 implements pv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f304164a;

    public g0(cw0.l0 l0Var) {
        this.f304164a = l0Var;
    }

    @Override // pv0.a
    public void a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, java.lang.String roleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        cw0.l0 l0Var = this.f304164a;
        ex0.q x76 = l0Var.x7(segmentID);
        if (x76 == null) {
            return;
        }
        l0Var.O7(segmentID, x76);
    }

    @Override // pv0.a
    public void b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        this.f304164a.P7(segmentID);
    }

    @Override // pv0.a
    public void c(dw0.c timbreInfo) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        cw0.l0 l0Var;
        ex0.q x76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = timbreInfo.f325620b;
        if (c4190xd8dd3713 == null || (c3971x241f78 = c4190xd8dd3713.f130065a) == null || (x76 = (l0Var = this.f304164a).x7(c3971x241f78)) == null || !timbreInfo.b()) {
            return;
        }
        l0Var.S7(x76);
    }

    @Override // pv0.a
    public void d(dw0.c timbreInfo) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        cw0.l0 l0Var;
        ex0.q x76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = timbreInfo.f325620b;
        if (c4190xd8dd3713 == null || (c3971x241f78 = c4190xd8dd3713.f130065a) == null || (x76 = (l0Var = this.f304164a).x7(c3971x241f78)) == null) {
            return;
        }
        l0Var.N7(x76);
    }

    @Override // pv0.a
    public void e(ru0.e roleResult) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleResult, "roleResult");
        cw0.l0 l0Var = this.f304164a;
        ex0.q x76 = l0Var.x7(roleResult.f481195a);
        if (x76 == null || (r6Var = roleResult.f481198d) == null) {
            return;
        }
        l0Var.K7(roleResult, x76, r6Var);
    }

    @Override // pv0.a
    public boolean f(dw0.c timbreInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
        boolean b17 = timbreInfo.b();
        cw0.l0 l0Var = this.f304164a;
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = timbreInfo.f325619a;
        if (b17) {
            l0Var.s7(new cw0.d0(l0Var));
        } else {
            l0Var.s7(new cw0.e0(dw0.f.a(c4104x6d422cb2), c4104x6d422cb2.f129759d));
            java.util.List y76 = l0Var.y7();
            if (y76 != null) {
                java.util.Objects.toString(timbreInfo);
                gx0.sc z76 = l0Var.z7();
                ug.m mVar = ug.m.Narration;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = y76.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = ((ex0.q) it.next()).f338700a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c4190xd8dd3713, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
                    yu0.t f17 = ru0.a.f((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd3713, c4104x6d422cb2);
                    if (f17 != null) {
                        arrayList.add(f17);
                    }
                }
                z76.p7(mVar, arrayList);
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var.f304180s, c4104x6d422cb2)) {
            java.lang.String string = l0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574040hj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            l0Var.U7(string);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4104x6d422cb2, "<set-?>");
        l0Var.f304180s = c4104x6d422cb2;
        cw0.l0 l0Var2 = this.f304164a;
        pf5.e.m158344xbe96bc24(l0Var2, null, null, new cw0.f0(l0Var2, null), 3, null);
        return true;
    }

    @Override // pv0.a
    public void g(dw0.c timbreInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbreInfo, "timbreInfo");
    }
}
