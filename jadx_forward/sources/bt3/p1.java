package bt3;

/* loaded from: classes9.dex */
public class p1 extends bt3.k1 {

    /* renamed from: g, reason: collision with root package name */
    public final dn.k f105900g;

    public p1() {
        super(1, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c);
        this.f105900g = new bt3.o1(this);
    }

    public final void c(zs3.y yVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgCDNService", "summersafecdn doJob, md5:%s, mediaId:%s, jobType[%d], jobStatus[%s]", yVar.f68319xf604e54a, yVar.f68324xaca5bdda, java.lang.Integer.valueOf(yVar.f68334x2262335f), java.lang.Integer.valueOf(yVar.f68328x10a0fed7));
        if (-1 == yVar.f68328x10a0fed7) {
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_RecordMsgCDNService";
        dn.k kVar = this.f105900g;
        mVar.f323320f = kVar;
        mVar.f69601xaca5bdda = yVar.f68324xaca5bdda;
        if (2 == yVar.f68334x2262335f) {
            mVar.f323319e = true;
            mVar.f69609xd84b8349 = 1;
            mVar.f69606xccdbf540 = false;
            mVar.f69620xeb1a61d6 = yVar.f68330xeb1a61d6;
            mVar.f69575xf11df5f5 = yVar.f68317xf47749d7;
            mVar.f69591xf9dbbe9c = yVar.f68318xf47770e7;
            mVar.f323320f = kVar;
            mVar.f69595x6d25b0d9 = yVar.f68326x2260084a;
            mVar.f69592xf1ebe47b = yVar.f68321xf1ebe47b;
            mVar.f69618x114ef53e = yVar.f68329x1209e7cb;
            mVar.f69594x4b409164 = false;
            mVar.f69621xf91593ca = true;
            mVar.f69587xa6fe74c = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn doJob TYPE_UPLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", false, java.lang.Integer.valueOf(mVar.f69592xf1ebe47b), mVar.f69575xf11df5f5, mVar.f69591xf9dbbe9c, java.lang.Boolean.valueOf(mVar.f69594x4b409164), java.lang.Boolean.valueOf(mVar.f69621xf91593ca), java.lang.Boolean.valueOf(mVar.f69587xa6fe74c), mVar.f69601xaca5bdda);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
            return;
        }
        mVar.f323319e = false;
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69620xeb1a61d6 = yVar.f68330xeb1a61d6;
        mVar.f69575xf11df5f5 = yVar.f68317xf47749d7;
        mVar.f69591xf9dbbe9c = yVar.f68318xf47770e7;
        mVar.f323320f = kVar;
        mVar.f69595x6d25b0d9 = yVar.f68326x2260084a + ".temp";
        mVar.f69592xf1ebe47b = yVar.f68321xf1ebe47b;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yVar.f68333x9229d684)) {
            mVar.f69592xf1ebe47b = 19;
            mVar.f69582x4e093552 = yVar.f68332x159b18b6;
            mVar.f69575xf11df5f5 = yVar.f68331xffd08a51;
            mVar.f323344z = yVar.f68333x9229d684;
            mVar.f69591xf9dbbe9c = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn doJob TYPE_DOWNLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", java.lang.Boolean.valueOf(mVar.f69594x4b409164), java.lang.Integer.valueOf(mVar.f69592xf1ebe47b), mVar.f69575xf11df5f5, mVar.f69591xf9dbbe9c, java.lang.Boolean.valueOf(mVar.f69594x4b409164), java.lang.Boolean.valueOf(mVar.f69621xf91593ca), java.lang.Boolean.valueOf(mVar.f69587xa6fe74c), mVar.f69601xaca5bdda);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
    }
}
