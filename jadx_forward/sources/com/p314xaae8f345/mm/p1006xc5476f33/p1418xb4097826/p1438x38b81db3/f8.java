package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class f8 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f184885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f184886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184887f;

    public f8(yz5.a aVar, boolean z17, android.widget.TextView textView) {
        this.f184885d = aVar;
        this.f184886e = z17;
        this.f184887f = textView;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setToMachineTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        yz5.a aVar = this.f184885d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setToMachineTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        boolean z17 = this.f184886e;
        android.widget.TextView textView = this.f184887f;
        if (z17) {
            ds6.setColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560796uf));
        } else {
            ds6.setColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560793uc));
        }
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
