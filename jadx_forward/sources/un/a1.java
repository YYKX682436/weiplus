package un;

/* loaded from: classes11.dex */
public final class a1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f510768d;

    public a1(un.g1 g1Var) {
        this.f510768d = g1Var;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            return 0;
        }
        un.g1 g1Var = this.f510768d;
        if (hVar == null || hVar.f69553xb5f54fe9 != 0) {
            if (hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectWxChatRoomAddMemberUIC", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                g1Var.W6(hVar.f69553xb5f54fe9, "cdn ret error", "");
                return 0;
            }
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "on process, cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectWxChatRoomAddMemberUIC", "start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            g1Var.W6(0, "cdn start error", "");
            return 0;
        }
        un.t0 t0Var = (un.t0) g1Var.f510804v.get(str);
        if (t0Var == null || !t0Var.f510861b) {
            g1Var.f510797o = hVar;
            g1Var.f510794i = false;
        } else {
            g1Var.f510801s = hVar;
            g1Var.f510798p = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] result:%s", str, java.lang.Integer.valueOf(i17), gVar, hVar, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.h(t0Var.f510860a)));
        g1Var.X6();
        a14.a a17 = a14.a.a();
        long a18 = c01.id.a();
        long j17 = a17.f82120f;
        if (a18 > j17) {
            a17.f82115a.f141905s = a18 - j17;
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}
