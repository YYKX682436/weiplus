package zd3;

/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.f f553141d;

    public e(zd3.f fVar) {
        this.f553141d = fVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b c16466x1a72912b = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b) obj;
        int i17 = c16466x1a72912b.f229692d;
        zd3.f fVar = this.f553141d;
        if (i17 == 0) {
            java.lang.String str = c16466x1a72912b.f229694f;
            if (str != null) {
                rk0.c.c("MB_External_surface", "prepareResourceForExternalTexture success, result: ".concat(str), new java.lang.Object[0]);
                yz5.l s17 = fVar.s();
                lc3.a0 a0Var = new lc3.a0();
                a0Var.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, new org.json.JSONObject(str));
                fVar.m(a0Var);
                s17.mo146xb9724478(a0Var);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareResourceForExternalTexture failed, errCode: ");
        int i18 = c16466x1a72912b.f229692d;
        sb6.append(i18);
        sb6.append(", errMsg: ");
        java.lang.String str2 = c16466x1a72912b.f229693e;
        sb6.append(str2);
        rk0.c.b("MB_External_surface", sb6.toString(), new java.lang.Object[0]);
        yz5.l s18 = fVar.s();
        if (str2 == null) {
            str2 = "unknown error";
        }
        s18.mo146xb9724478(fVar.h(i18, str2));
    }
}
