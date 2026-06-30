package p13;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final p13.u f432689a;

    /* renamed from: b, reason: collision with root package name */
    public p13.c f432690b;

    /* renamed from: c, reason: collision with root package name */
    public int f432691c;

    /* renamed from: d, reason: collision with root package name */
    public p13.r f432692d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f432693e = new java.util.ArrayList();

    public v(p13.u uVar) {
        this.f432689a = uVar;
    }

    /* renamed from: toString */
    public java.lang.String m157691x9616526c() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(this.f432691c);
        java.util.List list = this.f432693e;
        objArr[1] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        return java.lang.String.format("{resultCode: %d, resultSize: %d}", objArr);
    }
}
