package jr4;

/* loaded from: classes8.dex */
public final class m extends et1.e implements ct1.x {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f382944m = jz5.h.b(jr4.l.f382943d);

    @Override // et1.e, ct1.c
    public boolean b(r45.w3 rawBypMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        if (rawBypMsg.f470359d.f459093g == 10002) {
            rawBypMsg.f470363h = false;
        }
        return super.b(rawBypMsg);
    }

    @Override // ct1.c
    public int h() {
        return 20;
    }

    @Override // ct1.c
    public int i() {
        return 14;
    }

    @Override // ct1.c
    public void l(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(s((r45.w3) it.next()));
        }
        java.util.List Q = kz5.n0.Q(kz5.n0.V0(arrayList));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(Q, 10));
        java.util.Iterator it6 = Q.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((fr4.g0) i95.n0.c(fr4.g0.class)).Vi().z0((java.lang.String) it6.next()));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            arrayList3.add(r((r45.w3) it7.next()));
        }
        java.util.List Q2 = kz5.n0.Q(kz5.n0.V0(arrayList3));
        hr4.p pVar = hr4.p.f365796a;
        java.util.List t07 = kz5.n0.t0(Q2, arrayList2);
        hr4.s sVar = (hr4.s) ((jz5.n) hr4.p.f365797b).mo141623x754a37bb();
        sVar.getClass();
        java.util.Iterator it8 = ((java.util.ArrayList) t07).iterator();
        while (it8.hasNext()) {
            sVar.a((java.lang.String) it8.next(), java.lang.Boolean.FALSE);
        }
        sVar.b();
    }

    @Override // et1.e
    public java.lang.Object q(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((kr4.n) ((jz5.n) this.f382944m).mo141623x754a37bb()).y0(sessionId);
    }

    @Override // et1.e
    public void v(java.lang.Object obj, java.lang.String sessionId) {
        kr4.o session = (kr4.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        kr4.n nVar = (kr4.n) ((jz5.n) this.f382944m).mo141623x754a37bb();
        java.lang.String field_talkerUserName = session.f69160x3e123854;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talkerUserName, "field_talkerUserName");
        java.lang.String field_selfUserName = session.f69157x5568d387;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
        int i17 = session.f69156xef647383;
        java.lang.String[] strArr = kr4.n.f393051g;
        nVar.D0(sessionId, field_talkerUserName, field_selfUserName, 2, true, i17);
    }

    @Override // et1.e
    public boolean x(java.lang.Object obj, r45.w3 rawBypMsg) {
        r45.w75 w75Var;
        kr4.o localSessionInfo = (kr4.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localSessionInfo, "localSessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        if (rawBypMsg.f470359d.f459093g == 10002) {
            return false;
        }
        java.lang.String str = rawBypMsg.f470360e;
        java.lang.String r17 = r(rawBypMsg);
        java.lang.String s17 = s(rawBypMsg);
        if (rawBypMsg.f470362g != null) {
            try {
                w75Var = new r45.w75();
                w75Var.mo11468x92b714fd(rawBypMsg.f470362g.g());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f338100h, e17.getMessage());
                w75Var = new r45.w75();
            }
            if (w75Var.f470480e) {
                localSessionInfo.f69156xef647383 = 1;
            } else {
                localSessionInfo.f69156xef647383 = 0;
            }
        }
        localSessionInfo.f69158xbed8694c = str;
        localSessionInfo.f69160x3e123854 = s17;
        localSessionInfo.f69157x5568d387 = r17;
        return true;
    }
}
