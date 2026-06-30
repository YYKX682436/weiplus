package h10;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f359532a;

    /* renamed from: b, reason: collision with root package name */
    public final float f359533b;

    /* renamed from: c, reason: collision with root package name */
    public final float f359534c;

    /* renamed from: d, reason: collision with root package name */
    public final float f359535d;

    public e(float f17, float f18, float f19, float f27) {
        this.f359532a = f17;
        this.f359533b = f18;
        this.f359534c = f19;
        this.f359535d = f27;
    }

    /* renamed from: equals */
    public boolean m132637xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h10.e)) {
            return false;
        }
        h10.e eVar = (h10.e) obj;
        return java.lang.Float.compare(this.f359532a, eVar.f359532a) == 0 && java.lang.Float.compare(this.f359533b, eVar.f359533b) == 0 && java.lang.Float.compare(this.f359534c, eVar.f359534c) == 0 && java.lang.Float.compare(this.f359535d, eVar.f359535d) == 0;
    }

    /* renamed from: hashCode */
    public int m132638x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f359532a) * 31) + java.lang.Float.hashCode(this.f359533b)) * 31) + java.lang.Float.hashCode(this.f359534c)) * 31) + java.lang.Float.hashCode(this.f359535d);
    }

    /* renamed from: toString */
    public java.lang.String m132639x9616526c() {
        return "Rect(left=" + this.f359532a + ", top=" + this.f359533b + ", right=" + this.f359534c + ", bottom=" + this.f359535d + ')';
    }
}
