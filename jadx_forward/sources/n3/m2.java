package n3;

/* loaded from: classes14.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f415903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n3.s2 f415904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n3.i2 f415905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f415906g;

    public m2(n3.n2 n2Var, android.view.View view, n3.s2 s2Var, n3.i2 i2Var, android.animation.ValueAnimator valueAnimator) {
        this.f415903d = view;
        this.f415904e = s2Var;
        this.f415905f = i2Var;
        this.f415906g = valueAnimator;
    }

    @Override // java.lang.Runnable
    public void run() {
        n3.o2.h(this.f415903d, this.f415904e, this.f415905f);
        this.f415906g.start();
    }
}
