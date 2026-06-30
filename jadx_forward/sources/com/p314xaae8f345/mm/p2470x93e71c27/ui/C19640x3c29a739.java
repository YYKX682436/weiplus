package com.p314xaae8f345.mm.p2470x93e71c27.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/LoadingTipsView;", "Landroid/widget/FrameLayout;", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "Ljz5/f0;", "setTips", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.LoadingTipsView */
/* loaded from: classes.dex */
public final class C19640x3c29a739 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f271306d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f271307e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f271308f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19640x3c29a739(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setTips */
    private final void m75360x765082ba(java.lang.String str) {
        android.widget.TextView textView;
        if (str == null || (textView = this.f271308f) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoadingTipsVIew", "showEmptyTips: ");
        android.view.View view = this.f271307e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/LoadingTipsView", "hideLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/LoadingTipsView", "hideLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        m75360x765082ba(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cep));
    }

    public final void b() {
        android.view.View view = this.f271307e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/LoadingTipsView", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/LoadingTipsView", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoadingTipsVIew", "showLoadingWithTips: ");
        b();
        m75360x765082ba(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m7f));
    }

    public final void d(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoadingTipsVIew", "showLoadingWithTips: ");
        b();
        m75360x765082ba(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19640x3c29a739(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dog, this);
        this.f271306d = inflate;
        if (inflate != null) {
            this.f271307e = inflate.findViewById(com.p314xaae8f345.mm.R.id.imd);
            this.f271308f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oqc);
        }
    }
}
