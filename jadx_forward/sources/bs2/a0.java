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
    public com.p314xaae8f345.mm.p944x882e457a.i f105332y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.f f105333z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 core) {
        super(35, core);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(core, "core");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.B = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.T).mo141623x754a37bb()).r()).intValue();
        this.C = jz5.h.b(bs2.y.f105511d);
    }

    public static final void z(bs2.a0 a0Var, com.p314xaae8f345.mm.p944x882e457a.f fVar, bs2.h0 h0Var) {
        a0Var.f105333z = fVar;
        a0Var.A = android.os.SystemClock.elapsedRealtime();
        a0Var.E = true;
        if (h0Var == bs2.h0.f105385o) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad c5515x11ebd8ad = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad();
            c5515x11ebd8ad.f135846g.f89425a = a0Var.f105440a;
            c5515x11ebd8ad.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f81534if).mo141623x754a37bb()).r()).booleanValue();
        }
    }

    public final ey2.k0 A() {
        return (ey2.k0) ((jz5.n) this.C).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p944x882e457a.f B() {
        if (this.A <= 0 || android.os.SystemClock.elapsedRealtime() - this.A >= this.B * 1000) {
            return null;
        }
        return this.f105333z;
    }

    @Override // bs2.n1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f105442c, "cancel resp=" + this.f105333z);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f105456q;
        reentrantLock.lock();
        try {
            com.p314xaae8f345.mm.p944x882e457a.i iVar = this.f105332y;
            if (iVar != null) {
                iVar.j();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bs2.n1
    public boolean e(boolean z17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f105442c, "clear source=" + source + ",resp=" + this.f105333z);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f105456q;
        reentrantLock.lock();
        try {
            boolean z18 = this.f105333z != null;
            this.f105333z = null;
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
