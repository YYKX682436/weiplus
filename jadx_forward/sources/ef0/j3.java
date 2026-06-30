package ef0;

@j95.b
/* loaded from: classes8.dex */
public final class j3 extends i95.w implements qk.u8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f333773d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f333774e = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f333775f;

    public j3() {
        new java.util.concurrent.CopyOnWriteArraySet();
        this.f333775f = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public boolean Ai(rk4.o5 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        return this.f333773d.remove(listener);
    }

    public void wi(rk4.o5 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f333773d.add(listener);
    }
}
