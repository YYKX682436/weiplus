package id;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f371981a;

    /* renamed from: b, reason: collision with root package name */
    public final int f371982b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f371983c;

    public e(org.json.JSONObject result, int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f371981a = result;
        this.f371982b = i17;
        this.f371983c = username;
    }

    /* renamed from: equals */
    public boolean m135098xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id.e)) {
            return false;
        }
        id.e eVar = (id.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f371981a, eVar.f371981a) && this.f371982b == eVar.f371982b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f371983c, eVar.f371983c);
    }

    /* renamed from: hashCode */
    public int m135099x8cdac1b() {
        return (((this.f371981a.hashCode() * 31) + java.lang.Integer.hashCode(this.f371982b)) * 31) + this.f371983c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m135100x9616526c() {
        return "PocketMoneySelectResult(result=" + this.f371981a + ", status=" + this.f371982b + ", username=" + this.f371983c + ')';
    }
}
