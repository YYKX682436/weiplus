package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes12.dex */
public class w5 implements sw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6 f264034a;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6 l6Var) {
        this.f264034a = l6Var;
    }

    @Override // sw4.e
    public void a(android.os.Bundle bundle) {
    }

    @Override // sw4.e
    public void f(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6 l6Var = this.f264034a;
        if (bundle == null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n5) l6Var.f263924f).a(false, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String string = bundle.getString("media_id");
        java.lang.String string2 = bundle.getString("media_url");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (string == null) {
            string = "";
        }
        hashMap.put("serverId", string);
        if (string2 == null) {
            string2 = "";
        }
        hashMap.put("mediaUrl", string2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n5) l6Var.f263924f).a(true, hashMap);
    }
}
