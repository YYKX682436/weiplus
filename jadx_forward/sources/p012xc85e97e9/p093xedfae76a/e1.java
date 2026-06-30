package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes5.dex */
public class e1 extends p012xc85e97e9.p093xedfae76a.h1 {

    /* renamed from: c, reason: collision with root package name */
    public static p012xc85e97e9.p093xedfae76a.e1 f93154c;

    /* renamed from: b, reason: collision with root package name */
    public final android.app.Application f93155b;

    public e1(android.app.Application application) {
        this.f93155b = application;
    }

    @Override // p012xc85e97e9.p093xedfae76a.h1, p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class cls) {
        if (!p012xc85e97e9.p093xedfae76a.a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            return (p012xc85e97e9.p093xedfae76a.c1) cls.getConstructor(android.app.Application.class).newInstance(this.f93155b);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e18);
        } catch (java.lang.NoSuchMethodException e19) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e19);
        } catch (java.lang.reflect.InvocationTargetException e27) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e27);
        }
    }
}
