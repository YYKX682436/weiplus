package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1496x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#B#\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/convert/view/FinderLiveFeedToastView;", "Landroid/widget/FrameLayout;", "", "str", "Ljz5/f0;", "setTitle", "setDesc", "Landroid/view/View$OnClickListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setDescClickListener", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTitleTxtView", "()Landroid/widget/TextView;", "setTitleTxtView", "(Landroid/widget/TextView;)V", "titleTxtView", "e", "getDescTxtView", "setDescTxtView", "descTxtView", "Landroid/view/View;", "f", "Landroid/view/View;", "getDescRoot", "()Landroid/view/View;", "setDescRoot", "(Landroid/view/View;)V", "descRoot", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView */
/* loaded from: classes2.dex */
public final class C14214xfa60143c extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView titleTxtView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView descTxtView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View descRoot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14214xfa60143c(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570422dh1, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qcn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m56822x8e60e93f((android.widget.TextView) findViewById);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f566368q44);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m56820xf039b7a2((android.widget.TextView) findViewById2);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.qcl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        m56819xb334e195(findViewById3);
    }

    /* renamed from: getDescRoot */
    public final android.view.View m56814xb87c8089() {
        android.view.View view = this.descRoot;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descRoot");
        throw null;
    }

    /* renamed from: getDescTxtView */
    public final android.widget.TextView m56815x59d4442e() {
        android.widget.TextView textView = this.descTxtView;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTxtView");
        throw null;
    }

    /* renamed from: getTitleTxtView */
    public final android.widget.TextView m56816x5817ee33() {
        android.widget.TextView textView = this.titleTxtView;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTxtView");
        throw null;
    }

    /* renamed from: setDesc */
    public final void m56817x76492e13(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        m56815x59d4442e().setText(str);
        android.view.View m56814xb87c8089 = m56814xb87c8089();
        int i17 = str.length() > 0 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m56814xb87c8089, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/view/FinderLiveFeedToastView", "setDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m56814xb87c8089.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m56814xb87c8089, "com/tencent/mm/plugin/finder/live/convert/view/FinderLiveFeedToastView", "setDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setDescClickListener */
    public final void m56818xe8299f09(android.view.View.OnClickListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        m56814xb87c8089().setOnClickListener(listener);
    }

    /* renamed from: setDescRoot */
    public final void m56819xb334e195(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.descRoot = view;
    }

    /* renamed from: setDescTxtView */
    public final void m56820xf039b7a2(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.descTxtView = textView;
    }

    /* renamed from: setTitle */
    public final void m56821x53bfe316(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        m56816x5817ee33().setText(str);
    }

    /* renamed from: setTitleTxtView */
    public final void m56822x8e60e93f(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.titleTxtView = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14214xfa60143c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14214xfa60143c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        a();
    }
}
