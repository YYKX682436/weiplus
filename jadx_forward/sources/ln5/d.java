package ln5;

/* loaded from: classes15.dex */
public final class d extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f401457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f401458e;

    public d(com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864, boolean z17) {
        this.f401457d = c22851x22587864;
        this.f401458e = z17;
    }

    @Override // qn5.a
    public void b(android.animation.Animator animator) {
        if (animator != null && animator.getDuration() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f401457d;
        c22851x22587864.m82913x4b20af2f().f411746f = false;
        if (this.f401458e) {
            c22851x22587864.E(true);
        }
        tn5.a aVar = c22851x22587864.f295271h;
        if (aVar.f502384b == sn5.b.f491687m) {
            aVar.c(sn5.b.f491690p);
        }
    }
}
