package sa5;

/* loaded from: classes14.dex */
public abstract class e extends sa5.j {

    /* renamed from: e, reason: collision with root package name */
    public float f486868e;

    @Override // sa5.j
    public void a() {
    }

    @Override // sa5.j
    public void c() {
        sa5.p pVar;
        android.view.View view = this.f486884d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f486884d;
        this.f486868e = view2 != null ? view2.getAlpha() : 0.0f;
        android.view.View view3 = this.f486884d;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view4 = this.f486884d;
        if (view4 == null || (pVar = this.f486882b) == null) {
            return;
        }
        view4.setScaleX(pVar.f486896a);
        view4.setScaleY(pVar.f486897b);
    }

    @Override // sa5.j
    public void d() {
        super.d();
        android.view.View view = this.f486884d;
        if (view != null) {
            float f17 = this.f486868e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            sa5.k kVar = this.f486881a;
            if (kVar != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(kVar.f486886a));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            float measuredWidth = this.f486884d != null ? r0.getMeasuredWidth() : 0.0f;
            float measuredHeight = this.f486884d != null ? r2.getMeasuredHeight() : 0.0f;
            sa5.w wVar = this.f486883c;
            if (wVar != null) {
                view.setTranslationX(((java.lang.Number) wVar.f486904a.mo146xb9724478(java.lang.Float.valueOf(measuredWidth))).floatValue());
                view.setTranslationY(((java.lang.Number) wVar.f486905b.mo146xb9724478(java.lang.Float.valueOf(measuredHeight))).floatValue());
            }
        }
    }

    @Override // sa5.j
    public boolean e() {
        return false;
    }

    @Override // sa5.j
    public void g(android.view.ViewPropertyAnimator viewPropertyAnimator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewPropertyAnimator, "viewPropertyAnimator");
        viewPropertyAnimator.alpha(1.0f);
        viewPropertyAnimator.scaleX(1.0f);
        viewPropertyAnimator.scaleY(1.0f);
        viewPropertyAnimator.translationX(0.0f);
        viewPropertyAnimator.translationY(0.0f);
    }

    public final sa5.e i(sa5.e otherAction) {
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
}
