package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class i2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f148287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148289c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f148290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f148291e;

    public i2(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, android.content.Context context, r45.nw1 nw1Var, yz5.l lVar) {
        this.f148287a = c19792x256d2725;
        this.f148288b = v4Var;
        this.f148289c = context;
        this.f148290d = nw1Var;
        this.f148291e = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        java.lang.String m76944x730bcac6;
        java.lang.String m75945x2fec8307;
        r45.nw1 m76794xd0557130;
        r45.jy1 jy1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f148287a;
        android.content.Intent putExtra = (c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null || (jy1Var = (r45.jy1) m76794xd0557130.m75936x14adae67(25)) == null) ? null : new android.content.Intent().putExtra("KEY_PARAMS_LAYER_SHOW_INFO", jy1Var.mo14344x5f01b1f6());
        r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
        if (m76794xd05571302 != null) {
            int m75939xb282bd08 = m76794xd05571302.m75939xb282bd08(12);
            if (putExtra != null) {
                putExtra.putExtra("KEY_PARAMS_SOURCE_TYPE", m75939xb282bd08);
            }
        }
        r45.nw1 m76794xd05571303 = c19792x256d2725.m76794xd0557130();
        if (m76794xd05571303 != null && (m75945x2fec8307 = m76794xd05571303.m75945x2fec8307(22)) != null && putExtra != null) {
            putExtra.putExtra("KEY_PARAMS_GAME_APP_ID", m75945x2fec8307);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = this.f148288b;
        android.content.Context context = this.f148289c;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context context2 = context;
        long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f148290d.m75942xfb822ef2(0));
        java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
        java.lang.String str2 = "";
        if (m76803x6c285d75 == null) {
            m76803x6c285d75 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        if (m76802x2dd01666 != null && (m76944x730bcac6 = m76802x2dd01666.m76944x730bcac6()) != null) {
            str2 = m76944x730bcac6;
        }
        v4Var.oj(putExtra, context2, m76784x5db1b11, valueOf, m76803x6c285d75, l4Var.d(str2), "", c19792x256d2725.m76829x97edf6c0(), "");
        yz5.l lVar = this.f148291e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }
}
