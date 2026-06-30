package o4;

/* loaded from: classes13.dex */
public final class a implements o4.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f424333a;

    public a(o4.b registry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(registry, "registry");
        this.f424333a = new java.util.LinkedHashSet();
        registry.b("androidx.savedstate.Restarter", this);
    }

    @Override // o4.d
    public android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArrayList("classes_to_restore", new java.util.ArrayList<>(this.f424333a));
        return bundle;
    }
}
