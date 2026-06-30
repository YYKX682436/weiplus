package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c;

@db5.a(m123858x6ac9171 = 512)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/flutter/StatusFlutterPublishActivity;", "Lcom/tencent/mm/plugin/textstatus/ui/FlutterTextStatusTransparentActivity;", "<init>", "()V", "xj4/a", "xj4/b", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity */
/* loaded from: classes11.dex */
public final class ActivityC18678x2dd96834 extends com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18611x9a52c9e6 {
    public static final java.util.concurrent.atomic.AtomicInteger E;
    public volatile boolean D;

    /* renamed from: v, reason: collision with root package name */
    public android.os.ResultReceiver f255417v;

    /* renamed from: x, reason: collision with root package name */
    public bi4.d1 f255419x;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f255421z;

    /* renamed from: w, reason: collision with root package name */
    public int f255418w = -1;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f255420y = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final jz5.g A = jz5.h.b(new xj4.c(this));
    public final java.util.HashMap B = new java.util.HashMap();
    public final java.util.concurrent.CopyOnWriteArrayList C = new java.util.concurrent.CopyOnWriteArrayList();

    static {
        new xj4.a(null);
        E = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", "finish");
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        yz5.p pVar = (yz5.p) this.B.remove(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", "onActivityResult: pigeon reqCode=" + i17 + ", resultCode=" + i18);
        try {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), intent);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusFlutterPublishActivity", "onActivityResult: pigeon callback throw, err=" + th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: ignore duplicated press while callback in flight");
            return;
        }
        java.util.Map map = zi4.g0.f554747g;
        zi4.g0 g0Var = (zi4.g0) zi4.g0.f554747g.get(this);
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: actionHost not bound, fallback to super.onBackPressed");
            super.onBackPressed();
            return;
        }
        this.D = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: sending EdgeGesture_Pop_Begin to Flutter");
        xj4.e eVar = new xj4.e(this);
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24924xf55b6e2f c24924xf55b6e2f = g0Var.f554749b;
        if (c24924xf55b6e2f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FLTStatusActionHost", "sendCallbackToFlutter: commonCallbackApi is null, cmdId=".concat("Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin"));
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            eVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("commonCallbackApi not ready, cmdId=".concat("Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin"))))));
        } else {
            com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24922x59782579 c24922x59782579 = new com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24922x59782579("Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin", new com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24928xe4a82335(null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusActionHost", "sendCallbackToFlutter: cmdId=Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin, dataLen=0");
            pm0.v.X(new zi4.d0(c24924xf55b6e2f, c24922x59782579, eVar, g0Var, "Status_Native2Flutter_Sync_Call_EdgeGesture_Pop_Begin"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18611x9a52c9e6, com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        bi4.d1 d1Var;
        super.onCreate(bundle);
        this.f255417v = (android.os.ResultReceiver) getIntent().getParcelableExtra("status_flutter_publish_result_receiver");
        this.f255418w = getIntent().getIntExtra("status_flutter_publish_request_code", -1);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("status_flutter_publish_set_status_param_bytes");
        if (byteArrayExtra != null) {
            d1Var = new bi4.d1();
            d1Var.mo11468x92b714fd(byteArrayExtra);
        } else {
            d1Var = null;
        }
        this.f255419x = d1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate: hasReceiver=");
        sb6.append(this.f255417v != null);
        sb6.append(", requestCode=");
        sb6.append(this.f255418w);
        sb6.append(", hasEntryParam=");
        sb6.append(this.f255419x != null);
        sb6.append(", affSubId=");
        sb6.append((java.lang.String) ((jz5.n) this.A).mo141623x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", sb6.toString());
        ai4.m mVar = ai4.m.f86700a;
        java.lang.String subId = (java.lang.String) ((jz5.n) this.A).mo141623x754a37bb();
        xj4.f fVar = new xj4.f(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subId, "subId");
        if (r26.n0.N(subId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusStorageEventBridge", "addObserver: blank subId, reject");
            return;
        }
        if (!ai4.m.f86705f) {
            mVar.e();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ai4.m.f86701b;
        if (((ai4.i) concurrentHashMap.put(subId, fVar)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusStorageEventBridge", "addObserver: override exists subId=".concat(subId));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusStorageEventBridge", "addObserver: subId=" + subId + ", total=" + concurrentHashMap.size());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", "onDestroy: hasDispatchedResult=" + this.f255420y.get() + ", affSubId=" + ((java.lang.String) ((jz5.n) this.A).mo141623x754a37bb()));
        this.f255421z = true;
        try {
            ai4.m.f86700a.d((java.lang.String) ((jz5.n) this.A).mo141623x754a37bb());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusFlutterPublishActivity", "onDestroy: removeObserver failed, err=" + th6.getMessage());
        }
        if (!this.B.isEmpty()) {
            java.util.Map s17 = kz5.c1.s(this.B);
            this.B.clear();
            for (java.util.Map.Entry entry : s17.entrySet()) {
                int intValue = ((java.lang.Number) entry.getKey()).intValue();
                yz5.p pVar = (yz5.p) entry.getValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusFlutterPublishActivity", "onDestroy: cancel pending pigeon callback reqCode=" + intValue);
                try {
                    pVar.mo149xb9724478(0, null);
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        this.C.clear();
        if (this.f255420y.compareAndSet(false, true)) {
            try {
                android.os.ResultReceiver resultReceiver = this.f255417v;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusFlutterPublishActivity", "onDestroy: send RESULT_CANCELED failed, err=" + th7.getMessage());
            }
            setResult(0);
        }
        this.f255417v = null;
        this.f255419x = null;
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.C;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((xj4.b) it.next()).a(i17, permissions, grantResults);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusFlutterPublishActivity", "onRequestPermissionsResult: listener throw, err=" + th6.getMessage());
            }
        }
    }
}
