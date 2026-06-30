package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr45/k61;", "request", "Lr45/l61;", "resp", "Ljz5/f0;", "invoke", "(Lr45/k61;Lr45/l61;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$doGetFollowScene$1 */
/* loaded from: classes2.dex */
public final class C14638x80b7cb92 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent f204142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14638x80b7cb92(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent followListPresent) {
        super(2);
        this.f204142d = followListPresent;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.k61 request = (r45.k61) obj;
        r45.l61 resp = (r45.l61) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent followListPresent = this.f204142d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = request.m75934xbce7f2f(1);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = resp.m75934xbce7f2f(2);
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContactList(...)");
        followListPresent.f(true, m75934xbce7f2f, m75934xbce7f2f2, m75941xfb821914, resp.m75939xb282bd08(3) != 0);
        return jz5.f0.f384359a;
    }
}
