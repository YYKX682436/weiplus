package uw0;

/* loaded from: classes5.dex */
public final class g implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.a f513092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.o f513093e;

    public g(uw0.a aVar, uw0.o oVar) {
        this.f513092d = aVar;
        this.f513093e = oVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 h07;
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f513092d.m157187xd75f96ed(eVar);
        sw0.m mVar = eVar.f494961c;
        boolean z17 = mVar instanceof sw0.h;
        sw0.b bVar = null;
        uw0.o oVar = this.f513093e;
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.d(oVar.m158345xefc66565(), null, null, new uw0.f(oVar, null), 3, null);
            return;
        }
        if (mVar instanceof sw0.i) {
            if (oVar.A.isShowing()) {
                oVar.A.dismiss();
                return;
            }
            return;
        }
        if (mVar instanceof sw0.j) {
            return;
        }
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = oVar.f513122y;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (c4181x2248e1a3 == null || (h07 = c4181x2248e1a3.h0()) == null) ? null : h07.f130065a;
            sw0.g gVar = eVar.f494960b;
            java.util.List list = eVar.f494959a;
            if (c3971x241f78 == null) {
                sw0.d dVar = (sw0.d) kz5.n0.a0(list, gVar.f494968b);
                if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
                    oVar.x7(dVar);
                    sw0.e eVar2 = (sw0.e) oVar.u7().f539187r.mo3195x754a37bb();
                    if (eVar2 != null) {
                        oVar.S7(eVar2);
                    }
                    sw0.e eVar3 = (sw0.e) oVar.u7().f539185p.mo3195x754a37bb();
                    if (eVar3 != null) {
                        oVar.U7(eVar3);
                        return;
                    }
                    return;
                }
                return;
            }
            sw0.d dVar2 = (sw0.d) kz5.n0.a0(list, gVar.f494968b);
            if (zu0.i.f557209f == (dVar2 != null ? dVar2.f494956b : null)) {
                java.lang.String str = dVar2.f494955a.f129757b;
                java.util.Iterator it = oVar.A7().iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782 = ((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49) it.next()).f130065a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f782, "getSegmentID(...)");
                    ex0.d C7 = oVar.C7(c3971x241f782);
                    if (C7 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 c4182xb2a3bd49 = C7.f338654p;
                        c4182xb2a3bd49.getClass();
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4182xb2a3bd49.D();
                        java.lang.String F0 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.F0(c4182xb2a3bd49, D) : "";
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4182xb2a3bd49.D();
                        java.lang.String z07 = D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.z0(c4182xb2a3bd49, D2) : "";
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4182xb2a3bd49.D();
                        (D3 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.N0(c4182xb2a3bd49, str, D3) : bool).booleanValue();
                        c4182xb2a3bd49.getClass();
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D4 = c4182xb2a3bd49.D();
                        (D4 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.B0(c4182xb2a3bd49, F0, D4) : bool).booleanValue();
                        c4182xb2a3bd49.getClass();
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D5 = c4182xb2a3bd49.D();
                        if (D5 != null) {
                            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49.O0(c4182xb2a3bd49, z07, D5);
                        }
                        bool.booleanValue();
                        du0.v0 R6 = oVar.R6();
                        R6.getClass();
                        yy0.m7 m7Var = (yy0.m7) R6.O6();
                        m7Var.getClass();
                        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.b4(m7Var, str, null), 3, null);
                    }
                }
                sw0.b bVar2 = oVar.f430651q;
                if (bVar2 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    bVar = sw0.b.a(bVar2, null, str, null, null, null, 29, null);
                }
                oVar.f430651q = bVar;
                oVar.P7();
            }
        }
    }
}
