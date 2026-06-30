package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class e5 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 f228396d;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620) {
        this.f228396d = activityC16367x1189c620;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "long click envelope: %s", java.lang.Integer.valueOf(i17));
        in5.c cVar = (in5.c) ((in5.s0) k3Var).f374658i;
        if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5) {
            r45.wv3 wv3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5) cVar).f228548d;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620.C;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620 = this.f228396d;
            activityC16367x1189c620.getClass();
            if (wv3Var != null) {
                if ("0".equals(wv3Var.f471033f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "can not delete default envelope");
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC16367x1189c620.mo55332x76847179(), 1, true);
                    android.widget.TextView textView = new android.widget.TextView(activityC16367x1189c620.mo55332x76847179());
                    textView.setPadding(0, 0, 0, i65.a.b(activityC16367x1189c620.mo55332x76847179(), 9));
                    textView.setMinHeight(i65.a.h(activityC16367x1189c620.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561112v));
                    textView.setTextSize(14.0f);
                    textView.setTextColor(activityC16367x1189c620.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gms);
                    textView.setGravity(81);
                    k0Var.s(textView, true);
                    k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g5(activityC16367x1189c620);
                    k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.h5(activityC16367x1189c620, wv3Var);
                    k0Var.v();
                }
            }
        }
        return false;
    }
}
