package yq5;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public long f546136a;

    /* renamed from: b, reason: collision with root package name */
    public float f546137b;

    /* renamed from: c, reason: collision with root package name */
    public int f546138c;

    public l() {
        int i17 = s26.f.f483912b;
        this.f546136a = java.lang.System.nanoTime() - s26.f.f483911a;
        this.f546137b = 1.0f;
        this.f546138c = 255;
    }

    public final void a(float f17) {
        if (f17 == this.f546137b) {
            return;
        }
        this.f546137b = f17;
        this.f546138c = (int) (f17 * 255);
    }
}
