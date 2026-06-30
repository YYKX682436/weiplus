package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class f3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271840b;

    public f3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, java.lang.String str) {
        this.f271840b = c19666xfd6e2f33;
        this.f271839a = str;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.d0 d0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271840b;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
        hashMap.put("chat_username", y4Var != null ? y4Var.c() : "");
        fl5.i iVar = c19666xfd6e2f33.f271554m;
        hashMap.put("has_input", (iVar == null || iVar.getText() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19666xfd6e2f33.f271554m.getText().toString())) ? "0" : "1");
        int i17 = 0;
        hashMap.put("in_voice_mode", c19666xfd6e2f33.f271572p.getVisibility() != 0 ? 0 : "1");
        if ("chat_plus_btn".equals(this.f271839a)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.d0 d0Var2 = c19666xfd6e2f33.B;
            if (d0Var2 != null) {
                android.widget.ImageView imageView = d0Var2.f271787b;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i17 = 1;
                }
            }
            hashMap.put("is_red_dot", java.lang.Integer.valueOf(i17));
            hashMap.put("log_version", "20260409");
            if (i17 == 1 && (d0Var = c19666xfd6e2f33.B) != null) {
                hashMap.put("red_dot_source_list", d0Var.f271789d);
            }
        }
        return hashMap;
    }
}
