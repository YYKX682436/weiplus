package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class i3 extends p012xc85e97e9.p087x9da2e250.app.m3 {

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.d2 f92894h;

    public i3(p012xc85e97e9.p087x9da2e250.app.l3 l3Var, p012xc85e97e9.p087x9da2e250.app.k3 k3Var, p012xc85e97e9.p087x9da2e250.app.d2 d2Var, j3.h hVar) {
        super(l3Var, k3Var, d2Var.f92837c, hVar);
        this.f92894h = d2Var;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.m3
    public void b() {
        if (!this.f92939g) {
            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                m7756x9616526c();
            }
            this.f92939g = true;
            java.util.Iterator it = ((java.util.ArrayList) this.f92936d).iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
        this.f92894h.j();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.m3
    public void d() {
        if (this.f92934b == p012xc85e97e9.p087x9da2e250.app.k3.ADDING) {
            p012xc85e97e9.p087x9da2e250.app.d2 d2Var = this.f92894h;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var.f92837c;
            android.view.View findFocus = componentCallbacksC1101xa17d4670.f3462x628b0b2.findFocus();
            if (findFocus != null) {
                componentCallbacksC1101xa17d4670.m7567xf50360fa(findFocus);
                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                    findFocus.toString();
                    componentCallbacksC1101xa17d4670.mo7591x9616526c();
                }
            }
            android.view.View m7554x159e75aa = this.f92935c.m7554x159e75aa();
            if (m7554x159e75aa.getParent() == null) {
                d2Var.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m7554x159e75aa, arrayList.toArray(), "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                m7554x159e75aa.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(m7554x159e75aa, "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (m7554x159e75aa.getAlpha() == 0.0f && m7554x159e75aa.getVisibility() == 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(m7554x159e75aa, arrayList2.toArray(), "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m7554x159e75aa.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(m7554x159e75aa, "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            float m7458x687aaa50 = componentCallbacksC1101xa17d4670.m7458x687aaa50();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(m7458x687aaa50));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(m7554x159e75aa, arrayList3.toArray(), "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            m7554x159e75aa.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(m7554x159e75aa, "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
