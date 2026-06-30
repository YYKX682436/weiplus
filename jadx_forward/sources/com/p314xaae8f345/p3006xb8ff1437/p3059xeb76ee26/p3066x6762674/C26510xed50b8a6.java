package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674;

/* renamed from: com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy */
/* loaded from: classes14.dex */
public final class C26510xed50b8a6 {

    /* renamed from: DEFAULT */
    public static final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6 f54200x86df6221 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6(1920, 1920);

    /* renamed from: DEFAULT_INIT_HEIGHT */
    public static final int f54201x53e5ea18 = 1920;

    /* renamed from: DEFAULT_INIT_WIDTH */
    public static final int f54202x7f68ee95 = 1920;

    /* renamed from: initHeight */
    public int f54204xfbd2d657;

    /* renamed from: initWidth */
    public int f54205xf02e8296;

    /* renamed from: reConfigByRealFormat */
    public boolean f54206x508b7ee1 = true;

    /* renamed from: eraseType */
    public com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6.EraseType f54203x9676d300 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6.EraseType.First;

    /* renamed from: com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy$EraseType */
    /* loaded from: classes6.dex */
    public enum EraseType {
        First,
        SAME
    }

    public C26510xed50b8a6(int i17, int i18) {
        this.f54205xf02e8296 = i17;
        this.f54204xfbd2d657 = i18;
    }

    /* renamed from: toString */
    public java.lang.String m103498x9616526c() {
        return "[initWidth:" + this.f54205xf02e8296 + ", initHeight:" + this.f54204xfbd2d657 + ", reConfigByRealFormat:" + this.f54206x508b7ee1 + ']';
    }
}
