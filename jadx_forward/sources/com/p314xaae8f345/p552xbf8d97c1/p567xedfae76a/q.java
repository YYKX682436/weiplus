package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 f134308a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f134309b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f134310c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p f134311d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f134312e;

    public q(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 supervisorConfig, boolean z17, boolean z18, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p lifecycleThreadConfig, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(supervisorConfig, "supervisorConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleThreadConfig, "lifecycleThreadConfig");
        this.f134308a = supervisorConfig;
        this.f134309b = z17;
        this.f134310c = z18;
        this.f134311d = lifecycleThreadConfig;
        this.f134312e = z19;
    }

    /* renamed from: equals */
    public boolean m41075xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q qVar = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134308a, qVar.f134308a) && this.f134309b == qVar.f134309b && this.f134310c == qVar.f134310c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134311d, qVar.f134311d) && this.f134312e == qVar.f134312e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m41076x8cdac1b() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0 j0Var = this.f134308a;
        int m41115x8cdac1b = (j0Var != null ? j0Var.m41115x8cdac1b() : 0) * 31;
        boolean z17 = this.f134309b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (m41115x8cdac1b + i17) * 31;
        boolean z18 = this.f134310c;
        int i19 = z18;
        if (z18 != 0) {
            i19 = 1;
        }
        int i27 = (i18 + i19) * 31;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p pVar = this.f134311d;
        int m41072x8cdac1b = (i27 + (pVar != null ? pVar.m41072x8cdac1b() : 0)) * 31;
        boolean z19 = this.f134312e;
        return m41072x8cdac1b + (z19 ? 1 : z19 ? 1 : 0);
    }

    /* renamed from: toString */
    public java.lang.String m41077x9616526c() {
        return "MatrixLifecycleConfig(supervisorConfig=" + this.f134308a + ", enableFgServiceMonitor=" + this.f134309b + ", enableOverlayWindowMonitor=" + this.f134310c + ", lifecycleThreadConfig=" + this.f134311d + ", enableLifecycleLogger=" + this.f134312e + ")";
    }
}
