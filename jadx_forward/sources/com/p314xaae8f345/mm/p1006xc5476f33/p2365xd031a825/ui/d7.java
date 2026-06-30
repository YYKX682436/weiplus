package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class d7 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7 f261772d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f261773e;

    public d7(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7 c7Var) {
        this(2, c7Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        mo63036x52d2f021(android.graphics.Color.parseColor(str), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561047a61));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7 c7Var = this.f261772d;
        if (c7Var != null) {
            c7Var.a(view);
            com.p314xaae8f345.mm.p2802xd031a825.ui.b0.e(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0
    /* renamed from: setColorConfig */
    public void mo64459x8f3102c3(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        super.mo64459x8f3102c3(i17);
        if (i17 == 7) {
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        } else if (i17 == 5) {
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561047a61));
        } else if (i17 == 6) {
            mo63036x52d2f021(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560080ah), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f261773e) {
            com.p314xaae8f345.mm.ui.bk.r0(textPaint, 0.8f);
        }
    }

    public d7(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7 c7Var) {
        super(i17, (r35.m3) null);
        this.f261773e = false;
        this.f261772d = c7Var;
    }

    public d7(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7 c7Var, boolean z17) {
        super(i17, (r35.m3) null);
        this.f261773e = false;
        this.f261772d = c7Var;
        this.f261773e = z17;
    }
}
