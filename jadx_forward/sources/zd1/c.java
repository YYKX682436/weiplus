package zd1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzd1/c;", "Lcom/tencent/mm/plugin/appbrand/jsapi/g0;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f553060f = jz5.h.b(zd1.a.f553053d);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f553061d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f553062e;

    public c(boolean z17, java.lang.String[] types) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        this.f553061d = z17;
        this.f553062e = types;
    }

    /* renamed from: equals */
    public boolean m178709xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd1.c)) {
            return false;
        }
        zd1.c cVar = (zd1.c) obj;
        return this.f553061d == cVar.f553061d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f553062e, cVar.f553062e);
    }

    /* renamed from: hashCode */
    public int m178710x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f553061d) * 31) + java.util.Arrays.hashCode(this.f553062e);
    }

    /* renamed from: toString */
    public java.lang.String m178711x9616526c() {
        return "AcquireWebviewDomConfig(enabled=" + this.f553061d + ", types=" + java.util.Arrays.toString(this.f553062e) + ')';
    }

    public c() {
        this(false, new java.lang.String[0]);
    }
}
