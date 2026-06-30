package b75;

/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f99768a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f99769b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f99770c;

    public f(int i17, java.util.Map map, java.lang.String str) {
        this.f99768a = i17;
        this.f99769b = map;
        this.f99770c = str;
    }

    public abstract void a();

    /* renamed from: toString */
    public java.lang.String m9924x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Response status:");
        sb6.append(this.f99768a);
        sb6.append(", cookie:");
        java.lang.Object obj = this.f99769b;
        if (obj == null) {
            obj = "";
        }
        sb6.append(obj);
        sb6.append(", content length :");
        java.lang.String str = this.f99770c;
        sb6.append(str != null ? str.length() : 0);
        return sb6.toString();
    }
}
