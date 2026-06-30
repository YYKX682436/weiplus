package af;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.FutureTask f85970a;

    /* renamed from: b, reason: collision with root package name */
    public long f85971b;

    /* renamed from: c, reason: collision with root package name */
    public long f85972c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f85973d;

    /* renamed from: e, reason: collision with root package name */
    public long f85974e;

    public java.lang.Object a(int i17) {
        long j17;
        long currentTimeMillis;
        java.util.concurrent.FutureTask futureTask;
        java.util.concurrent.FutureTask futureTask2 = this.f85970a;
        if (futureTask2 == null) {
            throw new java.lang.IllegalStateException();
        }
        boolean isDone = futureTask2.isDone();
        java.lang.Object obj = null;
        try {
            currentTimeMillis = java.lang.System.currentTimeMillis();
            futureTask = this.f85970a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandBasePreFetchTask", "getPreFetchResult: " + e17.getMessage());
            j17 = 0;
        }
        if (futureTask == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("futureTask");
            throw null;
        }
        obj = futureTask.get(i17, java.util.concurrent.TimeUnit.MILLISECONDS);
        j17 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (obj == null) {
            java.util.concurrent.FutureTask futureTask3 = this.f85970a;
            if (futureTask3 == null) {
                throw new java.lang.IllegalStateException();
            }
            futureTask3.cancel(false);
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(b());
        objArr[1] = java.lang.Boolean.valueOf(obj != null);
        objArr[2] = java.lang.Boolean.valueOf(isDone);
        objArr[3] = java.lang.Long.valueOf(this.f85974e);
        objArr[4] = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandBasePreFetchTask", "getPreFetchResult: #%d task hit preFetch, isPreFetchSuccess = [%b], is done before invoke = [%b], cost = [%dms], wait = [%dms]", objArr);
        this.f85973d = true;
        return obj;
    }

    public abstract int b();

    public abstract java.lang.Object c();
}
