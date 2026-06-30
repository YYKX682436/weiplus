package com.tme.p3259xc83515e4.p3262x153e1c29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/tme/karaoke/lib_singscore/SkillFeature;", "Ljava/io/Serializable;", "type", "", "duration", "", "param1", "param2", "param3", "startTime", "endTime", "(IFFFFFF)V", "getDuration", "()F", "getEndTime", "getParam1", "getParam2", "getParam3", "getStartTime", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.tme.karaoke.lib_singscore.SkillFeature */
/* loaded from: classes4.dex */
public final /* data */ class C28073x75078f85 implements java.io.Serializable {
    private final float duration;
    private final float endTime;
    private final float param1;
    private final float param2;
    private final float param3;
    private final float startTime;
    private final int type;

    public C28073x75078f85(int i17, float f17, float f18, float f19, float f27, float f28, float f29) {
        this.type = i17;
        this.duration = f17;
        this.param1 = f18;
        this.param2 = f19;
        this.param3 = f27;
        this.startTime = f28;
        this.endTime = f29;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.tme.p3259xc83515e4.p3262x153e1c29.C28073x75078f85 m122317x75149012(com.tme.p3259xc83515e4.p3262x153e1c29.C28073x75078f85 c28073x75078f85, int i17, float f17, float f18, float f19, float f27, float f28, float f29, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = c28073x75078f85.type;
        }
        if ((i18 & 2) != 0) {
            f17 = c28073x75078f85.duration;
        }
        float f37 = f17;
        if ((i18 & 4) != 0) {
            f18 = c28073x75078f85.param1;
        }
        float f38 = f18;
        if ((i18 & 8) != 0) {
            f19 = c28073x75078f85.param2;
        }
        float f39 = f19;
        if ((i18 & 16) != 0) {
            f27 = c28073x75078f85.param3;
        }
        float f47 = f27;
        if ((i18 & 32) != 0) {
            f28 = c28073x75078f85.startTime;
        }
        float f48 = f28;
        if ((i18 & 64) != 0) {
            f29 = c28073x75078f85.endTime;
        }
        return c28073x75078f85.m122325x2eaf75(i17, f37, f38, f39, f47, f48, f29);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final float getDuration() {
        return this.duration;
    }

    /* renamed from: component3, reason: from getter */
    public final float getParam1() {
        return this.param1;
    }

    /* renamed from: component4, reason: from getter */
    public final float getParam2() {
        return this.param2;
    }

    /* renamed from: component5, reason: from getter */
    public final float getParam3() {
        return this.param3;
    }

    /* renamed from: component6, reason: from getter */
    public final float getStartTime() {
        return this.startTime;
    }

    /* renamed from: component7, reason: from getter */
    public final float getEndTime() {
        return this.endTime;
    }

    /* renamed from: copy */
    public final com.tme.p3259xc83515e4.p3262x153e1c29.C28073x75078f85 m122325x2eaf75(int type, float duration, float param1, float param2, float param3, float startTime, float endTime) {
        return new com.tme.p3259xc83515e4.p3262x153e1c29.C28073x75078f85(type, duration, param1, param2, param3, startTime, endTime);
    }

    /* renamed from: equals */
    public boolean m122326xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tme.p3259xc83515e4.p3262x153e1c29.C28073x75078f85)) {
            return false;
        }
        com.tme.p3259xc83515e4.p3262x153e1c29.C28073x75078f85 c28073x75078f85 = (com.tme.p3259xc83515e4.p3262x153e1c29.C28073x75078f85) other;
        return this.type == c28073x75078f85.type && java.lang.Float.compare(this.duration, c28073x75078f85.duration) == 0 && java.lang.Float.compare(this.param1, c28073x75078f85.param1) == 0 && java.lang.Float.compare(this.param2, c28073x75078f85.param2) == 0 && java.lang.Float.compare(this.param3, c28073x75078f85.param3) == 0 && java.lang.Float.compare(this.startTime, c28073x75078f85.startTime) == 0 && java.lang.Float.compare(this.endTime, c28073x75078f85.endTime) == 0;
    }

    /* renamed from: getDuration */
    public final float m122327x51e8b0a() {
        return this.duration;
    }

    /* renamed from: getEndTime */
    public final float m122328xde00a612() {
        return this.endTime;
    }

    /* renamed from: getParam1 */
    public final float m122329x29c21c3a() {
        return this.param1;
    }

    /* renamed from: getParam2 */
    public final float m122330x29c21c3b() {
        return this.param2;
    }

    /* renamed from: getParam3 */
    public final float m122331x29c21c3c() {
        return this.param3;
    }

    /* renamed from: getStartTime */
    public final float m122332x8082fb99() {
        return this.startTime;
    }

    /* renamed from: getType */
    public final int m122333xfb85f7b0() {
        return this.type;
    }

    /* renamed from: hashCode */
    public int m122334x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.type) * 31) + java.lang.Float.hashCode(this.duration)) * 31) + java.lang.Float.hashCode(this.param1)) * 31) + java.lang.Float.hashCode(this.param2)) * 31) + java.lang.Float.hashCode(this.param3)) * 31) + java.lang.Float.hashCode(this.startTime)) * 31) + java.lang.Float.hashCode(this.endTime);
    }

    /* renamed from: toString */
    public java.lang.String m122335x9616526c() {
        return "SkillFeature(type=" + this.type + ", duration=" + this.duration + ", param1=" + this.param1 + ", param2=" + this.param2 + ", param3=" + this.param3 + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }
}
