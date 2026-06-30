package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class n9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 f195132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var, int i17) {
        super(0);
        this.f195132d = o9Var;
        this.f195133e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var = this.f195132d;
        int i17 = this.f195133e;
        int x17 = o9Var.x1(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "switchCamera cameraRotate: " + x17 + ", contextRotate: " + i17);
        in0.q B1 = o9Var.B1();
        if (B1 != null) {
            B1.y0(x17);
        }
        return jz5.f0.f384359a;
    }
}
