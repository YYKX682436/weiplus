package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes5.dex */
public class h1 implements p012xc85e97e9.p093xedfae76a.f1 {

    /* renamed from: a, reason: collision with root package name */
    public static p012xc85e97e9.p093xedfae76a.h1 f93163a;

    @Override // p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class cls) {
        try {
            return (p012xc85e97e9.p093xedfae76a.c1) cls.newInstance();
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e18);
        }
    }
}
