package y8;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f541347a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f541348b;

    public g(java.lang.String str, boolean z17) {
        this.f541347a = str;
        this.f541348b = z17;
    }

    /* renamed from: equals */
    public boolean m176603xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != y8.g.class) {
            return false;
        }
        y8.g gVar = (y8.g) obj;
        return android.text.TextUtils.equals(this.f541347a, gVar.f541347a) && this.f541348b == gVar.f541348b;
    }

    /* renamed from: hashCode */
    public int m176604x8cdac1b() {
        java.lang.String str = this.f541347a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f541348b ? 1231 : 1237);
    }
}
