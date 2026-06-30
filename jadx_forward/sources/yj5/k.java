package yj5;

/* loaded from: classes8.dex */
public final class k extends yj5.a {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.ArrayList f544251h = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f544252f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final yj5.j f544253g = new yj5.j(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536423o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        kz5.p0 p0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        java.lang.String hostRoomId = talkerInfo.f542275a;
        this.f544252f.clear();
        java.util.ArrayList arrayList = this.f544252f;
        rl2.v wi6 = ((vd2.u0) ((ss5.c0) i95.n0.c(ss5.c0.class))).wi();
        if (wi6 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostRoomId, "hostRoomId");
            java.util.LinkedList<dm.s4> linkedList = new java.util.LinkedList();
            java.util.Vector vector = rl2.v.f478747g;
            synchronized (vector) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = vector.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((dm.s4) next).f68257x7560f783, hostRoomId)) {
                        arrayList2.add(next);
                    }
                }
                linkedList.addAll(kz5.n0.F0(arrayList2, new rl2.r()));
            }
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            java.util.List m17 = c01.v1.m(hostRoomId);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (dm.s4 s4Var : linkedList) {
                java.lang.String str = s4Var.f68254x123da011;
                if (str == null) {
                    str = "";
                }
                if (!((java.util.LinkedList) m17).contains(str)) {
                    wi6.z0(s4Var.f68258x41d5e0c, false);
                    arrayList3.add(s4Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarStorage", "delete " + pm0.v.u(s4Var.f68258x41d5e0c) + ", anchorWxUsername:" + str + " is not in chatroom:" + hostRoomId);
                }
            }
            linkedList.removeAll(arrayList3);
            for (dm.s4 s4Var2 : linkedList) {
                s4Var2.f68259x2c72afa8 = true;
                wi6.mo9952xce0038c9(s4Var2, "liveId");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarStorage", "getTipsBarDataByHostRoomId " + hostRoomId + ", " + kz5.n0.g0(linkedList, null, null, null, 0, null, rl2.q.f478740d, 31, null));
            p0Var = linkedList;
        } else {
            p0Var = kz5.p0.f395529d;
        }
        arrayList.addAll(p0Var);
        java.util.ArrayList arrayList4 = this.f544252f;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
        java.util.Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            arrayList5.add(new xj5.d((dm.s4) it6.next()));
        }
        return arrayList5;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.l(ui6, tipsBarContext, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        f544251h.add(this.f544253g);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        f544251h.remove(this.f544253g);
    }
}
