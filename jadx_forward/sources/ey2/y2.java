package ey2;

/* loaded from: classes2.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f339116a;

    /* renamed from: b, reason: collision with root package name */
    public long f339117b;

    /* renamed from: c, reason: collision with root package name */
    public long f339118c;

    /* renamed from: d, reason: collision with root package name */
    public long f339119d;

    public y2(int i17) {
        this.f339116a = i17;
    }

    /* renamed from: equals */
    public boolean m128399xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.y2) && this.f339116a == ((ey2.y2) obj).f339116a;
    }

    /* renamed from: hashCode */
    public int m128400x8cdac1b() {
        return java.lang.Integer.hashCode(this.f339116a);
    }

    /* renamed from: toString */
    public java.lang.String m128401x9616526c() {
        return "LastPreloadTimeStampCache(liveTabId=" + this.f339116a + ')';
    }
}
