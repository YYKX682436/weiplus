package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class a0 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.ui.z f295639d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f295640e;

    /* renamed from: f, reason: collision with root package name */
    public long f295641f;

    public a0(com.p314xaae8f345.mm.p2802xd031a825.ui.z zVar, boolean z17) {
        super(7, (r35.m3) null);
        this.f295639d = zVar;
        this.f295640e = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/TextLinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2802xd031a825.ui.z zVar = this.f295639d;
        if (zVar != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean z17 = currentTimeMillis - this.f295641f < 1000;
            this.f295641f = currentTimeMillis;
            if (z17) {
                yj0.a.h(this, "com/tencent/mm/wallet_core/ui/TextLinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                zVar.mo48650xaf6b9ae9(view);
                com.p314xaae8f345.mm.p2802xd031a825.ui.b0.e(view);
            }
        }
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/TextLinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0
    /* renamed from: setColorConfig */
    public void mo64459x8f3102c3(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        super.mo64459x8f3102c3(i17);
        if (i17 == 7) {
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        } else if (i17 == 6) {
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560080ah), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f295640e) {
            com.p314xaae8f345.mm.ui.bk.r0(textPaint, 0.8f);
        }
    }

    public a0(int i17, com.p314xaae8f345.mm.p2802xd031a825.ui.z zVar) {
        super(i17, (r35.m3) null);
        this.f295640e = true;
        this.f295639d = zVar;
    }

    public a0(int i17, int i18, com.p314xaae8f345.mm.p2802xd031a825.ui.z zVar) {
        super(i17, i18);
        this.f295640e = true;
        this.f295639d = zVar;
    }
}
