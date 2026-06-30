package lw2;

/* loaded from: classes2.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lw2.m f403100a;

    public e(lw2.m mVar) {
        this.f403100a = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gs
    public boolean a(android.view.MotionEvent event) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        lw2.m mVar = this.f403100a;
        boolean F = mVar.f403109a.F();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f17 = mVar.f();
        boolean z18 = f17 != null && f17.y(event);
        if (!mVar.f403111c) {
            return false;
        }
        android.view.View view = (android.view.View) ((jz5.n) mVar.f403117i).mo141623x754a37bb();
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getGlobalVisibleRect(rect);
            int pointerCount = event.getPointerCount();
            for (int i17 = 0; i17 < pointerCount; i17++) {
                if (rect.contains((int) event.getX(i17), (int) event.getY(i17))) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            return false;
        }
        return (F && z18) ? false : true;
    }
}
