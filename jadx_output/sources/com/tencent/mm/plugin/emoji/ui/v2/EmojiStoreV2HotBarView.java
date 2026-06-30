package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes3.dex */
public class EmojiStoreV2HotBarView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f98253d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f98254e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f98255f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f98256g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f98257h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f98258i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f98259m;

    public EmojiStoreV2HotBarView(android.content.Context context) {
        super(context);
        this.f98259m = new com.tencent.mm.plugin.emoji.ui.v2.j(this);
        a();
    }

    public void a() {
        android.view.View findViewById = ((android.view.ViewGroup) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a7t, this)).findViewById(com.tencent.mm.R.id.m7g);
        this.f98253d = findViewById;
        this.f98254e = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.dbg);
        this.f98255f = this.f98253d.findViewById(com.tencent.mm.R.id.dap);
        android.widget.TextView textView = (android.widget.TextView) this.f98253d.findViewById(com.tencent.mm.R.id.dc9);
        this.f98256g = textView;
        textView.setText(((java.lang.Object) getResources().getText(com.tencent.mm.R.string.f491109bz0)) + " ");
        android.view.View findViewById2 = this.f98253d.findViewById(com.tencent.mm.R.id.cvd);
        this.f98257h = findViewById2;
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.v2.k(this));
        this.f98258i = (android.widget.TextView) this.f98253d.findViewById(com.tencent.mm.R.id.k_3);
        b();
        setMoreOnClickListener(this.f98259m);
        if (com.tencent.mm.plugin.emoji.model.o.a().f97587c) {
            this.f98254e.setText(com.tencent.mm.R.string.bwh);
        } else {
            this.f98254e.setText(com.tencent.mm.R.string.bwg);
        }
    }

    public void b() {
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_NEW_DESIGNER_EMOJI_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        android.widget.TextView textView = this.f98258i;
        if (textView != null) {
            textView.setVisibility(booleanValue ? 0 : 8);
        }
    }

    @Override // android.view.View
    public android.view.View getRootView() {
        return this.f98253d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setDesignerCatalogViewPadding(boolean z17) {
        if (this.f98255f == null || z17) {
            return;
        }
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479876hp);
        int h18 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479884hx);
        int h19 = i65.a.h(getContext(), com.tencent.mm.R.dimen.i_);
        this.f98255f.setPadding(h19, h17, h19, h18);
    }

    public void setDesignerEmojiViewVisibility(int i17) {
        android.view.View view = this.f98257h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setDesignerEmojiViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setDesignerEmojiViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setMoreOnClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.f98256g;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        android.view.View view = this.f98253d;
        if (view == null) {
            super.setVisibility(i17);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public EmojiStoreV2HotBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98259m = new com.tencent.mm.plugin.emoji.ui.v2.j(this);
        a();
    }

    public EmojiStoreV2HotBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f98259m = new com.tencent.mm.plugin.emoji.ui.v2.j(this);
        a();
    }
}
