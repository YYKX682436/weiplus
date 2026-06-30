package sa5;

/* loaded from: classes14.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public sa5.k f486881a;

    /* renamed from: b, reason: collision with root package name */
    public sa5.p f486882b;

    /* renamed from: c, reason: collision with root package name */
    public sa5.w f486883c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f486884d;

    public abstract void a();

    public final void b(yz5.a aVar, long j17) {
        if (e()) {
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else {
            c();
            android.view.View view = this.f486884d;
            if (view != null) {
                view.post(new sa5.i(this, j17, aVar));
            }
        }
    }

    public abstract void c();

    public void d() {
        sa5.p pVar;
        float measuredWidth = this.f486884d != null ? r0.getMeasuredWidth() : 0.0f;
        float measuredHeight = this.f486884d != null ? r2.getMeasuredHeight() : 0.0f;
        android.view.View view = this.f486884d;
        if (view == null || (pVar = this.f486882b) == null) {
            return;
        }
        sa5.r rVar = sa5.r.f486902a;
        sa5.v vVar = pVar.f486899d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar, rVar)) {
            float f17 = 2;
            view.setPivotX(measuredWidth / f17);
            view.setPivotY(measuredHeight / f17);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar, sa5.q.f486901a)) {
            view.setPivotX(measuredWidth / 2);
            view.setPivotY(measuredHeight);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar, sa5.s.f486903a)) {
            view.setPivotX(measuredWidth / 2);
            view.setPivotY(0.0f);
        }
    }

    public abstract boolean e();

    public android.view.animation.Interpolator f() {
        return ta5.h.f498412a.a();
    }

    public abstract void g(android.view.ViewPropertyAnimator viewPropertyAnimator);

    public void h(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
