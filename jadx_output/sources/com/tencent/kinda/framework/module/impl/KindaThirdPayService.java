package com.tencent.kinda.framework.module.impl;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J0\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaThirdPayService;", "Lcom/tencent/kinda/gen/KThirdPayService;", "", "tn", "Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;", "resultCallback", "Ljz5/f0;", "startYunShanFuPayImpl", "", "isYunShanFuAppInstalled", "requestUrl", "Lcom/tencent/kinda/gen/ITransmitKvData;", "extra", "startDcepPayImpl", "isDcepAppInstalled", "isSupportApplePay", com.tencent.mm.plugin.appbrand.jsapi.nfc.k.NAME, "hasCallbacked", "Z", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class KindaThirdPayService implements com.tencent.kinda.gen.KThirdPayService {
    private static final int REQUEST_YUNSHANFU = 10;
    private static final java.lang.String TAG = "MicroMsg.KindaThirdPayService";
    private boolean hasCallbacked;

    @Override // com.tencent.kinda.gen.KThirdPayService
    public boolean isDcepAppInstalled() {
        java.util.HashMap hashMap = fj0.c.f263100a;
        return com.tencent.mm.pluginsdk.model.app.j1.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "cn.gov.pbc.dcep");
    }

    @Override // com.tencent.kinda.gen.KThirdPayService
    public boolean isSupportApplePay() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KThirdPayService
    public boolean isSupportNFC() {
        return ((h45.q) i95.n0.c(h45.q.class)).isDeviceSupportNFC();
    }

    @Override // com.tencent.kinda.gen.KThirdPayService
    public boolean isYunShanFuAppInstalled() {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_wechat_query_yunshanfu_installed_switch, false)) {
            return com.unionpay.a.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "00", "484200016666666");
        }
        com.tencent.mars.xlog.Log.i(TAG, "wechat check isYunShanFuAppInstalled");
        return com.tencent.mm.pluginsdk.model.app.j1.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.unionpay");
    }

    @Override // com.tencent.kinda.gen.KThirdPayService
    public void startDcepPayImpl(final java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        java.util.HashMap hashMap = fj0.c.f263100a;
        com.tencent.mm.pluginsdk.model.app.j1.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "cn.gov.pbc.dcep");
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17 || voidITransmitKvDataCallback == null) {
            return;
        }
        if (!com.tencent.mm.pluginsdk.model.app.j1.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "cn.gov.pbc.dcep")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DCEPHandler", "not installed decp app");
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(str2);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(parse);
        android.content.ComponentName resolveActivity = intent.resolveActivity(com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager());
        if (resolveActivity == null || !kotlin.jvm.internal.o.b(resolveActivity.getPackageName(), "cn.gov.pbc.dcep")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DCEPHandler", "can't find resolve activity: " + resolveActivity);
        }
        final android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (!(topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DCEPHandler", "current activity is not kinda activity: " + topOrUIPageFragmentActivity);
            return;
        }
        fj0.c.f263101b = new java.lang.ref.WeakReference(topOrUIPageFragmentActivity);
        ((com.tencent.mm.ui.MMFragmentActivity) topOrUIPageFragmentActivity).mo133getLifecycle().a(new androidx.lifecycle.x(str, topOrUIPageFragmentActivity) { // from class: com.tencent.mm.framework.app.modal.DCEPHandler$startDCEPPay$observer$1

            /* renamed from: d, reason: collision with root package name */
            public boolean f68166d = true;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.Runnable f68167e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f68168f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ android.app.Activity f68169g;

            {
                this.f68168f = str;
                this.f68169g = topOrUIPageFragmentActivity;
                this.f68167e = new fj0.b(str, topOrUIPageFragmentActivity, this);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onActivityDestroy() {
                com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback2 = (com.tencent.kinda.gen.VoidITransmitKvDataCallback) fj0.c.f263100a.remove(this.f68168f);
                if (voidITransmitKvDataCallback2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DCEPHandler", "callback from destroy");
                    com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                    create.putString("procSts", "0001");
                    create.putInt("ret_scene", 2);
                    voidITransmitKvDataCallback2.call(create);
                }
                android.app.Activity activity = this.f68169g;
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((com.tencent.mm.ui.MMFragmentActivity) activity).mo133getLifecycle().c(this);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onActivityPause() {
                com.tencent.mars.xlog.Log.i("MicroMsg.DCEPHandler", "on pause");
                pm0.v.C(this.f68167e);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onActivityResume() {
                com.tencent.mars.xlog.Log.i("MicroMsg.DCEPHandler", "on resume " + this.f68166d);
                if (((com.tencent.mm.framework.app.UIPageFragmentActivity) this.f68169g).isFinishing()) {
                    return;
                }
                if (this.f68166d) {
                    this.f68166d = false;
                } else {
                    pm0.v.U(500L, this.f68167e);
                }
            }
        });
        ((com.tencent.mm.framework.app.UIPageFragmentActivity) topOrUIPageFragmentActivity).mmSetOnActivityResultCallback(new fj0.a(str));
        if (str != null) {
            fj0.c.f263100a.put(str, voidITransmitKvDataCallback);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(topOrUIPageFragmentActivity, arrayList.toArray(), "com/tencent/mm/framework/app/modal/DCEPHandler", "startDCEPPay", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        topOrUIPageFragmentActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(topOrUIPageFragmentActivity, "com/tencent/mm/framework/app/modal/DCEPHandler", "startDCEPPay", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.x, com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$observer$1] */
    @Override // com.tencent.kinda.gen.KThirdPayService
    public void startYunShanFuPayImpl(java.lang.String str, final com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        com.tencent.mars.xlog.Log.i(TAG, "start yunshanfu " + str);
        final android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (!(topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity)) {
            com.tencent.mars.xlog.Log.w(TAG, "current activity is not kinda activity");
        }
        final ?? r17 = new androidx.lifecycle.x() { // from class: com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$observer$1
            private boolean firstResume = true;

            public final boolean getFirstResume() {
                return this.firstResume;
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onActivityDestroy() {
                boolean z17;
                z17 = this.hasCallbacked;
                if (!z17) {
                    com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                    create.putInt("ret", 2);
                    create.putInt("ret_scene", 2);
                    com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback2 = voidITransmitKvDataCallback;
                    if (voidITransmitKvDataCallback2 != null) {
                        voidITransmitKvDataCallback2.call(create);
                    }
                    this.hasCallbacked = true;
                }
                android.app.Activity activity = topOrUIPageFragmentActivity;
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.tencent.mm.ui.MMActivity) activity).mo133getLifecycle().c(this);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onActivityResume() {
                boolean z17;
                com.tencent.mars.xlog.Log.i("MicroMsg.KindaThirdPayService", "on resume " + this.firstResume);
                if (topOrUIPageFragmentActivity.isFinishing()) {
                    return;
                }
                if (this.firstResume) {
                    this.firstResume = false;
                    return;
                }
                z17 = this.hasCallbacked;
                if (!z17) {
                    com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                    create.putInt("ret", 2);
                    create.putInt("ret_scene", 1);
                    com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback2 = voidITransmitKvDataCallback;
                    if (voidITransmitKvDataCallback2 != null) {
                        voidITransmitKvDataCallback2.call(create);
                    }
                    this.hasCallbacked = true;
                }
                android.app.Activity activity = topOrUIPageFragmentActivity;
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.tencent.mm.ui.MMActivity) activity).mo133getLifecycle().c(this);
            }

            public final void setFirstResume(boolean z17) {
                this.firstResume = z17;
            }
        };
        kotlin.jvm.internal.o.e(topOrUIPageFragmentActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) topOrUIPageFragmentActivity;
        mMActivity.mo133getLifecycle().a(r17);
        mMActivity.mmSetOnActivityResultCallback(new com.tencent.mm.ui.da() { // from class: com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$1
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
            @Override // com.tencent.mm.ui.xc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void mmOnActivityResult(int r7, int r8, android.content.Intent r9) {
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
                    com.tencent.mars.xlog.Log.i(r0, r8)
                    r8 = 10
                    if (r7 != r8) goto Lc4
                    android.app.Activity r7 = r1
                    com.tencent.mm.ui.MMActivity r7 = (com.tencent.mm.ui.MMActivity) r7
                    r8 = 0
                    r7.mmSetOnActivityResultCallback(r8)
                    android.app.Activity r7 = r1
                    com.tencent.mm.ui.MMActivity r7 = (com.tencent.mm.ui.MMActivity) r7
                    androidx.lifecycle.o r7 = r7.mo133getLifecycle()
                    com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$observer$1 r1 = r2
                    r7.c(r1)
                    com.tencent.kinda.gen.ITransmitKvData r7 = com.tencent.kinda.gen.ITransmitKvData.create()
                    java.lang.String r1 = "ret_scene"
                    r2 = 0
                    r7.putInt(r1, r2)
                    com.tencent.kinda.framework.module.impl.KindaThirdPayService r1 = r3
                    r3 = 1
                    com.tencent.kinda.framework.module.impl.KindaThirdPayService.access$setHasCallbacked$p(r1, r3)
                    r1 = 2
                    java.lang.String r4 = "ret"
                    if (r9 != 0) goto L54
                    r7.putInt(r4, r1)
                    com.tencent.kinda.gen.VoidITransmitKvDataCallback r8 = r4
                    if (r8 == 0) goto L53
                    r8.call(r7)
                L53:
                    return
                L54:
                    android.os.Bundle r9 = r9.getExtras()
                    kotlin.jvm.internal.o.d(r9)
                    java.lang.String r5 = "pay_result"
                    java.lang.String r9 = r9.getString(r5)
                    if (r9 == 0) goto L6d
                    java.lang.String r8 = r9.toLowerCase()
                    java.lang.String r9 = "toLowerCase(...)"
                    kotlin.jvm.internal.o.f(r8, r9)
                L6d:
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    java.lang.String r5 = "pay result: "
                    r9.<init>(r5)
                    r9.append(r8)
                    java.lang.String r9 = r9.toString()
                    com.tencent.mars.xlog.Log.i(r0, r9)
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
                    r7.putInt(r4, r3)
                    goto Lbd
                La1:
                    java.lang.String r9 = "cancel"
                    boolean r8 = r8.equals(r9)
                    if (r8 != 0) goto Laa
                    goto Lba
                Laa:
                    r7.putInt(r4, r1)
                    goto Lbd
                Lae:
                    java.lang.String r9 = "success"
                    boolean r8 = r8.equals(r9)
                    if (r8 == 0) goto Lba
                    r7.putInt(r4, r2)
                    goto Lbd
                Lba:
                    r7.putInt(r4, r1)
                Lbd:
                    com.tencent.kinda.gen.VoidITransmitKvDataCallback r8 = r4
                    if (r8 == 0) goto Lc4
                    r8.call(r7)
                Lc4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$1.mmOnActivityResult(int, int, android.content.Intent):void");
            }
        });
        java.lang.String str2 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_YSFDebugEnv_Int, 0) == 1 ? "01" : "00";
        boolean z17 = topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity;
        if (z17) {
            ((com.tencent.mm.framework.app.UIPageFragmentActivity) topOrUIPageFragmentActivity).f68165u = true;
        }
        com.unionpay.a.n(topOrUIPageFragmentActivity, null, null, str, str2);
        if (z17) {
            ((com.tencent.mm.framework.app.UIPageFragmentActivity) topOrUIPageFragmentActivity).f68165u = false;
        }
    }
}
