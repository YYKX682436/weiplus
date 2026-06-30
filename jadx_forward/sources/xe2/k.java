package xe2;

/* loaded from: classes3.dex */
public final class k extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535406c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f535407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535406c = "LiveSingSongMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.fj1 fj1Var = new r45.fj1();
        if (ch1Var != null) {
            r45.ch1 ch1Var2 = ch1Var.m75934xbce7f2f(4) != null ? ch1Var : null;
            if (ch1Var2 != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var2.m75934xbce7f2f(4);
                fj1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("from msg syncRoomManagaerInfo modType: ");
        sb6.append(fj1Var.m75939xb282bd08(0));
        sb6.append(", msgId: ");
        sb6.append(ch1Var != null ? ch1Var.m75945x2fec8307(2) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535406c, sb6.toString());
        java.lang.String str = this.f535407d;
        if (str != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ch1Var != null ? ch1Var.m75945x2fec8307(2) : null)) {
                return;
            }
        }
        int m75939xb282bd08 = fj1Var.m75939xb282bd08(0);
        gk2.e eVar = this.f526800a;
        if (m75939xb282bd08 == 2) {
            dk2.xa.f315877a.e(eVar, 2, false);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.c1) eVar.a(mm2.c1.class)).U).k(java.lang.Boolean.FALSE);
        } else {
            dk2.xa.f315877a.e(eVar, 1, true);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.c1) eVar.a(mm2.c1.class)).U).k(java.lang.Boolean.TRUE);
        }
        this.f535407d = ch1Var != null ? ch1Var.m75945x2fec8307(2) : null;
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20069};
    }
}
