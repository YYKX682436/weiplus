package pk2;

/* loaded from: classes3.dex */
public final class q0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.u0 f437709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f437710e;

    public q0(pk2.u0 u0Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f437709d = u0Var;
        this.f437710e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorDesignedGiftOption$setupDesignedGiftDescClickableText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f437709d.f437808i, "click designed gift guide link");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.y9 y9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.y9(this.f437710e, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/dKB5Oj8391RRdAg2", null, 0.0f, 12, null);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f437710e;
        if ((abstractActivityC21394xb3d2c0cf instanceof android.app.Activity) && !abstractActivityC21394xb3d2c0cf.isFinishing() && !abstractActivityC21394xb3d2c0cf.isDestroyed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(y9Var, null, false, 0, 7, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorDesignedGiftOption$setupDesignedGiftDescClickableText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f437710e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
