package androidx.fragment.app;

/* loaded from: classes14.dex */
public class e implements j3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f11308a;

    public e(androidx.fragment.app.p pVar, android.animation.Animator animator) {
        this.f11308a = animator;
    }

    @Override // j3.g
    public void onCancel() {
        this.f11308a.end();
    }
}
