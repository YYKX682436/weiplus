package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 f163360a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 f163361b;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 left, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 right) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(left, "left");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(right, "right");
        this.f163360a = left;
        this.f163361b = right;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 appPauseType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appPauseType, "appPauseType");
        return this.f163360a.a(lVar, appPauseType) && this.f163361b.a(lVar, appPauseType);
    }

    /* renamed from: toString */
    public java.lang.String m51069x9616526c() {
        return "AutoPauseCombinedStrategy(left=" + this.f163360a + ", right=" + this.f163361b + ')';
    }
}
