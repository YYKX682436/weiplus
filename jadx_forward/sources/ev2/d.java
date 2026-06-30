package ev2;

/* loaded from: classes10.dex */
public final class d extends fp0.d implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final jv2.a f338436f;

    /* renamed from: g, reason: collision with root package name */
    public final iv2.a f338437g;

    /* renamed from: h, reason: collision with root package name */
    public fv2.h f338438h;

    public d(jv2.a action, iv2.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f338436f = action;
        this.f338437g = aVar;
    }

    @Override // fp0.d
    public void a() {
        iv2.a aVar = this.f338437g;
        if (aVar == null) {
            return;
        }
        jv2.a aVar2 = this.f338436f;
        this.f338438h = new fv2.h(aVar2, aVar);
        long a17 = c01.id.a() - (aVar2.u0().m76064x3febcdbf() * 1000);
        long j17 = aVar2.f67485x90b085b9;
        if (j17 < 2 && a17 < 1200000) {
            aVar2.f67485x90b085b9 = j17 + 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusActionTask", "doAction " + aVar2 + ' ' + aVar2 + ".field_tryCount");
            p000.y.f539830f.a().D0(aVar2.f67480xf609be94, aVar2, false);
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            fv2.h hVar = this.f338438h;
            if (hVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curScene");
                throw null;
            }
            d17.g(hVar);
            gm0.j1.d().a(9704, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusActionTask", "make fail tryNext " + aVar2.t0() + " tryCount " + aVar2.f67485x90b085b9 + " createTime: " + aVar2.u0().m76064x3febcdbf());
        aVar2.f67484x29d3a50c = -1;
        p000.y.f539830f.a().D0(aVar2.f67480xf609be94, aVar2, true);
        b(fp0.u.f346823f);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2.D0(), en1.a.a());
        xe0.i0 i0Var = (xe0.i0) i95.n0.c(xe0.i0.class);
        java.lang.String D0 = aVar2.D0();
        ((we0.l1) i0Var).getClass();
        mj4.h M = ai4.m0.f86706a.M(D0);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, kz5.c1.k(new jz5.l("textstatusid", M != null ? ((mj4.k) M).l() : ""), new jz5.l("s_self_textstatus", java.lang.Boolean.valueOf(b17))), 28809);
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jv2.a aVar = this.f338436f;
        sb6.append(aVar.f67475x2788aaf5);
        sb6.append('_');
        sb6.append(aVar.f67478xf9a02e3e);
        sb6.append('_');
        sb6.append(aVar.f67480xf609be94);
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        fv2.h hVar = this.f338438h;
        if (hVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curScene");
            throw null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, hVar)) {
            gm0.j1.d().q(9704, this);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd ");
            sb6.append(i17);
            sb6.append(", ");
            sb6.append(i18);
            sb6.append(", ");
            sb6.append(str);
            sb6.append(", ");
            jv2.a aVar = this.f338436f;
            sb6.append(aVar != null ? java.lang.Long.valueOf(aVar.f67480xf609be94) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusActionTask", sb6.toString());
            if (aVar != null) {
                if (i17 == 0 && i18 == 0) {
                    p000.y.f539830f.a().z0(aVar.f67480xf609be94);
                    b(fp0.u.f346823f);
                    return;
                }
                if (i17 == 4 && (i18 == -5002 || i18 == -5001 || i18 == -4007 || i18 == -4006)) {
                    p000.y.f539830f.a().z0(aVar.f67480xf609be94);
                } else {
                    if (i17 >= 4) {
                        aVar.f67484x29d3a50c = -1;
                        if (i18 == -4010) {
                            aVar.f67477xdad0d5ae = 1;
                        }
                    } else {
                        aVar.f67482x4ae21932 = c01.id.a();
                    }
                    p000.y.f539830f.a().D0(aVar.f67480xf609be94, aVar, false);
                }
                b(fp0.u.f346824g);
            }
        }
    }
}
