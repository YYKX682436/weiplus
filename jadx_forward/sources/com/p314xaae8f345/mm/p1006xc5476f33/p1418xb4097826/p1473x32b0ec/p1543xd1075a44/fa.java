package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class fa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ga f199869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f199870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f199871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ga gaVar, pk2.o9 o9Var, int i17) {
        super(0);
        this.f199869d = gaVar;
        this.f199870e = o9Var;
        this.f199871f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pk2.o9 o9Var = this.f199870e;
        if (o9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveCoLiveInviteeMoreActionPanel", "invokeOption: helper is null, skip");
        } else {
            try {
                new pk2.e0(o9Var, this.f199871f).A();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLiveCoLiveInviteeMoreActionPanel", th6, "invokeOption " + pk2.e0.class.getSimpleName() + " crashed", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this.f199869d, false, 1, null);
        }
        return jz5.f0.f384359a;
    }
}
