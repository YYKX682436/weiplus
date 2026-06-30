package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class h3 {

    /* renamed from: a, reason: collision with root package name */
    public int f12059a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f12060b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f12061c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f12062d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f12063e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12064f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12065g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12066h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12067i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12068j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12069k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f12070l;

    /* renamed from: m, reason: collision with root package name */
    public long f12071m;

    /* renamed from: n, reason: collision with root package name */
    public int f12072n;

    public void a(int i17) {
        if ((this.f12062d & i17) != 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Layout state should be one of " + java.lang.Integer.toBinaryString(i17) + " but it is " + java.lang.Integer.toBinaryString(this.f12062d));
    }

    public int b() {
        return this.f12065g ? this.f12060b - this.f12061c : this.f12063e;
    }

    public java.lang.String toString() {
        return "State{mTargetPosition=" + this.f12059a + ", mData=null, mItemCount=" + this.f12063e + ", mIsMeasuring=" + this.f12067i + ", mPreviousLayoutItemCount=" + this.f12060b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f12061c + ", mStructureChanged=" + this.f12064f + ", mInPreLayout=" + this.f12065g + ", mRunSimpleAnimations=" + this.f12068j + ", mRunPredictiveAnimations=" + this.f12069k + '}';
    }
}
