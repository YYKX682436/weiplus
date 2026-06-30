package uh1;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f509331b = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f509332a = new java.util.HashMap();

    public i(uh1.g gVar) {
    }

    public uh1.f a(java.lang.String str) {
        java.util.HashMap hashMap = this.f509332a;
        if (hashMap.containsKey(str)) {
            return (uh1.f) hashMap.get(str);
        }
        return null;
    }
}
