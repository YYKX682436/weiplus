package vl5;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f519461d;

    /* renamed from: e, reason: collision with root package name */
    public long f519462e;

    /* renamed from: f, reason: collision with root package name */
    public long f519463f;

    /* renamed from: g, reason: collision with root package name */
    public int f519464g;

    /* renamed from: h, reason: collision with root package name */
    public int f519465h;

    /* renamed from: i, reason: collision with root package name */
    public float f519466i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f519467m = false;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f519468n;

    public k(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395) {
        this.f519468n = c22722xd3be5395;
    }

    public void b(boolean z17) {
        if (!z17) {
            this.f519461d = true;
        } else {
            this.f519468n.removeCallbacks(this);
            this.f519467m = false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f519461d) {
            this.f519467m = false;
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519468n;
        int firstVisiblePosition = c22722xd3be5395.getFirstVisiblePosition();
        int lastVisiblePosition = c22722xd3be5395.getLastVisiblePosition();
        int count = c22722xd3be5395.getCount();
        int paddingTop = c22722xd3be5395.getPaddingTop();
        int height = (c22722xd3be5395.getHeight() - paddingTop) - c22722xd3be5395.getPaddingBottom();
        int min = java.lang.Math.min(c22722xd3be5395.S, c22722xd3be5395.f294025g + c22722xd3be5395.C);
        int max = java.lang.Math.max(c22722xd3be5395.S, c22722xd3be5395.f294025g - c22722xd3be5395.C);
        if (this.f519465h == 0) {
            android.view.View childAt = c22722xd3be5395.getChildAt(0);
            if (childAt == null) {
                this.f519467m = false;
                return;
            } else if (firstVisiblePosition == 0 && childAt.getTop() == paddingTop) {
                this.f519467m = false;
                return;
            } else {
                this.f519466i = ((vl5.e) c22722xd3be5395.Q).f519456a.P * ((c22722xd3be5395.L - max) / c22722xd3be5395.M);
            }
        } else {
            android.view.View childAt2 = c22722xd3be5395.getChildAt(lastVisiblePosition - firstVisiblePosition);
            if (childAt2 == null) {
                this.f519467m = false;
                return;
            } else if (lastVisiblePosition == count - 1 && childAt2.getBottom() <= height + paddingTop) {
                this.f519467m = false;
                return;
            } else {
                this.f519466i = -(((vl5.e) c22722xd3be5395.Q).f519456a.P * ((min - c22722xd3be5395.K) / c22722xd3be5395.N));
            }
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        this.f519463f = uptimeMillis;
        int round = java.lang.Math.round(this.f519466i * ((float) (uptimeMillis - this.f519462e)));
        this.f519464g = round;
        if (round >= 0) {
            this.f519464g = java.lang.Math.min(height, round);
            lastVisiblePosition = firstVisiblePosition;
        } else {
            this.f519464g = java.lang.Math.max(-height, round);
        }
        android.view.View childAt3 = c22722xd3be5395.getChildAt(lastVisiblePosition - firstVisiblePosition);
        int top = childAt3.getTop() + this.f519464g;
        if (lastVisiblePosition == 0 && top > paddingTop) {
            top = paddingTop;
        }
        c22722xd3be5395.A1 = true;
        c22722xd3be5395.setSelectionFromTop(lastVisiblePosition, top - paddingTop);
        c22722xd3be5395.layoutChildren();
        c22722xd3be5395.invalidate();
        c22722xd3be5395.A1 = false;
        c22722xd3be5395.j(lastVisiblePosition, childAt3, false);
        this.f519462e = this.f519463f;
        c22722xd3be5395.post(this);
    }
}
