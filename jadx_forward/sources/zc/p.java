package zc;

/* loaded from: classes11.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f552896e;

    public p(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, boolean z17) {
        this.f552895d = c3646xcf902238;
        this.f552896e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552895d;
        boolean z17 = this.f552896e;
        c3646xcf902238.I = z17;
        if (z17) {
            android.view.Window window = c3646xcf902238.f127508q.getWindow();
            if (window != null) {
                window.addFlags(128);
                return;
            }
            return;
        }
        android.view.Window window2 = c3646xcf902238.f127508q.getWindow();
        if (window2 != null) {
            window2.clearFlags(128);
        }
    }
}
