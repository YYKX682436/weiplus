package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes8.dex */
public final class b extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f235411d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f235412e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f235413f;

    /* renamed from: g, reason: collision with root package name */
    public final uc0.p f235414g;

    public b(android.content.Context context, java.lang.String remark, yz5.a currentDescOnClick, uc0.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remark, "remark");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentDescOnClick, "currentDescOnClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f235411d = context;
        this.f235412e = remark;
        this.f235413f = currentDescOnClick;
        this.f235414g = callback;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components/ModDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(((java.lang.CharSequence) this.f235413f.mo152xb9724478()).toString(), com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2);
        android.content.Context context = widget.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) {
            context = ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context).m81186xd24c19fa();
        }
        hw3.a.a(context, this.f235412e, e17, 400, this.f235414g);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components/ModDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(this.f235411d.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560257ff));
        ds6.setUnderlineText(false);
    }
}
