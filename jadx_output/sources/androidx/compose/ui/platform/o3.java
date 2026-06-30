package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class o3 implements z0.v {

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f10676d = n0.s4.c(java.lang.Float.valueOf(1.0f), null, 2, null);

    @Override // oz5.l
    public java.lang.Object fold(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.a(this, key);
    }

    @Override // oz5.i
    public oz5.j getKey() {
        return z0.u.f468923d;
    }

    @Override // oz5.l
    public oz5.l minusKey(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.b(this, key);
    }

    @Override // oz5.l
    public oz5.l plus(oz5.l context) {
        kotlin.jvm.internal.o.g(context, "context");
        return oz5.g.a(this, context);
    }
}
