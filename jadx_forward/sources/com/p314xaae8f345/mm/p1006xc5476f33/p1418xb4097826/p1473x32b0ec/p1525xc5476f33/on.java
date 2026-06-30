package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class on extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f195303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn f195304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tn tnVar) {
        super(0);
        this.f195303d = apVar;
        this.f195304e = tnVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f195303d.E.remove(this.f195304e.f195974h);
        this.f195303d.E.offerLast(this.f195304e.f195974h);
        while (this.f195303d.E.size() > 1000) {
            java.lang.String str = (java.lang.String) this.f195303d.E.pollFirst();
            if (str != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.f195303d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftQueuePlugin", "comboIdBackToLiveMap remove: comboId=".concat(str));
            }
        }
        return jz5.f0.f384359a;
    }
}
