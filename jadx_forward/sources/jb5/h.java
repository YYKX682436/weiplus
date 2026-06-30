package jb5;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f380398a;

    /* renamed from: b, reason: collision with root package name */
    public final int f380399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f380400c;

    /* renamed from: d, reason: collision with root package name */
    public final int f380401d;

    public h(int i17, int i18, int i19, int i27) {
        this.f380398a = i17;
        this.f380399b = i18;
        this.f380400c = i19;
        this.f380401d = i27;
    }

    /* renamed from: equals */
    public boolean m140600xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb5.h)) {
            return false;
        }
        jb5.h hVar = (jb5.h) obj;
        return this.f380398a == hVar.f380398a && this.f380399b == hVar.f380399b && this.f380400c == hVar.f380400c && this.f380401d == hVar.f380401d;
    }

    /* renamed from: hashCode */
    public int m140601x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f380398a) * 31) + java.lang.Integer.hashCode(this.f380399b)) * 31) + java.lang.Integer.hashCode(this.f380400c)) * 31) + java.lang.Integer.hashCode(this.f380401d);
    }

    /* renamed from: toString */
    public java.lang.String m140602x9616526c() {
        return "ViewPosition(x=" + this.f380398a + ", y=" + this.f380399b + ", width=" + this.f380400c + ", height=" + this.f380401d + ')';
    }
}
