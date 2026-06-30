package h63;

/* loaded from: classes14.dex */
public final class d1 implements os5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h63.g1 f360757a;

    public d1(h63.g1 g1Var) {
        this.f360757a = g1Var;
    }

    public void a(java.util.List list, r45.mf4 mf4Var) {
        r45.v12 v12Var;
        r45.v12 v12Var2;
        r45.v12 v12Var3;
        r45.v12 v12Var4;
        r45.v12 v12Var5;
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        if (p60.u.f433732g.getBoolean("disableLiveInfo", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "receive onLiveInfoChanged,but is disableLiveInfo");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16052x32172abb c16052x32172abb = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16052x32172abb(0L, 0L, 0L, 0L, 0L, null);
        if (mf4Var != null) {
            c16052x32172abb.f223548d = mf4Var.m75942xfb822ef2(3);
            c16052x32172abb.f223549e = mf4Var.m75942xfb822ef2(4);
            c16052x32172abb.f223550f = mf4Var.m75942xfb822ef2(1);
            c16052x32172abb.f223551g = mf4Var.m75942xfb822ef2(0);
            c16052x32172abb.f223552h = mf4Var.m75942xfb822ef2(5);
        }
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.nf4 nf4Var = (r45.nf4) it.next();
                nf4Var.m75939xb282bd08(0);
                nf4Var.m75945x2fec8307(2);
                nf4Var.m75945x2fec8307(17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16059xbced5ba8 c16059xbced5ba8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16059xbced5ba8(0, null, null, null, 0, 0L, 0, 0, null, null, null, 0, 0, null, null, null, null, null, null, 0, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                c16059xbced5ba8.f223573d = java.lang.Integer.valueOf(nf4Var.m75939xb282bd08(0));
                c16059xbced5ba8.f223574e = nf4Var.m75945x2fec8307(1);
                c16059xbced5ba8.f223575f = nf4Var.m75945x2fec8307(9);
                c16059xbced5ba8.f223576g = nf4Var.m75945x2fec8307(2);
                c16059xbced5ba8.H = nf4Var.m75945x2fec8307(17);
                c16059xbced5ba8.f223577h = java.lang.Integer.valueOf(nf4Var.m75939xb282bd08(3));
                c16059xbced5ba8.f223578i = java.lang.Long.valueOf(nf4Var.m75942xfb822ef2(4));
                c16059xbced5ba8.f223579m = java.lang.Integer.valueOf(nf4Var.m75939xb282bd08(15));
                c16059xbced5ba8.f223580n = java.lang.Integer.valueOf(nf4Var.m75939xb282bd08(8));
                c16059xbced5ba8.f223581o = nf4Var.m75945x2fec8307(10);
                c16059xbced5ba8.f223582p = nf4Var.m75945x2fec8307(12);
                c16059xbced5ba8.f223584q = nf4Var.m75945x2fec8307(13);
                r45.u12 u12Var = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.f223586s = u12Var != null ? java.lang.Integer.valueOf(u12Var.f468460d) : null;
                r45.u12 u12Var2 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.f223587t = u12Var2 != null ? u12Var2.f468461e : null;
                r45.u12 u12Var3 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.f223588u = u12Var3 != null ? u12Var3.f468462f : null;
                r45.u12 u12Var4 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.f223591x = u12Var4 != null ? u12Var4.f468464h : null;
                r45.u12 u12Var5 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.f223593y = u12Var5 != null ? u12Var5.f468465i : null;
                r45.u12 u12Var6 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.f223595z = u12Var6 != null ? java.lang.Integer.valueOf(u12Var6.f468466m) : null;
                r45.u12 u12Var7 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.A = u12Var7 != null ? java.lang.Integer.valueOf(u12Var7.f468467n) : null;
                r45.u12 u12Var8 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.B = u12Var8 != null ? u12Var8.f468468o : null;
                r45.u12 u12Var9 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.f223589v = u12Var9 != null ? u12Var9.f468463g : null;
                r45.u12 u12Var10 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.f223590w = u12Var10 != null ? u12Var10.f468472s : null;
                r45.u12 u12Var11 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.C = (u12Var11 == null || (v12Var5 = u12Var11.f468469p) == null) ? null : v12Var5.f469330d;
                r45.u12 u12Var12 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.D = (u12Var12 == null || (v12Var4 = u12Var12.f468469p) == null) ? null : java.lang.Integer.valueOf(v12Var4.f469331e);
                r45.u12 u12Var13 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.E = (u12Var13 == null || (v12Var3 = u12Var13.f468469p) == null) ? null : v12Var3.f469332f;
                r45.u12 u12Var14 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.F = (u12Var14 == null || (v12Var2 = u12Var14.f468469p) == null) ? null : v12Var2.f469333g;
                r45.u12 u12Var15 = (r45.u12) nf4Var.m75936x14adae67(16);
                c16059xbced5ba8.G = (u12Var15 == null || (v12Var = u12Var15.f468469p) == null) ? null : v12Var.f469334h;
                r45.iy1 iy1Var = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.I = iy1Var != null ? java.lang.Integer.valueOf(iy1Var.m75939xb282bd08(0)) : null;
                r45.iy1 iy1Var2 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.f223572J = iy1Var2 != null ? iy1Var2.m75945x2fec8307(1) : null;
                r45.iy1 iy1Var3 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.K = iy1Var3 != null ? iy1Var3.m75945x2fec8307(2) : null;
                r45.iy1 iy1Var4 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.L = iy1Var4 != null ? java.lang.Integer.valueOf(iy1Var4.m75939xb282bd08(3)) : null;
                r45.iy1 iy1Var5 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.M = iy1Var5 != null ? iy1Var5.m75945x2fec8307(4) : null;
                r45.iy1 iy1Var6 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.N = iy1Var6 != null ? iy1Var6.m75945x2fec8307(5) : null;
                r45.iy1 iy1Var7 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.P = iy1Var7 != null ? iy1Var7.m75945x2fec8307(6) : null;
                r45.iy1 iy1Var8 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.Q = iy1Var8 != null ? java.lang.Integer.valueOf(iy1Var8.m75939xb282bd08(7)) : null;
                r45.iy1 iy1Var9 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.R = iy1Var9 != null ? iy1Var9.m75945x2fec8307(8) : null;
                r45.iy1 iy1Var10 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.S = iy1Var10 != null ? java.lang.Integer.valueOf(iy1Var10.m75939xb282bd08(9)) : null;
                r45.iy1 iy1Var11 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.T = iy1Var11 != null ? iy1Var11.m75945x2fec8307(10) : null;
                r45.iy1 iy1Var12 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.U = iy1Var12 != null ? java.lang.Integer.valueOf(iy1Var12.m75939xb282bd08(11)) : null;
                r45.iy1 iy1Var13 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.V = iy1Var13 != null ? java.lang.Integer.valueOf(iy1Var13.m75939xb282bd08(12)) : null;
                r45.iy1 iy1Var14 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.W = iy1Var14 != null ? java.lang.Integer.valueOf(iy1Var14.m75939xb282bd08(13)) : null;
                r45.iy1 iy1Var15 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.f223583p0 = iy1Var15 != null ? iy1Var15.m75945x2fec8307(14) : null;
                r45.iy1 iy1Var16 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.f223592x0 = iy1Var16 != null ? iy1Var16.m75941xfb821914(15) : null;
                r45.iy1 iy1Var17 = (r45.iy1) nf4Var.m75936x14adae67(18);
                c16059xbced5ba8.f223594y0 = iy1Var17 != null ? iy1Var17.m75945x2fec8307(17) : null;
                if (nf4Var.m75939xb282bd08(15) != 0) {
                    c16059xbced5ba8.f223585r = nf4Var.m75939xb282bd08(11) / nf4Var.m75939xb282bd08(15);
                } else {
                    c16059xbced5ba8.f223585r = nf4Var.m75939xb282bd08(11);
                }
                arrayList.add(c16059xbced5ba8);
            }
            c16052x32172abb.f223553i = arrayList;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "decide to send IPC msg");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.F, null, 0, c16052x32172abb, 6, null), p60.q.class, null);
    }

    public void b(int i17) {
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        if (p60.u.f433732g.getBoolean("disableMicInfo", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "receive LiveVoiceVolume msg, but disableMicInfo");
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.G, null, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16062x6aff2a90(kz5.b1.e(new jz5.l("micVolume", java.lang.Integer.valueOf(i17)))), 6, null), p60.q.class, null);
        }
    }

    public void c(boolean z17, java.lang.String str, java.lang.Integer num) {
        java.lang.String str2 = "zbql:onMiniWindowStatusChange,isShown:" + z17 + ",isGameLiving:%b,appid:" + str + ",versionType:" + num + ",state:%s";
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = ((p60.u) i95.n0.c(p60.u.class)).Bi(str == null ? "" : str, num != null ? num.intValue() : 0);
        objArr[1] = ((p60.u) i95.n0.c(p60.u.class)).Ai().h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", str2, objArr);
        if (z17) {
            p60.u uVar = (p60.u) i95.n0.c(p60.u.class);
            if (str == null) {
                str = "";
            }
            if (uVar.Bi(str, num != null ? num.intValue() : 0).booleanValue() && ((p60.u) i95.n0.c(p60.u.class)).Ai() == p60.j.f433696h) {
                this.f360757a.getClass();
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
                dk2.ef efVar = dk2.ef.f314905a;
                pm0.v.X(new dk2.ld(false, context));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "hide MinimizeGameLive");
            }
        }
    }

    public void d(boolean z17, int i17) {
        h63.g1 g1Var = this.f360757a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:receive startLive success callback from finder");
            g1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "enableAudio");
            g1Var.f360767d = false;
            g1Var.Ai(true);
            g1Var.Bi();
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.D, null, 0, null, 14, null), p60.q.class, null);
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:invalid errType");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveMainProcessService", "zbql:PostErrType.ENTER_ROOM_FAIL");
            ((p60.u) i95.n0.c(p60.u.class)).Ni();
            g1Var.Vi();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:PostErrType.USER_CANCEL");
        p60.l lVar = p60.l.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u[] uVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u.f167525d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t[] tVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t.f167522d;
        g1Var.Ri(lVar, 3, 0);
        ((p60.u) i95.n0.c(p60.u.class)).Ni();
        g1Var.Vi();
    }

    public void e(boolean z17, int i17, int i18) {
        if (z17) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.E, null, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16062x6aff2a90(kz5.c1.k(new jz5.l("shareUserCount", java.lang.Integer.valueOf(i17)), new jz5.l("shareRoomCount", java.lang.Integer.valueOf(i18)))), 6, null), p60.q.class, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "ShareLiveToConversation failed");
        }
    }
}
