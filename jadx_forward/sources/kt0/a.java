package kt0;

/* loaded from: classes15.dex */
public class a implements lt0.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f393436a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f393437b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f393438c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f393439d;

    /* renamed from: e, reason: collision with root package name */
    public final int f393440e;

    /* renamed from: f, reason: collision with root package name */
    public final long f393441f;

    public a(java.lang.String str, java.lang.String str2, java.lang.Object obj, int i17, kk.h hVar, kk.i iVar) {
        this.f393440e = 0;
        this.f393441f = 0L;
        this.f393436a = str;
        this.f393437b = str2;
        this.f393438c = obj;
        this.f393440e = i17;
        this.f393439d = new java.lang.ref.WeakReference(hVar);
        new java.lang.ref.WeakReference(iVar);
        this.f393441f = java.lang.System.currentTimeMillis();
        lt0.a aVar = lt0.a.f402695c;
    }

    /* renamed from: equals */
    public boolean m144319xb2c87fbf(java.lang.Object obj) {
        java.lang.Object obj2;
        return (obj == null || !(obj instanceof kt0.a) || (obj2 = ((kt0.a) obj).f393438c) == null) ? super.equals(obj) : obj2.equals(this.f393438c);
    }

    /* renamed from: hashCode */
    public int m144320x8cdac1b() {
        java.lang.Object obj = this.f393438c;
        return obj != null ? obj.hashCode() : super.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m144321x9616526c() {
        return java.lang.String.format("StructBitmap %s key:%s size %s realObj %s cacheTime %s now %s", java.lang.Integer.valueOf(m144320x8cdac1b()), this.f393436a, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(this.f393440e), this.f393438c, java.lang.Long.valueOf(this.f393441f), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
