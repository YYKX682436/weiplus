package b75;

/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f18235a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f18236b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f18237c;

    public f(int i17, java.util.Map map, java.lang.String str) {
        this.f18235a = i17;
        this.f18236b = map;
        this.f18237c = str;
    }

    public abstract void a();

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Response status:");
        sb6.append(this.f18235a);
        sb6.append(", cookie:");
        java.lang.Object obj = this.f18236b;
        if (obj == null) {
            obj = "";
        }
        sb6.append(obj);
        sb6.append(", content length :");
        java.lang.String str = this.f18237c;
        sb6.append(str != null ? str.length() : 0);
        return sb6.toString();
    }
}
