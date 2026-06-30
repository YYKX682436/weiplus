package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class yb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc f198372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f198373e;

    public yb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar, r45.lv1 lv1Var) {
        this.f198372d = mcVar;
        this.f198373e = lv1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.p42 p42Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar = this.f198372d;
        mcVar.f198017b.i7(4);
        mcVar.b("attendClick");
        if (!((mm2.c1) mcVar.f198017b.m56788xbba4bfc0(mm2.c1.class)).f410435w || !((mm2.c1) mcVar.f198017b.m56788xbba4bfc0(mm2.c1.class)).f410429v) {
            db5.t7.m(mcVar.f198019d.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_h));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r45.uv1 uv1Var = (r45.uv1) this.f198373e.m75936x14adae67(1);
        if (uv1Var == null || (p42Var = (r45.p42) uv1Var.m75936x14adae67(10)) == null || (str = p42Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            df2.ar arVar = mcVar.f198017b;
            qo0.b bVar = qo0.b.W2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", str);
            arVar.X6(bVar, bundle);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mcVar.f198018c, "[input-auto-wording]  text = ".concat(str));
        } else {
            if2.b.Y6(mcVar.f198017b, qo0.b.W2, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindAttendButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
