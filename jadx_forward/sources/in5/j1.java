package in5;

/* loaded from: classes10.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f374611d;

    public j1(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf) {
        this.f374611d = c22848x6ddd90cf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause visibleExposeMap.size:");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f374611d;
        sb6.append(c22848x6ddd90cf.E.size());
        sb6.append(" sessionExposeMap.size:");
        sb6.append(c22848x6ddd90cf.D.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", sb6.toString());
        c22848x6ddd90cf.E.clear();
        c22848x6ddd90cf.D.clear();
    }
}
