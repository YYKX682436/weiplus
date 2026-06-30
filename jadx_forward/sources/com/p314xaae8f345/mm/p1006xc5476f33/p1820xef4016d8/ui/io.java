package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public final class io implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo f228568d;

    public io(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo joVar) {
        this.f228568d = joVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo joVar = this.f228568d;
        if (joVar.m80379x76847179().isFinishing() || joVar.m80379x76847179().isDestroyed()) {
            return;
        }
        if (!joVar.O6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[updateRightTextOptionMenuRedDot] do not show reddot");
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = joVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI");
        r45.lm5 c76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d) m158354x19263085).c7();
        if (c76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[updateRightTextOptionMenuRedDot] redDotData == null");
            return;
        }
        int i17 = c76.f461155d;
        if (i17 == 1) {
            joVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowNewRedDotStyle]");
            android.widget.TextView textView = (android.widget.TextView) joVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564019fu);
            android.widget.TextView textView2 = (android.widget.TextView) joVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.bzc);
            if (textView == null || textView2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowNewRedDotStyle] actionOptionTv == null || actionOptionRedTv == null");
                return;
            }
            textView2.setVisibility(0);
            textView.setPadding(i65.a.b(joVar.m80379x76847179(), 4), 0, i65.a.b(joVar.m80379x76847179(), 16), 0);
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.Cdo(joVar));
            return;
        }
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[updateRightTextOptionMenuRedDot] unknown type");
            return;
        }
        joVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowUpdateRedDotStyle]");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = joVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d) m158354x192630852).i7(27);
        android.widget.TextView textView3 = (android.widget.TextView) joVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564019fu);
        if (textView3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowUpdateRedDotStyle] actionOptionTv == null");
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = joVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d) m158354x192630853).m78613xf365e75(1, true);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570783dv5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo moVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo(inflate);
        joVar.f228608d = moVar;
        moVar.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575792ya);
        moVar.setFocusable(false);
        moVar.getContentView().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.eo(moVar, joVar));
        moVar.getContentView().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fo(moVar), 3000L);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) moVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.f567356rw1);
        java.lang.String str = c76.f461164p;
        if (str == null || str.length() == 0) {
            c19659x677e0913.setVisibility(8);
        } else {
            c19659x677e0913.setVisibility(0);
            c19659x677e0913.m75396xca029dad(c76.f461164p);
        }
        java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.g(c76);
        if (g17 == null || g17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC", "[doShowUpdateRedDotStyle] title isNullOrEmpty");
            return;
        }
        android.widget.TextView textView4 = (android.widget.TextView) moVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.f567358rw3);
        android.widget.ImageView imageView = (android.widget.ImageView) moVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.f567360rw5);
        textView4.setText(g17);
        textView3.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ho(joVar, moVar, textView3, imageView), 50L);
    }
}
