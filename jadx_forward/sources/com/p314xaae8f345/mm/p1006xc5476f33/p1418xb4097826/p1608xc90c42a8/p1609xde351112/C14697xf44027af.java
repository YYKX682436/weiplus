package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lso2/j5;", "resp", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$3 */
/* loaded from: classes2.dex */
public final class C14697xf44027af extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter f204276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14697xf44027af(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter purchaseListPresenter) {
        super(1);
        this.f204276d = purchaseListPresenter;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa resp = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        boolean hasMore = resp.getHasMore();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter purchaseListPresenter = this.f204276d;
        purchaseListPresenter.f204269g = hasMore ? 1 : 0;
        if (!resp.getHasMore()) {
            purchaseListPresenter.g().f204284d.m82690xd3a27e96(false);
            purchaseListPresenter.g().f204284d.m82688x390c1d00(false);
        }
        purchaseListPresenter.g().a(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter.c(purchaseListPresenter);
        purchaseListPresenter.f().m8146xced61ae5();
        return jz5.f0.f384359a;
    }
}
