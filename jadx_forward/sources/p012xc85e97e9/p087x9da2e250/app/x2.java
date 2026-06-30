package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class x2 extends p012xc85e97e9.p087x9da2e250.app.b3 {
    public static boolean y(android.transition.Transition transition) {
        return (p012xc85e97e9.p087x9da2e250.app.b3.j(transition.getTargetIds()) && p012xc85e97e9.p087x9da2e250.app.b3.j(transition.getTargetNames()) && p012xc85e97e9.p087x9da2e250.app.b3.j(transition.getTargetTypes())) ? false : true;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void a(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((android.transition.Transition) obj).addTarget(view);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void b(java.lang.Object obj, java.util.ArrayList arrayList) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        if (transition == null) {
            return;
        }
        int i17 = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i17 < transitionCount) {
                b(transitionSet.getTransitionAt(i17), arrayList);
                i17++;
            }
            return;
        }
        if (y(transition) || !p012xc85e97e9.p087x9da2e250.app.b3.j(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i17 < size) {
            transition.addTarget((android.view.View) arrayList.get(i17));
            i17++;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void c(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, (android.transition.Transition) obj);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public boolean e(java.lang.Object obj) {
        return obj instanceof android.transition.Transition;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public java.lang.Object g(java.lang.Object obj) {
        if (obj != null) {
            return ((android.transition.Transition) obj).clone();
        }
        return null;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public java.lang.Object k(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        android.transition.Transition transition2 = (android.transition.Transition) obj2;
        android.transition.Transition transition3 = (android.transition.Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new android.transition.TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public java.lang.Object l(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((android.transition.Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((android.transition.Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((android.transition.Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void n(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((android.transition.Transition) obj).removeTarget(view);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void o(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.List<android.view.View> targets;
        android.transition.Transition transition = (android.transition.Transition) obj;
        int i17 = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i17 < transitionCount) {
                o(transitionSet.getTransitionAt(i17), arrayList, arrayList2);
                i17++;
            }
            return;
        }
        if (y(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i17 < size) {
            transition.addTarget((android.view.View) arrayList2.get(i17));
            i17++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((android.view.View) arrayList.get(size2));
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void p(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((android.transition.Transition) obj).addListener(new p012xc85e97e9.p087x9da2e250.app.t2(this, view, arrayList));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void q(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3) {
        ((android.transition.Transition) obj).addListener(new p012xc85e97e9.p087x9da2e250.app.u2(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void r(java.lang.Object obj, android.graphics.Rect rect) {
        if (obj != null) {
            ((android.transition.Transition) obj).setEpicenterCallback(new p012xc85e97e9.p087x9da2e250.app.w2(this, rect));
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void s(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            i(view, rect);
            ((android.transition.Transition) obj).setEpicenterCallback(new p012xc85e97e9.p087x9da2e250.app.s2(this, rect));
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void t(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.Object obj, j3.h hVar, java.lang.Runnable runnable) {
        ((android.transition.Transition) obj).addListener(new p012xc85e97e9.p087x9da2e250.app.v2(this, runnable));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void v(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        java.util.List<android.view.View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            p012xc85e97e9.p087x9da2e250.app.b3.d(targets, (android.view.View) arrayList.get(i17));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void w(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            o(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public java.lang.Object x(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        transitionSet.addTransition((android.transition.Transition) obj);
        return transitionSet;
    }
}
