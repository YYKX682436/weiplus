package mq4;

/* loaded from: classes14.dex */
public class w extends mq4.e0 {
    public w(long j17, long j18, int i17, java.lang.String str, java.lang.String str2, double d17, double d18, int i18, int i19, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.o37();
        lVar.f152198b = new r45.p37();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipspeedresult";
        lVar.f152200d = 901;
        lVar.f152201e = 901;
        lVar.f152202f = 1000000901;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        r45.o37 o37Var = (r45.o37) a17.f152243a.f152217a;
        o37Var.f463418d = j17;
        o37Var.f463419e = j18;
        o37Var.f463420f = i17;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str;
        du5Var.f454290e = true;
        o37Var.f463421g = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = str2;
        du5Var2.f454290e = true;
        o37Var.f463422h = du5Var2;
        o37Var.f463423i = d17;
        o37Var.f463424m = d18;
        o37Var.f463425n = i18;
        o37Var.f463426o = i19;
        try {
            r45.a37 a37Var = (r45.a37) new r45.a37().mo11468x92b714fd(bArr);
            for (int i27 = 0; i27 < a37Var.f451241d.size(); i27++) {
                r45.vc6 vc6Var = new r45.vc6();
                java.util.LinkedList linkedList = a37Var.f451241d;
                vc6Var.f469632d = ((r45.z27) linkedList.get(i27)).f473172e;
                vc6Var.f469633e = ((r45.z27) linkedList.get(i27)).f473173f;
                vc6Var.f469634f = ((r45.z27) linkedList.get(i27)).f473174g;
                r45.b27 b27Var = new r45.b27();
                vc6Var.f469635g = b27Var;
                b27Var.f452018d = ((r45.z27) linkedList.get(i27)).f473175h;
                vc6Var.f469635g.f452019e = ((r45.z27) linkedList.get(i27)).f473176i;
                vc6Var.f469635g.f452020f = ((r45.z27) linkedList.get(i27)).f473186v;
                vc6Var.f469636h = ((r45.z27) linkedList.get(i27)).f473177m;
                vc6Var.f469637i = ((r45.z27) linkedList.get(i27)).f473178n;
                vc6Var.f469638m = ((r45.z27) linkedList.get(i27)).f473179o;
                vc6Var.f469639n = ((r45.z27) linkedList.get(i27)).f473181q.size();
                for (int i28 = 0; i28 < vc6Var.f469639n; i28++) {
                    vc6Var.f469640o.add((java.lang.Integer) ((r45.z27) linkedList.get(i27)).f473181q.get(i28));
                }
                vc6Var.f469641p = ((r45.z27) linkedList.get(i27)).f473182r;
                for (int i29 = 0; i29 < vc6Var.f469641p; i29++) {
                    vc6Var.f469642q.add((java.lang.Integer) ((r45.z27) linkedList.get(i27)).f473183s.get(i29));
                }
                vc6Var.f469643r = ((r45.z27) linkedList.get(i27)).f473184t;
                for (int i37 = 0; i37 < vc6Var.f469643r; i37++) {
                    vc6Var.f469644s.add((java.lang.Integer) ((r45.z27) linkedList.get(i27)).f473185u.get(i37));
                }
                vc6Var.f469645t = ((r45.z27) linkedList.get(i27)).f473187w;
                o37Var.f463427p.add(vc6Var);
                vq4.d0.c("MicroMsg.NetSceneVoipSpeedResult", "VoipContext NetSceneVoipSpeedResult testid:" + j17 + " roomkey=" + j18 + " ipstr=" + vc6Var.f469635g.f452020f + " client ipstr=" + vc6Var.f469645t);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneVoipSpeedResult", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.v(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 901;
    }
}
