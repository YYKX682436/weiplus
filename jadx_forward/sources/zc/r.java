package zc;

/* loaded from: classes11.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f552899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552900e;

    public r(boolean z17, com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238) {
        this.f552899d = z17;
        this.f552900e = c3646xcf902238;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f552899d;
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552900e;
        if (z17) {
            android.view.Window window = c3646xcf902238.f127508q.getWindow();
            if (window != null) {
                window.clearFlags(8192);
                return;
            }
            return;
        }
        android.view.Window window2 = c3646xcf902238.f127508q.getWindow();
        if (window2 != null) {
            window2.addFlags(8192);
        }
    }
}
