package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class x implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221306e;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, android.content.Context context) {
        this.f221305d = q5Var;
        this.f221306e = context;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1137) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f221305d;
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("ret_info");
                if ("0".equals(stringExtra)) {
                    q5Var.a(null, null);
                } else {
                    q5Var.a(stringExtra, null);
                }
            } else {
                q5Var.a("cancel", null);
            }
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f221306e).m78545xde66c1f2(null);
        }
    }
}
