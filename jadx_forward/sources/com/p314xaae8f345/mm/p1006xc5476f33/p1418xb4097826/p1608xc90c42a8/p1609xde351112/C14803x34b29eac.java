package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initAndRefreshAll$1 */
/* loaded from: classes10.dex */
public final class C14803x34b29eac extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback f204639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14803x34b29eac(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback notifyViewCallback) {
        super(0);
        this.f204639d = notifyViewCallback;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyViewCallback notifyViewCallback = this.f204639d;
        if (notifyViewCallback.f204614f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14783xc2c8f161.NotifyPresenter notifyPresenter = notifyViewCallback.f204615g;
            int i17 = notifyViewCallback.f204612d;
            notifyPresenter.i(i17, true);
            notifyPresenter.c(i17);
        }
        return jz5.f0.f384359a;
    }
}
