package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes4.dex */
public class d1 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f272733d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 f272734e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f272735f;

    public d1() {
        this.f272735f = java.lang.Boolean.TRUE;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/SnsClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 c1Var = this.f272734e;
        if (c1Var != null) {
            c1Var.a(view, this.f272733d);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/SnsClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDrawState", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
        super.updateDrawState(textPaint);
        if (this.f272735f.booleanValue()) {
            com.p314xaae8f345.mm.ui.bk.r0(textPaint, 0.8f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDrawState", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
    }

    public d1(android.content.Context context, java.lang.Object obj, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 c1Var) {
        super(2, (r35.m3) null);
        this.f272735f = java.lang.Boolean.TRUE;
        this.f272734e = c1Var;
        this.f272733d = obj;
    }

    public d1(android.content.Context context, java.lang.Object obj, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 c1Var, int i17) {
        super(2, (r35.m3) null);
        this.f272735f = java.lang.Boolean.TRUE;
        this.f272734e = c1Var;
        this.f272733d = obj;
        mo64459x8f3102c3(i17);
    }

    public d1(java.lang.Object obj, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 c1Var) {
        super(2, (r35.m3) null);
        this.f272735f = java.lang.Boolean.TRUE;
        this.f272734e = c1Var;
        this.f272733d = obj;
        mo64459x8f3102c3(2);
    }
}
