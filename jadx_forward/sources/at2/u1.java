package at2;

/* loaded from: classes3.dex */
public final class u1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: s, reason: collision with root package name */
    public static final at2.o1 f95293s = new at2.o1(null);

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f95294p;

    /* renamed from: q, reason: collision with root package name */
    public dt2.a0 f95295q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f95296r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.view.ViewGroup root, java.util.List list, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f95294p = list;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0191, code lost:
    
        if ((!r1.isEmpty()) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01e7, code lost:
    
        if ((!r1.isEmpty()) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t1() {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: at2.u1.t1():void");
    }

    public final boolean u1() {
        dt2.a0 a0Var = this.f95295q;
        if (a0Var != null) {
            return a0Var.f324691a.mo58787xc00617a4();
        }
        return false;
    }

    public final void v1(java.lang.Integer num, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replay_step3:playVideo,player:");
        dt2.a0 a0Var = this.f95295q;
        sb6.append(a0Var != null ? a0Var.hashCode() : 0);
        sb6.append(",offset:");
        sb6.append(num);
        sb6.append(",fromFloat:");
        sb6.append(z17);
        sb6.append(", isPlaying:");
        sb6.append(u1());
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerPlugin", sb6.toString());
        if (!z17) {
            dt2.a0 a0Var2 = this.f95295q;
            if (a0Var2 != null) {
                a0Var2.e(num);
                return;
            }
            return;
        }
        t1();
        dt2.a0 a0Var3 = this.f95295q;
        if (a0Var3 == null || (c14932xfc4acec9 = a0Var3.f324691a) == null) {
            return;
        }
        c14932xfc4acec9.postDelayed(new at2.t1(c14932xfc4acec9, this), 100L);
    }

    public final void w1(double d17, boolean z17) {
        dt2.a0 a0Var = this.f95295q;
        if (a0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekVideo ");
            sb6.append(a0Var.hashCode());
            sb6.append(" playerView:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = a0Var.f324691a;
            sb6.append(c14932xfc4acec9.hashCode());
            sb6.append(" afterSeekPlay:");
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayerWidget", sb6.toString());
            c14932xfc4acec9.a(d17, z17);
            if (z17) {
                c14932xfc4acec9.mo58789x348b34();
            }
        }
    }

    public final void x1() {
        dt2.a0 a0Var = this.f95295q;
        if (a0Var != null) {
            a0Var.i();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        at2.s1 s1Var = new at2.s1(this);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ct2.j) P0(ct2.j.class)).f303800h.mo3195x754a37bb(), java.lang.Boolean.TRUE)) {
            s1Var.mo152xb9724478();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f95296r;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
        ((ct2.j) P0(ct2.j.class)).f303800h.mo7806x9d92d11c(this, new at2.q1(s1Var, this));
        this.f95296r = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new at2.r1(s1Var, null), 3, null);
    }
}
