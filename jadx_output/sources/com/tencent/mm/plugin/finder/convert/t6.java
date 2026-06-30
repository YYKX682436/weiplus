package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class t6 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.v6 f104595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104596f;

    public t6(java.lang.String str, com.tencent.mm.plugin.finder.convert.v6 v6Var, in5.s0 s0Var) {
        this.f104594d = str;
        this.f104595e = v6Var;
        this.f104596f = s0Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 11 && intent != null) {
            int intExtra = intent.getIntExtra("key_output_interact", 2);
            int intExtra2 = intent.getIntExtra("key_interact_scene", 0);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0 s0Var = hb2.s0.f280090e;
            in5.s0 s0Var2 = this.f104596f;
            java.lang.String str = this.f104594d;
            s0Var.s(intExtra, intExtra2, new com.tencent.mm.plugin.finder.convert.s6(str, s0Var2), str);
        }
        this.f104595e.f104770e.T();
    }
}
