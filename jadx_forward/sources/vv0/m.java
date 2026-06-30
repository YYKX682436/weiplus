package vv0;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f521929a;

    /* renamed from: b, reason: collision with root package name */
    public final float f521930b;

    public m(java.lang.String filterID, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterID, "filterID");
        this.f521929a = filterID;
        this.f521930b = f17;
    }

    /* renamed from: equals */
    public boolean m172704xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.m)) {
            return false;
        }
        vv0.m mVar = (vv0.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521929a, mVar.f521929a) && java.lang.Float.compare(this.f521930b, mVar.f521930b) == 0;
    }

    /* renamed from: hashCode */
    public int m172705x8cdac1b() {
        return (this.f521929a.hashCode() * 31) + java.lang.Float.hashCode(this.f521930b);
    }

    /* renamed from: toString */
    public java.lang.String m172706x9616526c() {
        return "MJSegmentFilterInfo(filterID=" + this.f521929a + ", intensity=" + this.f521930b + ')';
    }
}
