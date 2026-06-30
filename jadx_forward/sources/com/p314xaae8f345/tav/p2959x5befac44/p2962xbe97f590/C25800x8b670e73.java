package com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0000J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/tav/decoder/logger/WXLoggerConfig;", "", "enable", "", ya.b.f77487x44fa364, "", "traceId", "", "enableFrameDetail", "(ZILjava/lang/String;Z)V", "getEnable", "()Z", "getEnableFrameDetail", "getLevel", "()I", "getTraceId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "copyConfig", "equals", "other", "hashCode", "toString", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.tav.decoder.logger.WXLoggerConfig */
/* loaded from: classes10.dex */
public final /* data */ class C25800x8b670e73 {
    private final boolean enable;
    private final boolean enableFrameDetail;
    private final int level;
    private final java.lang.String traceId;

    public C25800x8b670e73() {
        this(false, 0, null, false, 15, null);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 m97818x75149012(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 c25800x8b670e73, boolean z17, int i17, java.lang.String str, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            z17 = c25800x8b670e73.enable;
        }
        if ((i18 & 2) != 0) {
            i17 = c25800x8b670e73.level;
        }
        if ((i18 & 4) != 0) {
            str = c25800x8b670e73.traceId;
        }
        if ((i18 & 8) != 0) {
            z18 = c25800x8b670e73.enableFrameDetail;
        }
        return c25800x8b670e73.m97823x2eaf75(z17, i17, str, z18);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableFrameDetail() {
        return this.enableFrameDetail;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 m97823x2eaf75(boolean enable, int level, java.lang.String traceId, boolean enableFrameDetail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        return new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73(enable, level, traceId, enableFrameDetail);
    }

    /* renamed from: copyConfig */
    public final com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 m97824xae0cf317() {
        return m97818x75149012(this, false, 0, null, false, 15, null);
    }

    /* renamed from: equals */
    public boolean m97825xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73)) {
            return false;
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 c25800x8b670e73 = (com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73) other;
        return this.enable == c25800x8b670e73.enable && this.level == c25800x8b670e73.level && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.traceId, c25800x8b670e73.traceId) && this.enableFrameDetail == c25800x8b670e73.enableFrameDetail;
    }

    /* renamed from: getEnable */
    public final boolean m97826x17ac4879() {
        return this.enable;
    }

    /* renamed from: getEnableFrameDetail */
    public final boolean m97827x7efdb1e5() {
        return this.enableFrameDetail;
    }

    /* renamed from: getLevel */
    public final int m97828x74bf41ce() {
        return this.level;
    }

    /* renamed from: getTraceId */
    public final java.lang.String m97829xfe2df90a() {
        return this.traceId;
    }

    /* renamed from: hashCode */
    public int m97830x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.enable) * 31) + java.lang.Integer.hashCode(this.level)) * 31) + this.traceId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.enableFrameDetail);
    }

    /* renamed from: toString */
    public java.lang.String m97831x9616526c() {
        return "WXLoggerConfig(enable=" + this.enable + ", level=" + this.level + ", traceId=" + this.traceId + ", enableFrameDetail=" + this.enableFrameDetail + ')';
    }

    public C25800x8b670e73(boolean z17, int i17, java.lang.String traceId, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        this.enable = z17;
        this.level = i17;
        this.traceId = traceId;
        this.enableFrameDetail = z18;
    }

    public /* synthetic */ C25800x8b670e73(boolean z17, int i17, java.lang.String str, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? true : z17, (i18 & 2) != 0 ? 2 : i17, (i18 & 4) != 0 ? "" : str, (i18 & 8) != 0 ? true : z18);
    }
}
