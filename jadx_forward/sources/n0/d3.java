package n0;

/* loaded from: classes14.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f415016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f415017b;

    /* renamed from: c, reason: collision with root package name */
    public int f415018c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f415019d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f415020e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f415021f;

    public d3(java.util.List keyInfos, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyInfos, "keyInfos");
        this.f415016a = keyInfos;
        this.f415017b = i17;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException("Invalid start index".toString());
        }
        this.f415019d = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        int size = keyInfos.size();
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            n0.l2 l2Var = (n0.l2) this.f415016a.get(i19);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(l2Var.f415136c);
            int i27 = l2Var.f415137d;
            hashMap.put(valueOf, new n0.e2(i19, i18, i27));
            i18 += i27;
        }
        this.f415020e = hashMap;
        this.f415021f = jz5.h.b(new n0.c3(this));
    }

    public final int a(n0.l2 keyInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyInfo, "keyInfo");
        n0.e2 e2Var = (n0.e2) this.f415020e.get(java.lang.Integer.valueOf(keyInfo.f415136c));
        if (e2Var != null) {
            return e2Var.f415032b;
        }
        return -1;
    }

    public final boolean b(int i17, int i18) {
        int i19;
        java.util.HashMap hashMap = this.f415020e;
        n0.e2 e2Var = (n0.e2) hashMap.get(java.lang.Integer.valueOf(i17));
        if (e2Var == null) {
            return false;
        }
        int i27 = e2Var.f415032b;
        int i28 = i18 - e2Var.f415033c;
        e2Var.f415033c = i18;
        if (i28 == 0) {
            return true;
        }
        java.util.Collection<n0.e2> values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "groupInfos.values");
        for (n0.e2 e2Var2 : values) {
            if (e2Var2.f415032b >= i27 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e2Var2, e2Var) && (i19 = e2Var2.f415032b + i28) >= 0) {
                e2Var2.f415032b = i19;
            }
        }
        return true;
    }
}
