package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$thanksUpdateListener$1$callback$1 */
/* loaded from: classes10.dex */
final class C14736xe762cadd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter f204385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f204386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f204388g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 f204389h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14736xe762cadd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter, java.lang.Long l17, java.lang.String str, java.lang.Integer num, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922) {
        super(0);
        this.f204385d = msgPresenter;
        this.f204386e = l17;
        this.f204387f = str;
        this.f204388g = num;
        this.f204389h = c5542xa257d922;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = this.f204385d;
        java.lang.String str = msgPresenter.f204359g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thanksUpdateListener event objectID:");
        java.lang.Long l17 = this.f204386e;
        sb6.append(l17);
        sb6.append(" wxUsername:");
        java.lang.String str2 = this.f204387f;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.ArrayList arrayList = msgPresenter.f204361i;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.i iVar = (so2.i) next;
            int i19 = iVar.f491944d.f66129x2262335f;
            java.lang.Integer num = this.f204388g;
            boolean z17 = i19 == 2 && num != null && num.intValue() == 2;
            dm.pd pdVar = iVar.f491944d;
            boolean z18 = pdVar.f66129x2262335f == 15 && num != null && num.intValue() == 3;
            boolean z19 = pdVar.f66129x2262335f == 33 && num != null && num.intValue() == 5;
            if (z17 || z18 || z19) {
                long j17 = pdVar.f66108x2327e25f;
                if (l17 != null && j17 == l17.longValue() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pdVar.f66078xad49d1db.m76197x6c03c64c(), str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(msgPresenter.f204359g, "thanksUpdateListener event index " + i17);
                    am.md mdVar = this.f204389h.f135866g;
                    pdVar.w0(mdVar != null && mdVar.f88871b);
                    arrayList.set(i17, iVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = msgPresenter.f204360h;
                    if (msgViewCallback != null && (c22848x6ddd90cf = msgViewCallback.f204400q) != null) {
                        c22848x6ddd90cf.m8148xed6e4d18(i17, 1);
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
