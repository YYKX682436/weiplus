package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class d8 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.i8 f103132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103133e;

    public d8(com.tencent.mm.plugin.finder.convert.i8 i8Var, in5.s0 s0Var) {
        this.f103132d = i8Var;
        this.f103133e = s0Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setNoLbsSameCityPermission$3", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        yz5.a aVar = this.f103132d.f103648f;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setNoLbsSameCityPermission$3", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        boolean z17 = this.f103132d.f103650h;
        in5.s0 s0Var = this.f103133e;
        if (z17) {
            ds6.setColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.Link_Night_Mode));
        } else {
            ds6.setColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.Link_100));
        }
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
