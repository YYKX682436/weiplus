package bq;

/* loaded from: classes2.dex */
public final class d0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f23481o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.storage.FinderItem feed, long j17, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, int i17, java.util.LinkedList linkedList, java.lang.String clientUdfKv, com.tencent.mm.protobuf.g gVar2) {
        super(qt2Var);
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(clientUdfKv, "clientUdfKv");
        this.f23481o = feed;
        r45.y41 y41Var = new r45.y41();
        long id6 = feed.getFeedObject().getId();
        db2.t4 t4Var = db2.t4.f228171a;
        y41Var.set(1, t4Var.b(8560, qt2Var));
        y41Var.set(2, java.lang.Long.valueOf(id6));
        y41Var.set(4, gVar);
        y41Var.set(3, java.lang.Long.valueOf(j17));
        y41Var.set(5, linkedList);
        y41Var.set(6, gVar2);
        t4Var.d((r45.kv0) y41Var.getCustom(1), new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0), java.lang.Long.valueOf(id6), feed.getDupFlag()), qt2Var, clientUdfKv);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetbulletcomment";
        lVar.f70667d = 8560;
        lVar.f70664a = y41Var;
        lVar.f70665b = new r45.z41();
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pullType=");
        sb6.append(i17);
        sb6.append(", start_timestamp=");
        sb6.append(j17);
        sb6.append(", videoObjectId=");
        sb6.append(pm0.v.u(id6));
        sb6.append(" lastBuffer=");
        sb6.append(gVar);
        sb6.append(" ‘’md5=");
        java.util.ArrayList arrayList = null;
        sb6.append(kk.k.g(gVar != null ? gVar.f192156a : null));
        sb6.append(" client_udf_kv = ");
        r45.kv0 kv0Var = (r45.kv0) y41Var.getCustom(1);
        if (kv0Var != null && (list = kv0Var.getList(7)) != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.fl2) it.next()).getString(5));
            }
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.FinderGetBulletCgi", sb6.toString());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.z41 resp = (r45.z41) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList list = resp.getList(1);
            com.tencent.mm.protobuf.g byteString = resp.getByteString(2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("count:");
            sb6.append(list.size());
            sb6.append(" ,lastbuf ");
            sb6.append(kk.k.g(byteString != null ? byteString.f192156a : null));
            sb6.append(" min:");
            sb6.append(resp.getLong(3));
            sb6.append(" max: ==>");
            sb6.append(resp.getLong(4));
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(sb6.toString());
            int i19 = 0;
            for (java.lang.Object obj : list) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.oo ooVar = (r45.oo) obj;
                stringBuffer.append("# " + i19 + ':' + ooVar.getString(2) + ',' + ooVar.getInteger(4) + ", ");
                i19 = i27;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getBulletList videoObjectId=");
            sb7.append(pm0.v.u(this.f23481o.getId()));
            sb7.append(' ');
            sb7.append(kk.k.g(byteString != null ? byteString.f192156a : null));
            sb7.append(' ');
            sb7.append((java.lang.Object) stringBuffer);
            com.tencent.mars.xlog.Log.i("Finder.FinderGetBulletCgi", sb7.toString());
        }
    }
}
