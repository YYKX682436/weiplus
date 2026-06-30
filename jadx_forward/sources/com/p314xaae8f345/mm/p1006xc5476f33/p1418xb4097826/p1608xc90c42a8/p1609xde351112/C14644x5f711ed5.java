package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/FinderContact;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$loadStart$2 */
/* loaded from: classes2.dex */
public final class C14644x5f711ed5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent f204151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14644x5f711ed5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent followListPresent) {
        super(1);
        this.f204151d = followListPresent;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent followListPresent = this.f204151d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = followListPresent.f204135f;
        if (gVar != null) {
            return gVar;
        }
        if (linkedList == null) {
            return null;
        }
        java.util.ArrayList arrayList = followListPresent.f204136g;
        if (arrayList.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new so2.v1(ya2.d.h((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next(), null, false, 3, null)));
            }
            arrayList.addAll(arrayList2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = followListPresent.f204134e;
            if (followListViewCallback == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            followListViewCallback.o(false, 0, arrayList.size());
        }
        return jz5.f0.f384359a;
    }
}
