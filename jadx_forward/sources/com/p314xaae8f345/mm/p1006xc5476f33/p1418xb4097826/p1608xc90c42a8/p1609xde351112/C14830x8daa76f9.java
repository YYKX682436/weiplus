package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$thanksUpdateListener$1$callback$1 */
/* loaded from: classes10.dex */
final class C14830x8daa76f9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f204719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter f204721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f204722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 f204723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14830x8daa76f9(java.lang.Long l17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter, java.lang.Integer num, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922) {
        super(0);
        this.f204719d = l17;
        this.f204720e = str;
        this.f204721f = notifyPresenter;
        this.f204722g = num;
        this.f204723h = c5542xa257d922;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thanksUpdateListener event objectID:");
        java.lang.Long l17 = this.f204719d;
        sb6.append(l17);
        sb6.append(" wxUsername:");
        java.lang.String str2 = this.f204720e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter = this.f204721f;
        ir2.a1 a1Var = notifyPresenter.f204697t;
        if (a1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0);
            throw null;
        }
        int i17 = 0;
        for (java.lang.Object obj : a1Var.f375624d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.i iVar = (so2.i) obj;
            int i19 = iVar.f491944d.f66129x2262335f;
            java.lang.Integer num = this.f204722g;
            boolean z17 = i19 == 2 && num != null && num.intValue() == 2;
            dm.pd pdVar = iVar.f491944d;
            boolean z18 = pdVar.f66129x2262335f == 15 && num != null && num.intValue() == 3;
            boolean z19 = pdVar.f66129x2262335f == 33 && num != null && num.intValue() == 5;
            if (z17 || z18 || z19) {
                long j17 = pdVar.f66108x2327e25f;
                if (l17 != null && j17 == l17.longValue() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pdVar.f66078xad49d1db.m76197x6c03c64c(), str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter.B, "thanksUpdateListener event index " + i17);
                    am.md mdVar = this.f204723h.f135866g;
                    pdVar.w0(mdVar != null && mdVar.f88871b);
                    ir2.a1 a1Var2 = notifyPresenter.f204697t;
                    if (a1Var2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0);
                        throw null;
                    }
                    a1Var2.f375624d.set(i17, iVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback = notifyPresenter.f204699v;
                    if (notifyViewCallback == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = notifyViewCallback.f204729g;
                    if (c22801x87cbdc00 != null && (m82555x4905e9fa = c22801x87cbdc00.m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                        mo7946xf939df19.m8148xed6e4d18(i17, 1);
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
