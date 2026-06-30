package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.RoamServiceInitializer$wifiEventReceiver$1 f92632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f92633e;

    public k2(com.tencent.mm.plugin.backup.roambackup.RoamServiceInitializer$wifiEventReceiver$1 roamServiceInitializer$wifiEventReceiver$1, android.content.Context context, android.content.Intent intent) {
        this.f92632d = roamServiceInitializer$wifiEventReceiver$1;
        this.f92633e = intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r0.getState() == android.net.NetworkInfo.State.CONNECTED) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r0 == 3) goto L26;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            int r0 = com.tencent.mm.plugin.backup.roambackup.RoamServiceInitializer$wifiEventReceiver$1.f92559a
            com.tencent.mm.plugin.backup.roambackup.RoamServiceInitializer$wifiEventReceiver$1 r0 = r7.f92632d
            r0.getClass()
            android.content.Intent r0 = r7.f92633e
            java.lang.String r1 = r0.getAction()
            if (r1 == 0) goto Lae
            int r2 = r1.hashCode()
            r3 = -1875733435(0xffffffff90329445, float:-3.5218533E-29)
            r4 = 0
            java.lang.String r5 = "MM.RoamBackup.RoamServiceInitializer"
            r6 = 1
            if (r2 == r3) goto L6f
            r3 = -343630553(0xffffffffeb849d27, float:-3.2064068E26)
            if (r2 == r3) goto L23
            goto Lae
        L23:
            java.lang.String r2 = "android.net.wifi.STATE_CHANGE"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2d
            goto Lae
        L2d:
            java.lang.String r1 = "networkInfo"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "Fail to get network info from intent"
            com.tencent.mars.xlog.Log.w(r5, r0)
            goto Lae
        L3c:
            android.net.NetworkInfo r0 = (android.net.NetworkInfo) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Affroam network change: type="
            r1.<init>(r2)
            int r2 = r0.getType()
            r1.append(r2)
            java.lang.String r2 = ", state="
            r1.append(r2)
            android.net.NetworkInfo$State r2 = r0.getState()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r5, r1)
            int r1 = r0.getType()
            if (r1 == r6) goto L66
            goto Lae
        L66:
            android.net.NetworkInfo$State r0 = r0.getState()
            android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.CONNECTED
            if (r0 != r1) goto L95
            goto L93
        L6f:
            java.lang.String r2 = "android.net.wifi.WIFI_STATE_CHANGED"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L78
            goto Lae
        L78:
            java.lang.String r1 = "wifi_state"
            int r0 = r0.getIntExtra(r1, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Affroam network change: wifiState="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r5, r1)
            r1 = 3
            if (r0 != r1) goto L95
        L93:
            r0 = r6
            goto L96
        L95:
            r0 = r4
        L96:
            com.tencent.wechat.aff.affroam.c0 r1 = new com.tencent.wechat.aff.affroam.c0
            r1.<init>()
            r1.f215804g = r4
            r1.f215801d = r6
            java.lang.String r2 = ""
            r1.f215803f = r2
            r1.f215802e = r0
            com.tencent.mm.plugin.backup.roambackup.u r0 = com.tencent.mm.plugin.backup.roambackup.u.f92737a
            com.tencent.wechat.aff.affroam.p1 r0 = r0.d()
            r0.j(r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.backup.roambackup.k2.run():void");
    }
}
