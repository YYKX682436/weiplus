package km0;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f390520a;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Application f390522c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f390523d;

    /* renamed from: e, reason: collision with root package name */
    public final km0.a f390524e = new km0.a();

    /* renamed from: b, reason: collision with root package name */
    public final im0.a f390521b = new im0.a();

    public b(java.lang.String str, android.app.Application application) {
        this.f390520a = str;
        this.f390522c = application;
    }

    public boolean a() {
        if (this.f390523d == null) {
            this.f390523d = java.lang.Boolean.valueOf(b(""));
        }
        return this.f390523d.booleanValue();
    }

    public boolean b(java.lang.String str) {
        java.lang.String str2 = this.f390520a;
        if (str2 != null) {
            if (str2.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m143639x9616526c() {
        java.lang.String str = this.f390520a;
        return str != null ? str : super.toString();
    }
}
