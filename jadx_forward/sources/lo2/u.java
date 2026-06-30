package lo2;

/* loaded from: classes8.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f401703d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f401704e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f f401705f;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14485xd3a2499f activityC14485xd3a2499f) {
        this.f401705f = activityC14485xd3a2499f;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f401704e = android.os.SystemClock.uptimeMillis();
        zy2.g5 g5Var = this.f401705f.f202941z;
        if (g5Var != null) {
            g5Var.a(this.f401703d, false);
        }
    }
}
