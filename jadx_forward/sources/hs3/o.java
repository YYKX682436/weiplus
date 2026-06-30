package hs3;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f366126a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f366127b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f366128c;

    public o(int i17, java.util.Map map, java.lang.String str) {
        this.f366126a = 0;
        this.f366126a = i17;
        this.f366127b = map;
        this.f366128c = str;
    }

    /* renamed from: toString */
    public java.lang.String m134064x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Response status:");
        sb6.append(this.f366126a);
        sb6.append(", cookie:");
        java.lang.Object obj = this.f366127b;
        if (obj == null) {
            obj = "";
        }
        sb6.append(obj);
        sb6.append(", content length :");
        java.lang.String str = this.f366128c;
        sb6.append(str != null ? str.length() : 0);
        return sb6.toString();
    }
}
