package y1;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final y1.h f540246d = new y1.h(0.0f, new e06.e(0.0f, 0.0f), 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f540247a;

    /* renamed from: b, reason: collision with root package name */
    public final e06.f f540248b;

    /* renamed from: c, reason: collision with root package name */
    public final int f540249c;

    public h(float f17, e06.f range, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        this.f540247a = f17;
        this.f540248b = range;
        this.f540249c = i17;
    }

    /* renamed from: equals */
    public boolean m176328xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1.h)) {
            return false;
        }
        y1.h hVar = (y1.h) obj;
        return ((this.f540247a > hVar.f540247a ? 1 : (this.f540247a == hVar.f540247a ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540248b, hVar.f540248b) && this.f540249c == hVar.f540249c;
    }

    /* renamed from: hashCode */
    public int m176329x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f540247a) * 31) + this.f540248b.hashCode()) * 31) + this.f540249c;
    }

    /* renamed from: toString */
    public java.lang.String m176330x9616526c() {
        return "ProgressBarRangeInfo(current=" + this.f540247a + ", range=" + this.f540248b + ", steps=" + this.f540249c + ')';
    }
}
