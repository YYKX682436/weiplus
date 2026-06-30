package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class h8 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f185092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f185093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f185094f;

    public h8(yz5.a aVar, android.widget.TextView textView, boolean z17) {
        this.f185092d = aVar;
        this.f185093e = textView;
        this.f185094f = z17;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setToTargetTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        yz5.a aVar = this.f185092d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setToTargetTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f185093e.getContext().getResources().getColor(this.f185094f ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77829xf0e3277d : com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
