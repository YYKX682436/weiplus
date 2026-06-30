package rc5;

/* loaded from: classes11.dex */
public final class s implements com.p314xaae8f345.mm.ui.wc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rc5.x f475724a;

    public s(rc5.x xVar) {
        this.f475724a = xVar;
    }

    @Override // com.p314xaae8f345.mm.ui.wc
    public void a(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            rc5.x xVar = this.f475724a;
            xVar.getClass();
            if (!(xVar instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf)) {
                xVar.n7(motionEvent);
                return;
            }
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
            obtain.offsetLocation(0.0f, xVar.X6() - ((java.lang.Number) ((jz5.n) xVar.f281968r).mo141623x754a37bb()).intValue());
            xVar.n7(obtain);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.wc
    public java.lang.String key() {
        return java.lang.String.valueOf(this.f475724a.hashCode());
    }
}
