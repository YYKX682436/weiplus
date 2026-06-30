package n3;

/* loaded from: classes14.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final e3.d f415876a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.d f415877b;

    public i2(e3.d dVar, e3.d dVar2) {
        this.f415876a = dVar;
        this.f415877b = dVar2;
    }

    /* renamed from: toString */
    public java.lang.String m148930x9616526c() {
        return "Bounds{lower=" + this.f415876a + " upper=" + this.f415877b + "}";
    }

    public i2(android.view.WindowInsetsAnimation.Bounds bounds) {
        this.f415876a = e3.d.d(bounds.getLowerBound());
        this.f415877b = e3.d.d(bounds.getUpperBound());
    }
}
