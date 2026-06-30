package oa5;

/* loaded from: classes8.dex */
public class m extends oa5.j {
    @Override // oa5.b
    public oa5.b k(oa5.a aVar) {
        if (((android.view.ViewPropertyAnimator) this.f425415g.get()) != null) {
            this.f425392e = aVar;
        }
        return this;
    }

    @Override // oa5.j, oa5.b
    public void l() {
        java.lang.System.currentTimeMillis();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f);
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        java.lang.Runnable runnable = this.f425390c;
        if (runnable != null) {
            this.f425388a.put(ofFloat, runnable);
            this.f425390c = null;
        }
        java.lang.Runnable runnable2 = this.f425391d;
        if (runnable2 != null) {
            this.f425389b.put(ofFloat, runnable2);
            this.f425391d = null;
        }
        viewPropertyAnimator.setListener(new oa5.k(this, ofFloat));
        if (this.f425392e != null) {
            viewPropertyAnimator.setUpdateListener(new oa5.l(this));
        }
        viewPropertyAnimator.start();
    }
}
