package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes3.dex */
public final class e4 extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.d4 f233352b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f233353c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f233354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.d4 d4Var) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f233352b = d4Var;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5b, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        android.view.View findViewById = getContentView().findViewById(com.p314xaae8f345.mm.R.id.oqc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.ovk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f233353c = findViewById2;
        android.view.View findViewById3 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.jge);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f233354d = findViewById3;
        getContentView().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.c4(this));
    }

    public final void a() {
        android.view.View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
