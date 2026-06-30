package q93;

/* loaded from: classes.dex */
public class j implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f442459b;

    /* renamed from: c, reason: collision with root package name */
    public static q93.j f442460c;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f442459b = hashMap;
        hashMap.put("webTransfer", yx4.f.f549510d);
        f442460c = null;
    }

    @Override // nw4.j
    public boolean a(nw4.k kVar, nw4.y2 y2Var) {
        java.util.HashMap hashMap = f442459b;
        if (!hashMap.containsKey(y2Var.f422552i)) {
            return false;
        }
        qw4.a aVar = (qw4.a) hashMap.get(y2Var.f422552i);
        if (aVar != null) {
            int b17 = aVar.b();
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = kVar.f422394b;
            if (c19775x58fd37b3 != null ? c19775x58fd37b3.f(b17) : false) {
                aVar.a(kVar, y2Var);
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewJsApiPool", "handleMsg access denied func: %s", y2Var.f422552i);
        kVar.f422396d.e(y2Var.f422546c, "system:access_denied", null);
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k kVar, nw4.y2 y2Var) {
        return !f442459b.isEmpty() && kVar.f422396d.g() == this;
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String str) {
        java.util.HashMap hashMap = f442459b;
        if (hashMap.containsKey(str)) {
            return (qw4.a) hashMap.get(str);
        }
        return null;
    }
}
