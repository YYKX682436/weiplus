package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class x9 {

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f173913l = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f173914a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v f173915b;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f173917d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f173918e;

    /* renamed from: f, reason: collision with root package name */
    public final em1.c f173919f = new em1.c();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f173920g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f173921h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f173922i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f173923j = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final cl.m3 f173924k = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z9(this);

    /* renamed from: c, reason: collision with root package name */
    public final cl.l3 f173916c = b();

    public x9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f173914a = e9Var;
        this.f173915b = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v) e9Var.mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f173917d = arrayList;
        arrayList.add(new cl.j3(this.f173914a.X0() + "wxa_library/bootstrap_j2v8_worker.js", ik1.f.e("wxa_library/bootstrap_j2v8_worker.js")));
        e9Var.mo50357xcd94f799().mo14658x74041feb(this, "WeixinWorker");
    }

    public void a(java.util.ArrayList arrayList, java.lang.String str, boolean z17, java.lang.String workerType) {
        org.json.JSONObject config = z17 ? this.f173914a.A0() : this.f173914a.U0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workerType, "workerType");
        try {
            config.put("workerContentType", workerType);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WASnapshotConfigProvider", e17, "put with key(workerContentType)", new java.lang.Object[0]);
        }
        arrayList.add(new cl.j3(this.f173914a.X0() + "config", java.lang.String.format("var __wxConfig = %s;", config.toString())));
    }

    public cl.l3 b() {
        return new cl.l3(this.f173924k);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(java.lang.String r18, java.lang.String r19, cl.i3 r20, int r21, cl.k3 r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9.c(java.lang.String, java.lang.String, cl.i3, int, cl.k3):int");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: create */
    public int m53803xaf65a0fc(java.lang.String str) {
        return m53805xe8a4dc08(str, null);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0265: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:174:0x029b, block:B:155:0x0265 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8 A[Catch: all -> 0x01f2, InterruptedException -> 0x01f5, TRY_LEAVE, TryCatch #11 {InterruptedException -> 0x01f5, all -> 0x01f2, blocks: (B:9:0x0012, B:11:0x0025, B:12:0x0027, B:29:0x0057, B:31:0x005b, B:37:0x0070, B:39:0x0076, B:45:0x008b, B:47:0x0099, B:49:0x00a1, B:51:0x00b1, B:57:0x00c8, B:63:0x00b9, B:65:0x00dd, B:66:0x0126, B:73:0x013e, B:75:0x0144, B:82:0x0153, B:83:0x0102, B:86:0x0158, B:87:0x0159, B:89:0x0161, B:90:0x0166, B:92:0x0176), top: B:8:0x0012 }] */
    @android.webkit.JavascriptInterface
    /* renamed from: createWXLibWorker */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m53804xd7431606(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9.m53804xd7431606(java.lang.String, java.lang.String):int");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: createWithParams */
    public int m53805xe8a4dc08(java.lang.String str, java.lang.String str2) {
        return c(str, str2, cl.i3.USER, -1, null);
    }

    public java.util.List d() {
        cl.l3 l3Var = this.f173916c;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l3Var.f124219b;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        java.util.Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            cl.q0 q0Var = (cl.q0) concurrentHashMap.get((java.lang.Integer) it.next());
            l3Var.getClass();
            arrayList.add(new cl.f3(l3Var, q0Var));
        }
        return arrayList;
    }

    public cl.j3 e(java.lang.String str) {
        return new cl.j3(this.f173914a.X0() + str, this.f173914a.x().M(str), str, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a + this.f173914a.x().i());
    }

    public cl.j3 f(java.lang.String str) {
        return new cl.j3(this.f173914a.b1() + str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.p(this.f173914a.t3(), str) + this.f173914a.a1(str));
    }

    public final boolean g(java.lang.String str) {
        try {
            return "ad".equals(new org.json.JSONObject(str).optString("type"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandWorkerContainer", e17, "[createWXLibWorker] get type fail", new java.lang.Object[0]);
            return false;
        }
    }

    public final void h() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f173921h;
        if (atomicBoolean.get() || !this.f173922i.get() || this.f173914a.t3() == null) {
            return;
        }
        em1.c cVar = this.f173919f;
        if (cVar.f336550b != null) {
            atomicBoolean.set(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWorkerContainer", "dispatch OnWxConfigReady to worker %s", this.f173918e);
            cl.q0 engine = cVar.f336550b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engine, "engine");
            engine.d(java.lang.String.format(java.util.Locale.ENGLISH, ";(function(global){if(typeof global.WXConfig==='undefined'){global.WXConfig={};};Object.assign(global.WXConfig, %s);})(this)", this.f173914a.U0()), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C12818x6b57980()));
            engine.d(java.lang.String.format(java.util.Locale.US, ";(function(global){ if(global.WXConfig.preload) { %s; return true; } else { return false; }})(this);", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.c("onWxConfigReady", "", 0, 0)), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C12819x6b57981()));
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: postMsgToWorker */
    public void m53806xae51abba(int i17, java.lang.String str) {
        cl.l3 l3Var = this.f173916c;
        cl.q0 q0Var = (cl.q0) l3Var.f124219b.get(java.lang.Integer.valueOf(i17));
        if (q0Var == null) {
            return;
        }
        ((cl.a) q0Var.f124257b).h(new cl.g3(l3Var, q0Var, str), false);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: terminate */
    public void m53807x795abe61(int i17) {
        cl.l3 l3Var = this.f173916c;
        cl.q0 q0Var = (cl.q0) l3Var.f124219b.remove(java.lang.Integer.valueOf(i17));
        if (q0Var != null) {
            l3Var.e(i17, q0Var);
        }
    }
}
