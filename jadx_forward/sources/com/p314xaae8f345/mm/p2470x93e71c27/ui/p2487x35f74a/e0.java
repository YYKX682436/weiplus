package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes4.dex */
public class e0 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f272736d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f272737e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f272738f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w f272739g;

    public e0(java.lang.String str, int i17, int i18, boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w wVar) {
        super(i17, i18);
        this.f272736d = true;
        this.f272737e = true;
        this.f272738f = "";
        this.f272737e = z17;
        this.f272738f = str;
        this.f272739g = wVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.w wVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/MMSpanManager$LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f272736d && (wVar = this.f272739g) != null) {
            wVar.a(this.f272738f);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/MMSpanManager$LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0
    /* renamed from: setColor */
    public void mo63036x52d2f021(int i17, int i18) {
        super.mo63036x52d2f021(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f272737e) {
            com.p314xaae8f345.mm.ui.bk.r0(textPaint, 0.8f);
        }
    }
}
