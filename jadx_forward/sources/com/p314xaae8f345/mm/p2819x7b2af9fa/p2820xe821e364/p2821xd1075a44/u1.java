package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f296179a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f296180b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f296181c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f296182d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f296183e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f296184f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f296185g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f296186h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f296187i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f296188j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f296189k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f296190l;

    /* renamed from: m, reason: collision with root package name */
    public long f296191m;

    /* renamed from: n, reason: collision with root package name */
    public int f296192n;

    public void a(int i17) {
        if ((this.f296182d & i17) != 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Layout state should be one of " + java.lang.Integer.toBinaryString(i17) + " but it is " + java.lang.Integer.toBinaryString(this.f296182d));
    }

    public int b() {
        return this.f296185g ? this.f296180b - this.f296181c : this.f296183e;
    }

    /* renamed from: toString */
    public java.lang.String m83640x9616526c() {
        return "State{mTargetPosition=" + this.f296179a + ", mData=null, mItemCount=" + this.f296183e + ", mIsMeasuring=" + this.f296187i + ", mPreviousLayoutItemCount=" + this.f296180b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f296181c + ", mStructureChanged=" + this.f296184f + ", mInPreLayout=" + this.f296185g + ", mRunSimpleAnimations=" + this.f296188j + ", mRunPredictiveAnimations=" + this.f296189k + '}';
    }
}
