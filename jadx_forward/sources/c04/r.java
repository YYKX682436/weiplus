package c04;

/* loaded from: classes13.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119222d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a) {
        this.f119222d = c17324xa321818a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Vibrator vibrator = this.f119222d.f241171p1;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
    }
}
