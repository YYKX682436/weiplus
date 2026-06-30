package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class q2 implements w0.s {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f10705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.s f10706b;

    public q2(w0.s saveableStateRegistry, yz5.a onDispose) {
        kotlin.jvm.internal.o.g(saveableStateRegistry, "saveableStateRegistry");
        kotlin.jvm.internal.o.g(onDispose, "onDispose");
        this.f10705a = onDispose;
        this.f10706b = saveableStateRegistry;
    }

    @Override // w0.s
    public java.util.Map a() {
        return this.f10706b.a();
    }

    @Override // w0.s
    public boolean b(java.lang.Object value) {
        kotlin.jvm.internal.o.g(value, "value");
        return this.f10706b.b(value);
    }

    @Override // w0.s
    public java.lang.Object c(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return this.f10706b.c(key);
    }

    @Override // w0.s
    public w0.r d(java.lang.String key, yz5.a valueProvider) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(valueProvider, "valueProvider");
        return this.f10706b.d(key, valueProvider);
    }
}
