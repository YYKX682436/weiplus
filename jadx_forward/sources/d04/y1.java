package d04;

/* loaded from: classes8.dex */
public final class y1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d04.g f307091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17333xea344dac f307092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17346xe5e5429e f307093f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f307094g;

    public y1(d04.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17333xea344dac c17333xea344dac, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17346xe5e5429e c17346xe5e5429e, sz3.a1 a1Var) {
        this.f307091d = gVar;
        this.f307092e = c17333xea344dac;
        this.f307093f = c17346xe5e5429e;
        this.f307094g = a1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f307092e.removeView(this.f307093f);
        d04.w1 w1Var = this.f307092e.f241295f;
        if (w1Var != null) {
            sz3.a1 requestInfo = this.f307094g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestInfo, "requestInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = requestInfo.f495492a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductMaskDecorView", "addNewProduct trackId: " + c17282x335f2f60.getId());
            synchronized (w1Var.f307073m) {
                if (w1Var.f307073m.containsKey(java.lang.Integer.valueOf(c17282x335f2f60.getId()))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductMaskDecorView", "addNewProduct trackId: " + c17282x335f2f60.getId() + " insert");
                    w1Var.f307072i.add(0, java.lang.Integer.valueOf(c17282x335f2f60.getId()));
                    w1Var.m8149x8b456734(1);
                } else {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = w1Var.f307068e.getLayoutManager();
                    if (layoutManager != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "addProductInfo", "(Lcom/tencent/mm/plugin/scanner/scan_goods_new/ScanProductRequestInfo;)V", "Undefined", "scrollToPosition", "(I)V");
                        layoutManager.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(layoutManager, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "addProductInfo", "(Lcom/tencent/mm/plugin/scanner/scan_goods_new/ScanProductRequestInfo;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductMaskDecorView", "addNewProduct trackId: " + c17282x335f2f60.getId() + " pending insert");
                    w1Var.f307075o.add(java.lang.Integer.valueOf(c17282x335f2f60.getId()));
                }
            }
        }
        this.f307091d.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f307091d.b();
    }
}
