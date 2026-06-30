package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class ac implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc f197723d;

    public ac(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar) {
        this.f197723d = mcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar = this.f197723d;
        mcVar.f198017b.i7(4);
        mcVar.b("attendClick");
        if (((mm2.d) mcVar.f198017b.m56788xbba4bfc0(mm2.d.class)).N6()) {
            mcVar.f198017b.a7();
        } else {
            dk2.Cif cif = dk2.Cif.f315159a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = mcVar.f198017b.f372632e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.live.plugin.ILiveStatus");
            cif.a((qo0.c) ubVar, ((mm2.e1) mcVar.f198017b.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), dk2.hf.f315124i, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
