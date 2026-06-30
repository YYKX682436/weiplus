package ht2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f366351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f366353c;

    public e(java.lang.String key, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f366351a = key;
        this.f366352b = i17;
        this.f366353c = i18;
    }

    /* renamed from: equals */
    public boolean m134128xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht2.e)) {
            return false;
        }
        ht2.e eVar = (ht2.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f366351a, eVar.f366351a) && this.f366352b == eVar.f366352b && this.f366353c == eVar.f366353c;
    }

    /* renamed from: hashCode */
    public int m134129x8cdac1b() {
        return (((this.f366351a.hashCode() * 31) + java.lang.Integer.hashCode(this.f366352b)) * 31) + java.lang.Integer.hashCode(this.f366353c);
    }

    /* renamed from: toString */
    public java.lang.String m134130x9616526c() {
        return "{" + this.f366351a + '[' + this.f366352b + ':' + this.f366353c + "]}";
    }
}
