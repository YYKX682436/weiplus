package df2;

/* loaded from: classes3.dex */
public final class lp implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sp f312223d;

    public lp(df2.sp spVar) {
        this.f312223d = spVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        int d76;
        android.view.ViewGroup J1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        df2.sp spVar = this.f312223d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(spVar.f312886m, "click to dismiss");
        if (motionEvent.getAction() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) spVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
            if ((ag0Var == null || (J1 = ag0Var.J1()) == null || !pm0.v.r(J1).contains((int) motionEvent.getX(), (int) motionEvent.getY())) ? false : true) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(spVar.f312886m, "click gift entrance");
                android.view.View view2 = spVar.f312887n;
                java.lang.String str2 = null;
                java.lang.Object tag = view2 != null ? view2.getTag() : null;
                r45.o35 o35Var = tag instanceof r45.o35 ? (r45.o35) tag : null;
                if (o35Var != null) {
                    if (o35Var.m75939xb282bd08(4) == 2 && (d76 = spVar.d7(o35Var)) > 0) {
                        android.view.View view3 = spVar.f312887n;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
                        str2 = view3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lec, java.lang.Integer.valueOf(d76));
                    }
                    r45.zb4 zb4Var = new r45.zb4();
                    r45.kv1 kv1Var = (r45.kv1) o35Var.m75936x14adae67(1);
                    if (kv1Var == null || (str = kv1Var.m75945x2fec8307(0)) == null) {
                        str = "";
                    }
                    zb4Var.set(0, str);
                    zb4Var.set(1, java.lang.Boolean.TRUE);
                    android.view.View view4 = spVar.f312887n;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
                    zb4Var.set(2, view4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573096dj5));
                    zb4Var.set(3, str2);
                    mm2.s2 s2Var = (mm2.s2) spVar.m56788xbba4bfc0(mm2.s2.class);
                    if (s2Var != null && (c14227x4262fb44 = s2Var.f410944p) != null) {
                        c14227x4262fb44.mo7808x76db6cb1(zb4Var);
                    }
                }
            }
            df2.sp.a7(spVar);
        }
        boolean z17 = motionEvent.getAction() != 2;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
