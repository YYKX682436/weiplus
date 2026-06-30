package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$msgUpdateListener$1$callback$1 */
/* loaded from: classes10.dex */
final class C14733xfe16fbb1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter f204379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f204380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f204381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded f204382g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14733xfe16fbb1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter, long j17, long j18, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded c5508x3c9dcded) {
        super(0);
        this.f204379d = msgPresenter;
        this.f204380e = j17;
        this.f204381f = j18;
        this.f204382g = c5508x3c9dcded;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = this.f204379d;
        java.lang.String str = msgPresenter.f204359g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msgUpdateListener event id ");
        long j17 = this.f204380e;
        sb6.append(j17);
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
            dm.pd pdVar = iVar.f491944d;
            if (pdVar.f66095xc8a07680 == j17 || pdVar.f66124x65f321b == this.f204381f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(msgPresenter.f204359g, "msgUpdateListener event index " + i17);
                am.lc lcVar = this.f204382g.f135839g;
                int i19 = lcVar.f88772d;
                if (i19 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = msgPresenter.f204360h;
                    if (msgViewCallback != null && (c22848x6ddd90cf = msgViewCallback.f204400q) != null) {
                        c22848x6ddd90cf.m8147xed6e4d18(i17);
                    }
                } else if (i19 == 1) {
                    iVar.f491944d.w0(lcVar.f88771c);
                    arrayList.set(i17, iVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback2 = msgPresenter.f204360h;
                    if (msgViewCallback2 != null && (c22848x6ddd90cf2 = msgViewCallback2.f204400q) != null) {
                        c22848x6ddd90cf2.m8148xed6e4d18(i17, 1);
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
