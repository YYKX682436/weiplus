package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class zb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc f198395d;

    public zb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar) {
        this.f198395d = mcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar = this.f198395d;
        mcVar.f198017b.i7(4);
        mcVar.b("attendClick");
        if (((mm2.c1) mcVar.f198017b.m56788xbba4bfc0(mm2.c1.class)).F) {
            if2.b.Y6(mcVar.f198017b, qo0.b.f446949t3, null, 2, null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            db5.t7.m(mcVar.f198019d.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dly));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
