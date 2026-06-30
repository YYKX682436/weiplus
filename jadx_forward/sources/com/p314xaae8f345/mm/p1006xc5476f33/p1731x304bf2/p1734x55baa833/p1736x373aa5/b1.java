package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f220573d = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f220574e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f220575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 f220576g;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 e1Var, java.lang.Object obj, java.util.List list) {
        this.f220576g = e1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f220574e = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f220575f = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.e1 e1Var = this.f220576g;
        int measuredWidth = e1Var.f220617n.getMeasuredWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.d1();
        java.util.Iterator it = ((java.util.ArrayList) this.f220574e).iterator();
        int i17 = 0;
        boolean z17 = false;
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            int measuredWidth2 = view.getMeasuredWidth() > measuredWidth ? measuredWidth : view.getMeasuredWidth();
            i17 += measuredWidth2;
            int i18 = this.f220573d;
            if (i17 > measuredWidth || z17) {
                if (z17) {
                    measuredWidth2 = i17;
                } else {
                    z17 = true;
                }
                if (measuredWidth2 > measuredWidth) {
                    break;
                }
                e1Var.f220618o.addView(view);
                d1Var.f220600b = view.getMeasuredHeight();
                if (measuredWidth - measuredWidth2 >= i18) {
                    e1Var.f220618o.addView(new android.view.View(e1Var.f220830d), new android.widget.LinearLayout.LayoutParams(i18, 8));
                    measuredWidth2 += i18;
                }
                i17 = measuredWidth2;
            } else {
                e1Var.f220617n.addView(view);
                d1Var.f220599a = view.getMeasuredHeight();
                if (measuredWidth - i17 >= i18) {
                    e1Var.f220617n.addView(new android.view.View(e1Var.f220830d), new android.widget.LinearLayout.LayoutParams(i18, 8));
                    i17 += i18;
                }
            }
        }
        java.lang.Object obj = this.f220575f;
        if (obj != null) {
            e1Var.f220628y.put(obj, d1Var);
        }
    }
}
