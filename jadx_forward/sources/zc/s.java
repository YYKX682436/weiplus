package zc;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f552902e;

    public s(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, int i17) {
        this.f552901d = c3646xcf902238;
        this.f552902e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View decorView;
        android.view.Window window = this.f552901d.f127508q.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(this.f552902e);
    }
}
