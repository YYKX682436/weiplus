package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJRecordingResultTraits {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47918a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47919b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47920c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47921d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47922e;

    public MJRecordingResultTraits() {
        this.f47918a = false;
        this.f47919b = false;
        this.f47920c = false;
        this.f47921d = 0;
        this.f47922e = 0;
    }

    public java.lang.String toString() {
        return "MJRecordingResultTraits{hasFaceSticker=" + this.f47918a + ", hasOverlaySticker=" + this.f47919b + ", has3DLayer=" + this.f47920c + ", faceTimePercentage=" + this.f47921d + ", likelyDefective=" + this.f47922e + '}';
    }

    public MJRecordingResultTraits(boolean z17, boolean z18, boolean z19, int i17, int i18) {
        this.f47918a = z17;
        this.f47919b = z18;
        this.f47920c = z19;
        this.f47921d = i17;
        this.f47922e = i18;
    }
}
