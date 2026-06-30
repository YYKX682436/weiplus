package com.p314xaae8f345.p2936x80def495;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/skyline/SlowDisplayFrameConfig;", "", "enableFrameKit", "", "enableFrameKitStackTrace", "enableFrameKitTraceLayoutDetail", "(ZZZ)V", "getEnableFrameKit", "()Z", "setEnableFrameKit", "(Z)V", "getEnableFrameKitStackTrace", "setEnableFrameKitStackTrace", "getEnableFrameKitTraceLayoutDetail", "setEnableFrameKitTraceLayoutDetail", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.skyline.SlowDisplayFrameConfig */
/* loaded from: classes5.dex */
public final /* data */ class C25588x73e6a8ee {
    private boolean enableFrameKit;
    private boolean enableFrameKitStackTrace;
    private boolean enableFrameKitTraceLayoutDetail;

    public C25588x73e6a8ee() {
        this(false, false, false, 7, null);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2936x80def495.C25588x73e6a8ee m95873x75149012(com.p314xaae8f345.p2936x80def495.C25588x73e6a8ee c25588x73e6a8ee, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = c25588x73e6a8ee.enableFrameKit;
        }
        if ((i17 & 2) != 0) {
            z18 = c25588x73e6a8ee.enableFrameKitStackTrace;
        }
        if ((i17 & 4) != 0) {
            z19 = c25588x73e6a8ee.enableFrameKitTraceLayoutDetail;
        }
        return c25588x73e6a8ee.m95877x2eaf75(z17, z18, z19);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableFrameKit() {
        return this.enableFrameKit;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableFrameKitStackTrace() {
        return this.enableFrameKitStackTrace;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableFrameKitTraceLayoutDetail() {
        return this.enableFrameKitTraceLayoutDetail;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2936x80def495.C25588x73e6a8ee m95877x2eaf75(boolean enableFrameKit, boolean enableFrameKitStackTrace, boolean enableFrameKitTraceLayoutDetail) {
        return new com.p314xaae8f345.p2936x80def495.C25588x73e6a8ee(enableFrameKit, enableFrameKitStackTrace, enableFrameKitTraceLayoutDetail);
    }

    /* renamed from: equals */
    public boolean m95878xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.p2936x80def495.C25588x73e6a8ee)) {
            return false;
        }
        com.p314xaae8f345.p2936x80def495.C25588x73e6a8ee c25588x73e6a8ee = (com.p314xaae8f345.p2936x80def495.C25588x73e6a8ee) other;
        return this.enableFrameKit == c25588x73e6a8ee.enableFrameKit && this.enableFrameKitStackTrace == c25588x73e6a8ee.enableFrameKitStackTrace && this.enableFrameKitTraceLayoutDetail == c25588x73e6a8ee.enableFrameKitTraceLayoutDetail;
    }

    /* renamed from: getEnableFrameKit */
    public final boolean m95879xa10a8dc2() {
        return this.enableFrameKit;
    }

    /* renamed from: getEnableFrameKitStackTrace */
    public final boolean m95880x17e632ff() {
        return this.enableFrameKitStackTrace;
    }

    /* renamed from: getEnableFrameKitTraceLayoutDetail */
    public final boolean m95881x6d6cac5e() {
        return this.enableFrameKitTraceLayoutDetail;
    }

    /* renamed from: hashCode */
    public int m95882x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.enableFrameKit) * 31) + java.lang.Boolean.hashCode(this.enableFrameKitStackTrace)) * 31) + java.lang.Boolean.hashCode(this.enableFrameKitTraceLayoutDetail);
    }

    /* renamed from: setEnableFrameKit */
    public final void m95883x6900f5ce(boolean z17) {
        this.enableFrameKit = z17;
    }

    /* renamed from: setEnableFrameKitStackTrace */
    public final void m95884xc7b2fc0b(boolean z17) {
        this.enableFrameKitStackTrace = z17;
    }

    /* renamed from: setEnableFrameKitTraceLayoutDetail */
    public final void m95885x4ae9ddd2(boolean z17) {
        this.enableFrameKitTraceLayoutDetail = z17;
    }

    /* renamed from: toString */
    public java.lang.String m95886x9616526c() {
        return "SlowDisplayFrameConfig(enableFrameKit=" + this.enableFrameKit + ", enableFrameKitStackTrace=" + this.enableFrameKitStackTrace + ", enableFrameKitTraceLayoutDetail=" + this.enableFrameKitTraceLayoutDetail + ')';
    }

    public C25588x73e6a8ee(boolean z17, boolean z18, boolean z19) {
        this.enableFrameKit = z17;
        this.enableFrameKitStackTrace = z18;
        this.enableFrameKitTraceLayoutDetail = z19;
    }

    public /* synthetic */ C25588x73e6a8ee(boolean z17, boolean z18, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? false : z18, (i17 & 4) != 0 ? false : z19);
    }
}
