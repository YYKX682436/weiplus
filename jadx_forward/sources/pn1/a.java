package pn1;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f438495a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f438496b;

    public a(java.lang.String str) {
        this.f438495a = null;
        this.f438496b = true;
        java.util.Map a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p7.a(str);
        this.f438495a = a17;
        if (a17 == null) {
            this.f438496b = false;
            this.f438495a = new java.util.HashMap();
        }
    }

    public final int a(java.lang.String str) {
        java.util.Map map = this.f438495a;
        if (((java.util.HashMap) map).containsKey(str)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) ((java.util.HashMap) map).get(str), 0);
        }
        return 0;
    }
}
