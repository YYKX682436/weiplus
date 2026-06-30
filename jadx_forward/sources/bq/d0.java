package bq;

/* loaded from: classes2.dex */
public final class d0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f105014o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feed, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, int i17, java.util.LinkedList linkedList, java.lang.String clientUdfKv, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2) {
        super(qt2Var);
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientUdfKv, "clientUdfKv");
        this.f105014o = feed;
        r45.y41 y41Var = new r45.y41();
        long m76784x5db1b11 = feed.getFeedObject().m76784x5db1b11();
        db2.t4 t4Var = db2.t4.f309704a;
        y41Var.set(1, t4Var.b(8560, qt2Var));
        y41Var.set(2, java.lang.Long.valueOf(m76784x5db1b11));
        y41Var.set(4, gVar);
        y41Var.set(3, java.lang.Long.valueOf(j17));
        y41Var.set(5, linkedList);
        y41Var.set(6, gVar2);
        t4Var.d((r45.kv0) y41Var.m75936x14adae67(1), new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(m76784x5db1b11), feed.m59229xb5af1dd5()), qt2Var, clientUdfKv);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetbulletcomment";
        lVar.f152200d = 8560;
        lVar.f152197a = y41Var;
        lVar.f152198b = new r45.z41();
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pullType=");
        sb6.append(i17);
        sb6.append(", start_timestamp=");
        sb6.append(j17);
        sb6.append(", videoObjectId=");
        sb6.append(pm0.v.u(m76784x5db1b11));
        sb6.append(" lastBuffer=");
        sb6.append(gVar);
        sb6.append(" ‘’md5=");
        java.util.ArrayList arrayList = null;
        sb6.append(kk.k.g(gVar != null ? gVar.f273689a : null));
        sb6.append(" client_udf_kv = ");
        r45.kv0 kv0Var = (r45.kv0) y41Var.m75936x14adae67(1);
        if (kv0Var != null && (m75941xfb821914 = kv0Var.m75941xfb821914(7)) != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.fl2) it.next()).m75945x2fec8307(5));
            }
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetBulletCgi", sb6.toString());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.z41 resp = (r45.z41) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("count:");
            sb6.append(m75941xfb821914.size());
            sb6.append(" ,lastbuf ");
            sb6.append(kk.k.g(m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null));
            sb6.append(" min:");
            sb6.append(resp.m75942xfb822ef2(3));
            sb6.append(" max: ==>");
            sb6.append(resp.m75942xfb822ef2(4));
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(sb6.toString());
            int i19 = 0;
            for (java.lang.Object obj : m75941xfb821914) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.oo ooVar = (r45.oo) obj;
                stringBuffer.append("# " + i19 + ':' + ooVar.m75945x2fec8307(2) + ',' + ooVar.m75939xb282bd08(4) + ", ");
                i19 = i27;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getBulletList videoObjectId=");
            sb7.append(pm0.v.u(this.f105014o.m59251x5db1b11()));
            sb7.append(' ');
            sb7.append(kk.k.g(m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null));
            sb7.append(' ');
            sb7.append((java.lang.Object) stringBuffer);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetBulletCgi", sb7.toString());
        }
    }
}
