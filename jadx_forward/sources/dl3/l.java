package dl3;

/* loaded from: classes13.dex */
public class l implements dl3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl3.i f316869a;

    public l(dl3.i iVar) {
        this.f316869a = iVar;
    }

    public void a(java.lang.String str) {
        dl3.i iVar;
        dl3.d0 o17 = this.f316869a.o(str);
        if (o17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onStart player is null");
            return;
        }
        this.f316869a.v(str, o17);
        synchronized (this.f316869a.f316856p) {
            iVar = this.f316869a;
            iVar.f316857q = false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(iVar.P);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
        am.g0 g0Var = c5175x3ee93aa3.f135523g;
        g0Var.f88249a = 11;
        g0Var.f88252d = "real_play";
        g0Var.f88251c = str;
        g0Var.f88253e = this.f316869a.m(str);
        c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
    }
}
