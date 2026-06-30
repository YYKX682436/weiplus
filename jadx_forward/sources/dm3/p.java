package dm3;

/* loaded from: classes10.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.u f323263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f323264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323265f;

    public p(dm3.u uVar, android.widget.FrameLayout frameLayout, java.lang.String str) {
        this.f323263d = uVar;
        this.f323264e = frameLayout;
        this.f323265f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f323263d.r(this.f323264e, this.f323265f);
    }
}
