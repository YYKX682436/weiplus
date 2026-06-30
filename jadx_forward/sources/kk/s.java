package kk;

/* loaded from: classes9.dex */
public class s implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f390003d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f390004e;

    /* renamed from: f, reason: collision with root package name */
    public long f390005f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public int f390006g;

    public s(java.lang.Object obj, java.lang.Object obj2, int i17) {
        this.f390003d = obj;
        this.f390004e = obj2;
        this.f390006g = i17;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f390003d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f390004e;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("This node is read only");
    }
}
