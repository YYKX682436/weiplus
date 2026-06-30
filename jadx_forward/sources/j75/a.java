package j75;

/* loaded from: classes8.dex */
public abstract class a implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public j75.d f379599d;

    public final j75.d a(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        j75.d dVar = this.f379599d;
        if (dVar == null || !dVar.getClass().isAssignableFrom(clazz)) {
            return null;
        }
        return dVar;
    }

    public final void b(java.lang.Class clazz, j75.l handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        j75.d dVar = this.f379599d;
        if (dVar == null || !dVar.getClass().isAssignableFrom(clazz)) {
            return;
        }
        handler.a(dVar);
    }

    public final j75.a c() {
        java.lang.Object clone = super.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type com.tencent.mm.sdk.statecenter.BaseState");
        return (j75.a) clone;
    }

    /* renamed from: clone */
    public java.lang.Object mo8755x5a5dd5d() {
        return super.clone();
    }
}
