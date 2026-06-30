package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr45/x41;", "it", "Ljz5/f0;", "invoke", "(Lr45/x41;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListPresenter$doScene$1 */
/* loaded from: classes10.dex */
final class C14623xd7a95b94 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter f204102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14623xd7a95b94(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter) {
        super(1);
        this.f204102d = blockListPresenter;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.x41 it = (r45.x41) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa> m75941xfb821914 = it.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa : m75941xfb821914) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19782x23db1cfa);
                arrayList.add(new so2.i0(c19782x23db1cfa));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter = this.f204102d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback = blockListPresenter.f204099e;
        if (blockListViewCallback != null) {
            blockListViewCallback.l(arrayList, blockListPresenter.f204101g == null);
        }
        blockListPresenter.f204101g = it.m75934xbce7f2f(2);
        return jz5.f0.f384359a;
    }
}
