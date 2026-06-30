package xq;

/* loaded from: classes12.dex */
public final class r {
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.a()) {
            long j17 = xq.s.f537551d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (android.os.SystemClock.elapsedRealtime() - j17 > 1800000) {
                xq.s.f537551d = android.os.SystemClock.elapsedRealtime();
                ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ui(37, 7, -1, false);
                ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(37);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEggUtil", "checkAnimUpdate: " + xq.s.f537552e.f537510c.size() + ", " + xq.s.f537551d);
            }
        }
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.String U1 = msgInfo.U1();
        if (!msgInfo.H2() && !msgInfo.T2()) {
            return U1;
        }
        ot0.q v17 = ot0.q.v(U1);
        return v17 != null ? v17.f430187f : null;
    }

    public final java.util.List c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (msgInfo.S2()) {
            java.lang.String j17 = msgInfo.j();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msgInfo.Q0())) {
                j17 = c01.w9.r(j17);
            }
            ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).getClass();
            java.util.LinkedList recordList = bm5.d1.e(j17).f459919e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recordList, "recordList");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(recordList, 10));
            java.util.Iterator it = recordList.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.l55) it.next()).f460687f);
            }
            linkedList.addAll(arrayList);
        }
        return linkedList;
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = xq.s.f537549b;
        sb6.append(str);
        sb6.append("config.conf");
        int d17 = rr.t.d(sb6.toString());
        int d18 = rr.t.d("assets:///panel/config.conf");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str);
        java.lang.String str2 = xq.s.f537550c;
        sb7.append(str2);
        java.lang.String sb8 = sb7.toString();
        java.lang.String str3 = "assets:///panel/" + str2;
        gr.a aVar = gr.b.f356194a;
        if (d17 <= 0 || d17 < d18 || !com.p314xaae8f345.mm.vfs.w6.j(sb8)) {
            aVar.a(str3, xq.s.f537552e);
        } else {
            aVar.a(sb8, xq.s.f537552e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEggUtil", "initAnimConfig: version:" + d17 + ", " + d18 + "; content " + xq.s.f537552e.f537510c.size());
    }
}
