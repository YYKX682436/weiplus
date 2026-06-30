package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class f0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb f259421d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb) {
        this.f259421d = activityC18999x8e4b0cb;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        java.lang.String str;
        java.lang.String str2;
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = this.f259421d;
            activityC18999x8e4b0cb.f259317f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(activityC18999x8e4b0cb.f259320i.m83183xfb85ada3(), 0.0d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC18999x8e4b0cb.f259316e;
            if (c19091x9511676c != null) {
                java.lang.String str3 = c19091x9511676c.f69223x58802fcb;
                str2 = c19091x9511676c.f69225xed6d60f6;
                str = str3;
            } else {
                at4.n a17 = at4.n.a();
                if (a17.b()) {
                    db5.e1.s(activityC18999x8e4b0cb, a17.f95435b, activityC18999x8e4b0cb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                } else {
                    str = "";
                    str2 = str;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = activityC18999x8e4b0cb.f259316e;
            if (c19091x9511676c2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c2.f69239x93565523)) {
                db5.t7.m123883x26a183b(activityC18999x8e4b0cb.mo55332x76847179(), activityC18999x8e4b0cb.f259316e.f69239x93565523, 0).show();
            } else if (activityC18999x8e4b0cb.f259317f <= 0.0d || !activityC18999x8e4b0cb.f259320i.n()) {
                db5.t7.m123882x26a183b(activityC18999x8e4b0cb.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.kfm, 0).show();
            } else if (activityC18999x8e4b0cb.f259317f > vr4.f1.wi().Ai().f95532h.O2) {
                db5.t7.m123882x26a183b(activityC18999x8e4b0cb.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.keq, 0).show();
            } else if (activityC18999x8e4b0cb.f259317f > vr4.f1.wi().Ai().f95532h.Q2) {
                db5.t7.m123882x26a183b(activityC18999x8e4b0cb.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ker, 0).show();
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
                com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
                activityC18999x8e4b0cb.e7(21, activityC18999x8e4b0cb.f259317f, "1", str, str2, activityC18999x8e4b0cb.I);
                activityC18999x8e4b0cb.mo73823x964575a5();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = activityC18999x8e4b0cb.L;
            objArr[1] = 7;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 = activityC18999x8e4b0cb.f259316e;
            objArr[2] = c19091x9511676c3 != null ? c19091x9511676c3.f69223x58802fcb : "";
            objArr[3] = c19091x9511676c3 != null ? c19091x9511676c3.f69225xed6d60f6 : "";
            g0Var.d(16398, objArr);
        }
        return true;
    }
}
