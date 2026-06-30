package if3;

/* loaded from: classes12.dex */
public class y implements java.lang.Cloneable {

    /* renamed from: y, reason: collision with root package name */
    public byte[] f372762y;

    /* renamed from: z, reason: collision with root package name */
    public int f372763z = -1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372744d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f372745e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f372746f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f372747g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372748h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372749i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372750m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f372751n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f372752o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f372753p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f372754q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f372755r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f372756s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f372757t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f372758u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f372759v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f372760w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f372761x = "";

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public if3.y m135220x5a5dd5d() {
        try {
            return (if3.y) super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public void b(android.database.Cursor cursor) {
        this.f372744d = cursor.getString(0);
        this.f372745e = cursor.getInt(1);
        this.f372746f = cursor.getLong(2);
        this.f372747g = cursor.getLong(3);
        this.f372748h = cursor.getString(4);
        this.f372749i = cursor.getString(5);
        this.f372750m = cursor.getString(6);
        this.f372751n = cursor.getInt(7);
        this.f372752o = cursor.getInt(8);
        this.f372753p = cursor.getInt(9);
        this.f372754q = cursor.getInt(10);
        this.f372755r = cursor.getInt(11);
        this.f372756s = cursor.getInt(12);
        this.f372757t = cursor.getInt(13);
        this.f372758u = cursor.getInt(14);
        this.f372759v = cursor.getInt(15);
        this.f372760w = cursor.getString(16);
        this.f372761x = cursor.getString(17);
    }

    public java.lang.String c() {
        java.lang.String str = this.f372744d;
        return str == null ? "" : str;
    }

    public java.lang.String d() {
        java.lang.String str = this.f372748h;
        return str == null ? "" : str;
    }

    public java.lang.String e() {
        java.lang.String str = this.f372750m;
        return str == null ? "" : str;
    }

    /* renamed from: toString */
    public java.lang.String m135221x9616526c() {
        return "MasSendInfo{clientid='" + this.f372744d + "', createTime=" + this.f372746f + ", msgType=" + this.f372752o + ", massMsgId='" + this.f372760w + "', flag=" + this.f372763z + '}';
    }
}
