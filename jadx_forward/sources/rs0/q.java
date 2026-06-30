package rs0;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f480845a;

    /* renamed from: b, reason: collision with root package name */
    public final int f480846b;

    /* renamed from: c, reason: collision with root package name */
    public final int f480847c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f480848d;

    public q(int i17, int i18, int i19, java.lang.Integer num) {
        this.f480845a = i17;
        this.f480846b = i18;
        this.f480847c = i19;
        this.f480848d = num;
    }

    /* renamed from: equals */
    public boolean m162957xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs0.q)) {
            return false;
        }
        rs0.q qVar = (rs0.q) obj;
        return this.f480845a == qVar.f480845a && this.f480846b == qVar.f480846b && this.f480847c == qVar.f480847c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f480848d, qVar.f480848d);
    }

    /* renamed from: hashCode */
    public int m162958x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f480845a) * 31) + java.lang.Integer.hashCode(this.f480846b)) * 31) + java.lang.Integer.hashCode(this.f480847c)) * 31;
        java.lang.Integer num = this.f480848d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m162959x9616526c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("colorRange", this.f480845a);
        jSONObject.put("colorStandard", this.f480846b);
        jSONObject.put("colorTransfer", this.f480847c);
        java.lang.Integer num = this.f480848d;
        if (num != null) {
            jSONObject.put("ffmpegColorPrimaries", num.intValue());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
