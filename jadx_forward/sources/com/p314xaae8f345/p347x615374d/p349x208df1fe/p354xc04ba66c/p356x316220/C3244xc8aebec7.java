package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J0\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaThirdPayService;", "Lcom/tencent/kinda/gen/KThirdPayService;", "", "tn", "Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;", "resultCallback", "Ljz5/f0;", "startYunShanFuPayImpl", "", "isYunShanFuAppInstalled", "requestUrl", "Lcom/tencent/kinda/gen/ITransmitKvData;", "extra", "startDcepPayImpl", "isDcepAppInstalled", "isSupportApplePay", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.k.f34559x24728b, "hasCallbacked", "Z", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.module.impl.KindaThirdPayService */
/* loaded from: classes9.dex */
public final class C3244xc8aebec7 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3535x35cfe5e9 {

    /* renamed from: REQUEST_YUNSHANFU */
    private static final int f12430x136b96f3 = 10;
    private static final java.lang.String TAG = "MicroMsg.KindaThirdPayService";
    private boolean hasCallbacked;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3535x35cfe5e9
    /* renamed from: isDcepAppInstalled */
    public boolean mo25916x6e08ea2d() {
        java.util.HashMap hashMap = fj0.c.f344633a;
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "cn.gov.pbc.dcep");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3535x35cfe5e9
    /* renamed from: isSupportApplePay */
    public boolean mo25917x4ec4d553() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3535x35cfe5e9
    /* renamed from: isSupportNFC */
    public boolean mo25918x5cd36426() {
        return ((h45.q) i95.n0.c(h45.q.class)).mo24772x3494ab9c();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3535x35cfe5e9
    /* renamed from: isYunShanFuAppInstalled */
    public boolean mo25919x449f6012() {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_wechat_query_yunshanfu_installed_switch, false)) {
            return com.p3263xee53b379.a.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "00", "484200016666666");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "wechat check isYunShanFuAppInstalled");
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.unionpay");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3535x35cfe5e9
    /* renamed from: startDcepPayImpl */
    public void mo25920x7ec23c5c(final java.lang.String str, java.lang.String str2, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e, com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f) {
        java.util.HashMap hashMap = fj0.c.f344633a;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "cn.gov.pbc.dcep");
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17 || abstractC3628xfac5d5f == null) {
            return;
        }
        if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "cn.gov.pbc.dcep")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DCEPHandler", "not installed decp app");
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(str2);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(parse);
        android.content.ComponentName resolveActivity = intent.resolveActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager());
        if (resolveActivity == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(resolveActivity.getPackageName(), "cn.gov.pbc.dcep")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DCEPHandler", "can't find resolve activity: " + resolveActivity);
        }
        final android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (!(m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DCEPHandler", "current activity is not kinda activity: " + m27313x7608d9c4);
            return;
        }
        fj0.c.f344634b = new java.lang.ref.WeakReference(m27313x7608d9c4);
        ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m27313x7608d9c4).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x(str, m27313x7608d9c4) { // from class: com.tencent.mm.framework.app.modal.DCEPHandler$startDCEPPay$observer$1

            /* renamed from: d, reason: collision with root package name */
            public boolean f149699d = true;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.Runnable f149700e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f149701f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ android.app.Activity f149702g;

            {
                this.f149701f = str;
                this.f149702g = m27313x7608d9c4;
                this.f149700e = new fj0.b(str, m27313x7608d9c4, this);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onActivityDestroy */
            public final void m45655x2711d60c() {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f2 = (com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f) fj0.c.f344633a.remove(this.f149701f);
                if (abstractC3628xfac5d5f2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DCEPHandler", "callback from destroy");
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                    m27539xaf65a0fc.mo27566xe4673800("procSts", "0001");
                    m27539xaf65a0fc.mo27557xc5c55e60("ret_scene", 2);
                    abstractC3628xfac5d5f2.mo28480x2e7a5e(m27539xaf65a0fc);
                }
                android.app.Activity activity = this.f149702g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).mo273xed6858b4().c(this);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onActivityPause */
            public final void m45656xf470b888() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DCEPHandler", "on pause");
                pm0.v.C(this.f149700e);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onActivityResume */
            public final void m45657x9d4787db() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DCEPHandler", "on resume " + this.f149699d);
                if (((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) this.f149702g).isFinishing()) {
                    return;
                }
                if (this.f149699d) {
                    this.f149699d = false;
                } else {
                    pm0.v.U(500L, this.f149700e);
                }
            }
        });
        ((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) m27313x7608d9c4).m78545xde66c1f2(new fj0.a(str));
        if (str != null) {
            fj0.c.f344633a.put(str, abstractC3628xfac5d5f);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m27313x7608d9c4, arrayList.toArray(), "com/tencent/mm/framework/app/modal/DCEPHandler", "startDCEPPay", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m27313x7608d9c4.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m27313x7608d9c4, "com/tencent/mm/framework/app/modal/DCEPHandler", "startDCEPPay", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.x, com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$observer$1] */
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3535x35cfe5e9
    /* renamed from: startYunShanFuPayImpl */
    public void mo25921x3b951cc7(java.lang.String str, final com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start yunshanfu " + str);
        final android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (!(m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "current activity is not kinda activity");
        }
        final ?? r17 = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$observer$1
            private boolean firstResume = true;

            public final boolean getFirstResume() {
                return this.firstResume;
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onActivityDestroy */
            public final void m25923x2711d60c() {
                boolean z17;
                z17 = this.hasCallbacked;
                if (!z17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                    m27539xaf65a0fc.mo27557xc5c55e60("ret", 2);
                    m27539xaf65a0fc.mo27557xc5c55e60("ret_scene", 2);
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f2 = abstractC3628xfac5d5f;
                    if (abstractC3628xfac5d5f2 != null) {
                        abstractC3628xfac5d5f2.mo28480x2e7a5e(m27539xaf65a0fc);
                    }
                    this.hasCallbacked = true;
                }
                android.app.Activity activity = m27313x7608d9c4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo273xed6858b4().c(this);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onActivityResume */
            public final void m25924x9d4787db() {
                boolean z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KindaThirdPayService", "on resume " + this.firstResume);
                if (m27313x7608d9c4.isFinishing()) {
                    return;
                }
                if (this.firstResume) {
                    this.firstResume = false;
                    return;
                }
                z17 = this.hasCallbacked;
                if (!z17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                    m27539xaf65a0fc.mo27557xc5c55e60("ret", 2);
                    m27539xaf65a0fc.mo27557xc5c55e60("ret_scene", 1);
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f2 = abstractC3628xfac5d5f;
                    if (abstractC3628xfac5d5f2 != null) {
                        abstractC3628xfac5d5f2.mo28480x2e7a5e(m27539xaf65a0fc);
                    }
                    this.hasCallbacked = true;
                }
                android.app.Activity activity = m27313x7608d9c4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo273xed6858b4().c(this);
            }

            /* renamed from: setFirstResume */
            public final void m25925x30207d3b(boolean z17) {
                this.firstResume = z17;
            }
        };
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m27313x7608d9c4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m27313x7608d9c4;
        abstractActivityC21394xb3d2c0cf.mo273xed6858b4().a(r17);
        abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(new com.p314xaae8f345.mm.ui.da() { // from class: com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$1
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
            @Override // com.p314xaae8f345.mm.ui.xc
            /* renamed from: mmOnActivityResult */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void mo9729x757c998b(int r7, int r8, android.content.Intent r9) {
                /*
                    r6 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "onActivityResult: "
                    r0.<init>(r1)
                    r0.append(r7)
                    java.lang.String r1 = ", "
                    r0.append(r1)
                    r0.append(r8)
                    java.lang.String r8 = r0.toString()
                    java.lang.String r0 = "MicroMsg.KindaThirdPayService"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8)
                    r8 = 10
                    if (r7 != r8) goto Lc4
                    android.app.Activity r7 = r1
                    com.tencent.mm.ui.MMActivity r7 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r7
                    r8 = 0
                    r7.m78545xde66c1f2(r8)
                    android.app.Activity r7 = r1
                    com.tencent.mm.ui.MMActivity r7 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r7
                    androidx.lifecycle.o r7 = r7.mo273xed6858b4()
                    com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$observer$1 r1 = r2
                    r7.c(r1)
                    com.tencent.kinda.gen.ITransmitKvData r7 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc()
                    java.lang.String r1 = "ret_scene"
                    r2 = 0
                    r7.mo27557xc5c55e60(r1, r2)
                    com.tencent.kinda.framework.module.impl.KindaThirdPayService r1 = r3
                    r3 = 1
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3244xc8aebec7.m25915xcfebbda8(r1, r3)
                    r1 = 2
                    java.lang.String r4 = "ret"
                    if (r9 != 0) goto L54
                    r7.mo27557xc5c55e60(r4, r1)
                    com.tencent.kinda.gen.VoidITransmitKvDataCallback r8 = r4
                    if (r8 == 0) goto L53
                    r8.mo28480x2e7a5e(r7)
                L53:
                    return
                L54:
                    android.os.Bundle r9 = r9.getExtras()
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)
                    java.lang.String r5 = "pay_result"
                    java.lang.String r9 = r9.getString(r5)
                    if (r9 == 0) goto L6d
                    java.lang.String r8 = r9.toLowerCase()
                    java.lang.String r9 = "toLowerCase(...)"
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r9)
                L6d:
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    java.lang.String r5 = "pay result: "
                    r9.<init>(r5)
                    r9.append(r8)
                    java.lang.String r9 = r9.toString()
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r9)
                    if (r8 == 0) goto Lba
                    int r9 = r8.hashCode()
                    r0 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
                    if (r9 == r0) goto Lae
                    r0 = -1367724422(0xffffffffae7a2e7a, float:-5.68847E-11)
                    if (r9 == r0) goto La1
                    r0 = 3135262(0x2fd71e, float:4.393438E-39)
                    if (r9 == r0) goto L94
                    goto Lba
                L94:
                    java.lang.String r9 = "fail"
                    boolean r8 = r8.equals(r9)
                    if (r8 != 0) goto L9d
                    goto Lba
                L9d:
                    r7.mo27557xc5c55e60(r4, r3)
                    goto Lbd
                La1:
                    java.lang.String r9 = "cancel"
                    boolean r8 = r8.equals(r9)
                    if (r8 != 0) goto Laa
                    goto Lba
                Laa:
                    r7.mo27557xc5c55e60(r4, r1)
                    goto Lbd
                Lae:
                    java.lang.String r9 = "success"
                    boolean r8 = r8.equals(r9)
                    if (r8 == 0) goto Lba
                    r7.mo27557xc5c55e60(r4, r2)
                    goto Lbd
                Lba:
                    r7.mo27557xc5c55e60(r4, r1)
                Lbd:
                    com.tencent.kinda.gen.VoidITransmitKvDataCallback r8 = r4
                    if (r8 == 0) goto Lc4
                    r8.mo28480x2e7a5e(r7)
                Lc4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3245xd459bcb7.mo9729x757c998b(int, int, android.content.Intent):void");
            }
        });
        java.lang.String str2 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_YSFDebugEnv_Int, 0) == 1 ? "01" : "00";
        boolean z17 = m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2;
        if (z17) {
            ((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) m27313x7608d9c4).f149698u = true;
        }
        com.p3263xee53b379.a.n(m27313x7608d9c4, null, null, str, str2);
        if (z17) {
            ((com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) m27313x7608d9c4).f149698u = false;
        }
    }
}
