package zp;

/* loaded from: classes16.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f556455a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Point f556456b;

    /* renamed from: c, reason: collision with root package name */
    public final int f556457c;

    /* renamed from: d, reason: collision with root package name */
    public float f556458d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f556459e = 0.0f;

    public m(long j17, android.graphics.Point point, int i17) {
        this.f556455a = j17;
        this.f556456b = point;
        this.f556457c = i17;
    }

    /* renamed from: toString */
    public java.lang.String m179271x9616526c() {
        return "TouchPoint{mTime=" + this.f556455a + ", mTargetLeft=" + this.f556458d + ", mTargetTop=" + this.f556459e + ", mPoint=" + this.f556456b + ", mDistanceOfError=" + this.f556457c + '}';
    }
}
