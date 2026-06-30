package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi */
/* loaded from: classes8.dex */
public class C19486x36f27892 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 {
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 G;
    public boolean H;

    public C19486x36f27892(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59
    public void E0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = this.G;
        if (u3Var != null) {
            u3Var.D();
        }
    }

    /* renamed from: getJsapi */
    public nw4.n m74797x74a9227b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = this.G;
        if (u3Var != null) {
            return u3Var.f269087g;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: loadData */
    public void mo74798x6dfa45b0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = this.G;
        if (u3Var != null) {
            u3Var.f269101u = true;
            u3Var.Z("");
        }
        super.mo74798x6dfa45b0(str, str2, str3);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: loadDataWithBaseURL */
    public void mo64581x9b341568(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = this.G;
        if (u3Var != null) {
            u3Var.f269101u = true;
            u3Var.Z("");
        }
        super.mo64581x9b341568(str, str2, str3, str4, str5);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32265x141096a9(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = this.G;
        if (u3Var == null) {
            super.mo32265x141096a9(str);
            return;
        }
        u3Var.f269101u = false;
        if (u3Var.Z(str)) {
            return;
        }
        super.mo32265x141096a9(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = this.G;
        if (u3Var == null || !this.H) {
            return;
        }
        u3Var.D();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59
    /* renamed from: setCleanOnDetached */
    public void mo74799x7d1824d8(boolean z17) {
        this.H = z17;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: setWebViewClient */
    public void mo74800x23d27c02(com.p314xaae8f345.p3210x3857dc.h1 h1Var) {
        super.mo74800x23d27c02(h1Var);
        if (h1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3) {
            this.G = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3) h1Var;
        } else {
            this.G = null;
        }
    }

    public C19486x36f27892(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.H = true;
        try {
            mo120173x7af55728("searchBoxJavaBridge_");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWebView", "removeConfigJsInterface, ex = %s", e17.getMessage());
        }
        mo120153xd15cf999().E(true);
        mo120153xd15cf999().J(0);
        mo81410x6fd49b97(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2(this));
        mo74800x23d27c02(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3(this, false, null));
        java.lang.String g17 = mo120153xd15cf999().g();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        if (g17 != null ? g17.toLowerCase().contains("MicroMessenger/".toLowerCase()) : false) {
            return;
        }
        mo120153xd15cf999().Q(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.b(getContext(), g17));
    }
}
