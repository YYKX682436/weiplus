package bs2;

/* loaded from: classes2.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f105402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f105403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105404f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, bs2.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f105403e = abstractC14490x69736cb5;
        this.f105404f = n1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        bs2.j0 j0Var = new bs2.j0(this.f105403e, this.f105404f, interfaceC29045xdcb5ca57);
        j0Var.f105402d = obj;
        return j0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bs2.j0 j0Var = (bs2.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        bs2.n1 n1Var = this.f105404f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f105403e;
        if (abstractC14490x69736cb5 != null) {
            r45.mb4 first = abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec().getFirst();
            ds2.h hVar = ds2.h.f324399a;
            long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(first);
            mn2.g4 c17 = hVar.c(mo2128x1ed62e84, first, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
            java.lang.String n17 = c17.n();
            bs2.e0 e0Var = bs2.n1.f105438w;
            n1Var.l(feedObject, n17, "unreadCache");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f105442c, "checkPreloadUnreadFeedVideo: preload unread feed, feedid=".concat(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f105442c, "checkPreloadUnreadFeedVideo: do not have unread cache feed");
        }
        return f0Var2;
    }
}
