package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class s0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 f237845d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 b1Var) {
        this.f237845d = b1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int length = editable != null ? editable.length() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 b1Var = this.f237845d;
        if (length <= 0) {
            android.widget.ImageView imageView = b1Var.f237708p;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            b1Var.f237714v = editable != null ? editable.toString() : null;
            b1Var.A();
            return;
        }
        android.widget.ImageView imageView2 = b1Var.f237708p;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        b1Var.f237714v = editable != null ? editable.toString() : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f237714v)) {
            return;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_music_search_direct_search_enabel, bm5.h0.RepairerConfig_Maas_DirectSearchEnable_Int, 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XConfigUtil", "enableDirectSearch: " + z17);
        if (z17) {
            b1Var.A();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
