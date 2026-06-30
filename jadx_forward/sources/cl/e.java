package cl;

/* loaded from: classes7.dex */
public class e extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f124149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.a f124150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cl.a aVar, java.lang.String str, java.util.concurrent.CountDownLatch countDownLatch) {
        super(str);
        this.f124150e = aVar;
        this.f124149d = countDownLatch;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f124150e.f124115o = android.os.Process.myTid();
        cl.a.f124099y.run();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "expansions file is ready");
        cl.a aVar = this.f124150e;
        int i17 = aVar.f124122v.f135487l;
        if (Integer.MIN_VALUE != i17) {
            aVar.i(i17);
        }
        cl.a aVar2 = this.f124150e;
        aVar2.f124102b = aVar2.d();
        this.f124150e.f124102b.o(new cl.f(this));
        this.f124149d.countDown();
        this.f124150e.f124103c.countDown();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "prepareV8WhenThreadStart, tid[%d] JsRuntime[%d] JsLooper[%d]", java.lang.Integer.valueOf(this.f124150e.f124115o), java.lang.Integer.valueOf(this.f124150e.hashCode()), java.lang.Integer.valueOf(this.f124150e.f124102b.hashCode()));
        cl.a aVar3 = this.f124150e;
        aVar3.f124101a = aVar3.e();
        this.f124150e.f124101a.m15874x5db1c78().m16267xb1ea9fd7(this.f124150e.f124113m);
        cl.a aVar4 = this.f124150e;
        aVar4.f124101a.m15880xc7e91772(aVar4.f124118r);
        cl.a aVar5 = this.f124150e;
        cl.a aVar6 = this.f124150e;
        aVar5.f124105e = new cl.w3(aVar6.f124101a);
        aVar6.f124105e.getClass();
        cl.a aVar7 = this.f124150e;
        aVar7.f124104d = aVar7.f124101a.m15867xfdb17fd0();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "v8 init cost:%d ms", java.lang.Long.valueOf(currentTimeMillis2));
        cl.r3.c(5, currentTimeMillis2, -1, null, -1, -1, -1);
        com.p159x477cd522.p160x333422.C1476xfffd285a m15875x77fd01b0 = this.f124150e.f124101a.m15875x77fd01b0();
        if (m15875x77fd01b0.m16433x2986eee5()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "has lock release");
            m15875x77fd01b0.m16434x41012807();
        }
        m15875x77fd01b0.m16430xba9b60d6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "#loop before");
        this.f124150e.f124102b.i(new java.lang.Runnable() { // from class: cl.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    cl.a aVar8 = cl.e.this.f124150e;
                    java.lang.Runnable runnable = (java.lang.Runnable) aVar8.f124121u.poll();
                    if (runnable == null) {
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (com.p159x477cd522.p160x333422.AbstractC1482xef2ea8c2 e17) {
                        aVar8.f(e17);
                    } catch (java.lang.reflect.UndeclaredThrowableException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractJSRuntime", "doPostedBeforeLooperEndJob UndeclaredThrowableException: %s %s", e18, e18.getCause());
                    }
                }
            }
        });
        this.f124150e.f124102b.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "#loop after");
        cl.a aVar8 = this.f124150e;
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) aVar8.f124120t.poll();
            if (runnable == null) {
                break;
            }
            try {
                runnable.run();
            } catch (com.p159x477cd522.p160x333422.AbstractC1482xef2ea8c2 e17) {
                aVar8.f(e17);
            } catch (java.lang.reflect.UndeclaredThrowableException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractJSRuntime", "doPostedCleanUpJob UndeclaredThrowableException: %s %s", e18, e18.getCause());
            }
        }
        this.f124150e.f124104d.m16645x41012807();
        this.f124150e.f124105e.getClass();
        try {
            this.f124150e.f124119s.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractJSRuntime", "whenThreadEnd, mJSExceptionHandlerMap.clear() succeed, JsRuntime[%d]", java.lang.Integer.valueOf(this.f124150e.hashCode()));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractJSRuntime", "whenThreadEnd, mJSExceptionHandlerMap.clear(), JsRuntime[%d] get exception[%s]", java.lang.Integer.valueOf(this.f124150e.hashCode()), th6);
        }
        this.f124150e.a();
    }
}
