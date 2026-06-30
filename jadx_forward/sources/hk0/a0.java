package hk0;

/* loaded from: classes3.dex */
public final class a0 implements p012xc85e97e9.p093xedfae76a.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f363224a;

    public a0(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f363224a = owner;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(hk0.u0.class)) {
            return new hk0.u0(this.f363224a);
        }
        throw new java.lang.IllegalArgumentException("Unknown ViewModel class");
    }
}
