package mz0;

/* loaded from: classes5.dex */
public final class l2 extends mz0.b2 {
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f414532J;
    public final jz5.g K;
    public final java.lang.String L;
    public final int M;
    public final int N;
    public final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.I = jz5.h.b(mz0.k2.f414528d);
        jz5.i iVar = jz5.i.f384364f;
        this.f414532J = jz5.h.a(iVar, new mz0.f2(this));
        this.K = jz5.h.a(iVar, new mz0.g2(this));
        this.L = "channels";
        this.M = 1800;
        this.N = activity.getIntent().getIntExtra("KEY_POST_ENTERSCENE", 0);
        this.P = new mz0.h2();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J7(mz0.l2 r22, az0.b0 r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.l2.J7(mz0.l2, az0.b0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mz0.b2
    public void D7(java.util.ArrayList mediaList) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        int size = mediaList.size();
        if (mediaList.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = mediaList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if ((((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next()).mo63659xfb85f7b0() == 1) && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        if (mediaList.isEmpty()) {
            i18 = 0;
        } else {
            java.util.Iterator it6 = mediaList.iterator();
            i18 = 0;
            while (it6.hasNext()) {
                if ((((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it6.next()).mo63659xfb85f7b0() == 2) && (i18 = i18 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.x1(m7Var, size, i17, i18, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map Ai = m7Var.Ai();
        Ai.put("in_time", java.lang.Long.valueOf(currentTimeMillis));
        Ai.put("page_name", "MJPublisherMovieTemplateUI");
        Ai.put("page_id", "30100");
        Ai.put("view_id", "30100");
        ((cy1.a) rVar).yj("page_in", null, Ai, 6, false);
    }

    @Override // mz0.b2
    public java.lang.Object S6(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return nz0.o.f423063a.b(str, 2, interfaceC29045xdcb5ca57);
    }

    @Override // mz0.b2
    public java.lang.Object T6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return nz0.o.f423063a.c(0, "cache_key_finder_album", interfaceC29045xdcb5ca57);
    }

    @Override // mz0.b2
    public dz0.e W6() {
        return new mz0.e2();
    }

    @Override // mz0.b2
    public dz0.h X6() {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).i7();
        int i17 = this.N;
        java.lang.String str = 60 == i17 || 61 == i17 ? "RedPacketTemplateRecommendv2" : "TemplateRecommendv2";
        ez0.o oVar = ez0.o.f339368a;
        java.util.List e17 = oVar.e();
        boolean a17 = oVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(oVar.e());
        mz0.a a76 = a7();
        if (a76 != null) {
            arrayList.add(a76.f414404a);
        }
        return new dz0.h(str, false, true, -1, false, e17, 0, a17, arrayList, oVar.b());
    }

    @Override // mz0.b2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17067x215f5d9e Y6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2011x373aa5.C17079x73265d64(m80379x76847179(), null);
    }

    @Override // mz0.b2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a Z6() {
        return new no4.c(new android.os.Bundle(), com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0.f257147f);
    }

    @Override // mz0.b2
    public mz0.a a7() {
        com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f c11010x5ff4d15f = (com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f) this.f414532J.mo141623x754a37bb();
        if (c11010x5ff4d15f == null) {
            return null;
        }
        java.lang.String id6 = ((r45.rz6) ((jz5.n) c11010x5ff4d15f.f151300f).mo141623x754a37bb()).f466853d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(id6, "id");
        return new mz0.a(id6, c11010x5ff4d15f.f151299e, java.lang.Boolean.FALSE);
    }

    @Override // mz0.b2
    public java.lang.Object b7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return ez0.o.f339368a.f(interfaceC29045xdcb5ca57);
    }

    @Override // mz0.b2
    public mz0.b c7() {
        jz5.g gVar = this.K;
        if (((r45.zi2) gVar.mo141623x754a37bb()) == null && !m158359x1e885992().hasExtra("KEY_FINDER_POST_MUSIC_FEEDID")) {
            return null;
        }
        r45.zi2 zi2Var = (r45.zi2) gVar.mo141623x754a37bb();
        java.lang.String m75945x2fec8307 = zi2Var != null ? zi2Var.m75945x2fec8307(12) : null;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_FINDER_POST_MUSIC_FEEDID");
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            if (stringExtra == null || stringExtra.length() == 0) {
                return null;
            }
        }
        return new mz0.b(m75945x2fec8307, stringExtra);
    }

    @Override // mz0.b2
    public java.lang.String d7() {
        return this.L;
    }

    @Override // mz0.b2
    public int e7() {
        return this.M;
    }

    @Override // mz0.b2
    public com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7 g7() {
        return this.P;
    }

    @Override // mz0.b2
    public ty0.c h7() {
        return null;
    }

    @Override // mz0.b2
    public com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 i7() {
        return null;
    }

    @Override // mz0.b2
    public boolean m7() {
        return ((java.lang.Boolean) ((jz5.n) this.I).mo141623x754a37bb()).booleanValue();
    }

    @Override // mz0.b2
    public boolean p7() {
        return false;
    }

    @Override // mz0.b2
    public boolean q7() {
        int i17 = this.N;
        return true ^ (60 == i17 || 61 == i17);
    }

    @Override // mz0.b2
    public void r7(java.lang.Throwable th6) {
    }

    @Override // mz0.b2
    public void s7(java.lang.Throwable th6, java.lang.String musicId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.p4(m7Var, musicId, null), 3, null);
    }

    @Override // mz0.b2
    public void t7(dw3.o0 launchType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchType, "launchType");
    }

    @Override // mz0.b2
    public void v7(java.lang.String templateId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 a17 = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m.a(templateId);
        ((yy0.o0) k0Var).Bi(templateId, i17, a17 != null ? a17.f151565i : null);
    }

    @Override // mz0.b2
    public void x7(az0.b0 exportInfoHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportInfoHolder, "exportInfoHolder");
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new mz0.i2(this, exportInfoHolder, null), 3, null);
    }

    @Override // mz0.b2
    public void y7() {
        nz0.o.f423063a.f(0, "cache_key_finder_album");
    }
}
