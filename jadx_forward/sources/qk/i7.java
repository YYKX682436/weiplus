package qk;

/* loaded from: classes12.dex */
public abstract class i7 {

    /* renamed from: a, reason: collision with root package name */
    public int f445688a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f445689b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f445690c = "";

    /* renamed from: d, reason: collision with root package name */
    public final long f445691d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public boolean f445692e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f445693f;

    public final java.lang.String c() {
        if (this.f445690c.length() == 0) {
            this.f445690c = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        return this.f445690c;
    }

    public final void d(int i17) {
        this.f445688a = i17;
    }
}
