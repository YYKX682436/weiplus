package sa5;

/* loaded from: classes14.dex */
public abstract class f extends sa5.j {

    /* renamed from: e, reason: collision with root package name */
    public final int f486870e;

    public f(int i17) {
        this.f486870e = i17;
    }

    @Override // sa5.j
    public void a() {
        android.view.View view = this.f486884d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f486870e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/inout/AnimOutAction", "afterAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/anim/inout/AnimOutAction", "afterAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // sa5.j
    public void c() {
    }

    @Override // sa5.j
    public boolean e() {
        android.view.View view = this.f486884d;
        return view != null && view.getVisibility() == this.f486870e;
    }

    @Override // sa5.j
    public android.view.animation.Interpolator f() {
        return super.f();
    }

    @Override // sa5.j
    public void g(android.view.ViewPropertyAnimator viewPropertyAnimator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewPropertyAnimator, "viewPropertyAnimator");
        sa5.k kVar = this.f486881a;
        if (kVar != null) {
            viewPropertyAnimator.alpha(kVar.f486886a);
        }
        sa5.p pVar = this.f486882b;
        if (pVar != null) {
            viewPropertyAnimator.scaleX(pVar.f486896a);
            viewPropertyAnimator.scaleY(pVar.f486897b);
        }
        sa5.w wVar = this.f486883c;
        if (wVar != null) {
            viewPropertyAnimator.translationX(((java.lang.Number) wVar.f486904a.mo146xb9724478(java.lang.Float.valueOf(this.f486884d != null ? r1.getMeasuredWidth() : 0.0f))).floatValue());
            viewPropertyAnimator.translationY(((java.lang.Number) wVar.f486905b.mo146xb9724478(java.lang.Float.valueOf(this.f486884d != null ? r1.getMeasuredHeight() : 0.0f))).floatValue());
        }
    }

    public final sa5.f i(sa5.f otherAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherAction, "otherAction");
        sa5.k kVar = this.f486881a;
        if (kVar == null) {
            kVar = otherAction.f486881a;
        }
        this.f486881a = kVar;
        sa5.p pVar = this.f486882b;
        if (pVar == null) {
            pVar = otherAction.f486882b;
        }
        this.f486882b = pVar;
        sa5.w wVar = this.f486883c;
        if (wVar == null) {
            wVar = otherAction.f486883c;
        }
        this.f486883c = wVar;
        return this;
    }

    public /* synthetic */ f(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 4 : i17);
    }
}
