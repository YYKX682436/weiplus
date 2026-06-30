package jm0;

/* loaded from: classes5.dex */
public final class e implements p012xc85e97e9.p093xedfae76a.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jm0.o f381798a;

    public e(jm0.o oVar) {
        this.f381798a = oVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        java.lang.Object newInstance = modelClass.getConstructor(jm0.o.class).newInstance(this.f381798a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
        return (p012xc85e97e9.p093xedfae76a.c1) newInstance;
    }
}
