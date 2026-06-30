package o45;

/* loaded from: classes12.dex */
public class pg extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.sr6 f424528a = new r45.sr6();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.xb xbVar;
        try {
            r45.sr6 sr6Var = (r45.sr6) this.f424528a.mo11468x92b714fd(bArr);
            this.f424528a = sr6Var;
            o45.bh.b(this, sr6Var.mo11484xe92ab0a8());
            if (this.f424528a.mo11484xe92ab0a8().f458492d == 0 && ((xbVar = this.f424528a.f467485e) == null || xbVar.f471454d == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(x51.j1.d(xbVar.f471456f)))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAuth", "retcode 0 but invalid auth sect resp or invalid uin or invalid session");
                this.f424528a.mo11484xe92ab0a8().f458492d = -1;
            }
            java.lang.String m150572x17ec12d2 = m150572x17ec12d2();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAuth", "summerauthkick auto errmsg[%s]", m150572x17ec12d2);
            gm0.m.f354768x = m150572x17ec12d2;
            return this.f424528a.mo11484xe92ab0a8().f458492d;
        } catch (java.io.IOException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAuth", "toProtoBuf :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            this.f424528a.mo11484xe92ab0a8().f458492d = -1;
            return -1;
        }
    }
}
