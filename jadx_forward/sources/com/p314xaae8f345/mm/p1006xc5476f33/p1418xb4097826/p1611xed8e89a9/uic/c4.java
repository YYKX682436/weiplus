package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class c4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae f205115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f205116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f205117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae c15304x8ca13bae, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var, java.lang.Long l17) {
        super(0);
        this.f205115d = c15304x8ca13bae;
        this.f205116e = f4Var;
        this.f205117f = l17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f205115d.setClickable(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var = this.f205116e;
        f4Var.A = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae X6 = f4Var.X6();
        if (X6 != null) {
            X6.m62122xc54f6a7a(true);
        }
        yz5.a aVar = f4Var.f205234y;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        if (this.f205117f == null) {
            f4Var.b7("channel_profile_recentviewed", 1, 1);
        } else {
            f4Var.c7("view_clk");
        }
        return jz5.f0.f384359a;
    }
}
