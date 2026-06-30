package sl5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f490816a;

    /* renamed from: b, reason: collision with root package name */
    public final float f490817b;

    /* renamed from: c, reason: collision with root package name */
    public final int f490818c;

    /* renamed from: d, reason: collision with root package name */
    public final int f490819d;

    /* renamed from: e, reason: collision with root package name */
    public final long f490820e;

    public a(float f17, float f18, int i17, int i18, long j17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i19 & 1) != 0 ? 0.02f : f17;
        f18 = (i19 & 2) != 0 ? 0.23f : f18;
        i17 = (i19 & 4) != 0 ? 500 : i17;
        i18 = (i19 & 8) != 0 ? 15 : i18;
        j17 = (i19 & 16) != 0 ? 150L : j17;
        this.f490816a = f17;
        this.f490817b = f18;
        this.f490818c = i17;
        this.f490819d = i18;
        this.f490820e = j17;
    }

    /* renamed from: equals */
    public boolean m164782xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl5.a)) {
            return false;
        }
        sl5.a aVar = (sl5.a) obj;
        return java.lang.Float.compare(this.f490816a, aVar.f490816a) == 0 && java.lang.Float.compare(this.f490817b, aVar.f490817b) == 0 && this.f490818c == aVar.f490818c && this.f490819d == aVar.f490819d && this.f490820e == aVar.f490820e;
    }

    /* renamed from: hashCode */
    public int m164783x8cdac1b() {
        return (((((((java.lang.Float.hashCode(this.f490816a) * 31) + java.lang.Float.hashCode(this.f490817b)) * 31) + java.lang.Integer.hashCode(this.f490818c)) * 31) + java.lang.Integer.hashCode(this.f490819d)) * 31) + java.lang.Long.hashCode(this.f490820e);
    }

    /* renamed from: toString */
    public java.lang.String m164784x9616526c() {
        return "PinchZoomConfig(directionThreshold=" + this.f490816a + ", applyThreshold=" + this.f490817b + ", autoTransitionDurationMs=" + this.f490818c + ", maxPendingFrames=" + this.f490819d + ", overlayFadeOutDurationMs=" + this.f490820e + ')';
    }
}
