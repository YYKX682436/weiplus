package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class l6 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m6 f200441d;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m6 m6Var) {
        this.f200441d = m6Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorLiveReplaySettingWidget$setCopyLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m6 m6Var = this.f200441d;
        m6Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e("https://channels.weixin.qq.com/");
        android.content.Context context = m6Var.f199914d;
        db5.t7.h(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorLiveReplaySettingWidget$setCopyLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f200441d.f199914d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
