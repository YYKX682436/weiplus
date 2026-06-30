package db5;

/* loaded from: classes4.dex */
public final class b5 implements db5.y4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21507x556904c6 f309827a;

    public b5(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21507x556904c6 c21507x556904c6) {
        this.f309827a = c21507x556904c6;
    }

    public int c() {
        return this.f309827a.getScrollY();
    }

    public void d(int i17) {
        this.f309827a.scrollBy(0, i17);
    }

    public void e(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21507x556904c6 c21507x556904c6 = this.f309827a;
        c21507x556904c6.f279039p = false;
        if (i18 < 0) {
            c21507x556904c6.f279033g.startScroll(0, c(), 0, i17, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a);
        } else {
            c21507x556904c6.f279033g.startScroll(0, c(), 0, i17, i18);
        }
        c21507x556904c6.f279040q = true;
        c21507x556904c6.postInvalidate();
    }
}
