package b75;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f99765a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f99766b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f99767c;

    public e(int i17, java.util.Map map, java.util.Map map2, b75.d dVar) {
    }

    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!this.f99767c.startsWith("http://") && !this.f99767c.startsWith("https://")) {
            sb6.append(this.f99765a + this.f99766b);
        }
        sb6.append(this.f99767c);
        return sb6.toString();
    }

    /* renamed from: toString */
    public java.lang.String m9923x9616526c() {
        try {
            return a();
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HttpWrapperBase", e17, "", new java.lang.Object[0]);
            return "";
        }
    }
}
