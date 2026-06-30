package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes14.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296135d;

    public o0(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        this.f296135d = c22949xf1deaba4;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296135d;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b1 b1Var = c22949xf1deaba4.S;
        if (b1Var != null) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q qVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q) b1Var;
            java.util.ArrayList arrayList = qVar.f296143h;
            boolean z17 = !arrayList.isEmpty();
            java.util.ArrayList arrayList2 = qVar.f296145j;
            boolean z18 = !arrayList2.isEmpty();
            java.util.ArrayList arrayList3 = qVar.f296146k;
            boolean z19 = !arrayList3.isEmpty();
            java.util.ArrayList arrayList4 = qVar.f296144i;
            boolean z27 = !arrayList4.isEmpty();
            if (z17 || z18 || z27 || z19) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    j17 = qVar.f295997d;
                    if (!hasNext) {
                        break;
                    }
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) it.next();
                    android.view.View view = y1Var.f296236d;
                    android.view.ViewPropertyAnimator animate = view.animate();
                    qVar.f296152q.add(y1Var);
                    animate.setDuration(j17).alpha(0.0f).setListener(new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j(qVar, y1Var, animate, view)).start();
                    it = it;
                }
                arrayList.clear();
                if (z18) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.addAll(arrayList2);
                    qVar.f296148m.add(arrayList5);
                    arrayList2.clear();
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g gVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g(qVar, arrayList5);
                    if (z17) {
                        android.view.View view2 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p) arrayList5.get(0)).f296136a.f296236d;
                        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                        n3.u0.n(view2, gVar, j17);
                    } else {
                        gVar.run();
                    }
                }
                if (z19) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.addAll(arrayList3);
                    qVar.f296149n.add(arrayList6);
                    arrayList3.clear();
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h hVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h(qVar, arrayList6);
                    if (z17) {
                        android.view.View view3 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o) arrayList6.get(0)).f296129a.f296236d;
                        java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                        n3.u0.n(view3, hVar, j17);
                    } else {
                        hVar.run();
                    }
                }
                if (z27) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.addAll(arrayList4);
                    qVar.f296147l.add(arrayList7);
                    arrayList4.clear();
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.i iVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.i(qVar, arrayList7);
                    if (z17 || z18 || z19) {
                        if (!z17) {
                            j17 = 0;
                        }
                        long max = j17 + java.lang.Math.max(z18 ? qVar.f295998e : 0L, z19 ? qVar.f295999f : 0L);
                        android.view.View view4 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList7.get(0)).f296236d;
                        java.util.WeakHashMap weakHashMap3 = n3.l1.f415895a;
                        n3.u0.n(view4, iVar, max);
                    } else {
                        iVar.run();
                    }
                }
            }
        }
        c22949xf1deaba4.L1 = false;
    }
}
