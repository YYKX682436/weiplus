package in5;

/* loaded from: classes10.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f374681a;

    /* renamed from: b, reason: collision with root package name */
    public int f374682b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f374683c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f374684d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f374685e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f374686f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f374687g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f374688h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f374689i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f374690j = new java.util.LinkedList();

    public w0(int i17) {
        this.f374681a = i17;
    }

    /* renamed from: equals */
    public boolean m136798xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in5.w0) && this.f374681a == ((in5.w0) obj).f374681a;
    }

    /* renamed from: hashCode */
    public int m136799x8cdac1b() {
        return java.lang.Integer.hashCode(this.f374681a);
    }

    /* renamed from: toString */
    public java.lang.String m136800x9616526c() {
        return "WxRVData(state=" + this.f374681a + ')';
    }
}
