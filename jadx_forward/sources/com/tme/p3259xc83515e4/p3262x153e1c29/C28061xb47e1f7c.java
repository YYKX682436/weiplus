package com.tme.p3259xc83515e4.p3262x153e1c29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/tme/karaoke/lib_singscore/LoudnessItem;", "Ljava/io/Serializable;", "startMs", "", "endMs", "loudness", "", "valid", "", "(IIFZ)V", "getEndMs", "()I", "setEndMs", "(I)V", "getLoudness", "()F", "setLoudness", "(F)V", "getStartMs", "setStartMs", "getValid", "()Z", "setValid", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.tme.karaoke.lib_singscore.LoudnessItem */
/* loaded from: classes5.dex */
public final /* data */ class C28061xb47e1f7c implements java.io.Serializable {
    private int endMs;
    private float loudness;
    private int startMs;
    private boolean valid;

    public C28061xb47e1f7c() {
        this(0, 0, 0.0f, false, 15, null);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.tme.p3259xc83515e4.p3262x153e1c29.C28061xb47e1f7c m122186x75149012(com.tme.p3259xc83515e4.p3262x153e1c29.C28061xb47e1f7c c28061xb47e1f7c, int i17, int i18, float f17, boolean z17, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = c28061xb47e1f7c.startMs;
        }
        if ((i19 & 2) != 0) {
            i18 = c28061xb47e1f7c.endMs;
        }
        if ((i19 & 4) != 0) {
            f17 = c28061xb47e1f7c.loudness;
        }
        if ((i19 & 8) != 0) {
            z17 = c28061xb47e1f7c.valid;
        }
        return c28061xb47e1f7c.m122191x2eaf75(i17, i18, f17, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartMs() {
        return this.startMs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEndMs() {
        return this.endMs;
    }

    /* renamed from: component3, reason: from getter */
    public final float getLoudness() {
        return this.loudness;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* renamed from: copy */
    public final com.tme.p3259xc83515e4.p3262x153e1c29.C28061xb47e1f7c m122191x2eaf75(int startMs, int endMs, float loudness, boolean valid) {
        return new com.tme.p3259xc83515e4.p3262x153e1c29.C28061xb47e1f7c(startMs, endMs, loudness, valid);
    }

    /* renamed from: equals */
    public boolean m122192xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tme.p3259xc83515e4.p3262x153e1c29.C28061xb47e1f7c)) {
            return false;
        }
        com.tme.p3259xc83515e4.p3262x153e1c29.C28061xb47e1f7c c28061xb47e1f7c = (com.tme.p3259xc83515e4.p3262x153e1c29.C28061xb47e1f7c) other;
        return this.startMs == c28061xb47e1f7c.startMs && this.endMs == c28061xb47e1f7c.endMs && java.lang.Float.compare(this.loudness, c28061xb47e1f7c.loudness) == 0 && this.valid == c28061xb47e1f7c.valid;
    }

    /* renamed from: getEndMs */
    public final int m122193x74606e2b() {
        return this.endMs;
    }

    /* renamed from: getLoudness */
    public final float m122194xc08961f() {
        return this.loudness;
    }

    /* renamed from: getStartMs */
    public final int m122195xccb87972() {
        return this.startMs;
    }

    /* renamed from: getValid */
    public final boolean m122196x754a3646() {
        return this.valid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m122197x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.startMs) * 31) + java.lang.Integer.hashCode(this.endMs)) * 31) + java.lang.Float.hashCode(this.loudness)) * 31;
        boolean z17 = this.valid;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    /* renamed from: setEndMs */
    public final void m122198x52ee889f(int i17) {
        this.endMs = i17;
    }

    /* renamed from: setLoudness */
    public final void m122199x6c0f72b(float f17) {
        this.loudness = f17;
    }

    /* renamed from: setStartMs */
    public final void m122200x4029c6e6(int i17) {
        this.startMs = i17;
    }

    /* renamed from: setValid */
    public final void m122201x53d850ba(boolean z17) {
        this.valid = z17;
    }

    /* renamed from: toString */
    public java.lang.String m122202x9616526c() {
        return "LoudnessItem(startMs=" + this.startMs + ", endMs=" + this.endMs + ", loudness=" + this.loudness + ", valid=" + this.valid + ")";
    }

    public C28061xb47e1f7c(int i17, int i18, float f17, boolean z17) {
        this.startMs = i17;
        this.endMs = i18;
        this.loudness = f17;
        this.valid = z17;
    }

    public /* synthetic */ C28061xb47e1f7c(int i17, int i18, float f17, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? 0 : i17, (i19 & 2) != 0 ? 0 : i18, (i19 & 4) != 0 ? 0.0f : f17, (i19 & 8) != 0 ? false : z17);
    }
}
