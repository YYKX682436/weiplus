package x44;

/* loaded from: classes4.dex */
public final class s extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.f66875xa013b0d5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FollowBrand", "username is empty!!");
            b(g("username is empty!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
        } else {
            if (f()) {
                p(optString, new x44.o(this));
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(dm.i4.f66875xa013b0d5, optString);
                i(bundle);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
        }
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, dm.i4.f66875xa013b0d5);
        if (k17 == null) {
            k17 = "";
        }
        q(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "error", -1), k17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, dm.i4.f66875xa013b0d5);
        if (k17 == null) {
            k17 = "";
        }
        p(k17, new x44.q(bVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r4.r2() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.lang.String r19, yz5.p r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "request"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            java.lang.Class<vg3.x3> r4 = vg3.x3.class
            lm0.a r4 = gm0.j1.s(r4)
            vg3.x3 r4 = (vg3.x3) r4
            com.tencent.mm.plugin.messenger.foundation.h2 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r4
            com.tencent.mm.storage.k4 r4 = r4.Bi()
            r5 = 0
            if (r4 == 0) goto L31
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r19)
            if (r6 != 0) goto L31
            r6 = 1
            com.tencent.mm.storage.z3 r4 = r4.n(r0, r6)
            if (r4 == 0) goto L31
            boolean r4 = r4.r2()
            if (r4 == 0) goto L31
            goto L32
        L31:
            r6 = r5
        L32:
            if (r6 == 0) goto L3f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1.mo149xb9724478(r4, r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return
        L3f:
            x44.r r4 = new x44.r
            r5 = r18
            r4.<init>(r1, r5)
            java.lang.String r1 = "followRequest"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r3)
            java.lang.String r6 = "whichNetScene"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r3)
            boolean r7 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(r19)
            if (r7 == 0) goto L7b
            java.lang.Class<ab0.b0> r7 = ab0.b0.class
            i95.m r7 = i95.n0.c(r7)
            ab0.b0 r7 = (ab0.b0) r7
            za0.k r7 = (za0.k) r7
            r7.getClass()
            l41.o r7 = new l41.o
            r8 = 0
            java.lang.String r9 = ""
            r7.<init>(r0, r9, r8)
            jz5.l r0 = new jz5.l
            r8 = 667(0x29b, float:9.35E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.<init>(r7, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r3)
            goto Lc5
        L7b:
            r7 = 79
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.List r11 = kz5.b0.c(r7)
            java.util.List r10 = kz5.b0.c(r19)
            java.lang.Class<ns.k> r0 = ns.k.class
            i95.m r0 = i95.n0.c(r0)
            ns.k r0 = (ns.k) r0
            r9 = 1
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            r15 = 0
            java.lang.String r16 = ""
            r17 = 0
            ms.a r0 = (ms.a) r0
            r0.getClass()
            com.tencent.mm.pluginsdk.model.m3 r0 = new com.tencent.mm.pluginsdk.model.m3
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r45.hy6 r7 = new r45.hy6
            r7.<init>()
            r8 = 2
            r7.f458090d = r8
            r0.P(r7)
            jz5.l r7 = new jz5.l
            r8 = 30
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.<init>(r0, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r3)
            r0 = r7
        Lc5:
            com.tencent.mm.modelbase.r1 r6 = gm0.j1.d()
            java.lang.Object r7 = r0.f384366d
            com.tencent.mm.modelbase.m1 r7 = (com.p314xaae8f345.mm.p944x882e457a.m1) r7
            r6.g(r7)
            com.tencent.mm.modelbase.r1 r6 = gm0.j1.d()
            java.lang.Object r0 = r0.f384367e
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            int r0 = r0.intValue()
            x44.p r8 = new x44.p
            r8.<init>(r4, r0)
            r6.a(r7, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r3)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x44.s.p(java.lang.String, yz5.p):void");
    }

    public final void q(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
        if (i17 != 0 || android.text.TextUtils.isEmpty(str)) {
            b(w44.d.k(this, -1, "follow user failed", null, 4, null));
        } else {
            b(l());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser");
    }
}
