package pd5;

/* loaded from: classes9.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final pd5.k f435113b = new pd5.k(null);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class[] f435114c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f435115d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f435116e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f435117a = new int[8];

    static {
        java.lang.Class[] clsArr = {com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20102x43e17dd6.class, com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20108x5f4ea5a6.class, com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20105x7a1371d7.class, com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2520x2ff57c.C20084x27a09d7d.class, com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20106xfa5a3ca3.class, com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20103xeae93e71.class, com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20104xc7ce92cc.class, com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20097x45cad97d.class};
        f435114c = clsArr;
        java.util.ArrayList arrayList = new java.util.ArrayList(clsArr.length);
        for (java.lang.Class cls : clsArr) {
            arrayList.add(((q55.e) cls.newInstance()).k());
        }
        f435115d = arrayList;
        f435116e = new java.util.LinkedHashMap();
    }

    public l() {
        a();
    }

    public final boolean a() {
        boolean z17 = false;
        for (int i17 = 0; i17 < 8; i17++) {
            int c17 = j62.e.g().c((q55.e) f435114c[i17].newInstance());
            int[] iArr = this.f435117a;
            if (c17 != iArr[i17]) {
                iArr[i17] = c17;
                z17 = true;
            }
        }
        return z17;
    }
}
