package ak5;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final ak5.t f5694d = new ak5.t(null);

    /* renamed from: e, reason: collision with root package name */
    public static final p75.n0 f5695e = dm.kb.f238115h;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f5696f = jz5.h.b(ak5.s.f5692d);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5697a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5698b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f5699c;

    public v(java.lang.String chatRoomName) {
        kotlin.jvm.internal.o.g(chatRoomName, "chatRoomName");
        this.f5697a = chatRoomName;
        this.f5698b = "TopMsg.TopMsgInfoRecordHelper@" + chatRoomName;
        this.f5699c = jz5.h.b(new ak5.u(this));
    }

    public final void a(long j17) {
        java.lang.Object obj;
        java.util.Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.storage.db) obj).w0().f372605f == j17) {
                    break;
                }
            }
        }
        com.tencent.mm.storage.db dbVar = (com.tencent.mm.storage.db) obj;
        java.lang.String str = this.f5698b;
        if (dbVar == null) {
            com.tencent.mars.xlog.Log.e(str, "cancelBySrvId() called can not find :%s", java.lang.Long.valueOf(j17));
            return;
        }
        dbVar.A0(true);
        dbVar.updateToDB(f5694d.a().Q4(), true);
        com.tencent.mars.xlog.Log.i(str, "cancelBySrvId() succeed :%s", java.lang.Long.valueOf(j17));
    }

    public final java.util.List b() {
        return (java.util.List) ((jz5.n) this.f5699c).getValue();
    }

    public final void c(java.util.List cache, r45.cu5 cu5Var) {
        byte[] bArr;
        kotlin.jvm.internal.o.g(cache, "cache");
        if (cu5Var != null) {
            try {
                com.tencent.mm.protobuf.g gVar = cu5Var.f371841f;
                if (gVar != null && (bArr = gVar.f192156a) != null) {
                    r45.cn6 cn6Var = new r45.cn6();
                    cn6Var.parseFrom(bArr);
                    d(cache, cn6Var.f371675d);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f5698b, th6, "updateTopMsgInfoItemsByServer err", new java.lang.Object[0]);
                return;
            }
        }
        d(cache, new java.util.LinkedList());
    }

    public final void d(java.util.List list, java.util.List list2) {
        boolean z17;
        java.lang.Object obj;
        boolean z18;
        java.lang.Object obj2;
        if (list2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("size:" + list2.size());
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                sb6.append(com.tencent.mm.ui.tipsbar.t.a((r45.dn6) it.next()));
            }
            kotlin.jvm.internal.o.f(sb6.toString(), "toString(...)");
        }
        java.util.List<r45.dn6> linkedList = list2 == null ? new java.util.LinkedList() : list2;
        ak5.t tVar = f5694d;
        l75.k0 Q4 = tVar.a().Q4();
        kotlin.jvm.internal.o.e(Q4, "null cannot be cast to non-null type com.tencent.mm.sdk.storage.ISQLiteDatabase");
        long F = Q4.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it6 = list.iterator();
        while (true) {
            z17 = true;
            if (!it6.hasNext()) {
                break;
            }
            com.tencent.mm.storage.db dbVar = (com.tencent.mm.storage.db) it6.next();
            java.util.Iterator it7 = linkedList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj2 = null;
                    break;
                }
                java.lang.Object next = it7.next();
                if (((r45.dn6) next).f372603d == dbVar.u0()) {
                    obj2 = next;
                    break;
                }
            }
            if (((r45.dn6) obj2) == null) {
                linkedList2.add(dbVar);
                it6.remove();
                dbVar.deleteFromDB(tVar.a().Q4(), true);
                int i17 = dbVar.w0().f372603d;
            }
        }
        for (r45.dn6 dn6Var : linkedList) {
            java.util.Iterator it8 = list.iterator();
            while (true) {
                if (it8.hasNext()) {
                    obj = it8.next();
                    if (((com.tencent.mm.storage.db) obj).u0() == dn6Var.f372603d ? z17 : false) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.tencent.mm.storage.db dbVar2 = (com.tencent.mm.storage.db) obj;
            if (dbVar2 == null) {
                com.tencent.mm.storage.db dbVar3 = new com.tencent.mm.storage.db();
                dbVar3.z0(dn6Var.f372603d);
                dbVar3.D0(dn6Var);
                dbVar3.y0(this.f5697a);
                list.add(dbVar3);
                l75.k0 Q42 = tVar.a().Q4();
                o75.c cVar = new o75.c(o75.b.f343582c, java.lang.String.valueOf(dbVar3.getPrimaryKeyValue()), "MicroMsg.SDK.BaseTopMsgInfoRecord");
                cVar.f343590d = dbVar3;
                new m75.c(dbVar3, true, cVar, dm.kb.f238124t, "MicroMsg.SDK.BaseTopMsgInfoRecord").a(Q42);
                z18 = true;
            } else {
                dbVar2.D0(dn6Var);
                z18 = true;
                dbVar2.updateToDB(tVar.a().Q4(), true);
                int i18 = dbVar2.w0().f372603d;
            }
            z17 = z18;
        }
        l75.k0 Q43 = tVar.a().Q4();
        if (Q43 != null) {
            Q43.w(java.lang.Long.valueOf(F));
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("size:" + list.size());
        java.util.Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            com.tencent.mm.storage.db dbVar4 = (com.tencent.mm.storage.db) it9.next();
            kotlin.jvm.internal.o.g(dbVar4, "<this>");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("item{id=");
            sb8.append(dbVar4.u0());
            sb8.append(" isCancel =");
            sb8.append(dbVar4.v0());
            sb8.append(" item=");
            r45.dn6 w07 = dbVar4.w0();
            kotlin.jvm.internal.o.f(w07, "getTopMsgInfoItem(...)");
            sb8.append(com.tencent.mm.ui.tipsbar.t.a(w07));
            sb8.append('}');
            sb7.append(sb8.toString());
        }
        kotlin.jvm.internal.o.f(sb7.toString(), "toString(...)");
    }
}
