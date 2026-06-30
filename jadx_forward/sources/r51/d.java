package r51;

/* loaded from: classes15.dex */
public final class d extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f474157a;

    public d(com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480) {
        this.f474157a = c11323x28056480;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = this.f474157a;
        if (i17 == 1000) {
            c11323x28056480.invalidate();
            return;
        }
        if (i17 == 2000) {
            c11323x28056480.f(s51.b.FLING);
        } else {
            if (i17 != 3000) {
                return;
            }
            java.lang.Runnable runnable = c11323x28056480.f153918m;
            c11323x28056480.removeCallbacks(runnable);
            c11323x28056480.postDelayed(runnable, 200L);
        }
    }
}
