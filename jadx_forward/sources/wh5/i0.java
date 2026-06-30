package wh5;

/* loaded from: classes3.dex */
public final class i0 implements vh5.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f527603a;

    public i0(boolean z17) {
        this.f527603a = z17;
    }

    /* renamed from: equals */
    public boolean m173821xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh5.i0) && this.f527603a == ((wh5.i0) obj).f527603a;
    }

    /* renamed from: hashCode */
    public int m173822x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f527603a);
    }

    /* renamed from: toString */
    public java.lang.String m173823x9616526c() {
        return "ImageOCRHelperBindData(hideButton=" + this.f527603a + ')';
    }
}
