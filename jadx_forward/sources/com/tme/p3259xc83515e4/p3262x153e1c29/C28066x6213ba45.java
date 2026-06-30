package com.tme.p3259xc83515e4.p3262x153e1c29;

/* renamed from: com.tme.karaoke.lib_singscore.NoteItem */
/* loaded from: classes10.dex */
public class C28066x6213ba45 {

    /* renamed from: INVALID_GROVE_VALUE */
    public static final int f65768x4efaea1d = -1;

    /* renamed from: MAX_GROVE_VALUE */
    public static final int f65769x5301da0a = 100;

    /* renamed from: MAX_VOICE_PITCH_VALUE */
    public static final int f65770x633ff58a = 90;

    /* renamed from: duration */
    public int f65771x89444d94;

    /* renamed from: endTime */
    public int f65772xa0336a48;

    /* renamed from: height */
    public int f65773xb7389127;

    /* renamed from: startTime */
    public int f65774x81158a4f;

    /* renamed from: getEndTime */
    public int m122257xde00a612() {
        return this.f65774x81158a4f + this.f65771x89444d94;
    }

    /* renamed from: isSame */
    public boolean m122258xb9a89cb0(int i17) {
        return java.lang.Math.abs(this.f65773xb7389127 - i17) < 11 && this.f65773xb7389127 > 0 && i17 > 0;
    }

    /* renamed from: toString */
    public java.lang.String m122259x9616526c() {
        return java.lang.String.format("startTime = %d ; endTime = %d ; duration = %d ; height = %d;", java.lang.Integer.valueOf(this.f65774x81158a4f), java.lang.Integer.valueOf(this.f65772xa0336a48), java.lang.Integer.valueOf(this.f65771x89444d94), java.lang.Integer.valueOf(this.f65773xb7389127));
    }
}
