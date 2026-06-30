package v5;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f514813a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f514814b;

    public e(android.graphics.drawable.Drawable drawable, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f514813a = drawable;
        this.f514814b = z17;
    }

    /* renamed from: equals */
    public boolean m171112xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5.e)) {
            return false;
        }
        v5.e eVar = (v5.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514813a, eVar.f514813a) && this.f514814b == eVar.f514814b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m171113x8cdac1b() {
        int hashCode = this.f514813a.hashCode() * 31;
        boolean z17 = this.f514814b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    /* renamed from: toString */
    public java.lang.String m171114x9616526c() {
        return "DecodeResult(drawable=" + this.f514813a + ", isSampled=" + this.f514814b + ')';
    }
}
