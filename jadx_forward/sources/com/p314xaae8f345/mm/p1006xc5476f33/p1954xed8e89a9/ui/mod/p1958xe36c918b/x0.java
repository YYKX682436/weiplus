package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes3.dex */
public final class x0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.EditText f235682d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f235683e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f235684f;

    /* renamed from: g, reason: collision with root package name */
    public final gr3.m f235685g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f235686h;

    public x0(android.widget.EditText editText, android.view.View tooltip, java.lang.String remark, gr3.m reporter, yz5.a onClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tooltip, "tooltip");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remark, "remark");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        this.f235682d = editText;
        this.f235683e = tooltip;
        this.f235684f = remark;
        this.f235685g = reporter;
        this.f235686h = onClick;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModRemarkUIWxContact$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WriteRemarkSpan", "oncreate WriteRemarkSpan");
        java.lang.String str = this.f235684f;
        android.widget.EditText editText = this.f235682d;
        editText.setText(str);
        editText.setSelection(editText.getText().length());
        android.view.View view = this.f235683e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModRemarkUIWxContact$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModRemarkUIWxContact$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f235686h.mo152xb9724478();
        this.f235685g.a();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModRemarkUIWxContact$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f235682d.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560257ff));
        ds6.setUnderlineText(false);
    }
}
