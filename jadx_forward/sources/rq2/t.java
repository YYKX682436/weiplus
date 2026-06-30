package rq2;

/* loaded from: classes2.dex */
public final class t extends db2.y2 {
    public t() {
        super(new java.util.LinkedList(), null);
    }

    @Override // db2.y2
    public java.util.LinkedList B() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        rq2.s sVar = rq2.s.f480412a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.HashSet hashSet = rq2.s.f480419h;
        synchronized (hashSet) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                rq2.q qVar = (rq2.q) it.next();
                r45.m31 m31Var = new r45.m31();
                m31Var.set(0, 3);
                m31Var.set(2, java.lang.Integer.valueOf(qVar.f480401i));
                m31Var.set(4, java.lang.Integer.valueOf((int) qVar.f480404l));
                m31Var.set(5, java.lang.Integer.valueOf((int) qVar.f480405m));
                m31Var.set(9, java.lang.Integer.valueOf((int) qVar.f480407o));
                m31Var.set(6, java.lang.Integer.valueOf((int) qVar.f480406n));
                m31Var.set(10, qVar.f480400h);
                r45.xw xwVar = qVar.f480410r;
                if (xwVar != null) {
                    m31Var.set(16, java.lang.Long.valueOf(xwVar.f472080q));
                    m31Var.set(17, java.lang.Long.valueOf(xwVar.f472070d));
                    m31Var.set(18, java.lang.Long.valueOf(xwVar.f472071e));
                    m31Var.set(19, java.lang.Long.valueOf(xwVar.f472072f));
                    m31Var.set(20, java.lang.Long.valueOf(xwVar.f472073g));
                    m31Var.set(21, java.lang.Long.valueOf(xwVar.f472074h));
                    m31Var.set(22, java.lang.Long.valueOf(xwVar.f472076m));
                    m31Var.set(23, java.lang.Long.valueOf(xwVar.f472077n));
                }
                linkedList2.add(m31Var);
                pm0.v.K(null, new rq2.r(qVar));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "getStatsReportFluencyInfo real report: \npullType = " + qVar.f480401i + ", \nenterCost = " + qVar.f480404l + ", \ncgiCost = " + qVar.f480405m + ",\ndbCost = " + qVar.f480407o + ",\ndebugMessage = " + qVar.f480400h + ",\nisFromClick = " + rq2.s.f480415d + ",\ntabName = " + qVar.f480403k + ",\nstart_time = " + m31Var.m75942xfb822ef2(16) + "\nstart_connect_time = " + m31Var.m75942xfb822ef2(17) + "\nconnect_successful_time = " + m31Var.m75942xfb822ef2(18) + "\nstart_tls_handshake_time = " + m31Var.m75942xfb822ef2(19) + "\ntls_handshake_successful_time = " + m31Var.m75942xfb822ef2(20) + "\nstart_send_packet_time = " + m31Var.m75942xfb822ef2(21) + "\nstart_read_packet_time = " + m31Var.m75942xfb822ef2(22) + "\nread_packet_finished_time = " + m31Var.m75942xfb822ef2(23));
            }
            rq2.s.f480419h.clear();
        }
        linkedList.addAll(linkedList2);
        return linkedList;
    }

    @Override // db2.y2, az2.j
    /* renamed from: C */
    public void A(int i17, int i18, java.lang.String str, r45.tw2 resp, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLiveCgiStatusReport", "onCgiEnd errType: " + i17 + " errCode: " + i18 + " errMsg: " + str);
    }
}
