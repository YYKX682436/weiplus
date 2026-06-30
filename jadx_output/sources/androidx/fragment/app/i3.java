package androidx.fragment.app;

/* loaded from: classes14.dex */
public class i3 extends androidx.fragment.app.m3 {

    /* renamed from: h, reason: collision with root package name */
    public final androidx.fragment.app.d2 f11361h;

    public i3(androidx.fragment.app.l3 l3Var, androidx.fragment.app.k3 k3Var, androidx.fragment.app.d2 d2Var, j3.h hVar) {
        super(l3Var, k3Var, d2Var.f11304c, hVar);
        this.f11361h = d2Var;
    }

    @Override // androidx.fragment.app.m3
    public void b() {
        if (!this.f11406g) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                toString();
            }
            this.f11406g = true;
            java.util.Iterator it = ((java.util.ArrayList) this.f11403d).iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
        this.f11361h.j();
    }

    @Override // androidx.fragment.app.m3
    public void d() {
        if (this.f11401b == androidx.fragment.app.k3.ADDING) {
            androidx.fragment.app.d2 d2Var = this.f11361h;
            androidx.fragment.app.Fragment fragment = d2Var.f11304c;
            android.view.View findFocus = fragment.mView.findFocus();
            if (findFocus != null) {
                fragment.setFocusedView(findFocus);
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    findFocus.toString();
                    fragment.toString();
                }
            }
            android.view.View requireView = this.f11402c.requireView();
            if (requireView.getParent() == null) {
                d2Var.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(requireView, arrayList.toArray(), "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                requireView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(requireView, "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(requireView, arrayList2.toArray(), "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                requireView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(requireView, "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            float postOnViewCreatedAlpha = fragment.getPostOnViewCreatedAlpha();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(postOnViewCreatedAlpha));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(requireView, arrayList3.toArray(), "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            requireView.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(requireView, "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
