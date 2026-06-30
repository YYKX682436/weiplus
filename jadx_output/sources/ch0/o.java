package ch0;

/* loaded from: classes8.dex */
public final class o implements qx4.d {

    /* renamed from: a, reason: collision with root package name */
    public final tg0.b2 f41245a;

    public o(tg0.b2 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f41245a = callback;
    }

    @Override // qx4.d
    public void onReady() {
        this.f41245a.b();
    }
}
