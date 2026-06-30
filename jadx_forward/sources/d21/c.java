package d21;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f307316j = "";

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f307317k = "";

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f307318a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f307319b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f307321d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f307322e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f307323f;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f307320c = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f307324g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f307325h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f307326i = new java.util.LinkedList();

    public c(java.util.Map map) {
        this.f307318a = map;
    }

    public boolean a() {
        java.util.Map map = this.f307318a;
        if (map == null || map.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseNewXmlMsg", "values == null || values.size() == 0 ");
            return false;
        }
        if (map.containsKey(".sysmsg.$type")) {
            this.f307321d = (java.lang.String) map.get(".sysmsg.$type");
        }
        java.lang.String str = ".sysmsg." + this.f307321d + ".text";
        f307316j = str;
        if (map.containsKey(str)) {
            this.f307322e = (java.lang.String) map.get(f307316j);
        }
        java.lang.String str2 = ".sysmsg." + this.f307321d + ".link.scene";
        f307317k = str2;
        if (map.containsKey(str2)) {
            this.f307323f = (java.lang.String) map.get(f307317k);
        }
        return b();
    }

    public abstract boolean b();

    public c(java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f307318a = map;
        this.f307319b = f9Var;
    }
}
