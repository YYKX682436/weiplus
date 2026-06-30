package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageCgiSource;", "Lir2/c;", "Lso2/i;", "Lbq/a;", "Lr45/n81;", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource */
/* loaded from: classes10.dex */
public final class C14859x45ba311f extends ir2.c {

    /* renamed from: e, reason: collision with root package name */
    public final int f204800e;

    /* renamed from: f, reason: collision with root package name */
    public final int f204801f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f204802g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f204803h;

    /* renamed from: i, reason: collision with root package name */
    public final int f204804i;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageCgiSource$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource$Companion */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }
    }

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14859x45ba311f.Companion(null);
    }

    public C14859x45ba311f(int i17, int i18, int[] messageTypes, java.lang.String username, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageTypes, "messageTypes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f204800e = i17;
        this.f204801f = i18;
        this.f204802g = messageTypes;
        this.f204803h = username;
        this.f204804i = i19;
    }

    @Override // ir2.c
    public ir2.a e(int i17, int i18, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e c14861xdd35421e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e(new java.util.ArrayList(), false);
        c14861xdd35421e.f375618g = i18;
        c14861xdd35421e.f375617f = i17;
        c14861xdd35421e.f375619h = errorMsg;
        return c14861xdd35421e;
    }

    @Override // ir2.c
    public ir2.a f(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.lang.Object obj;
        int i17;
        r45.n81 resp = (r45.n81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.wg2 wg2Var = (r45.wg2) resp.m75936x14adae67(1);
        cu2.a0 a0Var = cu2.b0.f303904a;
        boolean z17 = false;
        if (wg2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MessageCgiSource", "GetMentionList size " + wg2Var.m75941xfb821914(0).size());
            java.util.LinkedList m75941xfb821914 = wg2Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMentions(...)");
            m75941xfb821914.isEmpty();
            java.util.LinkedList m75941xfb8219142 = wg2Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getMentions(...)");
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                i17 = this.f204800e;
                if (!hasNext) {
                    break;
                }
                r45.pg2 pg2Var = (r45.pg2) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pg2Var);
                linkedList.add(a0Var.k(i17, pg2Var, this.f204803h));
            }
            if (bq.q0.f105046t.b()) {
                i(resp.m75934xbce7f2f(4));
            } else {
                java.util.LinkedList m75941xfb8219143 = wg2Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getMentions(...)");
                m75941xfb8219143.isEmpty();
                java.util.LinkedList<r45.pg2> m75941xfb8219144 = wg2Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getMentions(...)");
                for (r45.pg2 pg2Var2 : m75941xfb8219144) {
                    if (pg2Var2.m75939xb282bd08(2) == 10 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pg2Var2.m75945x2fec8307(25))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MessageCgiSource", "MENTION_TYPE_FOLLOW_APPLICATION APPROVED, clean db, username:" + pg2Var2.m75945x2fec8307(18) + ", clientMsgId:" + pg2Var2.m75945x2fec8307(25) + " scene:" + i17);
                        java.lang.String m75945x2fec8307 = pg2Var2.m75945x2fec8307(25);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        a0Var.i(m75945x2fec8307, i17);
                    }
                }
                if (!linkedList.isEmpty()) {
                    a0Var.h(linkedList, i17);
                }
                i(resp.m75934xbce7f2f(2));
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            if (kz5.z.F(this.f204802g, ((dm.pd) obj2).f66129x2262335f)) {
                arrayList.add(obj2);
            }
        }
        dm.pd pdVar = (dm.pd) kz5.n0.k0(arrayList);
        long j17 = pdVar != null ? pdVar.f66095xc8a07680 : -1L;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            so2.i j18 = a0Var.j((dm.pd) it6.next());
            if (j18 != null) {
                arrayList2.add(j18);
            }
        }
        r45.qk4 qk4Var = (r45.qk4) resp.m75936x14adae67(5);
        if (qk4Var != null) {
            java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((so2.i) obj).f491944d.f66124x65f321b > qk4Var.m75942xfb822ef2(0)) {
                    break;
                }
            }
            so2.i iVar = (so2.i) obj;
            if (iVar != null) {
                iVar.f491945e = true;
                iVar.f491946f = qk4Var.m75939xb282bd08(1) == 1;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load:");
        sb6.append(arrayList2.size());
        sb6.append(" unreadMentionId:");
        sb6.append(j17);
        sb6.append(" lastReadInfo: ");
        sb6.append(qk4Var != null ? java.lang.Long.valueOf(qk4Var.m75942xfb822ef2(0)) : null);
        sb6.append(" folded: ");
        if (qk4Var != null && qk4Var.m75939xb282bd08(1) == 1) {
            z17 = true;
        }
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MessageCgiSource", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e c14861xdd35421e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e(arrayList2, true);
        c14861xdd35421e.f204812k = j17;
        c14861xdd35421e.f204813l = qk4Var;
        c14861xdd35421e.f204814m = (r45.tl6) resp.m75936x14adae67(3);
        return c14861xdd35421e;
    }

    @Override // ir2.c, ir2.a0, ay1.m
    /* renamed from: getKey */
    public ir2.z getF204809h() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f204800e);
        sb6.append('-');
        sb6.append(this.f204801f);
        sb6.append('-');
        sb6.append(this.f204804i);
        return new ir2.z(sb6.toString());
    }

    @Override // ir2.c
    public az2.j h() {
        return new bq.a(this.f204800e, this.f204801f, this.f204803h, false);
    }

    public final void i(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        if (gVar != null) {
            bq.p0 p0Var = bq.q0.f105046t;
            p0Var.g(this.f204800e, this.f204801f, gVar.g(), this.f204803h, p0Var.b());
        }
        if (gVar != null && gVar.f273689a.length == 0) {
            int a17 = bq.q0.f105046t.a(this.f204800e);
            if (a17 == 2) {
                int i17 = this.f204801f;
                if (i17 == 1) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 50L, 1L, false);
                } else if (i17 == 2) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 51L, 1L, false);
                }
            } else if (a17 == 1) {
                jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 52L, 1L, false);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lastBuf ");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f273689a.length) : "null");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MessageCgiSource", sb6.toString());
    }
}
