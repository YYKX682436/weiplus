package gf;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f352570d;

    public e(int i17) {
        this.f352570d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df.a1 a1Var = df.a1.f310954a;
        int i17 = this.f352570d;
        synchronized (a1Var) {
            java.lang.Long l17 = (java.lang.Long) df.a1.f310957d.get(java.lang.Integer.valueOf(i17));
            if (l17 == null) {
                l17 = 0L;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            df.x0 x0Var = (df.x0) df.a1.f310956c.get(java.lang.Long.valueOf(l17.longValue()));
            if (x0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SkylineManager", "destroyFlutter id:" + i17 + " fail");
                return;
            }
            x0Var.a(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "destroyFlutter id:" + i17);
            if (x0Var.f311140e == i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "destroyFlutter id:" + i17 + " ignore, return");
                return;
            }
            if (x0Var.f311141f.contains(java.lang.Integer.valueOf(i17))) {
                x0Var.f311141f.remove(java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95768xecc6fa4(i17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SkylineManager", "destroyFlutter id:" + i17 + " fail, return");
            }
        }
    }
}
