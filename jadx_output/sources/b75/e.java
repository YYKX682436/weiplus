package b75;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f18232a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f18233b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f18234c;

    public e(int i17, java.util.Map map, java.util.Map map2, b75.d dVar) {
    }

    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!this.f18234c.startsWith("http://") && !this.f18234c.startsWith("https://")) {
            sb6.append(this.f18232a + this.f18233b);
        }
        sb6.append(this.f18234c);
        return sb6.toString();
    }

    public java.lang.String toString() {
        try {
            return a();
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HttpWrapperBase", e17, "", new java.lang.Object[0]);
            return "";
        }
    }
}
