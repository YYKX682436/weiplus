package wh5;

/* loaded from: classes3.dex */
public final class j0 implements vh5.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f527605a;

    public j0(boolean z17) {
        this.f527605a = z17;
    }

    /* renamed from: equals */
    public boolean m173824xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh5.j0) && this.f527605a == ((wh5.j0) obj).f527605a;
    }

    /* renamed from: hashCode */
    public int m173825x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f527605a);
    }

    /* renamed from: toString */
    public java.lang.String m173826x9616526c() {
        return "ImageScanData(hideButton=" + this.f527605a + ')';
    }
}
