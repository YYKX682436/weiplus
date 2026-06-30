package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class f8 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f103352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f103353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103354f;

    public f8(yz5.a aVar, boolean z17, android.widget.TextView textView) {
        this.f103352d = aVar;
        this.f103353e = z17;
        this.f103354f = textView;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setToMachineTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        yz5.a aVar = this.f103352d;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setToMachineTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        boolean z17 = this.f103353e;
        android.widget.TextView textView = this.f103354f;
        if (z17) {
            ds6.setColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479263uf));
        } else {
            ds6.setColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479260uc));
        }
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
