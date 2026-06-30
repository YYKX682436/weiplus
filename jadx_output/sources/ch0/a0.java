package ch0;

/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f41191a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final kz5.q f41192b = new kz5.q();

    public final int a() {
        kz5.q qVar = this.f41192b;
        if (qVar.isEmpty()) {
            return -1;
        }
        if (qVar.isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return ((java.lang.Number) qVar.f313999e[qVar.n(qVar.f313998d + kz5.c0.h(qVar))]).intValue();
    }

    public final ch0.z b() {
        int a17 = a();
        return (ch0.z) ((java.util.LinkedHashMap) this.f41191a).get(java.lang.Integer.valueOf(a17));
    }
}
