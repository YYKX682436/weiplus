package ql2;

/* loaded from: classes10.dex */
public final class e0 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ql2.i0 f446045a;

    public e0(ql2.i0 i0Var) {
        this.f446045a = i0Var;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        ql2.i0 i0Var = this.f446045a;
        i0Var.f446054d = i17;
        java.lang.ref.WeakReference weakReference = i0Var.f446055e;
        i0Var.t(weakReference != null ? (android.widget.ImageView) weakReference.get() : null);
        i0Var.r(null, i17);
    }
}
