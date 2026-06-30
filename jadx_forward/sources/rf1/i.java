package rf1;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f476160a = "ok";

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f476161b = null;

    /* renamed from: toString */
    public java.lang.String m162281x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mErrorMsg:");
        sb6.append(this.f476160a);
        sb6.append(" mWifiList:");
        java.util.List list = this.f476161b;
        if (list == null || list.size() <= 0) {
            sb6.append("null:");
        } else {
            for (rf1.h hVar : this.f476161b) {
                sb6.append(" WiFiItem:");
                sb6.append(hVar);
            }
        }
        return sb6.toString();
    }
}
