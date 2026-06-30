package ev2;

/* loaded from: classes10.dex */
public final class i extends fp0.d implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final jv2.c f338446f;

    /* renamed from: g, reason: collision with root package name */
    public final iv2.b f338447g;

    /* renamed from: h, reason: collision with root package name */
    public fv2.i f338448h;

    public i(jv2.c action, iv2.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f338446f = action;
        this.f338447g = bVar;
    }

    @Override // fp0.d
    public void a() {
        iv2.b bVar = this.f338447g;
        if (bVar == null) {
            return;
        }
        jv2.c cVar = this.f338446f;
        this.f338448h = new fv2.i(cVar, bVar);
        long a17 = c01.id.a() - (cVar.u0().m76064x3febcdbf() * 1000);
        long j17 = cVar.f67485x90b085b9;
        if (j17 >= 2 || a17 >= 1200000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.ActionTask", "make fail tryNext " + cVar.t0() + " tryCount " + cVar.f67485x90b085b9 + " createTime: " + cVar.u0().m76064x3febcdbf());
            cVar.f67484x29d3a50c = -1;
            jv2.h.f383750f.a().D0(cVar.f67480xf609be94, cVar, true);
            b(fp0.u.f346823f);
            return;
        }
        cVar.f67485x90b085b9 = j17 + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.ActionTask", "doAction " + cVar + ' ' + cVar + ".field_tryCount");
        jv2.h.f383750f.a().D0(cVar.f67480xf609be94, cVar, false);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        fv2.i iVar = this.f338448h;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curScene");
            throw null;
        }
        d17.g(iVar);
        gm0.j1.d().a(6964, this);
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jv2.c cVar = this.f338446f;
        sb6.append(cVar.f67475x2788aaf5);
        sb6.append('_');
        sb6.append(cVar.f67478xf9a02e3e);
        sb6.append('_');
        sb6.append(cVar.f67480xf609be94);
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        fv2.i iVar = this.f338448h;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curScene");
            throw null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, iVar)) {
            gm0.j1.d().q(6964, this);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd ");
            sb6.append(i17);
            sb6.append(", ");
            sb6.append(i18);
            sb6.append(", ");
            sb6.append(str);
            sb6.append(", ");
            jv2.c cVar = this.f338446f;
            sb6.append(cVar != null ? java.lang.Long.valueOf(cVar.f67480xf609be94) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.ActionTask", sb6.toString());
            if (cVar != null) {
                if (i17 == 0 && i18 == 0) {
                    jv2.h.f383750f.a().z0(cVar.f67480xf609be94);
                    b(fp0.u.f346823f);
                    return;
                }
                if (i17 == 4 && (i18 == -5002 || i18 == -5001 || i18 == -4007 || i18 == -4006)) {
                    jv2.h.f383750f.a().z0(cVar.f67480xf609be94);
                } else {
                    if (i17 >= 4) {
                        cVar.f67484x29d3a50c = -1;
                        if (i18 == -4010) {
                            cVar.f67477xdad0d5ae = 1;
                        }
                    } else {
                        cVar.f67482x4ae21932 = c01.id.a();
                    }
                    jv2.h.f383750f.a().D0(cVar.f67480xf609be94, cVar, false);
                }
                b(fp0.u.f346824g);
            }
        }
    }
}
