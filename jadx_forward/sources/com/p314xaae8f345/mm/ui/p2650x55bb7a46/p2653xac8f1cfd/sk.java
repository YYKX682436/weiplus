package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.f2.class)
/* loaded from: classes11.dex */
public class sk extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.f2, c01.w8, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.i9 f281476e;

    /* renamed from: f, reason: collision with root package name */
    public int f281477f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f281478g = false;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        c01.d9.e().a(522, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        c01.d9.e().q(522, this);
        n0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        c01.d9.e().q(522, this);
        n0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        this.f281476e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.i9(this.f280113d);
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (i17 != 207) {
            return;
        }
        p0(intent.getStringExtra("art_smiley_slelct_data"), 4, null);
    }

    public void m0(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta taVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta) ((sb5.p0) this.f280113d.f542241c.a(sb5.p0.class));
        taVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.d1(str);
        f9Var.j1(1);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fa faVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fa(taVar, false, kz5.b0.c(f9Var));
        taVar.f281517s = faVar;
        pm0.v.W(faVar);
    }

    public final void n0() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.i9 i9Var = this.f281476e;
        java.util.List list = mo3.l.f411952d;
        synchronized (list) {
            ((java.util.ArrayList) list).remove(i9Var);
        }
        ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411941e = null;
        w21.k.f523933u = null;
        ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).f372867n = null;
        com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45942x8a28c24b(), this.f281477f);
        this.f281477f = 0;
    }

    public final void o0() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.i9 i9Var = this.f281476e;
        java.util.List list = mo3.l.f411952d;
        synchronized (list) {
            if (!((java.util.ArrayList) list).contains(i9Var)) {
                ((java.util.ArrayList) list).add(i9Var);
            }
        }
        oo3.j jVar = (oo3.j) i95.n0.c(oo3.j.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.i9 i9Var2 = this.f281476e;
        ((mo3.g) jVar).f411941e = i9Var2;
        w21.k.f523933u = i9Var2;
        dg0.f fVar = (dg0.f) i95.n0.c(dg0.f.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.i9 notify = this.f281476e;
        ig0.o oVar = (ig0.o) fVar;
        oVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notify, "notify");
        oVar.f372867n = new java.lang.ref.WeakReference(notify);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        yb5.d dVar = this.f280113d;
        if (dVar != null) {
            dVar.b();
        }
        if (522 == m1Var.mo808xfb85f7b0()) {
            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45942x8a28c24b(), this.f281477f);
            this.f281477f = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p0(java.lang.String r30, int r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sk.p0(java.lang.String, int, java.lang.String):boolean");
    }

    public boolean q0(java.lang.String str, java.lang.String str2) {
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h3 h3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h3) ((sb5.s) this.f280113d.f542241c.a(sb5.s.class));
        boolean z17 = false;
        if (!h3Var.u()) {
            return p0(str, 0, str2);
        }
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21730x685be89 c21730x685be89 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21730x685be89(this, str, str2);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dy dyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dy.f215705a;
        if (dyVar.b()) {
            dyVar.c(h3Var.f280113d.g(), h3Var.f280113d.t(), 2, new yz5.a() { // from class: com.tencent.mm.ui.chatting.component.h3$$b
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h3 h3Var2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h3.this;
                    h3Var2.getClass();
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21730x685be89 c21730x685be892 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21730x685be89) c21730x685be89;
                    if (!c21730x685be892.f281479a.p0(c21730x685be892.f281480b, 0, c21730x685be892.f281481c)) {
                        return null;
                    }
                    h3Var2.m0();
                    return null;
                }
            });
        } else {
            z17 = p0(str, 0, str2);
            if (z17) {
                h3Var.m0();
            }
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (!this.f281478g) {
            o0();
        }
        this.f281478g = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.i9 i9Var = this.f281476e;
        java.util.List list = mo3.l.f411952d;
        synchronized (list) {
            ((java.util.ArrayList) list).remove(i9Var);
        }
        ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411941e = null;
        w21.k.f523933u = null;
        ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).f372867n = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        o0();
        this.f281478g = true;
    }
}
