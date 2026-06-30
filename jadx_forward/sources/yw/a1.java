package yw;

/* loaded from: classes4.dex */
public final class a1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.a1 f547795a = new yw.a1();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetBizLatestItemListResp");
            r45.ob3 ob3Var = (r45.ob3) fVar2;
            java.util.LinkedList list = ob3Var.f463663d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Long.valueOf(((r45.zk) it.next()).f473689f));
            }
            int hashCode = kz5.n0.D0(arrayList2).hashCode();
            android.database.Cursor E = yq1.u0.Ri().f392836d.E("BizFollowedContactDigest", new java.lang.String[]{dm.i4.f66874x4c6b1f55}, null, null, null, null, dm.i4.f66874x4c6b1f55);
            if (E != null) {
                try {
                    arrayList = new java.util.ArrayList();
                    while (E.moveToNext()) {
                        arrayList.add(java.lang.Long.valueOf(E.getLong(0)));
                    }
                    vz5.b.a(E, null);
                } finally {
                }
            } else {
                arrayList = new java.util.ArrayList();
            }
            if (hashCode == kz5.n0.D0(arrayList).hashCode()) {
                yw.h1 h1Var = yw.h1.f547865a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "there is no difference between saved and current data.");
            } else {
                java.util.LinkedList<r45.zk> list2 = ob3Var.f463663d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "list");
                for (r45.zk zkVar : list2) {
                    kr1.a aVar = new kr1.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zkVar);
                    aVar.f66580x3a0bff44 = zkVar.f473687d;
                    aVar.f66582xa783a79b = zkVar.f473689f;
                    aVar.f66581xf66fcca9 = zkVar.f473688e;
                    kr1.b Ri = yq1.u0.Ri();
                    Ri.getClass();
                    kr1.a aVar2 = new kr1.a();
                    java.lang.String str = aVar.f66580x3a0bff44;
                    aVar2.f66580x3a0bff44 = str;
                    p75.i0 i17 = dm.g1.f318548g.i();
                    i17.f434190d = dm.g1.f318549h.j(str);
                    i17.f434189c = "MicroMsg.SDK.BaseBizFollowedContactDigest";
                    kr1.a aVar3 = (kr1.a) i17.a().o(Ri.f392836d, kr1.a.class);
                    if (aVar3 == null) {
                        Ri.mo880xb970c2b9(aVar);
                    } else if (aVar3.f66582xa783a79b != aVar.f66582xa783a79b) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f66581xf66fcca9)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFollowedContactDigestStorage", "replaceOrAdd: new digest is empty, keep old digest for " + aVar.f66580x3a0bff44);
                            aVar.f66581xf66fcca9 = aVar3.f66581xf66fcca9;
                        }
                        Ri.mo11260x413cb2b4(aVar);
                    }
                }
            }
        } else {
            yw.h1 h1Var2 = yw.h1.f547865a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFlutterHelper", "fetchContactMsgDigest error:" + fVar.f152148a + ' ' + fVar.f152149b);
        }
        return jz5.f0.f384359a;
    }
}
