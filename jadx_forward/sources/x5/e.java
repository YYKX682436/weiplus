package x5;

/* loaded from: classes14.dex */
public final class e extends x5.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f533477a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f533478b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.d f533479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.graphics.drawable.Drawable drawable, boolean z17, v5.d dataSource) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        this.f533477a = drawable;
        this.f533478b = z17;
        this.f533479c = dataSource;
    }

    /* renamed from: equals */
    public boolean m175003xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5.e)) {
            return false;
        }
        x5.e eVar = (x5.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533477a, eVar.f533477a) && this.f533478b == eVar.f533478b && this.f533479c == eVar.f533479c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m175004x8cdac1b() {
        int hashCode = this.f533477a.hashCode() * 31;
        boolean z17 = this.f533478b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return ((hashCode + i17) * 31) + this.f533479c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175005x9616526c() {
        return "DrawableResult(drawable=" + this.f533477a + ", isSampled=" + this.f533478b + ", dataSource=" + this.f533479c + ')';
    }
}
