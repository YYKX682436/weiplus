package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class t6 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.v6 f186128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186129f;

    public t6(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.v6 v6Var, in5.s0 s0Var) {
        this.f186127d = str;
        this.f186128e = v6Var;
        this.f186129f = s0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 11 && intent != null) {
            int intExtra = intent.getIntExtra("key_output_interact", 2);
            int intExtra2 = intent.getIntExtra("key_interact_scene", 0);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0 s0Var = hb2.s0.f361623e;
            in5.s0 s0Var2 = this.f186129f;
            java.lang.String str = this.f186127d;
            s0Var.s(intExtra, intExtra2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s6(str, s0Var2), str);
        }
        this.f186128e.f186303e.T();
    }
}
