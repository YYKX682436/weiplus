package bt3;

/* loaded from: classes9.dex */
public class p1 extends bt3.k1 {

    /* renamed from: g, reason: collision with root package name */
    public final dn.k f24367g;

    public p1() {
        super(1, com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER);
        this.f24367g = new bt3.o1(this);
    }

    public final void c(zs3.y yVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgCDNService", "summersafecdn doJob, md5:%s, mediaId:%s, jobType[%d], jobStatus[%s]", yVar.field_dataId, yVar.field_mediaId, java.lang.Integer.valueOf(yVar.field_type), java.lang.Integer.valueOf(yVar.field_status));
        if (-1 == yVar.field_status) {
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_RecordMsgCDNService";
        dn.k kVar = this.f24367g;
        mVar.f241787f = kVar;
        mVar.field_mediaId = yVar.field_mediaId;
        if (2 == yVar.field_type) {
            mVar.f241786e = true;
            mVar.field_priority = 1;
            mVar.field_needStorage = false;
            mVar.field_totalLen = yVar.field_totalLen;
            mVar.field_aesKey = yVar.field_cdnKey;
            mVar.field_fileId = yVar.field_cdnUrl;
            mVar.f241787f = kVar;
            mVar.field_fullpath = yVar.field_path;
            mVar.field_fileType = yVar.field_fileType;
            mVar.field_talker = yVar.field_toUser;
            mVar.field_force_aeskeycdn = false;
            mVar.field_trysafecdn = true;
            mVar.field_enable_hitcheck = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn doJob TYPE_UPLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", false, java.lang.Integer.valueOf(mVar.field_fileType), mVar.field_aesKey, mVar.field_fileId, java.lang.Boolean.valueOf(mVar.field_force_aeskeycdn), java.lang.Boolean.valueOf(mVar.field_trysafecdn), java.lang.Boolean.valueOf(mVar.field_enable_hitcheck), mVar.field_mediaId);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
            return;
        }
        mVar.f241786e = false;
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_totalLen = yVar.field_totalLen;
        mVar.field_aesKey = yVar.field_cdnKey;
        mVar.field_fileId = yVar.field_cdnUrl;
        mVar.f241787f = kVar;
        mVar.field_fullpath = yVar.field_path + ".temp";
        mVar.field_fileType = yVar.field_fileType;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(yVar.field_tpdataurl)) {
            mVar.field_fileType = 19;
            mVar.field_authKey = yVar.field_tpauthkey;
            mVar.field_aesKey = yVar.field_tpaeskey;
            mVar.f241811z = yVar.field_tpdataurl;
            mVar.field_fileId = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn doJob TYPE_DOWNLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", java.lang.Boolean.valueOf(mVar.field_force_aeskeycdn), java.lang.Integer.valueOf(mVar.field_fileType), mVar.field_aesKey, mVar.field_fileId, java.lang.Boolean.valueOf(mVar.field_force_aeskeycdn), java.lang.Boolean.valueOf(mVar.field_trysafecdn), java.lang.Boolean.valueOf(mVar.field_enable_hitcheck), mVar.field_mediaId);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
    }
}
