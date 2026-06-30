package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.l0 f107900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f107901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f107902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f107904e;

    public h0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var, long j17, java.util.List list, java.lang.String str, java.util.List list2) {
        this.f107900a = l0Var;
        this.f107901b = j17;
        this.f107902c = list;
        this.f107903d = str;
        this.f107904e = list2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.Object obj2;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        try {
            if (fVar2.f70615a == 0 && fVar2.f70616b == 0 && (fVar = fVar2.f70618d) != null) {
                com.tencent.mm.protobuf.g byteString = ((r45.j51) fVar).getByteString(3);
                java.lang.String str = this.f107900a.f108126h;
                r45.j51 j51Var = (r45.j51) fVar2.f70618d;
                if (j51Var != null && (list2 = j51Var.getList(11)) != null) {
                    list2.size();
                }
                r45.j51 j51Var2 = (r45.j51) fVar2.f70618d;
                if (j51Var2 != null && (list = j51Var2.getList(12)) != null) {
                    list.size();
                }
                if (byteString != null) {
                    com.tencent.mm.sdk.platformtools.w2.b(byteString.g());
                }
                boolean z17 = true;
                boolean z18 = ((r45.j51) fVar2.f70618d).getInteger(5) == 1;
                boolean z19 = ((r45.j51) fVar2.f70618d).getInteger(4) == 1;
                r45.j51 j51Var3 = (r45.j51) fVar2.f70618d;
                java.lang.Long valueOf = j51Var3 != null ? java.lang.Long.valueOf(j51Var3.getLong(13)) : null;
                r45.j51 j51Var4 = (r45.j51) fVar2.f70618d;
                if (j51Var4 != null && (finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) j51Var4.getCustom(6)) != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.finder.feed.model.g0(this.f107900a, finderCommentInfo, this.f107901b, valueOf));
                }
                r45.j51 j51Var5 = (r45.j51) fVar2.f70618d;
                if (j51Var5 != null) {
                    com.tencent.mm.plugin.finder.feed.model.v vVar = com.tencent.mm.plugin.finder.feed.model.y.f108465e;
                    com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f107900a;
                    vVar.a(j51Var5, l0Var.f108125g, this.f107901b, l0Var.f108126h);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> list3 = ((r45.j51) fVar2.f70618d).getList(1);
                kotlin.jvm.internal.o.f(list3, "getCommentInfo(...)");
                long j17 = this.f107901b;
                java.lang.String str2 = this.f107903d;
                for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 : list3) {
                    kotlin.jvm.internal.o.d(finderCommentInfo2);
                    com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
                    yj0Var.field_feedId = j17;
                    yj0Var.field_dupFlag = str2;
                    yj0Var.field_state = 2;
                    yj0Var.field_actionInfo.set(1, finderCommentInfo2);
                    yj0Var.n1(0L);
                    arrayList.add(new so2.y0(yj0Var));
                }
                com.tencent.mm.plugin.finder.feed.model.l0.L0(this.f107900a, this.f107902c, arrayList, this.f107901b, this.f107903d);
                java.util.List J0 = com.tencent.mm.plugin.finder.feed.model.l0.J0(this.f107900a, arrayList, this.f107901b, this.f107903d);
                java.util.List<com.tencent.mm.plugin.finder.storage.yj0> list4 = this.f107904e;
                com.tencent.mm.plugin.finder.feed.model.l0 l0Var2 = this.f107900a;
                for (com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 : list4) {
                    java.util.Iterator it = ((java.util.ArrayList) J0).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        so2.y0 y0Var = (so2.y0) obj2;
                        y0Var.f410703d.getClientId();
                        if (kotlin.jvm.internal.o.b(y0Var.f410703d.getClientId(), yj0Var2.getClientId())) {
                            break;
                        }
                    }
                    if (((so2.y0) obj2) == null) {
                        java.lang.String str3 = l0Var2.f108126h;
                        yj0Var2.getClientId();
                        ((java.util.ArrayList) J0).add(new so2.y0(yj0Var2));
                    }
                }
                com.tencent.mars.xlog.Log.i(this.f107900a.f108126h, "---merge preSize: " + ((r45.j51) fVar2.f70618d).getList(1).size() + ", afterSize:" + ((java.util.ArrayList) J0).size());
                bu2.n nVar = bu2.n.f24550a;
                if (nVar.e(this.f107901b, 0L) != null) {
                    z17 = false;
                }
                if (z17) {
                    long j18 = this.f107901b;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(J0, 10));
                    java.util.Iterator it6 = ((java.util.ArrayList) J0).iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(((so2.y0) it6.next()).f410703d);
                    }
                    nVar.a(j18, 0L, arrayList2);
                    bu2.n.f24550a.b(this.f107901b, 0L, 0, byteString, z19, z18, false, (r45.uy0) ((r45.j51) fVar2.f70618d).getCustom(8), (r45.xq2) ((r45.j51) fVar2.f70618d).getCustom(10), (r45.vy0) ((r45.j51) fVar2.f70618d).getCustom(9));
                    com.tencent.mars.xlog.Log.i(this.f107900a.f108126h, "add cache succ, feedId: " + pm0.v.u(this.f107901b) + ", size:" + ((java.util.ArrayList) J0).size());
                } else {
                    com.tencent.mars.xlog.Log.i(this.f107900a.f108126h, "---cache exist or list is empty, feedId:" + pm0.v.u(this.f107901b) + ", list size: " + ((java.util.ArrayList) J0).size());
                }
            }
        } finally {
            try {
                this.f107900a.f108132q.remove(java.lang.Long.valueOf(this.f107901b));
                return jz5.f0.f302826a;
            } catch (java.lang.Throwable th6) {
            }
        }
        this.f107900a.f108132q.remove(java.lang.Long.valueOf(this.f107901b));
        return jz5.f0.f302826a;
    }
}
