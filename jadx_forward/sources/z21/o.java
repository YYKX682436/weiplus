package z21;

/* loaded from: classes14.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.q f551191d;

    public o(z21.q qVar) {
        this.f551191d = qVar;
    }

    public void a() {
        int i17;
        z21.q qVar = this.f551191d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceAddr", "initDeviceInLock");
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(z21.q.a(qVar));
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                m17.f294799a.d(m17.f294800b);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceAddr", "delete file failed, " + z21.q.a(qVar), e17);
        }
        tl.w wVar = new tl.w(qVar.f551200i ? 8000 : 16000, 1, 3);
        qVar.f551202n = wVar;
        wVar.f501693m = -19;
        wVar.i(false);
        if (!qVar.f551200i) {
            yl.h hVar = new yl.h();
            qVar.f551203o = hVar;
            if (!hVar.b(!qVar.f551200i ? z21.q.f551192t : z21.q.f551193u)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceAddr", "init speex writer failed");
                ((yl.h) qVar.f551203o).d();
                qVar.f551203o = null;
            }
        }
        if (qVar.f551200i || (i17 = wo.v1.f529366m.f529284i) <= 0) {
            qVar.f551202n.h(5, false);
        } else {
            qVar.f551202n.h(i17, true);
        }
        qVar.f551202n.j(false);
        int i18 = qVar.f551199h;
        com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.c cVar = new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.c(i18, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1998x3d67feb.f6000xf7b4e5a6);
        qVar.f551204p = cVar;
        com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.C25467xe1898bb2 c25467xe1898bb2 = cVar.f296796a;
        int m94439x39c7a91c = c25467xe1898bb2.m94439x39c7a91c(i18, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1998x3d67feb.f6000xf7b4e5a6);
        if (m94439x39c7a91c == 0 && (m94439x39c7a91c = c25467xe1898bb2.m94440x39ca6a56()) == 0 && (m94439x39c7a91c = c25467xe1898bb2.m94433xa04c5cfa(true)) == 0) {
            m94439x39c7a91c = c25467xe1898bb2.m94444xffbd01d6();
        }
        int i19 = m94439x39c7a91c != 0 ? -1 : 0;
        if (i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceAddr", "init VoiceDetectAPI failed :" + i19);
            qVar.c();
            return;
        }
        tl.w wVar2 = qVar.f551202n;
        wVar2.f501705y = qVar.f551206r;
        if (wVar2.k()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceAddr", "start record failed");
        qVar.c();
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f551191d) {
            a();
        }
    }
}
