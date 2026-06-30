package fh5;

/* loaded from: classes13.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final fh5.a f344251d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f344252e;

    public b(fh5.a request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        this.f344251d = request;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        android.os.Message mo50292x733c63a2;
        fh5.a aVar = this.f344251d;
        this.f344252e = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.f0 f0Var = null;
        try {
            fh5.e eVar = aVar.f344245a;
            aVar.f344248d = com.p314xaae8f345.mm.ui.id.b(eVar != null ? eVar.f344255a : null).inflate(aVar.f344247c, aVar.f344246b, false);
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxAsyncLayoutInflater", "Failed to inflate resource(" + aVar.f344247c + ") in the background! Retry on the UI thread. " + e17.getMessage());
        }
        fh5.c cVar = aVar.f344249e;
        if (cVar != null) {
            android.view.View view = aVar.f344248d;
            um2.d6 d6Var = (um2.d6) cVar;
            android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
            android.view.ViewGroup viewGroup2 = d6Var.f510301b;
            um2.x5 x5Var = d6Var.f510300a;
            if (viewGroup != null) {
                um2.h6.a(x5Var, "asyncInflateShoppingPlugin-" + java.lang.Thread.currentThread().getName(), viewGroup2, viewGroup);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(x5Var.f510565f, "asyncInflateShoppingPlugin fail,view:" + view + '!');
                pm0.v.X(new um2.c6(x5Var, d6Var.f510302c, viewGroup2));
            }
        }
        java.util.concurrent.CountDownLatch countDownLatch = aVar.f344250f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        fh5.e eVar2 = aVar.f344245a;
        if (eVar2 != null && (n3Var = eVar2.f344256b) != null && (mo50292x733c63a2 = n3Var.mo50292x733c63a2(0, aVar)) != null) {
            mo50292x733c63a2.sendToTarget();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxAsyncLayoutInflater", "InflateRunnable " + aVar.f344247c + ' ' + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
