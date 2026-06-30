package ql5;

/* loaded from: classes15.dex */
public class b implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f446120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ql5.e f446121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ql5.d f446122c;

    public b(ql5.d dVar, int i17, ql5.e eVar) {
        this.f446122c = dVar;
        this.f446120a = i17;
        this.f446121b = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ql5.d dVar = this.f446122c;
        dVar.a(this.f446120a).f446139a = false;
        dVar.notifyDataSetChanged();
        this.f446121b.setTag(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
