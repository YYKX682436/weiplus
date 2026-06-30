package gf;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f352656d;

    public m(long j17) {
        this.f352656d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df.a1 a1Var = df.a1.f310954a;
        long j17 = this.f352656d;
        synchronized (a1Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "release " + j17);
            java.util.HashMap hashMap = df.a1.f310956c;
            df.x0 x0Var = (df.x0) hashMap.get(java.lang.Long.valueOf(j17));
            if (x0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SkylineManager", "release runtimePtr:" + j17 + " fail stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
                return;
            }
            hashMap.remove(java.lang.Long.valueOf(j17));
            java.util.Iterator it = x0Var.f311141f.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                int i17 = x0Var.f311140e;
                if (num != null && num.intValue() == i17) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "release destroyFlutter id:" + num.intValue());
                com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95768xecc6fa4(num.intValue());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "release destroyFirstFlutter id:" + x0Var.f311140e);
            com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95768xecc6fa4(x0Var.f311140e);
        }
    }
}
