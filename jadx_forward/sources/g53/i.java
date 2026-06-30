package g53;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f350448d;

    /* renamed from: a, reason: collision with root package name */
    public static final g53.i f350445a = new g53.i();

    /* renamed from: b, reason: collision with root package name */
    public static final g53.h f350446b = new g53.h();

    /* renamed from: c, reason: collision with root package name */
    public static final g53.g f350447c = new g53.g();

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f350449e = 4;

    public static final void a(g53.i iVar) {
        iVar.getClass();
        int b17 = b();
        boolean z17 = b17 != 4;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5584x1426e7c7 c5584x1426e7c7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5584x1426e7c7();
        c5584x1426e7c7.f135906g.getClass();
        c5584x1426e7c7.e();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("isUnderWeakNet", z17);
            jSONObject.put("weakNetDetailFlags", b17);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "onNetworkChange");
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.toString());
            ((h80.k) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.j0.class))).getClass();
            com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle, tw4.a.class, null);
        } catch (org.json.JSONException unused) {
        }
    }

    public static final int b() {
        int i17 = f350448d ? 2 : 4;
        if (kz5.z.G(new java.lang.Integer[]{4, 6}, java.lang.Integer.valueOf(f350449e))) {
            return i17;
        }
        return 1;
    }
}
