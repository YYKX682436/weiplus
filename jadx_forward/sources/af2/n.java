package af2;

/* loaded from: classes3.dex */
public final class n extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f86068a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86069b;

    public n(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f86068a = liveContext;
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        java.lang.Object obj;
        kn0.p pVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respWrapper, "respWrapper");
        r45.r71 r71Var = respWrapper.f526747a;
        if (r71Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isHistory:");
            sb6.append(r71Var.m75939xb282bd08(22));
            sb6.append(", getConfig:");
            r45.b94 b94Var = (r45.b94) r71Var.m75936x14adae67(21);
            if (b94Var == null || (obj = pm0.b0.b(b94Var)) == null) {
                obj = "";
            }
            sb6.append(obj);
            sb6.append(",msgsize:");
            sb6.append(r71Var.m75941xfb821914(2).size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMsgRespSpeedInterceptor", sb6.toString());
            mm2.e5 e5Var = (mm2.e5) this.f86068a.a(mm2.e5.class);
            r45.b94 b94Var2 = (r45.b94) r71Var.m75936x14adae67(21);
            if (b94Var2 != null) {
                if (!(b94Var2.m75939xb282bd08(10) >= 0 || b94Var2.m75939xb282bd08(11) > 0 || b94Var2.m75939xb282bd08(0) > 0 || b94Var2.m75939xb282bd08(6) > 0 || b94Var2.m75939xb282bd08(3) > 0)) {
                    b94Var2 = null;
                }
                if (b94Var2 != null) {
                    r45.b94 other = e5Var.f410535f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
                    boolean z17 = b94Var2.m75939xb282bd08(10) == other.m75939xb282bd08(10) && b94Var2.m75939xb282bd08(11) == other.m75939xb282bd08(11) && b94Var2.m75939xb282bd08(0) == other.m75939xb282bd08(0) && b94Var2.m75939xb282bd08(12) == other.m75939xb282bd08(12);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveMsgSpeedControlSlice", "[isSame] " + z17);
                    if (!z17) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[isSame]  ");
                        sb7.append("config = " + pm0.b0.b(b94Var2));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveMsgSpeedControlSlice", sb7.toString());
                    }
                    if (!z17) {
                        e5Var.f410535f = b94Var2;
                        mm2.e5.f410534o = e5Var.f410535f.m75939xb282bd08(12);
                    }
                }
            }
            tn0.w0 w0Var = dk2.ef.f314911d;
            if ((w0Var == null || (pVar = w0Var.D) == null || pVar.f()) ? false : true) {
                mm2.e5 e5Var2 = (mm2.e5) this.f86068a.a(mm2.e5.class);
                java.util.LinkedList m75941xfb821914 = r71Var.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMsgList(...)");
                java.util.LinkedList m75941xfb8219142 = r71Var.m75941xfb821914(14);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getApp_msg_list(...)");
                if (((mm2.c1) e5Var2.m147920xbba4bfc0(mm2.c1.class)).f410435w) {
                    if (e5Var2.f410535f.m75939xb282bd08(10) <= 0) {
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        z65.c.a();
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                        h0Var.f391656d = new java.util.ArrayList();
                        java.util.Iterator it = m75941xfb821914.iterator();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                            r45.t12 t12Var = (r45.t12) next;
                            if (e5Var2.f410537h.contains(java.lang.Integer.valueOf(t12Var.m75939xb282bd08(3)))) {
                                ((java.util.ArrayList) h0Var.f391656d).add(t12Var);
                                it.remove();
                            }
                        }
                        java.util.Iterator it6 = m75941xfb8219142.iterator();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
                        while (it6.hasNext()) {
                            java.lang.Object next2 = it6.next();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next2, "next(...)");
                            r45.ch1 ch1Var = (r45.ch1) next2;
                            if (e5Var2.f410537h.contains(java.lang.Integer.valueOf(ch1Var.m75939xb282bd08(1)))) {
                                ((java.util.ArrayList) h0Var.f391656d).add(ch1Var);
                                it6.remove();
                            }
                        }
                        e5Var2.f410538i.mo50293x3498a0(new mm2.c5(e5Var2, h0Var));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveMsgSpeedControlSlice", "unable LiveRoom Comment,clear cache");
                    e5Var2.f410538i.mo50293x3498a0(new mm2.b5(e5Var2));
                }
            }
            if (!this.f86069b) {
                mm2.e5 e5Var3 = (mm2.e5) this.f86068a.a(mm2.e5.class);
                p3325xe03a0797.p3326xc267989b.l.d(e5Var3.f410496d.f354008i, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new mm2.a5(e5Var3, null), 2, null);
                this.f86069b = true;
            }
        }
        return true;
    }

    @Override // we2.x
    public void c() {
        this.f86069b = false;
    }
}
