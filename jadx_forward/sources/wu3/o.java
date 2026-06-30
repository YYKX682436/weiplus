package wu3;

/* loaded from: classes5.dex */
public final class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 f531318d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 c17039xf3cc6396) {
        this.f531318d = c17039xf3cc6396;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int length = editable != null ? editable.length() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 c17039xf3cc6396 = this.f531318d;
        if (length <= 0) {
            android.widget.ImageView imageView = c17039xf3cc6396.f237495s;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        android.widget.ImageView imageView2 = c17039xf3cc6396.f237495s;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        c17039xf3cc6396.f237501y = editable != null ? editable.toString() : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17039xf3cc6396.f237501y)) {
            return;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_music_search_direct_search_enabel, bm5.h0.RepairerConfig_Maas_DirectSearchEnable_Int, 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XConfigUtil", "enableDirectSearch: " + z17);
        if (z17) {
            c17039xf3cc6396.e();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
