package d04;

/* loaded from: classes8.dex */
public final class e extends db5.w5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc f306939d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc c17325xac7c40dc) {
        this.f306939d = c17325xac7c40dc;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc c17325xac7c40dc = this.f306939d;
        boolean z17 = c17325xac7c40dc.B == c17325xac7c40dc.f241204i;
        if (java.lang.Math.abs(f17) > java.lang.Math.abs(f18) && z17) {
            java.util.ArrayList arrayList = c17325xac7c40dc.f241202g;
            if (f17 <= -100.0f) {
                int i17 = c17325xac7c40dc.f241204i + 1;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    c17325xac7c40dc.C = true;
                    c17325xac7c40dc.h(i17, 2);
                }
            } else if (f17 >= 100.0f) {
                int i18 = c17325xac7c40dc.f241204i - 1;
                if (i18 >= 0 && i18 < arrayList.size()) {
                    c17325xac7c40dc.C = true;
                    c17325xac7c40dc.h(i18, 2);
                }
            }
        }
        return false;
    }
}
