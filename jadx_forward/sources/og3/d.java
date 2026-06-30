package og3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f426692a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f426693b;

    public d(java.util.ArrayList inputs, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputs, "inputs");
        this.f426692a = inputs;
        this.f426693b = bundle;
    }

    /* renamed from: equals */
    public boolean m151256xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3.d)) {
            return false;
        }
        og3.d dVar = (og3.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426692a, dVar.f426692a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426693b, dVar.f426693b);
    }

    /* renamed from: hashCode */
    public int m151257x8cdac1b() {
        int hashCode = this.f426692a.hashCode() * 31;
        android.os.Bundle bundle = this.f426693b;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m151258x9616526c() {
        return "MediaInputInfo(inputs=" + this.f426692a + ", extra=" + this.f426693b + ')';
    }
}
