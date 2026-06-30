package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class cz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f188051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f188052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f188053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188054i;

    public cz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, int i17, int i18, int i19, int i27, java.lang.String str) {
        this.f188049d = pzVar;
        this.f188050e = i17;
        this.f188051f = i18;
        this.f188052g = i19;
        this.f188053h = i27;
        this.f188054i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188049d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "notifyChanged,msgNotifyData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = pzVar.f190289h;
        if (abstractC15124x7bae6180 != null) {
            int i17 = this.f188050e;
            so2.t tVar = pzVar.f190296p0;
            tVar.f492131d = i17;
            tVar.f492133f = this.f188051f;
            tVar.f492134g = this.f188052g;
            tVar.f492132e = this.f188053h;
            java.lang.String str = this.f188054i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            tVar.f492135h = str;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) pf5.z.f435481a.b(abstractC15124x7bae6180).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class)).Q6();
        }
    }
}
