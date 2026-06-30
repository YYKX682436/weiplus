package com.p314xaae8f345.p2936x80def495;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/tencent/skyline/PageMonitorConfig;", "", "enablePageDetect", "", "(Z)V", "getEnablePageDetect", "()Z", "setEnablePageDetect", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.skyline.PageMonitorConfig */
/* loaded from: classes5.dex */
public final /* data */ class C25574x71c62ecd {
    private boolean enablePageDetect;

    public C25574x71c62ecd() {
        this(false, 1, null);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.p2936x80def495.C25574x71c62ecd m95697x75149012(com.p314xaae8f345.p2936x80def495.C25574x71c62ecd c25574x71c62ecd, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = c25574x71c62ecd.enablePageDetect;
        }
        return c25574x71c62ecd.m95699x2eaf75(z17);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnablePageDetect() {
        return this.enablePageDetect;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.p2936x80def495.C25574x71c62ecd m95699x2eaf75(boolean enablePageDetect) {
        return new com.p314xaae8f345.p2936x80def495.C25574x71c62ecd(enablePageDetect);
    }

    /* renamed from: equals */
    public boolean m95700xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.p314xaae8f345.p2936x80def495.C25574x71c62ecd) && this.enablePageDetect == ((com.p314xaae8f345.p2936x80def495.C25574x71c62ecd) other).enablePageDetect;
    }

    /* renamed from: getEnablePageDetect */
    public final boolean m95701xcc29af6b() {
        return this.enablePageDetect;
    }

    /* renamed from: hashCode */
    public int m95702x8cdac1b() {
        return java.lang.Boolean.hashCode(this.enablePageDetect);
    }

    /* renamed from: setEnablePageDetect */
    public final void m95703x70264477(boolean z17) {
        this.enablePageDetect = z17;
    }

    /* renamed from: toString */
    public java.lang.String m95704x9616526c() {
        return "PageMonitorConfig(enablePageDetect=" + this.enablePageDetect + ')';
    }

    public C25574x71c62ecd(boolean z17) {
        this.enablePageDetect = z17;
    }

    public /* synthetic */ C25574x71c62ecd(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }
}
