package s56;

/* loaded from: classes16.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final s56.j f484748a = new s56.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f484749b = new s56.g();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f484750c = new s56.h();

    public boolean a(p56.m mVar, java.lang.Object obj) {
        if (obj == f484749b) {
            mVar.mo157868xaa8b332c();
            return true;
        }
        if (obj == f484750c) {
            mVar.a(null);
            return false;
        }
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("The lite notification can not be null");
        }
        if (obj.getClass() == s56.i.class) {
            mVar.mo157869xaf8aa769(((s56.i) obj).f484747d);
            return true;
        }
        mVar.a(obj);
        return false;
    }
}
