package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyViewPager */
/* loaded from: classes8.dex */
public class C19497x6eab2374 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d {

    /* renamed from: d, reason: collision with root package name */
    public int f268861d;

    /* renamed from: e, reason: collision with root package name */
    public int f268862e;

    /* renamed from: f, reason: collision with root package name */
    public ey4.c0 f268863f;

    /* renamed from: g, reason: collision with root package name */
    public ey4.d0 f268864g;

    public C19497x6eab2374(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268861d = 0;
        this.f268862e = 0;
        if (fp.h.c(9)) {
            setOverScrollMode(2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        ey4.c0 c0Var = this.f268863f;
        if (c0Var != null && (((i17 > 0 && i19 != i17) || (i18 > 0 && i27 != i18)) && ((i18 > 0 && i18 != this.f268861d) || (i17 > 0 && i17 != this.f268862e)))) {
            c0Var.f339145d = i18;
            c0Var.f339146e = i17;
            ey4.d0 d0Var = this.f268864g;
            if (d0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19496x19c2a45a c19496x19c2a45a = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19496x19c2a45a) d0Var;
                if (c19496x19c2a45a.f268858i != null) {
                    c19496x19c2a45a.f268855f.f339147f = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(c19496x19c2a45a.getContext());
                    ey4.e0 e0Var = (ey4.e0) c19496x19c2a45a.f268858i.m80829xf939df19();
                    if (e0Var != null) {
                        e0Var.f339150d.clear();
                        e0Var.f339151e = c19496x19c2a45a.f268855f;
                        e0Var.mo8343xced61ae5();
                    } else {
                        ey4.e0 e0Var2 = new ey4.e0();
                        e0Var2.f339151e = c19496x19c2a45a.f268855f;
                        c19496x19c2a45a.f268858i.mo79164x6cab2c8d(e0Var2);
                    }
                    c19496x19c2a45a.f268858i.post(new ey4.a0(c19496x19c2a45a));
                }
            }
        }
        if (i18 > 0) {
            this.f268861d = i18;
        }
        if (i17 > 0) {
            this.f268862e = i17;
        }
    }

    /* renamed from: setOnSizeChangedListener */
    public void m74847x138029a6(ey4.d0 d0Var) {
        this.f268864g = d0Var;
    }

    /* renamed from: setPanelManager */
    public void m74848x3e2a9e8b(ey4.c0 c0Var) {
        this.f268863f = c0Var;
    }
}
