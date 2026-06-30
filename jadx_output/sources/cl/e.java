package cl;

/* loaded from: classes7.dex */
public class e extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f42616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.a f42617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cl.a aVar, java.lang.String str, java.util.concurrent.CountDownLatch countDownLatch) {
        super(str);
        this.f42617e = aVar;
        this.f42616d = countDownLatch;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f42617e.f42582o = android.os.Process.myTid();
        cl.a.f42566y.run();
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "expansions file is ready");
        cl.a aVar = this.f42617e;
        int i17 = aVar.f42589v.f53954l;
        if (Integer.MIN_VALUE != i17) {
            aVar.i(i17);
        }
        cl.a aVar2 = this.f42617e;
        aVar2.f42569b = aVar2.d();
        this.f42617e.f42569b.o(new cl.f(this));
        this.f42616d.countDown();
        this.f42617e.f42570c.countDown();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "prepareV8WhenThreadStart, tid[%d] JsRuntime[%d] JsLooper[%d]", java.lang.Integer.valueOf(this.f42617e.f42582o), java.lang.Integer.valueOf(this.f42617e.hashCode()), java.lang.Integer.valueOf(this.f42617e.f42569b.hashCode()));
        cl.a aVar3 = this.f42617e;
        aVar3.f42568a = aVar3.e();
        this.f42617e.f42568a.getV8().setDelaySaveCodeCache(this.f42617e.f42580m);
        cl.a aVar4 = this.f42617e;
        aVar4.f42568a.setMinimalCodeLength(aVar4.f42585r);
        cl.a aVar5 = this.f42617e;
        cl.a aVar6 = this.f42617e;
        aVar5.f42572e = new cl.w3(aVar6.f42568a);
        aVar6.f42572e.getClass();
        cl.a aVar7 = this.f42617e;
        aVar7.f42571d = aVar7.f42568a.createMemoryManager();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "v8 init cost:%d ms", java.lang.Long.valueOf(currentTimeMillis2));
        cl.r3.c(5, currentTimeMillis2, -1, null, -1, -1, -1);
        com.eclipsesource.mmv8.V8Locker v8Locker = this.f42617e.f42568a.getV8Locker();
        if (v8Locker.hasLock()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "has lock release");
            v8Locker.release();
        }
        v8Locker.acquire();
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "#loop before");
        this.f42617e.f42569b.i(new java.lang.Runnable() { // from class: cl.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    cl.a aVar8 = cl.e.this.f42617e;
                    java.lang.Runnable runnable = (java.lang.Runnable) aVar8.f42588u.poll();
                    if (runnable == null) {
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (com.eclipsesource.mmv8.V8ScriptException e17) {
                        aVar8.f(e17);
                    } catch (java.lang.reflect.UndeclaredThrowableException e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AbstractJSRuntime", "doPostedBeforeLooperEndJob UndeclaredThrowableException: %s %s", e18, e18.getCause());
                    }
                }
            }
        });
        this.f42617e.f42569b.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "#loop after");
        cl.a aVar8 = this.f42617e;
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) aVar8.f42587t.poll();
            if (runnable == null) {
                break;
            }
            try {
                runnable.run();
            } catch (com.eclipsesource.mmv8.V8ScriptException e17) {
                aVar8.f(e17);
            } catch (java.lang.reflect.UndeclaredThrowableException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AbstractJSRuntime", "doPostedCleanUpJob UndeclaredThrowableException: %s %s", e18, e18.getCause());
            }
        }
        this.f42617e.f42571d.release();
        this.f42617e.f42572e.getClass();
        try {
            this.f42617e.f42586s.clear();
            com.tencent.mars.xlog.Log.i("MicroMsg.AbstractJSRuntime", "whenThreadEnd, mJSExceptionHandlerMap.clear() succeed, JsRuntime[%d]", java.lang.Integer.valueOf(this.f42617e.hashCode()));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbstractJSRuntime", "whenThreadEnd, mJSExceptionHandlerMap.clear(), JsRuntime[%d] get exception[%s]", java.lang.Integer.valueOf(this.f42617e.hashCode()), th6);
        }
        this.f42617e.a();
    }
}
