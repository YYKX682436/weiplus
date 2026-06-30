package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.l0 f107840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f107841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107842c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f107843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f107844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f107845f;

    public f0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var, long j17, java.lang.String str, java.util.List list, java.util.List list2, int i17) {
        this.f107840a = l0Var;
        this.f107841b = j17;
        this.f107842c = str;
        this.f107843d = list;
        this.f107844e = list2;
        this.f107845f = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.Object obj2;
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        try {
            if (fVar2.f70615a == 0 && fVar2.f70616b == 0 && (fVar = fVar2.f70618d) != null) {
                com.tencent.mm.protobuf.g byteString = ((r45.h51) fVar).getByteString(3);
                ((r45.h51) fVar2.f70618d).getInteger(8);
                java.lang.String str = this.f107840a.f108126h;
                if (byteString != null) {
                    com.tencent.mm.sdk.platformtools.w2.b(byteString.g());
                }
                boolean z17 = true;
                boolean z18 = ((r45.h51) fVar2.f70618d).getInteger(6) == 1;
                boolean z19 = ((r45.h51) fVar2.f70618d).getInteger(5) == 1;
                r45.h51 h51Var = (r45.h51) fVar2.f70618d;
                if (h51Var != null && (list = h51Var.getList(13)) != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.finder.feed.model.d0(this.f107840a, this.f107841b, list));
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> list2 = ((r45.h51) fVar2.f70618d).getList(1);
                kotlin.jvm.internal.o.f(list2, "getCommentInfo(...)");
                long j17 = this.f107841b;
                java.lang.String str2 = this.f107842c;
                for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : list2) {
                    kotlin.jvm.internal.o.d(finderCommentInfo);
                    com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
                    yj0Var.field_feedId = j17;
                    yj0Var.field_dupFlag = str2;
                    yj0Var.field_state = 2;
                    yj0Var.field_actionInfo.set(1, finderCommentInfo);
                    yj0Var.n1(0L);
                    arrayList.add(new so2.y0(yj0Var));
                }
                com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f107840a;
                java.util.LinkedList list3 = ((r45.h51) fVar2.f70618d).getList(9);
                kotlin.jvm.internal.o.f(list3, "getBarrageCommentInfo(...)");
                com.tencent.mm.plugin.finder.feed.model.l0.I0(l0Var, list3, this.f107841b, this.f107842c);
                com.tencent.mm.plugin.finder.feed.model.l0.L0(this.f107840a, this.f107843d, arrayList, this.f107841b, this.f107842c);
                java.util.List J0 = com.tencent.mm.plugin.finder.feed.model.l0.J0(this.f107840a, arrayList, this.f107841b, this.f107842c);
                java.util.List<com.tencent.mm.plugin.finder.storage.yj0> list4 = this.f107844e;
                com.tencent.mm.plugin.finder.feed.model.l0 l0Var2 = this.f107840a;
                for (com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 : list4) {
                    java.util.Iterator it = ((java.util.ArrayList) J0).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (kotlin.jvm.internal.o.b(((so2.y0) obj2).f410703d.getClientId(), yj0Var2.getClientId())) {
                            break;
                        }
                    }
                    if (((so2.y0) obj2) == null) {
                        java.lang.String str3 = l0Var2.f108126h;
                        yj0Var2.getClientId();
                        ((java.util.ArrayList) J0).add(new so2.y0(yj0Var2));
                    }
                }
                com.tencent.mars.xlog.Log.i(this.f107840a.f108126h, "---merge respCount:" + ((r45.h51) fVar2.f70618d).getInteger(4) + ", preSize: " + ((r45.h51) fVar2.f70618d).getList(1).size() + ", afterSize:" + ((java.util.ArrayList) J0).size());
                bu2.n nVar = bu2.n.f24550a;
                if (nVar.e(this.f107841b, 0L) != null) {
                    z17 = false;
                }
                if (z17) {
                    long j18 = this.f107841b;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(J0, 10));
                    java.util.Iterator it6 = ((java.util.ArrayList) J0).iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(((so2.y0) it6.next()).f410703d);
                    }
                    nVar.a(j18, 0L, arrayList2);
                    bu2.n.f24550a.b(this.f107841b, 0L, 0, byteString, z19, z18, false, null, null, null);
                    com.tencent.mars.xlog.Log.i(this.f107840a.f108126h, "add cache succ, feedId: " + pm0.v.u(this.f107841b) + ", size:" + ((java.util.ArrayList) J0).size());
                } else {
                    com.tencent.mars.xlog.Log.i(this.f107840a.f108126h, "---cache exist or list is empty, feedId:" + pm0.v.u(this.f107841b) + ", list size: " + ((java.util.ArrayList) J0).size());
                }
                int i17 = this.f107845f;
                if (i17 >= 0) {
                    com.tencent.mm.plugin.finder.feed.model.l0 l0Var3 = this.f107840a;
                    l0Var3.M0(i17, new com.tencent.mm.plugin.finder.feed.model.e0(this.f107841b, fVar2, l0Var3));
                }
            } else {
                int i18 = fVar2.f70616b;
                if (i18 == -4011 || i18 == -4033 || i18 == -4036) {
                    cu2.u.f222441a.b(this.f107841b);
                    com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = new com.tencent.mm.autogen.events.FeedDeleteEvent();
                    feedDeleteEvent.f54247g.f6437a = this.f107841b;
                    feedDeleteEvent.e();
                    com.tencent.mars.xlog.Log.i(this.f107840a.f108126h, "CgiGetFinderFeedComment onCgiEnd: deleteItem by id " + this.f107841b);
                }
            }
        } finally {
            try {
                this.f107840a.f108132q.remove(java.lang.Long.valueOf(this.f107841b));
                return jz5.f0.f302826a;
            } catch (java.lang.Throwable th6) {
            }
        }
        this.f107840a.f108132q.remove(java.lang.Long.valueOf(this.f107841b));
        return jz5.f0.f302826a;
    }
}
