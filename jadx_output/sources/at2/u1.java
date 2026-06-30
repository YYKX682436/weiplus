package at2;

/* loaded from: classes3.dex */
public final class u1 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: s, reason: collision with root package name */
    public static final at2.o1 f13760s = new at2.o1(null);

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f13761p;

    /* renamed from: q, reason: collision with root package name */
    public dt2.a0 f13762q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.r2 f13763r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.view.ViewGroup root, java.util.List list, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f13761p = list;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
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
        dt2.a0 a0Var = this.f13762q;
        if (a0Var != null) {
            return a0Var.f243158a.isPlaying();
        }
        return false;
    }

    public final void v1(java.lang.Integer num, boolean z17) {
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replay_step3:playVideo,player:");
        dt2.a0 a0Var = this.f13762q;
        sb6.append(a0Var != null ? a0Var.hashCode() : 0);
        sb6.append(",offset:");
        sb6.append(num);
        sb6.append(",fromFloat:");
        sb6.append(z17);
        sb6.append(", isPlaying:");
        sb6.append(u1());
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerPlugin", sb6.toString());
        if (!z17) {
            dt2.a0 a0Var2 = this.f13762q;
            if (a0Var2 != null) {
                a0Var2.e(num);
                return;
            }
            return;
        }
        t1();
        dt2.a0 a0Var3 = this.f13762q;
        if (a0Var3 == null || (finderLiveThumbPlayerProxy = a0Var3.f243158a) == null) {
            return;
        }
        finderLiveThumbPlayerProxy.postDelayed(new at2.t1(finderLiveThumbPlayerProxy, this), 100L);
    }

    public final void w1(double d17, boolean z17) {
        dt2.a0 a0Var = this.f13762q;
        if (a0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekVideo ");
            sb6.append(a0Var.hashCode());
            sb6.append(" playerView:");
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = a0Var.f243158a;
            sb6.append(finderLiveThumbPlayerProxy.hashCode());
            sb6.append(" afterSeekPlay:");
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", sb6.toString());
            finderLiveThumbPlayerProxy.a(d17, z17);
            if (z17) {
                finderLiveThumbPlayerProxy.play();
            }
        }
    }

    public final void x1() {
        dt2.a0 a0Var = this.f13762q;
        if (a0Var != null) {
            a0Var.i();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        at2.s1 s1Var = new at2.s1(this);
        if (kotlin.jvm.internal.o.b(((ct2.j) P0(ct2.j.class)).f222267h.getValue(), java.lang.Boolean.TRUE)) {
            s1Var.invoke();
            kotlinx.coroutines.r2 r2Var = this.f13763r;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
        ((ct2.j) P0(ct2.j.class)).f222267h.observe(this, new at2.q1(s1Var, this));
        this.f13763r = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new at2.r1(s1Var, null), 3, null);
    }
}
