package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes14.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f296072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q f296073e;

    public h(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q qVar, java.util.ArrayList arrayList) {
        this.f296073e = qVar;
        this.f296072d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f296072d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q qVar = this.f296073e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f296149n.remove(arrayList);
                return;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o oVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.o) it.next();
            qVar.getClass();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var = oVar.f296129a;
            android.view.View view = y1Var == null ? null : y1Var.f296236d;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var2 = oVar.f296130b;
            android.view.View view2 = y1Var2 != null ? y1Var2.f296236d : null;
            java.util.ArrayList arrayList2 = qVar.f296153r;
            long j17 = qVar.f295999f;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(j17);
                arrayList2.add(oVar.f296129a);
                duration.translationX(oVar.f296133e - oVar.f296131c);
                duration.translationY(oVar.f296134f - oVar.f296132d);
                duration.alpha(0.0f).setListener(new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m(qVar, oVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(oVar.f296130b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(j17).alpha(1.0f).setListener(new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n(qVar, oVar, animate, view2)).start();
            }
        }
    }
}
