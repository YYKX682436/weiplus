package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class n1 {

    /* renamed from: p, reason: collision with root package name */
    public static long f218428p;

    /* renamed from: q, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f218429q;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f218431b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.d1 f218432c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.d1 f218433d;

    /* renamed from: e, reason: collision with root package name */
    public hy4.s f218434e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f218435f;

    /* renamed from: g, reason: collision with root package name */
    public final kd0.p2 f218436g;

    /* renamed from: h, reason: collision with root package name */
    public hy4.h0 f218437h;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.ref.WeakReference f218443n;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f218430a = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218438i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f218439j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Long f218440k = 0L;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Long f218441l = 0L;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Long f218442m = 0L;

    /* renamed from: o, reason: collision with root package name */
    public final hy4.r f218444o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.w0(this);

    static {
        new java.util.HashMap();
        f218428p = 0L;
    }

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.q0 q0Var) {
        this.f218443n = new java.lang.ref.WeakReference(q0Var);
        if (f().mo63373x86b9ebe3() != null) {
            f().mo63373x86b9ebe3().setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.a1(this));
        }
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context context = f().getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.y0(this);
        ((jd0.q2) x2Var).getClass();
        this.f218436g = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(context, y0Var);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var, java.lang.String str) {
        n1Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.HashMap hashMap = n1Var.f218439j;
        if (hashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "do cancelRecogQBar:" + str);
            try {
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15495xad513397(str, ((java.lang.Long) hashMap.get(str)).longValue()), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l1.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.x0(n1Var));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewLongClickHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final void b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357) {
        java.lang.String str;
        hy4.h0 h0Var = this.f218437h;
        if (h0Var == null) {
            return;
        }
        h0Var.f367641b = this.f218438i;
        h0Var.f367643d = 40;
        if (c17261xe88a6357 != null) {
            h0Var.f367642c = true;
            h0Var.f367646g = c17261xe88a6357.f240153e == 22 ? "WX_CODE" : "QR_CODE";
            h0Var.f367645f = c17261xe88a6357.f240152d;
        }
        if (android.webkit.URLUtil.isDataUrl(this.f218431b)) {
            try {
                str = kk.r.b(this.f218431b);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "getSHA1 ex %s", e17.getMessage());
                str = "";
            }
        } else {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(this.f218431b);
        }
        hy4.h0 h0Var2 = this.f218437h;
        h0Var2.f367647h = str;
        h0Var2.a(i17);
    }

    public final android.content.Context c() {
        return f().getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r0.startsWith("http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f218438i
            java.lang.String r1 = "/s"
            java.lang.String r2 = "http://"
            java.lang.String r3 = "https://"
            r4 = 0
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r5.<init>(r3)     // Catch: java.lang.Exception -> L46
            r3 = 2131769611(0x7f10390b, float:1.9170502E38)
            java.lang.String r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(r3)     // Catch: java.lang.Exception -> L46
            r5.append(r6)     // Catch: java.lang.Exception -> L46
            r5.append(r1)     // Catch: java.lang.Exception -> L46
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L46
            boolean r5 = r0.startsWith(r5)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r5.<init>(r2)     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(r3)     // Catch: java.lang.Exception -> L46
            r5.append(r2)     // Catch: java.lang.Exception -> L46
            r5.append(r1)     // Catch: java.lang.Exception -> L46
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L46
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L50
        L44:
            r4 = 1
            goto L50
        L46:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "MicroMsg.WebViewLongClickHelper"
            java.lang.String r3 = "isMpUrl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r3, r1)
        L50:
            if (r4 == 0) goto L54
            r0 = 5
            return r0
        L54:
            r0 = 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1.d():int");
    }

    public final boolean e() {
        try {
            return f().mo63365x1e89676e().mo74369xe8158c5e();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu fail, ex = " + e17.getMessage());
            return false;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.q0 f() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.q0) this.f218443n.get();
    }

    public final boolean g() {
        try {
            if (f().mo63365x1e89676e() != null) {
                return f().mo63365x1e89676e().Yh();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "invoker is null");
            return false;
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "unable get config for Scan QRCode" + e17.getMessage());
            return false;
        }
    }

    public final boolean h() {
        return f() == null || f().getIsReleased();
    }

    public final boolean i(java.lang.String str) {
        if (h()) {
            return false;
        }
        if (!e()) {
            return true;
        }
        this.f218431b = str;
        if (this.f218435f == null) {
            this.f218435f = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(f().getContext(), 1, false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f218435f;
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.b1(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.c1(this, str);
        k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.d1(this));
        if (!f().getIsReleased()) {
            this.f218435f.v();
        }
        return this.f218435f.i();
    }

    public final boolean j(com.p314xaae8f345.p3210x3857dc.d1 d1Var) {
        boolean i17 = i(d1Var.f301773b);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f218430a) && f().mo63367xfb83db66().b().a() && g()) {
            this.f218433d = d1Var;
            hy4.s sVar = new hy4.s();
            this.f218434e = sVar;
            sVar.a(f().mo63373x86b9ebe3(), this.f218444o);
        }
        return i17;
    }

    public final boolean k(com.p314xaae8f345.p3210x3857dc.d1 d1Var) {
        boolean i17 = i(d1Var.f301773b);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f218430a) && f().mo63367xfb83db66().b().a() && g()) {
            this.f218432c = d1Var;
            hy4.s sVar = new hy4.s();
            this.f218434e = sVar;
            sVar.a(f().mo63373x86b9ebe3(), this.f218444o);
        }
        return i17;
    }
}
