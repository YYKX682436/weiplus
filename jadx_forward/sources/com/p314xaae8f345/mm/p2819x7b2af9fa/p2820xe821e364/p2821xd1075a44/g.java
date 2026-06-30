package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f296052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q f296053e;

    public g(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q qVar, java.util.ArrayList arrayList) {
        this.f296053e = qVar;
        this.f296052d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f296052d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q qVar = this.f296053e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f296148m.remove(arrayList);
                return;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p pVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.p) it.next();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var = pVar.f296136a;
            qVar.getClass();
            android.view.View view = y1Var.f296236d;
            int i17 = pVar.f296139d - pVar.f296137b;
            int i18 = pVar.f296140e - pVar.f296138c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            qVar.f296151p.add(y1Var);
            animate.setDuration(qVar.f295998e).setListener(new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.l(qVar, y1Var, i17, view, i18, animate)).start();
        }
    }
}
