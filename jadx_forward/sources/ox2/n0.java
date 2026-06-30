package ox2;

/* loaded from: classes2.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f431226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431227f;

    public n0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var) {
        this.f431225d = view;
        this.f431226e = qeVar;
        this.f431227f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = ox2.p0.f431235a;
        android.view.View view = this.f431225d;
        view.getLocationInWindow(iArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e a17 = ox2.p0.a(this.f431226e, this.f431227f);
        if (a17 != null) {
            a17.d(iArr[0] + ((int) ((view.getWidth() * view.getScaleX()) / 2.0f)), iArr[1] + ((int) ((view.getHeight() * view.getScaleY()) / 2.0f)));
        }
    }
}
