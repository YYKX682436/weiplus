package d04;

/* loaded from: classes13.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 f307046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f307047e;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4, android.graphics.Bitmap bitmap) {
        this.f307046d = c17327x39ee10a4;
        this.f307047e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bz3.l lVar = bz3.l.f118335d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = this.f307046d;
        c17327x39ee10a4.S1 = true;
        c17327x39ee10a4.T1 = true;
        c17327x39ee10a4.L(this.f307047e);
    }
}
