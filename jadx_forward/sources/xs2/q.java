package xs2;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f537898a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f537899b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f537900c;

    public q(boolean z17, boolean z18, java.lang.Object obj) {
        this.f537898a = z17;
        this.f537899b = z18;
        this.f537900c = obj;
    }

    /* renamed from: equals */
    public boolean m175878xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs2.q)) {
            return false;
        }
        xs2.q qVar = (xs2.q) obj;
        return this.f537898a == qVar.f537898a && this.f537899b == qVar.f537899b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537900c, qVar.f537900c);
    }

    /* renamed from: hashCode */
    public int m175879x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f537898a) * 31) + java.lang.Boolean.hashCode(this.f537899b)) * 31;
        java.lang.Object obj = this.f537900c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m175880x9616526c() {
        return "DanmakuBackgroundConfig(set=" + this.f537898a + ", enablePrivilegeDanmaku=" + this.f537899b + ", extraInfo=" + this.f537900c + ')';
    }
}
