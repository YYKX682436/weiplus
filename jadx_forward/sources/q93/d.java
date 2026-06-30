package q93;

/* loaded from: classes8.dex */
public class d implements q80.j0 {

    /* renamed from: a, reason: collision with root package name */
    public nw4.n f442446a;

    /* renamed from: b, reason: collision with root package name */
    public long f442447b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f442448c = 0;

    public d() {
        if (this.f442446a != null) {
            return;
        }
        try {
            this.f442446a = a(this, "liteapp", "wxaliteapp", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        } catch (java.lang.ClassNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public nw4.n a(q93.d dVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3) {
        int hashCode = hashCode();
        if (q93.j.f442460c == null) {
            q93.j.f442460c = new q93.j();
        }
        nw4.n nVar = new nw4.n((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) null, (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w) null, hashCode, q93.j.f442460c);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
        bundle.putString("appId", str2);
        nVar.H = c19775x58fd37b3;
        nVar.I = bundle;
        nVar.f422419J = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3 m3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3.f263419a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.B;
        m3Var.a(true, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.class, new q93.b(this, nVar, dVar, hashCode));
        return nVar;
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar, nw4.y2 y2Var) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3.f34512x24728b.equals(pVar.f380556d)) {
            if (pVar.c() instanceof com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7) {
                y2Var.f422323a.put("liteAppNavigationBarHeight", java.lang.Integer.valueOf(((com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7) pVar.c()).F));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiBridgeWebViewHandler", "appBridgeWebViewJsApi.getContext(): " + pVar.c());
            }
        }
    }
}
