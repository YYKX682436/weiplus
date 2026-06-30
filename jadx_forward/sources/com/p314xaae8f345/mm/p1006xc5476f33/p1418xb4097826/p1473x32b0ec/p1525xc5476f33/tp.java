package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f195998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f195999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.g f196000g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.b82 f196001h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar, ce2.i iVar, dk2.g gVar, r45.b82 b82Var) {
        super(3);
        this.f195997d = str;
        this.f195998e = dqVar;
        this.f195999f = iVar;
        this.f196000g = gVar;
        this.f196001h = b82Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        kz5.p0 p0Var;
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str3 = (java.lang.String) obj2;
        java.lang.String str4 = (java.lang.String) obj3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "doPostGift, giftId:" + this.f195997d + ", cnt:" + intValue + ", pkgBatchId:" + str3 + ", pkgDurationId:" + str4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = this.f195998e;
        int i18 = !dqVar.A ? 0 : 8;
        dk2.xf W0 = dqVar.W0();
        if (W0 != null) {
            android.content.Context context = this.f195998e.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            long m75942xfb822ef2 = ((mm2.e1) this.f195998e.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            long j17 = ((mm2.e1) this.f195998e.P0(mm2.e1.class)).f410516m;
            java.lang.String str5 = this.f195997d;
            int P0 = (int) this.f195999f.P0();
            dk2.g gVar2 = this.f196000g;
            java.lang.String str6 = this.f195998e.R;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(this.f196001h.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mo0 mo0Var = this.f195998e.f193865x0;
            if (mo0Var != null) {
                str = str3;
                gVar = b17;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                synchronized (mo0Var) {
                    i17 = i18;
                    str2 = str6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo0Var.f195080b, "onBatch prepareSuccList:" + mo0Var.f195082d.size() + ", rawList:" + mo0Var.f195081c.size() + ", prepareJobList:" + mo0Var.f195083e);
                    arrayList.addAll(mo0Var.f195082d);
                    arrayList.addAll(mo0Var.f195081c);
                    mo0Var.f195082d.clear();
                    mo0Var.f195081c.clear();
                    java.util.Iterator it = mo0Var.f195083e.iterator();
                    while (it.hasNext()) {
                        java.util.Iterator it6 = it;
                        p3325xe03a0797.p3326xc267989b.p2.a((p3325xe03a0797.p3326xc267989b.r2) it.next(), null, 1, null);
                        it = it6;
                    }
                }
                p0Var = arrayList;
            } else {
                str = str3;
                str2 = str6;
                i17 = i18;
                gVar = b17;
                p0Var = kz5.p0.f395529d;
            }
            ((dk2.r4) W0).H(context, m75942xfb822ef2, j17, str5, intValue, P0, gVar2, str2, i17, gVar, p0Var, str, str4, ((mm2.e1) this.f195998e.P0(mm2.e1.class)).f410526w, ((mm2.e1) this.f195998e.P0(mm2.e1.class)).f410518o, this.f195998e.P);
        }
        return jz5.f0.f384359a;
    }
}
