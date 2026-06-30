package bs2;

/* loaded from: classes2.dex */
public final class a0 extends bs2.n1 {
    public static final bs2.x F = new bs2.x(null);
    public long A;
    public final int B;
    public final jz5.g C;
    public ey2.d0 D;
    public volatile boolean E;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.modelbase.i f23799y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.modelbase.f f23800z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore core) {
        super(35, core);
        kotlin.jvm.internal.o.g(core, "core");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.B = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.T).getValue()).r()).intValue();
        this.C = jz5.h.b(bs2.y.f23978d);
    }

    public static final void z(bs2.a0 a0Var, com.tencent.mm.modelbase.f fVar, bs2.h0 h0Var) {
        a0Var.f23800z = fVar;
        a0Var.A = android.os.SystemClock.elapsedRealtime();
        a0Var.E = true;
        if (h0Var == bs2.h0.f23852o) {
            com.tencent.mm.autogen.events.FinderNextTabPreloadEvent finderNextTabPreloadEvent = new com.tencent.mm.autogen.events.FinderNextTabPreloadEvent();
            finderNextTabPreloadEvent.f54313g.f7892a = a0Var.f23907a;
            finderNextTabPreloadEvent.e();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f1if).getValue()).r()).booleanValue();
        }
    }

    public final ey2.k0 A() {
        return (ey2.k0) ((jz5.n) this.C).getValue();
    }

    public final com.tencent.mm.modelbase.f B() {
        if (this.A <= 0 || android.os.SystemClock.elapsedRealtime() - this.A >= this.B * 1000) {
            return null;
        }
        return this.f23800z;
    }

    @Override // bs2.n1
    public void b() {
        com.tencent.mars.xlog.Log.i(this.f23909c, "cancel resp=" + this.f23800z);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23923q;
        reentrantLock.lock();
        try {
            com.tencent.mm.modelbase.i iVar = this.f23799y;
            if (iVar != null) {
                iVar.j();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bs2.n1
    public boolean e(boolean z17, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f23909c, "clear source=" + source + ",resp=" + this.f23800z);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23923q;
        reentrantLock.lock();
        try {
            boolean z18 = this.f23800z != null;
            this.f23800z = null;
            this.A = 0L;
            return z18;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x03c1, code lost:
    
        if (r3 == null) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    @Override // bs2.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(bs2.h0 r30, android.content.Intent r31, yz5.l r32) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.a0.q(bs2.h0, android.content.Intent, yz5.l):void");
    }
}
