package ln5;

/* loaded from: classes15.dex */
public final class h extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f401472d;

    public h(com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864) {
        this.f401472d = c22851x22587864;
    }

    @Override // qn5.a
    public void b(android.animation.Animator animator) {
        boolean z17 = false;
        if (animator != null && animator.getDuration() == 0) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        this.f401472d.m82936x39239740(true);
    }
}
