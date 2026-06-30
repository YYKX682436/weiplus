package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$finishRefresh$1 */
/* loaded from: classes10.dex */
final class C14834xfd748509 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f204742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback f204743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14834xfd748509(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback) {
        super(0);
        this.f204742d = z17;
        this.f204743e = notifyViewCallback;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f204742d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback = this.f204743e;
        if (z17) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epa);
            int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a);
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback.f204725t;
            notifyViewCallback.s(string, color, false);
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback.f204725t;
            notifyViewCallback.s(null, 0, false);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = notifyViewCallback.f204729g;
        if (c22801x87cbdc00 != null) {
            c22801x87cbdc00.P(0);
        }
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback.f204725t;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishRefresh: onFinishRefresh notifyDataSetChanged:");
        sb6.append(notifyViewCallback.f204728f);
        sb6.append(" size:");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = notifyViewCallback.f204736q;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        sb6.append(mo7946xf939df19 != null ? java.lang.Integer.valueOf(mo7946xf939df19.mo1894x7e414b06()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
        return jz5.f0.f384359a;
    }
}
