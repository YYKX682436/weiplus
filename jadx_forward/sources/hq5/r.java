package hq5;

/* loaded from: classes5.dex */
public final class r extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f364792d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f364793e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f364794f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f364795g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f364792d = jz5.h.b(new hq5.p(this));
        this.f364793e = jz5.h.b(new hq5.q(activity));
    }

    public final void T6() {
        boolean z17 = false;
        jq5.b.f382788a.b().G("is_first_send", false);
        try {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext().getSystemService("wifi");
            android.net.wifi.WifiManager wifiManager = systemService instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService : null;
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    z17 = true;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeDrop.WeDropPermissionManager", "[isWiFiEnable] error=" + e17);
        }
        if (z17) {
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.d());
                return;
            }
            return;
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new eq5.i(14));
        }
    }

    public final com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22930x873617e1 U6() {
        return (com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22930x873617e1) ((jz5.n) this.f364792d).mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r2 == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            r4 = this;
            com.tencent.mm.wedrop.ui.view.PermissionAreaView r0 = r4.U6()
            if (r0 == 0) goto L25
            java.util.List r0 = r0.f295824f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
            r2 = r1
        L10:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r0.next()
            com.tencent.mm.wedrop.ui.view.PermissionLineView r3 = (com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22931x315eebc8) r3
            boolean r3 = r3.g()
            r2 = r2 & r3
            goto L10
        L22:
            if (r2 != r1) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L36
            j75.f r0 = r4.Q6()
            if (r0 == 0) goto L36
            eq5.d r1 = new eq5.d
            r1.<init>()
            r0.B3(r1)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hq5.r.V6():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new hq5.o(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22930x873617e1 U6 = U6();
        boolean z17 = false;
        if (U6 != null && U6.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            V6();
        } else if (this.f364795g) {
            T6();
        }
    }
}
