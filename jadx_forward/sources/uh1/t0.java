package uh1;

/* loaded from: classes7.dex */
public class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f509437b = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f509438a = new java.util.HashMap();

    public t0(uh1.r0 r0Var) {
    }

    public mf1.i a(java.lang.String str) {
        java.util.HashMap hashMap = this.f509438a;
        if (hashMap.containsKey(str)) {
            return (mf1.i) hashMap.get(str);
        }
        return null;
    }
}
