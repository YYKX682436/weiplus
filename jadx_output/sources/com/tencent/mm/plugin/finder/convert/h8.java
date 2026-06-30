package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class h8 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f103559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f103561f;

    public h8(yz5.a aVar, android.widget.TextView textView, boolean z17) {
        this.f103559d = aVar;
        this.f103560e = textView;
        this.f103561f = z17;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setToTargetTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        yz5.a aVar = this.f103559d;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setToTargetTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f103560e.getContext().getResources().getColor(this.f103561f ? com.tencent.mm.R.color.Link_100_Night_Mode : com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
