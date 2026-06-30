package zj0;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f554818a = new java.lang.ThreadLocal();

    public static zj0.a a() {
        java.lang.ThreadLocal threadLocal = f554818a;
        zj0.a aVar = (zj0.a) threadLocal.get();
        threadLocal.remove();
        return aVar;
    }

    public static zj0.a b(boolean z17, zj0.a aVar) {
        aVar.c(java.lang.Boolean.valueOf(z17));
        return aVar;
    }

    public static zj0.a c(int i17, zj0.a aVar) {
        aVar.c(java.lang.Integer.valueOf(i17));
        return aVar;
    }
}
