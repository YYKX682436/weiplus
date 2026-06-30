package oa2;

/* loaded from: classes2.dex */
public final class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f {
    public int F;
    public long G;
    public long H;
    public final jz5.g I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.F = -1;
        this.I = jz5.h.b(new oa2.a0(this));
    }

    @Override // x92.m
    public void C7(int i17, java.lang.String str) {
        super.C7(i17, str);
        vb2.k0 k0Var = (vb2.k0) ((jz5.n) this.I).mo141623x754a37bb();
        k0Var.f516174b.setVisibility(0);
        k0Var.f516176d.setVisibility(0);
        k0Var.f516175c.setVisibility(8);
        k0Var.f516174b.setOnClickListener(new oa2.z(this, k0Var));
    }

    @Override // x92.m
    public void E7(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        super.E7((r45.r03) fVar);
        vb2.k0 k0Var = (vb2.k0) ((jz5.n) this.I).mo141623x754a37bb();
        k0Var.f516174b.setVisibility(8);
        k0Var.f516177e.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public boolean L7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public y92.b M7() {
        y92.b M7 = super.M7();
        java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("key_finder_user_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        M7.f541865t.set(11, stringExtra);
        return M7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f
    public boolean Q7(r45.r03 topicInfo) {
        java.util.LinkedList<r45.bo6> m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicInfo, "topicInfo");
        r45.q03 q03Var = (r45.q03) topicInfo.m75936x14adae67(20);
        java.util.LinkedList m75941xfb8219142 = q03Var != null ? q03Var.m75941xfb821914(0) : null;
        boolean z17 = m75941xfb8219142 == null || m75941xfb8219142.isEmpty();
        r45.q03 q03Var2 = (r45.q03) topicInfo.m75936x14adae67(20);
        if (q03Var2 != null && (m75941xfb821914 = q03Var2.m75941xfb821914(0)) != null) {
            for (r45.bo6 bo6Var : m75941xfb821914) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1430xb13acc7a.ui.C13662x2a33e19f c13662x2a33e19f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1430xb13acc7a.ui.C13662x2a33e19f(topicInfo);
                c13662x2a33e19f.f210798p = bo6Var.m75939xb282bd08(1) - 1;
                c13662x2a33e19f.f210799q = bo6Var.m75945x2fec8307(0);
                c13662x2a33e19f.f183286u = bo6Var.m75942xfb822ef2(2);
                java.lang.String m75945x2fec8307 = bo6Var.m75945x2fec8307(0);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                c13662x2a33e19f.f183287v = m75945x2fec8307;
                java.lang.String m75945x2fec83072 = bo6Var.m75945x2fec8307(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, new w92.a(-1, m75945x2fec83072 == null ? "" : m75945x2fec83072, false, bo6Var.m75939xb282bd08(1), 18), c13662x2a33e19f, false, 4, null);
            }
        }
        r7();
        return !z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r12 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map R7(int r12) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa2.b0.R7(int):java.util.Map");
    }

    public final void S7() {
        if (this.F < 0) {
            return;
        }
        if (this.H > 0) {
            this.G += android.os.SystemClock.elapsedRealtime() - this.H;
            this.H = 0L;
        }
        long j17 = this.G;
        if (j17 <= 0) {
            return;
        }
        int i17 = this.F;
        java.util.Map m17 = kz5.c1.m(R7(i17), kz5.c1.k(new jz5.l("page_name", "template_profile_page"), new jz5.l("stay_time", java.lang.Long.valueOf(j17))));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTemplateTopicTabUIC", "[reportTabOut] tabIndex=" + i17 + " stayTimeMs=" + j17 + " params=" + m17);
        i95.m c17 = i95.n0.c(dy1.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) ((dy1.r) c17)).Aj(50081, "tab_out", m17, 1, false);
    }

    @Override // x92.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void l7(int i17) {
        super.l7(i17);
        if (i17 < 0 || i17 >= f7().size() || i17 == this.F) {
            return;
        }
        S7();
        this.F = i17;
        this.G = 0L;
        this.H = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        S7();
        this.F = -1;
        super.mo451xac79a11b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        if (this.H > 0) {
            this.G += android.os.SystemClock.elapsedRealtime() - this.H;
            this.H = 0L;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.F < 0 || this.H != 0) {
            return;
        }
        this.H = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f, x92.m
    public int w7() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_2;
    }
}
