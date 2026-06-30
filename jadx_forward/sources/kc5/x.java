package kc5;

@j95.b
/* loaded from: classes9.dex */
public final class x extends i95.w implements wg3.j {

    /* renamed from: d, reason: collision with root package name */
    public final r26.t f388121d = new r26.t("<extcommoninfo\\b[^>]*>[\\s\\S]*?</extcommoninfo>");

    /* renamed from: e, reason: collision with root package name */
    public final r26.t f388122e = new r26.t("\\s*<groupinfo\\b[^>]*>[\\s\\S]*?</groupinfo>\\s*");

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f388123f = new java.util.LinkedHashMap();

    public static final void wi(kc5.x xVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        xVar.getClass();
        java.lang.String a17 = ic5.f.f371970c.a(f9Var);
        c95.d dVar = c95.d.f121280a;
        up5.x a18 = dVar.a(a17);
        if (a18 == null) {
            a18 = new up5.x();
            a18.f511648a = a17;
            a18.f511650c = f9Var.m124847x74d37ac6();
            a18.f511651d = f9Var.T1();
            a18.f511652e = 0;
            a18.f511653f = 0;
        }
        if (a18.f511653f == 1) {
            a18.f511653f = 0;
            a18.f511650c = f9Var.m124847x74d37ac6();
            a18.f511651d = f9Var.T1();
            a18.f511652e = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaGroupService", "refresh hasShowTongue[" + a17 + "] - firstMsgId:" + f9Var.m124847x74d37ac6() + " - firstMsgCreateTime:" + f9Var.mo78012x3fdd41df());
        }
        a18.f511649b = f9Var.Q0();
        a18.f511652e++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaGroupService", "recordUnreadInfo[" + a17 + "] - talker:" + f9Var.Q0() + " - msgId:" + a18.f511650c + " - unreadCount:" + a18.f511652e + " - hasShowTongue:" + a18.f511653f);
        dVar.e(a18);
    }

    public void Ai(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (Di() && f9Var != null) {
            java.lang.String groupId = ic5.f.f371970c.a(f9Var);
            c95.d dVar = c95.d.f121280a;
            if (dVar.a(groupId) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
                try {
                    dVar.c().m107088x90df30e9(up5.j.f511530c.eq(groupId));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgGroupDBProvider", "[deleteMsgGroupExtInfo] groupId=" + groupId + ", error: " + e17.getMessage());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaGroupService", "clearUnreadGroupInfo[" + groupId + ']');
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long Bi(java.lang.String talker, r45.j4 cmdAM, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdAM, "cmdAM");
        l15.c cVar = new l15.c();
        boolean z17 = true;
        cVar.m126743xf78a7eb8(true);
        if (str == null) {
            str = "";
        }
        cVar.m126728xdc93280d(str);
        r15.b l17 = cVar.l();
        up5.y yVar = null;
        r15.d j17 = l17 != null ? l17.j() : null;
        java.lang.String groupId = j17 != null ? j17.m161293x5db1b11() : null;
        if (groupId != null && groupId.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return c01.w9.m(talker, cmdAM.f459098o);
        }
        c95.d dVar = c95.d.f121280a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        try {
            yVar = (up5.y) ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) c95.d.f121283d).mo141623x754a37bb()).m107127x946de4d9(up5.k.f511538c.eq(groupId));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgGroupDBProvider", "[getMsgGroupInfo] groupId=" + groupId + ", error: " + e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaGroupService", "fixRecvMediaGroupTime[" + groupId + ']');
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaGroupService", "fixRecvMediaGroupTime first time[" + groupId + ']');
            long m17 = c01.w9.m(talker, (long) cmdAM.f459098o);
            int m161292x7444f759 = j17.m161292x7444f759();
            java.util.HashMap hashMap = (java.util.HashMap) c01.w9.f119072b;
            if (hashMap.containsKey(talker)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "[reservedRecvMsgCreateTime] reserved recv msg create time, talker:%s, reservedCount:%s", talker, java.lang.Integer.valueOf(m161292x7444f759));
                hashMap.put(talker, java.lang.Long.valueOf(((java.lang.Long) hashMap.get(talker)).longValue() + m161292x7444f759));
            }
            return m17;
        }
        long j18 = yVar.f511656c;
        long j19 = 1 + j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaGroupService", "fixRecvMediaGroupTime[" + groupId + "] - talker:" + talker + " - lastTimeInGroup:" + j18 + " - thisTime:" + j19);
        return j19;
    }

    public boolean Di() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20097x45cad97d()) >= 1;
    }

    public boolean Ni() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20094x9a0e5860()) == 1;
    }

    public boolean Ri() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20097x45cad97d()) >= 2;
    }

    public void Ui(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, y15.d dVar) {
        r15.d j17;
        r15.d j18;
        if (!Di() || f9Var == null || dVar == null) {
            return;
        }
        r15.b j19 = dVar.j();
        java.lang.String str = null;
        java.lang.String m161293x5db1b11 = (j19 == null || (j18 = j19.j()) == null) ? null : j18.m161293x5db1b11();
        if (m161293x5db1b11 == null || r26.n0.N(m161293x5db1b11)) {
            return;
        }
        r15.b j27 = dVar.j();
        if (j27 != null && (j17 = j27.j()) != null) {
            str = j17.m161293x5db1b11();
        }
        Vi(f9Var, str);
        ((ku5.t0) ku5.t0.f394148d).h(new kc5.v(this, f9Var), "MicroMsg.MediaGroupService");
    }

    public final void Vi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        up5.y yVar = new up5.y();
        yVar.f511654a = str;
        yVar.f511655b = f9Var.Q0();
        yVar.f511656c = f9Var.mo78012x3fdd41df();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaGroupService", "recordMediaGroupInfo[" + str + "] - createTime:" + f9Var.mo78012x3fdd41df());
        c95.d.f121280a.f(yVar);
    }

    public java.lang.String Zi(java.lang.String str) {
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20093x7bd4ef92()) == 1)) {
            return str;
        }
        if (str != null) {
            return this.f388121d.f(str, new kc5.w(this));
        }
        return null;
    }
}
