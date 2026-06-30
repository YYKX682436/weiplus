package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class je extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se f200287d;

    public je(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar) {
        this.f200287d = seVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("license click,licenseClickCallback is null:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar = this.f200287d;
        sb6.append(seVar.f201291f == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveExceptionWidget", sb6.toString());
        yz5.l lVar = seVar.f201291f;
        if (lVar == null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
            j45.l.j(widget.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } else if (lVar != null) {
            lVar.mo146xb9724478("https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f200287d.f201286a.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77834x6dc6993d));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
