package k23;

/* loaded from: classes12.dex */
public final class q1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f385197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f385198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f385199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f385200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f385201h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385202i;

    public q1(android.view.ViewGroup viewGroup, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, android.widget.ImageView imageView4, k23.j2 j2Var) {
        this.f385197d = viewGroup;
        this.f385198e = imageView;
        this.f385199f = imageView2;
        this.f385200g = imageView3;
        this.f385201h = imageView4;
        this.f385202i = j2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141816x25712705;
        android.view.ViewGroup viewGroup = this.f385197d;
        viewGroup.getOverlay().remove(this.f385198e);
        viewGroup.getOverlay().remove(this.f385199f);
        viewGroup.getOverlay().remove(this.f385200g);
        viewGroup.getOverlay().remove(this.f385201h);
        k23.j2 j2Var = this.f385202i;
        m141816x25712705 = j2Var.m141816x25712705();
        m141816x25712705.setAlpha(1.0f);
        j2Var.m141804x8ee3d2b2().setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
