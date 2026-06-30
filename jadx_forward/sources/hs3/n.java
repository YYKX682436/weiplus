package hs3;

/* loaded from: classes8.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f366123a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f366124b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f366125c;

    public n(int i17, java.util.Map map, java.util.Map map2, hs3.p pVar) {
        this.f366123a = i17;
        this.f366124b = map;
        this.f366125c = map2;
    }

    /* renamed from: toString */
    public java.lang.String m134063x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Request method:");
        sb6.append(this.f366123a);
        sb6.append(", params:");
        java.lang.Object obj = this.f366124b;
        if (obj == null) {
            obj = "";
        }
        sb6.append(obj);
        sb6.append(", cookie:");
        java.util.Map map = this.f366125c;
        sb6.append(map != null ? map : "");
        return sb6.toString();
    }
}
