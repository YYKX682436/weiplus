package kc2;

/* loaded from: classes15.dex */
public final class o implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kc2.q f387997a;

    public o(kc2.q qVar) {
        this.f387997a = qVar;
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        java.lang.Integer value = (java.lang.Integer) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f387997a.f388007e.put(key, value);
    }
}
