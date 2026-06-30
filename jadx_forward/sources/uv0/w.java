package uv0;

/* loaded from: classes5.dex */
public final class w implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final uv0.u f512888d;

    /* renamed from: e, reason: collision with root package name */
    public final rv0.n1 f512889e;

    public w(uv0.u filterPanel, rv0.n1 clipPanelUIC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterPanel, "filterPanel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipPanelUIC, "clipPanelUIC");
        this.f512888d = filterPanel;
        this.f512889e = clipPanelUIC;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        rv0.n1 n1Var;
        ex0.r n76;
        ex0.r K;
        vv0.c cVar = (vv0.c) obj;
        if (cVar == null || (n76 = (n1Var = this.f512889e).n7()) == null) {
            return;
        }
        vv0.i iVar = cVar.f521908c;
        boolean z17 = iVar instanceof vv0.g;
        java.lang.String str = null;
        uv0.u uVar = this.f512888d;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = n76.f338700a;
        if (z17) {
            com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d c4108x6d452a1d = cVar.f521906a;
            java.util.List a17 = c4108x6d452a1d != null ? c4108x6d452a1d.a() : null;
            if (a17 == null) {
                return;
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            if (c4181x2248e1a3 != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                str = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.v0(c4181x2248e1a3, D) : "";
            }
            uVar.Q(a17, str);
            return;
        }
        if (iVar instanceof vv0.e) {
            vv0.e eVar = (vv0.e) iVar;
            gx0.bf p76 = n1Var.p7();
            uVar.R(eVar.f521910a, true);
            vv0.a aVar = eVar.f521910a;
            if (aVar.f521903b == zu0.i.f557209f) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a32 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
                if (c4181x2248e1a32 != null) {
                    java.lang.String str2 = aVar.f521902a.f129757b;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a32.D();
                    if (D2 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.k1(c4181x2248e1a32, str2, D2);
                    }
                }
                p76.c7();
                return;
            }
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar, vv0.d.f521909a)) {
            return;
        }
        if (iVar instanceof vv0.h) {
            vv0.h hVar = (vv0.h) iVar;
            gx0.bf p77 = n1Var.p7();
            uVar.R(hVar.f521913a, true);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a33 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            if (c4181x2248e1a33 != null) {
                java.lang.String str3 = hVar.f521913a.f521902a.f129757b;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4181x2248e1a33.D();
                if (D3 != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.k1(c4181x2248e1a33, str3, D3);
                }
            }
            p77.c7();
            return;
        }
        if (iVar instanceof vv0.f) {
            for (java.util.Map.Entry entry : ((vv0.f) iVar).f521911a.entrySet()) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) entry.getKey();
                vv0.m mVar = (vv0.m) entry.getValue();
                ex0.a0 a0Var = n1Var.q7().f358175r;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd37132 = (a0Var == null || (K = a0Var.K(c3971x241f78)) == null) ? null : K.f338700a;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a34 = c4190xd8dd37132 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd37132 : null;
                if (c4181x2248e1a34 != null) {
                    java.lang.String str4 = mVar.f521929a;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D4 = c4181x2248e1a34.D();
                    if (D4 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.k1(c4181x2248e1a34, str4, D4);
                    }
                }
                if (c4181x2248e1a34 != null) {
                    float f17 = mVar.f521930b;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D5 = c4181x2248e1a34.D();
                    if (D5 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.G0(c4181x2248e1a34, f17, D5);
                    }
                }
            }
            p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new uv0.v(this, null), 3, null);
        }
    }
}
