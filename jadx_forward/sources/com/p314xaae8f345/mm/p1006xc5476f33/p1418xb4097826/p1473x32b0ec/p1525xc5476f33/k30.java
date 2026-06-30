package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class k30 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 f194721d;

    public k30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var) {
        this.f194721d = r30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r30 r30Var = this.f194721d;
        android.widget.RelativeLayout relativeLayout = r30Var.f195610q;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        android.content.Context context = r30Var.f195610q.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        layoutParams.width = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x7.b(context);
        relativeLayout.setLayoutParams(layoutParams);
    }
}
