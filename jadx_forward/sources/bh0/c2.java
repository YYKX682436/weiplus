package bh0;

/* loaded from: classes13.dex */
public class c2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c2() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 r12) {
        /*
            r11 = this;
            com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent r12 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80) r12
            boolean r12 = r12 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80
            r0 = 0
            if (r12 == 0) goto Lae
            java.lang.Class<c25.e> r12 = c25.e.class
            lm0.a r12 = gm0.j1.s(r12)
            c25.e r12 = (c25.e) r12
            com.tencent.mm.plugin.zero.a r12 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r12
            ip.j r12 = r12.b()
            java.lang.String r1 = "WebKernelMode"
            r2 = -1
            int r12 = r12.b(r1, r2)
            com.tencent.xweb.b r1 = com.p314xaae8f345.p3210x3857dc.b.m()
            java.lang.String r2 = "disable_ip_type_change"
            java.lang.String r3 = "tools"
            boolean r1 = r1.h(r2, r3, r0)
            java.lang.String r2 = "XWebSdkInternal"
            if (r1 == 0) goto L32
            java.lang.String r12 = "setIpType, ip type change disabled"
            by5.c4.f(r2, r12)
            goto L89
        L32:
            android.content.SharedPreferences r1 = by5.d4.f()
            r3 = -2
            java.lang.String r4 = "IP_TYPE"
            int r1 = r1.getInt(r4, r3)
            if (r12 == r1) goto L89
            android.content.SharedPreferences r3 = by5.d4.f()
            android.content.SharedPreferences$Editor r3 = r3.edit()
            android.content.SharedPreferences$Editor r3 = r3.putInt(r4, r12)
            r3.commit()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "setIpType, ip type changed from "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = " to "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            by5.c4.f(r2, r3)
            r2 = 1
            if (r1 != 0) goto L72
            if (r12 != r2) goto L72
            r3 = 197(0xc5, double:9.73E-322)
            by5.s0.d(r3, r2)
            goto L7b
        L72:
            if (r1 != r2) goto L7b
            if (r12 != 0) goto L7b
            r3 = 198(0xc6, double:9.8E-322)
            by5.s0.d(r3, r2)
        L7b:
            if (r1 > 0) goto L7f
            if (r12 <= 0) goto L89
        L7f:
            r5 = 1749(0x6d5, double:8.64E-321)
            r7 = 28
            r9 = 1
            by5.s0.e(r5, r7, r9)
            goto L8a
        L89:
            r2 = r0
        L8a:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r1 = "WvUpdateDynamicConfig"
            java.lang.String r3 = "updateWebViewDynamicConfig, need check update xwalk:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r12)
            if (r2 == 0) goto Lae
            java.lang.Class<sh0.e> r12 = sh0.e.class
            i95.m r12 = i95.n0.c(r12)
            sh0.e r12 = (sh0.e) r12
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            th0.a0 r12 = (th0.a0) r12
            r12.getClass()
            r12 = 5
            com.p314xaae8f345.mm.p2829xfa87f9de.u0.a(r1, r12)
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bh0.c2.mo778xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
