package by5;

/* loaded from: classes13.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f118124a = new java.lang.StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final int f118125b;

    public r0(int i17) {
        this.f118125b = 0;
        this.f118125b = i17;
    }

    public by5.r0 a(int i17, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = this.f118124a;
        if (sb6.length() > 0) {
            sb6.append(",");
        }
        sb6.append(obj.toString());
        return this;
    }
}
