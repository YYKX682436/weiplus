package o4;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f424335b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Bundle f424336c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f424337d;

    /* renamed from: e, reason: collision with root package name */
    public o4.a f424338e;

    /* renamed from: a, reason: collision with root package name */
    public final q.h f424334a = new q.h();

    /* renamed from: f, reason: collision with root package name */
    public boolean f424339f = true;

    public final android.os.Bundle a(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (!this.f424337d) {
            throw new java.lang.IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        android.os.Bundle bundle = this.f424336c;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        android.os.Bundle bundle3 = this.f424336c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        android.os.Bundle bundle4 = this.f424336c;
        boolean z17 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z17 = true;
        }
        if (!z17) {
            this.f424336c = null;
        }
        return bundle2;
    }

    public final void b(java.lang.String key, o4.d provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        if (!(((o4.d) this.f424334a.e(key, provider)) == null)) {
            throw new java.lang.IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void c(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        if (!this.f424339f) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        o4.a aVar = this.f424338e;
        if (aVar == null) {
            aVar = new o4.a(this);
        }
        this.f424338e = aVar;
        try {
            clazz.getDeclaredConstructor(new java.lang.Class[0]);
            o4.a aVar2 = this.f424338e;
            if (aVar2 != null) {
                aVar2.f424333a.add(clazz.getName());
            }
        } catch (java.lang.NoSuchMethodException e17) {
            throw new java.lang.IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e17);
        }
    }
}
