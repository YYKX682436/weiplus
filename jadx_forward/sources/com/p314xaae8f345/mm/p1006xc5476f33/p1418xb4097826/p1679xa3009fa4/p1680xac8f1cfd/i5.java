package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class i5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oo f216230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f216231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(r45.oo ooVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(0);
        this.f216230d = ooVar;
        this.f216231e = yj0Var;
        this.f216232f = abstractC14490x69736cb5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f216231e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(yj0Var.m60788xbd8ebd19());
        r45.oo ooVar = this.f216230d;
        ooVar.set(9, valueOf);
        int m60787xf4204902 = yj0Var.m60787xf4204902();
        if (m60787xf4204902 < 0) {
            m60787xf4204902 = 0;
        }
        ooVar.set(8, java.lang.Integer.valueOf(m60787xf4204902));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletUIC", "likeBulletComment " + hc2.b0.f(this.f216232f, true) + " onLikeSucceed:like_flag:" + ooVar.m75939xb282bd08(9) + ", like_count:" + ooVar.m75939xb282bd08(8));
        return jz5.f0.f384359a;
    }
}
