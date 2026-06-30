package u4;

/* loaded from: classes13.dex */
public class w0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.b f506103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 f506104e;

    public w0(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975, x.b bVar) {
        this.f506104e = abstractC1183x100d4975;
        this.f506103d = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f506103d.m174754xc84af884(animator);
        this.f506104e.f93933z.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f506104e.f93933z.add(animator);
    }
}
