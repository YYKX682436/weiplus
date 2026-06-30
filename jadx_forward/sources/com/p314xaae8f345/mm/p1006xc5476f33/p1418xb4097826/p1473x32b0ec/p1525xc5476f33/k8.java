package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class k8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l8 f194735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l8 l8Var) {
        super(1);
        this.f194735d = l8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i7 buttonType = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonType, "buttonType");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l8 l8Var = this.f194735d;
        l8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorMusicSelectPlugin", "handleMusicEntranceButtonClick: " + buttonType);
        int ordinal = buttonType.ordinal();
        int i17 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i17 = 2;
        }
        l8Var.f194893r = i17;
        return jz5.f0.f384359a;
    }
}
