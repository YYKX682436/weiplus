package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class h3 {

    /* renamed from: a, reason: collision with root package name */
    public int f93592a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f93593b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f93594c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f93595d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f93596e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93597f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93598g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93599h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93600i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93601j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f93602k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f93603l;

    /* renamed from: m, reason: collision with root package name */
    public long f93604m;

    /* renamed from: n, reason: collision with root package name */
    public int f93605n;

    public void a(int i17) {
        if ((this.f93595d & i17) != 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Layout state should be one of " + java.lang.Integer.toBinaryString(i17) + " but it is " + java.lang.Integer.toBinaryString(this.f93595d));
    }

    public int b() {
        return this.f93598g ? this.f93593b - this.f93594c : this.f93596e;
    }

    /* renamed from: toString */
    public java.lang.String m8168x9616526c() {
        return "State{mTargetPosition=" + this.f93592a + ", mData=null, mItemCount=" + this.f93596e + ", mIsMeasuring=" + this.f93600i + ", mPreviousLayoutItemCount=" + this.f93593b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f93594c + ", mStructureChanged=" + this.f93597f + ", mInPreLayout=" + this.f93598g + ", mRunSimpleAnimations=" + this.f93601j + ", mRunPredictiveAnimations=" + this.f93602k + '}';
    }
}
