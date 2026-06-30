package uw0;

/* loaded from: classes5.dex */
public final class d0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f513075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f513076e;

    public d0(uw0.x xVar, uw0.t0 t0Var) {
        this.f513075d = xVar;
        this.f513076e = t0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb J7;
        sw0.b bVar;
        java.lang.String P0;
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f513075d.m157187xd75f96ed(eVar);
        sw0.m mVar = eVar.f494961c;
        boolean z17 = mVar instanceof sw0.h;
        str = "";
        uw0.t0 t0Var = this.f513076e;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = t0Var.D;
            if (!u3Var.isShowing() && !t0Var.u7().f539174e) {
                xw0.r u76 = t0Var.u7();
                java.lang.String str2 = u76.f539176g.f129757b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getMaterialID(...)");
                if (!u76.f539170a.Q6(str2)) {
                    u3Var.show();
                }
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb J72 = t0Var.J7();
            p3325xe03a0797.p3326xc267989b.l.d(t0Var.m158345xefc66565(), null, null, new uw0.z(t0Var, J72, null), 3, null);
            if (J72 != null && (P0 = J72.P0()) != null) {
                str = P0;
            }
            t0Var.q7(str);
            t0Var.R7(J72);
            t0Var.B = true;
            return;
        }
        if (mVar instanceof sw0.i) {
            if (t0Var.D.isShowing()) {
                t0Var.D.dismiss();
                return;
            }
            return;
        }
        if (((mVar instanceof sw0.l) || (mVar instanceof sw0.k)) && (J7 = t0Var.J7()) != null) {
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = J7.f130065a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
            ex0.l K7 = t0Var.K7(c3971x241f78);
            if (K7 == null) {
                return;
            }
            sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
            if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
                java.lang.String str3 = dVar.f494955a.f129757b;
                sw0.b bVar2 = t0Var.f430651q;
                if (bVar2 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    bVar = sw0.b.a(bVar2, null, str3, null, null, null, 29, null);
                } else {
                    bVar = null;
                }
                t0Var.f430651q = bVar;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb c4187xe514cceb = K7.f338679p;
                c4187xe514cceb.getClass();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4187xe514cceb.D();
                java.lang.String w07 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb.w0(c4187xe514cceb, D) : "";
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4187xe514cceb.D();
                str = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb.M0(c4187xe514cceb, D2) : "";
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4187xe514cceb.D();
                (D3 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb.O0(c4187xe514cceb, str3, D3) : bool).booleanValue();
                K7.A(w07);
                c4187xe514cceb.getClass();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D4 = c4187xe514cceb.D();
                if (D4 != null) {
                    bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb.B0(c4187xe514cceb, str, D4);
                }
                bool.booleanValue();
                gx0.hf.V6(t0Var.G7(), c3971x241f78, null, 2, null);
                du0.v0 R6 = t0Var.R6();
                R6.getClass();
                yy0.m7 m7Var = (yy0.m7) R6.O6();
                m7Var.getClass();
                p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.f4(m7Var, str3, null), 3, null);
            }
        }
    }
}
