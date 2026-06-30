package um;

/* loaded from: classes10.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static final um.f f510211c = new um.f();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f510212a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public java.util.Stack f510213b = new java.util.Stack();

    public qk.g6 a() {
        return this.f510213b.empty() ? qk.g6.DEFAULT : (qk.g6) this.f510213b.pop();
    }

    public void b(java.lang.String str) {
        java.util.HashMap hashMap = this.f510212a;
        if (hashMap.containsKey(str)) {
            this.f510213b = (java.util.Stack) hashMap.get(str);
        } else {
            hashMap.put(str, new java.util.Stack());
        }
    }
}
