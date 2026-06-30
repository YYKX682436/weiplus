package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$showRefreshTip$1 */
/* loaded from: classes4.dex */
final class C14850x69c37ab6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback f204779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f204780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f204781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14850x69c37ab6(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback, boolean z17, int i17) {
        super(0);
        this.f204778d = str;
        this.f204779e = notifyViewCallback;
        this.f204780f = z17;
        this.f204781g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f204778d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback = this.f204779e;
        if (K0) {
            android.widget.TextView textView = notifyViewCallback.f204734o;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            android.widget.TextView textView2 = notifyViewCallback.f204734o;
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText(str);
                textView2.setClickable(this.f204780f);
                textView2.setTextColor(this.f204781g);
            }
        }
        return jz5.f0.f384359a;
    }
}
