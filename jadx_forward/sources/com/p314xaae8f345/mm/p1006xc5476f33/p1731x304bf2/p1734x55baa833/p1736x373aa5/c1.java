package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes5.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f220585d = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f220586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 f220587f;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 e1Var, java.util.List list) {
        this.f220587f = e1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f220586e = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 e1Var = this.f220587f;
        e1Var.f220619p.removeAllViews();
        int measuredWidth = e1Var.f220619p.getMeasuredWidth();
        java.util.Iterator it = ((java.util.ArrayList) this.f220586e).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            i17 += view.getMeasuredWidth() > measuredWidth ? measuredWidth : view.getMeasuredWidth();
            if (i17 > measuredWidth) {
                return;
            }
            e1Var.f220619p.addView(view);
            int i18 = measuredWidth - i17;
            int i19 = this.f220585d;
            if (i18 >= i19) {
                e1Var.f220619p.addView(new android.view.View(e1Var.f220830d), new android.widget.LinearLayout.LayoutParams(i19, 8));
                i17 += i19;
            }
        }
    }
}
