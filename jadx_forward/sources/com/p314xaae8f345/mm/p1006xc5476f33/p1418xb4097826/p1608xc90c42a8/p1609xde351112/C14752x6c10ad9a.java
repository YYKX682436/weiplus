package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$showRefreshTip$1 */
/* loaded from: classes10.dex */
final class C14752x6c10ad9a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback f204437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f204438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f204439g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14752x6c10ad9a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback, boolean z17, int i17) {
        super(0);
        this.f204436d = str;
        this.f204437e = msgViewCallback;
        this.f204438f = z17;
        this.f204439g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f204436d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = this.f204437e;
        if (K0) {
            android.widget.TextView textView = msgViewCallback.f204399p;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshTip");
                throw null;
            }
            textView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = msgViewCallback.f204399p;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshTip");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = msgViewCallback.f204399p;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshTip");
                throw null;
            }
            textView3.setText(str);
            android.widget.TextView textView4 = msgViewCallback.f204399p;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshTip");
                throw null;
            }
            textView4.setClickable(this.f204438f);
            android.widget.TextView textView5 = msgViewCallback.f204399p;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshTip");
                throw null;
            }
            textView5.setTextColor(this.f204439g);
        }
        return jz5.f0.f384359a;
    }
}
