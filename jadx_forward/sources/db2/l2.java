package db2;

/* loaded from: classes2.dex */
public final class l2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final int f309586t;

    /* renamed from: u, reason: collision with root package name */
    public final long f309587u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f309588v;

    /* renamed from: w, reason: collision with root package name */
    public int f309589w;

    public /* synthetic */ l2(r45.f96 f96Var, zy2.o9 o9Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.Integer num, r45.qt2 qt2Var, int i17, int i18, long j17, java.lang.String str, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(f96Var, o9Var, gVar, (i19 & 8) != 0 ? null : num, (i19 & 16) != 0 ? null : qt2Var, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? 0 : i18, (i19 & 128) != 0 ? 0L : j17, (i19 & 256) != 0 ? "" : str);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.zo2 resp = (r45.zo2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderPoiStream", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("server increatment size:");
        sb6.append(resp.m75941xfb821914(1).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderPoiStream", sb6.toString());
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            java.util.Objects.toString(resp.mo12245xcc313de3());
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = this.f152179f.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse");
            java.util.LinkedList m75941xfb821914 = ((r45.zo2) fVar2).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).cl((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), this.f97668n);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(r45.f96 location, zy2.o9 fromType, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.Integer num, r45.qt2 qt2Var, int i17, int i18, long j17, java.lang.String bypassBuffer) {
        super(qt2Var, null, 2, null);
        jz5.o oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromType, "fromType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassBuffer, "bypassBuffer");
        this.f309586t = i18;
        this.f309587u = j17;
        this.f309588v = bypassBuffer;
        r45.yo2 yo2Var = new r45.yo2();
        r45.zo2 zo2Var = new r45.zo2();
        yo2Var.set(1, db2.t4.f309704a.b(5225, qt2Var));
        yo2Var.set(6, location.m75945x2fec8307(5));
        yo2Var.set(3, java.lang.Float.valueOf(location.m75938x746dc8a6(0)));
        yo2Var.set(4, java.lang.Float.valueOf(location.m75938x746dc8a6(1)));
        yo2Var.set(12, location.m75945x2fec8307(4));
        java.lang.String m75945x2fec8307 = location.m75945x2fec8307(3);
        java.lang.String m75945x2fec83072 = location.m75945x2fec8307(15);
        java.lang.String m75945x2fec83073 = location.m75945x2fec8307(2);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            oVar = new jz5.o(m75945x2fec8307 == null ? "" : m75945x2fec8307, m75945x2fec83072 == null ? "" : m75945x2fec83072, m75945x2fec83073 == null ? "" : m75945x2fec83073);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
            java.lang.String t17 = !(m75945x2fec83072 == null || m75945x2fec83072.length() == 0) ? r26.i0.t(m75945x2fec8307, m75945x2fec83072, "", false) : m75945x2fec8307;
            t17 = m75945x2fec83073 == null || m75945x2fec83073.length() == 0 ? t17 : r26.i0.t(t17, m75945x2fec83073, "", false);
            while (r26.i0.y(t17, " · ", false)) {
                t17 = r26.n0.W(t17, " · ");
            }
            if (r26.n0.B(t17, " · ", false)) {
                oVar = new jz5.o(m75945x2fec8307, m75945x2fec83072 == null ? "" : m75945x2fec83072, m75945x2fec83073 == null ? "" : m75945x2fec83073);
            } else {
                oVar = new jz5.o(t17, m75945x2fec83072 == null ? "" : m75945x2fec83072, m75945x2fec83073 == null ? "" : m75945x2fec83073);
            }
        }
        java.lang.String str = (java.lang.String) oVar.f384374d;
        java.lang.String str2 = (java.lang.String) oVar.f384375e;
        java.lang.String str3 = (java.lang.String) oVar.f384376f;
        yo2Var.set(11, str);
        yo2Var.set(13, str3);
        yo2Var.set(14, str2);
        yo2Var.set(8, java.lang.Integer.valueOf(fromType.ordinal()));
        yo2Var.set(2, gVar);
        yo2Var.set(10, java.lang.Integer.valueOf(i17));
        yo2Var.set(5, db2.t4.f309704a.n());
        yo2Var.set(18, java.lang.Integer.valueOf(this.f309586t));
        yo2Var.set(7, java.lang.Long.valueOf(this.f309587u));
        yo2Var.set(19, this.f309588v);
        yo2Var.set(20, (r45.wo2) location.m75936x14adae67(21));
        if (num != null) {
            yo2Var.set(9, java.lang.Integer.valueOf(num.intValue()));
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = yo2Var;
        lVar.f152198b = zo2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpoistream";
        lVar.f152200d = 5225;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderPoiStream", "poi_name=" + location.m75945x2fec8307(3) + " poiAddress=" + location.m75945x2fec8307(4) + " City=" + location.m75945x2fec8307(2) + " country=" + location.m75945x2fec8307(15) + "poiId=" + location.m75945x2fec8307(5) + " fromScene=" + num + " fromType=" + fromType);
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            yo2Var.m75939xb282bd08(18);
            java.util.Objects.toString(yo2Var.mo12245xcc313de3());
        }
    }
}
