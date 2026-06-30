package uh1;

/* loaded from: classes7.dex */
public class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f509329b = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f509330a = new java.util.HashMap();

    public h0(uh1.f0 f0Var) {
    }

    public uh1.e0 a(java.lang.String str) {
        java.util.HashMap hashMap = this.f509330a;
        if (hashMap.containsKey(str)) {
            return (uh1.e0) hashMap.get(str);
        }
        return null;
    }
}
