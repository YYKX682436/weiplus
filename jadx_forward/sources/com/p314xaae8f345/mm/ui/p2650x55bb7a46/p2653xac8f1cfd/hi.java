package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.j1.class)
/* loaded from: classes4.dex */
public final class hi extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.j1, l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f280700e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f280701f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21670xdec2b0e7 f280702g = new com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler(this) { // from class: com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent$OpenIMArchiveSpanHandler

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.ref.WeakReference f280098a;

        {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this, "component");
            this.f280098a = new java.lang.ref.WeakReference(this);
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public int[] b() {
            return new int[]{65};
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public r35.m3 c(java.lang.String str) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (r26.i0.A(r26.n0.u0(str).toString(), "wxwork://jump?target=archivepopup", false, 2, null)) {
                return new r35.m3(str, 65, null);
            }
            return null;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean d(android.view.View view, r35.m3 m3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z zVar) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m3Var);
            if (m3Var.f450728d != 65) {
                return false;
            }
            java.lang.ref.WeakReference weakReference = this.f280098a;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hi hiVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hi) weakReference.get();
            if (hiVar == null || hiVar.f280700e) {
                return false;
            }
            java.lang.String queryParameter = android.net.Uri.parse(m3Var.e()).getQueryParameter("url");
            if (queryParameter == null) {
                return true;
            }
            hiVar.n0(queryParameter, false);
            return true;
        }

        @Override // com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler
        public boolean f(java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
            return false;
        }
    };

    public static final void m0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hi hiVar, r45.tz4 tz4Var, int i17) {
        yb5.d dVar = hiVar.f280113d;
        java.lang.String x17 = dVar != null ? dVar.x() : null;
        if (x17 == null) {
            x17 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMArchiveComponent", "doubleBtnClick username:%s url:%s status:%s", x17, tz4Var.f468421m, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(hiVar.f280113d.g(), "", hiVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, false, null);
        java.lang.String privacy_agreement_url = tz4Var.f468421m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(privacy_agreement_url, "privacy_agreement_url");
        pq5.g l17 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ci(x17, privacy_agreement_url, i17).l();
        android.app.Activity g17 = hiVar.f280113d.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        l17.f((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) g17);
        l17.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ei(Q, x17, hiVar));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMArchiveComponent", "onChattingExitAnimEnd() called " + hashCode());
        com.p314xaae8f345.mm.app.p622xc5476f33.s.f().f135215h.remove(this.f280702g);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f280701f;
        if (z2Var != null) {
            z2Var.B();
        }
        this.f280701f = null;
    }

    public final void n0(java.lang.String str, boolean z17) {
        yb5.d dVar = this.f280113d;
        java.lang.String x17 = dVar != null ? dVar.x() : null;
        if (x17 == null) {
            x17 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" checkArchiveDlg() called with: url = ");
        sb6.append(str);
        sb6.append(", fromNewXml = ");
        sb6.append(z17);
        sb6.append(" reqUserName = ");
        sb6.append(x17);
        sb6.append(" isfinish:");
        android.app.Activity g17 = this.f280113d.g();
        sb6.append(g17 != null ? java.lang.Boolean.valueOf(g17.isFinishing()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMArchiveComponent", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (!z17) {
            h0Var.f391656d = db5.e1.Q(this.f280113d.g(), "", this.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, false, null);
        }
        pq5.g l17 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ai(x17, str).l();
        android.app.Activity g18 = this.f280113d.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g18, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        l17.f((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) g18);
        l17.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.di(this, x17, h0Var, z17));
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        yb5.d dVar = this.f280113d;
        java.lang.String x17 = dVar != null ? dVar.x() : null;
        if (x17 == null) {
            x17 = "";
        }
        if (r26.n0.N(x17)) {
            return;
        }
        if (w0Var != null && w0Var.f398507b == 4) {
            java.lang.Object obj = w0Var != null ? w0Var.f398509d : null;
            dm.s8 s8Var = obj instanceof dm.s8 ? (dm.s8) obj : null;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x17, s8Var != null ? s8Var.f68316xdec927b : null)) {
                java.lang.Object obj2 = w0Var != null ? w0Var.f398509d : null;
                dm.s8 s8Var2 = obj2 instanceof dm.s8 ? (dm.s8) obj2 : null;
                java.lang.String str2 = s8Var2 != null ? s8Var2.f68315xad49e234 : null;
                if (str2 == null || r26.n0.N(str2)) {
                    return;
                }
                n0(str2, true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        this.f280700e = false;
        yb5.d dVar = this.f280113d;
        java.lang.String x17 = dVar != null ? dVar.x() : null;
        if (x17 == null) {
            x17 = "";
        }
        if (r26.n0.N(x17)) {
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(x17) || c01.e2.R(x17)) {
            i41.l lVar = (i41.l) ((j41.c0) i95.n0.c(j41.c0.class));
            lVar.getClass();
            u41.e eVar = new u41.e(x17, null);
            lVar.Bi().get(eVar, new java.lang.String[0]);
            java.lang.String str = eVar.f68315xad49e234;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMArchiveComponent", hashCode() + " onChattingResume talker:%s url:%s", x17, str);
            if (!(str == null || r26.n0.N(str))) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                n0(str, true);
            }
            ((i41.l) ((j41.c0) i95.n0.c(j41.c0.class))).Bi().add(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        this.f280700e = true;
        ((i41.l) ((j41.c0) i95.n0.c(j41.c0.class))).Bi().mo49775xc84af884(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMArchiveComponent", "onChattingEnterAnimStart() called " + hashCode());
        com.p314xaae8f345.mm.app.p622xc5476f33.s.f().f135215h.add(this.f280702g);
    }
}
