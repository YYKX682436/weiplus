package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView */
/* loaded from: classes3.dex */
public class C13344xe2832fe2 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f179786d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f179787e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f179788f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f179789g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f179790h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f179791i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f179792m;

    public C13344xe2832fe2(android.content.Context context) {
        super(context);
        this.f179792m = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.j(this);
        a();
    }

    public void a() {
        android.view.View findViewById = ((android.view.ViewGroup) com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a7t, this)).findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f179786d = findViewById;
        this.f179787e = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.dbg);
        this.f179788f = this.f179786d.findViewById(com.p314xaae8f345.mm.R.id.dap);
        android.widget.TextView textView = (android.widget.TextView) this.f179786d.findViewById(com.p314xaae8f345.mm.R.id.dc9);
        this.f179789g = textView;
        textView.setText(((java.lang.Object) getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.f572642bz0)) + " ");
        android.view.View findViewById2 = this.f179786d.findViewById(com.p314xaae8f345.mm.R.id.cvd);
        this.f179790h = findViewById2;
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.k(this));
        this.f179791i = (android.widget.TextView) this.f179786d.findViewById(com.p314xaae8f345.mm.R.id.k_3);
        b();
        m54834xa7972ee6(this.f179792m);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179120c) {
            this.f179787e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bwh);
        } else {
            this.f179787e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bwg);
        }
    }

    public void b() {
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_NEW_DESIGNER_EMOJI_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        android.widget.TextView textView = this.f179791i;
        if (textView != null) {
            textView.setVisibility(booleanValue ? 0 : 8);
        }
    }

    @Override // android.view.View
    public android.view.View getRootView() {
        return this.f179786d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: setDesignerCatalogViewPadding */
    public void m54832x9894c420(boolean z17) {
        if (this.f179788f == null || z17) {
            return;
        }
        int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp);
        int h18 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx);
        int h19 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
        this.f179788f.setPadding(h19, h17, h19, h18);
    }

    /* renamed from: setDesignerEmojiViewVisibility */
    public void m54833x6b8182d0(int i17) {
        android.view.View view = this.f179790h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setDesignerEmojiViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setDesignerEmojiViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: setMoreOnClickListener */
    public void m54834xa7972ee6(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.f179789g;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        android.view.View view = this.f179786d;
        if (view == null) {
            super.setVisibility(i17);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public C13344xe2832fe2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f179792m = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.j(this);
        a();
    }

    public C13344xe2832fe2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f179792m = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.j(this);
        a();
    }
}
