package d04;

/* loaded from: classes13.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 f307016d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4) {
        this.f307016d = c17327x39ee10a4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Vibrator vibrator = this.f307016d.Z1;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
    }
}
