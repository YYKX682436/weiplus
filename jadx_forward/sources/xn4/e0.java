package xn4;

/* loaded from: classes11.dex */
public final class e0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static final xn4.e0 f537147d = new xn4.e0();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f537148e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f537149f = "";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f537150g = "";

    /* renamed from: h, reason: collision with root package name */
    public static org.json.JSONArray f537151h = new org.json.JSONArray();

    /* renamed from: i, reason: collision with root package name */
    public static org.json.JSONArray f537152i = new org.json.JSONArray();

    /* renamed from: m, reason: collision with root package name */
    public static java.util.List f537153m = kz5.c0.i(f537151h, f537152i, new org.json.JSONArray());

    /* renamed from: n, reason: collision with root package name */
    public static r45.mm6 f537154n = new r45.mm6();

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.List f537155o;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f537155o = arrayList;
        xn4.d0 d0Var = xn4.d0.f537145d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateManager", "init!");
        arrayList.add(new java.lang.ref.WeakReference(d0Var));
    }

    public e0() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.mm6 b() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn4.e0.b():r45.mm6");
    }

    public final void c(java.lang.String md52) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XUpdate.XUpdateManager", "ignoreVersion: ".concat(md52));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_IGNORE_NEWAPKMD5").putString(md52, md52);
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).bj();
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Zi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if ((r2.length() == 0) == false) goto L30;
     */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 r6) {
        /*
            r5 = this;
            com.tencent.mm.autogen.events.ConfigUpdatedEvent r6 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21) r6
            java.lang.String r0 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            r0 = 0
            am.k3 r6 = r6.f135605g
            if (r6 != 0) goto Le
            goto L87
        Le:
            boolean r1 = o45.wf.f424564i
            if (r1 != 0) goto L87
            java.lang.String r1 = r6.f88659a
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r1 != 0) goto L87
            java.lang.String r6 = r6.f88659a
            java.lang.String r1 = "configName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r1)
            java.lang.String r1 = "clicfg_full_pkg_update_url_params"
            boolean r6 = r26.n0.B(r6, r1, r0)
            if (r6 != 0) goto L2a
            goto L87
        L2a:
            java.lang.String r6 = "MicroMsg.XUpdate.XUpdateManager"
            java.lang.String r1 = "ConfigUpdatedEvent"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
            r6 = 1
            java.lang.String r1 = "X Config Callback"
            r5.h(r6, r1)
            java.lang.Class<un4.e> r1 = un4.e.class
            i95.m r1 = i95.n0.c(r1)
            un4.e r1 = (un4.e) r1
            tn4.o r1 = (tn4.o) r1
            r1.getClass()
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r3 = "UpdaterConfigSharedPreferences"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            java.lang.String r3 = "getSharedPreferences(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.lang.String r3 = "KeyXUpdateVersion"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            if (r2 != 0) goto L5c
            goto L5d
        L5c:
            r4 = r2
        L5d:
            int r2 = r4.length()
            if (r2 <= 0) goto L65
            r2 = r6
            goto L66
        L65:
            r2 = r0
        L66:
            if (r2 == 0) goto L87
            xn4.e0 r2 = xn4.e0.f537147d
            r45.mm6 r2 = r2.b()
            java.lang.String r2 = r2.f462204g
            if (r2 == 0) goto L7e
            int r2 = r2.length()
            if (r2 != 0) goto L7a
            r2 = r6
            goto L7b
        L7a:
            r2 = r0
        L7b:
            if (r2 != 0) goto L7e
            goto L7f
        L7e:
            r6 = r0
        L7f:
            if (r6 != 0) goto L87
            r1.bj()
            r1.Zi()
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xn4.e0.mo778xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    public final boolean f(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_IGNORE_NEWAPKMD5").f(str);
    }

    public final void h(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateManager", "setNeedNotifyFlag:" + z17 + " from " + str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_COMM_KV").putBoolean("MMKV_KEY_NeedNotifyFlag", z17);
    }
}
