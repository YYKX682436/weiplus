package by5;

/* loaded from: classes13.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f36591a = new java.lang.StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final int f36592b;

    public r0(int i17) {
        this.f36592b = 0;
        this.f36592b = i17;
    }

    public by5.r0 a(int i17, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = this.f36591a;
        if (sb6.length() > 0) {
            sb6.append(",");
        }
        sb6.append(obj.toString());
        return this;
    }
}
