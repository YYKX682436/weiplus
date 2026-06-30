package t13;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: i, reason: collision with root package name */
    public p13.y f496106i;

    /* renamed from: a, reason: collision with root package name */
    public int f496098a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public boolean f496099b = true;

    /* renamed from: c, reason: collision with root package name */
    public int f496100c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public boolean f496101d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f496102e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f496103f = null;

    /* renamed from: g, reason: collision with root package name */
    public p13.r f496104g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f496105h = true;

    /* renamed from: j, reason: collision with root package name */
    public int f496107j = 0;

    /* renamed from: toString */
    public java.lang.String m165608x9616526c() {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(this.f496098a);
        objArr[1] = java.lang.Boolean.valueOf(this.f496099b);
        objArr[2] = java.lang.Integer.valueOf(this.f496100c);
        objArr[3] = java.lang.Boolean.valueOf(this.f496101d);
        objArr[4] = java.lang.Integer.valueOf(this.f496102e);
        java.util.List list = this.f496103f;
        objArr[5] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        objArr[6] = java.lang.Integer.valueOf(this.f496107j);
        return java.lang.String.format("{%d, %b, %d, %b, %d, %d, %d}", objArr);
    }
}
