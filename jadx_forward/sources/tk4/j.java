package tk4;

/* loaded from: classes11.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a f501521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f501522b;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a, boolean z17) {
        this.f501521a = c18711x7115b73a;
        this.f501522b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a = this.f501521a;
        if (i17 == 0 && fVar.f152149b == 0) {
            bw5.a50 mo11468x92b714fd = new bw5.a50().mo11468x92b714fd(((qk.t9) fVar.f152151d).f445871d);
            bw5.c2 c2Var = mo11468x92b714fd.f106560h[4] ? mo11468x92b714fd.f106557e : new bw5.c2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c2Var, "getPushConfig(...)");
            c18711x7115b73a.I = c2Var;
            long j17 = c2Var.f107415d;
            java.lang.String str = c18711x7115b73a.f256172a;
            if (j17 <= 0) {
                bw5.c2 c2Var2 = new bw5.c2();
                c2Var2.f107415d = 3600000L;
                c2Var2.f107417f[1] = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "saveAudioRootConfigs fail: interval_ms = " + c2Var.f107415d);
                c2Var = c2Var2;
            }
            try {
                gm4.a.f355090a.j(c18711x7115b73a.f256175d, android.util.Base64.encodeToString(c2Var.mo14344x5f01b1f6(), 0));
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "store in kv fail: %s", e17.getMessage());
            }
            java.util.LinkedList linkedList = mo11468x92b714fd.f106558f;
            bw5.d2 d2Var = linkedList != null ? (bw5.d2) kz5.n0.Z(linkedList) : null;
            boolean z17 = this.f501522b;
            if (d2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryShowPushTips fail, no need! audioPush null outdoor " + z17);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
                c6973x5d0a81b7.f142835d = c18711x7115b73a.f256181j;
                c6973x5d0a81b7.k();
            } else {
                int i18 = d2Var.f107818i;
                if (i18 == 1 || i18 == 2) {
                    o11.f fVar2 = new o11.f();
                    fVar2.f423611b = true;
                    fVar2.f423610a = true;
                    fVar2.f423629t = true;
                    o11.g a17 = fVar2.a();
                    n11.a b17 = n11.a.b();
                    bw5.e2 e2Var = d2Var.f107820n[7] ? d2Var.f107819m : new bw5.e2();
                    b17.i(e2Var.f108226g[3] ? e2Var.f108225f : "", null, a17, new tk4.n(c18711x7115b73a, z17, d2Var));
                } else {
                    c18711x7115b73a.i(d2Var, c18711x7115b73a.f256182k);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryShowPushTips fail! audioPush.contentType:" + d2Var.f107818i + ", not support! outdoor " + z17);
                }
            }
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7 c6973x5d0a81b72 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6973x5d0a81b7();
            c6973x5d0a81b72.f142835d = c18711x7115b73a.f256188q;
            c6973x5d0a81b72.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c18711x7115b73a.f256172a, "TingGetAudioConfigCGI fail, errType:" + fVar.f152148a + ", errCode:" + fVar.f152149b);
        }
        return jz5.f0.f384359a;
    }
}
