package xe2;

/* loaded from: classes3.dex */
public final class j1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535405c = "LiveSingSongMsgInterceptor";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        r45.by1 by1Var;
        r45.ay1 ay1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        mm2.m6 m6Var = (mm2.m6) this.f526800a.a(mm2.m6.class);
        java.lang.Object[] objArr = ch1Var != null && ch1Var.m75939xb282bd08(1) == 20135;
        java.lang.String str = this.f535405c;
        r7 = null;
        r7 = null;
        java.lang.String str2 = null;
        if (objArr != true) {
            r45.fk1 fk1Var = new r45.fk1();
            if (ch1Var != null) {
                if ((ch1Var.m75934xbce7f2f(4) != null) == false) {
                    ch1Var = null;
                }
                if (ch1Var != null) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                    fk1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "from msg SingingSongName: " + fk1Var.m75945x2fec8307(0) + ", song_list_version: " + fk1Var.m75942xfb822ef2(3) + ", has_live_song_list: " + fk1Var.m75933x41a8a7f2(1));
            fk1Var.m75933x41a8a7f2(1);
            m6Var.f410776h.mo7808x76db6cb1(fk1Var.m75945x2fec8307(0));
            r45.z22 z22Var = (r45.z22) fk1Var.m75936x14adae67(4);
            if (z22Var != null) {
                m6Var.V6(z22Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Updated song cache: unique_add_id=" + z22Var.f473162f + ", song_mid=" + z22Var.f473160d);
                return;
            }
            return;
        }
        r45.ek1 ek1Var = new r45.ek1();
        if ((ch1Var.m75934xbce7f2f(4) != null) == false) {
            ch1Var = null;
        }
        if (ch1Var != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = ch1Var.m75934xbce7f2f(4);
            ek1Var.mo11468x92b714fd(m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "from msg SyncNewSongInfo: has_new_song_list=" + ek1Var.m75933x41a8a7f2(0) + ", song_list_version=" + ek1Var.m75942xfb822ef2(1));
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85400r8).mo141623x754a37bb()).r()).intValue();
        m6Var.f410779n.mo7808x76db6cb1(java.lang.Boolean.valueOf(intValue != 1 ? intValue != 2 ? ek1Var.m75933x41a8a7f2(0) : false : true));
        r45.z22 z22Var2 = (r45.z22) ek1Var.m75936x14adae67(2);
        if (z22Var2 != null && (by1Var = z22Var2.f473164h) != null && (ay1Var = by1Var.f452676d) != null) {
            str2 = ay1Var.f451884e;
        }
        m6Var.f410775g.mo7808x76db6cb1(str2 == null ? "" : str2);
        r45.z22 z22Var3 = (r45.z22) ek1Var.m75936x14adae67(2);
        if (z22Var3 != null) {
            m6Var.V6(z22Var3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Updated song cache: unique_add_id=" + z22Var3.f473162f + ", song_mid=" + z22Var3.f473160d + ", songName=" + str2);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20066, 20135};
    }
}
