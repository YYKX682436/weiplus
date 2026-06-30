package zo5;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f556413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f556414b;

    /* renamed from: c, reason: collision with root package name */
    public final int f556415c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f556416d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f556417e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.Size f556418f;

    public e(int i17, int i18, int i19, boolean z17, boolean z18, android.util.Size size, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i27 & 8) != 0 ? false : z17;
        z18 = (i27 & 16) != 0 ? true : z18;
        size = (i27 & 32) != 0 ? null : size;
        this.f556413a = i17;
        this.f556414b = i18;
        this.f556415c = i19;
        this.f556416d = z17;
        this.f556417e = z18;
        this.f556418f = size;
    }

    /* renamed from: equals */
    public boolean m179261xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo5.e)) {
            return false;
        }
        zo5.e eVar = (zo5.e) obj;
        return this.f556413a == eVar.f556413a && this.f556414b == eVar.f556414b && this.f556415c == eVar.f556415c && this.f556416d == eVar.f556416d && this.f556417e == eVar.f556417e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556418f, eVar.f556418f);
    }

    /* renamed from: hashCode */
    public int m179262x8cdac1b() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f556413a) * 31) + java.lang.Integer.hashCode(this.f556414b)) * 31) + java.lang.Integer.hashCode(this.f556415c)) * 31) + java.lang.Boolean.hashCode(this.f556416d)) * 31) + java.lang.Boolean.hashCode(this.f556417e)) * 31;
        android.util.Size size = this.f556418f;
        return hashCode + (size == null ? 0 : size.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m179263x9616526c() {
        return "RenderInfo(width=" + this.f556413a + ", height=" + this.f556414b + ", rotate=" + this.f556415c + ", mirror=" + this.f556416d + ", centerCrop=" + this.f556417e + ", realSize=" + this.f556418f + ')';
    }
}
