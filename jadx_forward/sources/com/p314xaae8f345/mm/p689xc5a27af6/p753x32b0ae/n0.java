package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 f148758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f148759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 f148760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f148761g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q80.s f148762h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData f148763i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148764m;

    public n0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, android.os.Bundle bundle, q80.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData) {
        this.f148764m = iVar;
        this.f148758d = c3717xac6c2329;
        this.f148759e = c3712x3ed8a441;
        this.f148760f = c3707xe60c5943;
        this.f148761g = bundle;
        this.f148762h = sVar;
        this.f148763i = openExtraData;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80;
        java.lang.String str;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f148759e;
        java.lang.String str2 = c3712x3ed8a441.f14359x58b7f1c;
        com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = this.f148758d;
        c3717xac6c2329.f127584r = str2;
        java.lang.String str3 = c3712x3ed8a441.f14369x346425;
        c3717xac6c2329.f127589w = str3;
        java.lang.String str4 = c3712x3ed8a441.f14372xa8503287;
        c3717xac6c2329.f127588v = str4;
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = this.f148764m;
        java.lang.String Ej = iVar.Ej(str3, str2, str4);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.f148760f;
        if (c3707xe60c5943.I != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ej)) {
            c3707xe60c5943.I.mo28901xc633a616(Ej);
        }
        android.os.Bundle bundle = this.f148761g;
        if (bundle.containsKey(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
            c3717xac6c2329.f127585s = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        }
        java.lang.String string = bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
        boolean isEmpty = string.isEmpty();
        q80.s sVar = this.f148762h;
        if (!isEmpty && !com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65267x91e5a229(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "open Liteapp in view fail, session ID already has an active instance");
            if (sVar != null) {
                sVar.mo9542x2fd71e();
                return;
            }
            return;
        }
        c3717xac6c2329.f127587u = string;
        if (bundle.containsKey("query")) {
            c3717xac6c2329.f127586t = bundle.getString("query");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData = this.f148763i;
        if (openExtraData != null && (str = openExtraData.f37266x83282d6d) != null) {
            c3708xc1f46f80 = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80.m28986x81e0d263(str);
        } else if (bundle.containsKey("liteappReferrerInfo")) {
            c3708xc1f46f80 = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80) bundle.getParcelable("liteappReferrerInfo");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "no referrer info found");
            c3708xc1f46f80 = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.h(c3712x3ed8a441.f14359x58b7f1c, c3717xac6c2329.f127585s, c3717xac6c2329.f127586t, c3708xc1f46f80);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        oVar.d();
        iVar.ij(c3712x3ed8a441.f14359x58b7f1c, c3717xac6c2329.f127585s);
        iVar.Xj();
        oVar.b(7, c3707xe60c5943);
        boolean z17 = bundle.getBoolean("forbidSharedEngineGroup", false);
        if ((kx5.n.h().f394854k != null) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && !z17) {
            kx5.n.h().n(new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.o0(this));
        } else {
            c3717xac6c2329.f();
            ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) iVar.f148707i).computeIfAbsent(c3717xac6c2329.f127584r, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10631x624771f())).add(java.lang.Long.valueOf(c3717xac6c2329.mo28563xe7b2546()));
            ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) iVar.f148708m).computeIfAbsent(c3717xac6c2329.f127584r, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.C10632x6247720())).add(c3717xac6c2329.f127587u);
            if (sVar != null) {
                sVar.a(c3717xac6c2329);
            }
        }
        m93.i.INSTANCE.b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65301x1743ea71(c3712x3ed8a441.f14369x346425, c3712x3ed8a441.f14359x58b7f1c, c3712x3ed8a441.f14372xa8503287, true), 0);
    }
}
