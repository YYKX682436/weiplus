package jm0;

/* loaded from: classes4.dex */
public final class j implements p012xc85e97e9.p093xedfae76a.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jm0.k f381801a;

    public j(jm0.k kVar) {
        this.f381801a = kVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        java.lang.Object newInstance = modelClass.getConstructor(n75.b.class).newInstance(this.f381801a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
        return (p012xc85e97e9.p093xedfae76a.c1) newInstance;
    }
}
