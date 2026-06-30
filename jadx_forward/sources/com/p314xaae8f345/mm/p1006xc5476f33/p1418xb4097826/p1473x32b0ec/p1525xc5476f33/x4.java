package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class x4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 f196560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f196561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var, boolean z17) {
        super(0);
        this.f196560d = a5Var;
        this.f196561e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = this.f196560d;
        a5Var.w1();
        ll2.e eVar = ll2.e.f400666a;
        eVar.e(a5Var.I1() ? "anchorlive.bottom.videosetting.makeup" : "startlive.bottom.videosetting.makeup", false);
        eVar.e(a5Var.I1() ? "anchorlive.bottom.videosetting.beauty" : "startlive.bottom.videosetting.beauty", false);
        eVar.e(a5Var.I1() ? "anchorlive.bottom.videosetting.filter" : "startlive.bottom.videosetting.filter", false);
        eVar.e(a5Var.D1(), false);
        eVar.e(a5Var.E1(), false);
        eVar.e(a5Var.G1(), false);
        eVar.e(a5Var.F1(), false);
        a5Var.f193340x0 = 0;
        a5Var.f446856d.animate().translationY(com.p314xaae8f345.mm.ui.bl.b(r1.getContext()).y).setDuration(200L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w4(a5Var, this.f196561e)).start();
        return jz5.f0.f384359a;
    }
}
