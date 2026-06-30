package xb;

/* loaded from: classes15.dex */
public class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef f534407d;

    public h(com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef c2885xf34260ef) {
        this.f534407d = c2885xf34260ef;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef c2885xf34260ef = this.f534407d;
        java.util.ArrayList arrayList = c2885xf34260ef.f127363f.f534397a;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            xb.d dVar = (xb.d) arrayList.get(i17);
            dVar.a();
            dVar.f534393n = dVar.f534391l;
        }
        c2885xf34260ef.a();
        c2885xf34260ef.invalidate();
    }
}
