package ah4;

/* loaded from: classes4.dex */
public class u extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f5016h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f5017i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL f5018j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5019k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5020l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f5022n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5023o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ah4.y f5024p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ah4.y yVar, long j17, java.lang.Integer num, java.lang.String[] strArr, int[] iArr, com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL iLiveConEngineCallback_AIDL, int i17, int i18, int i19, long j18, int i27) {
        super(j17, num);
        this.f5024p = yVar;
        this.f5016h = strArr;
        this.f5017i = iArr;
        this.f5018j = iLiveConEngineCallback_AIDL;
        this.f5019k = i17;
        this.f5020l = i18;
        this.f5021m = i19;
        this.f5022n = j18;
        this.f5023o = i27;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        java.lang.String[] strArr = this.f5016h;
        try {
            r45.c37 c37Var = new r45.c37();
            java.util.LinkedList linkedList = c37Var.f371258d;
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomEngineProxy", "Open Engine svr cnt %d", java.lang.Integer.valueOf(strArr.length));
            for (int i17 = 0; i17 < strArr.length; i17++) {
                r45.hk6 hk6Var = new r45.hk6();
                java.lang.String str = strArr[i17];
                hk6Var.f376249d = str;
                if (str == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomEngineProxy", "Open Engine ip_str null skip");
                } else {
                    hk6Var.f376250e = this.f5017i[i17];
                    linkedList.add(hk6Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomEngineProxy", "Open Engine svr:[%s][%d] ", hk6Var.f376249d, java.lang.Integer.valueOf(hk6Var.f376250e));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomEngineProxy", "Open Engine valid svr cnt %d", java.lang.Integer.valueOf(linkedList.size()));
            return java.lang.Integer.valueOf(this.f5024p.f5031e.Open(this.f5018j, this.f5019k, this.f5020l, this.f5021m, this.f5022n, this.f5023o, c37Var.toByteArray(), c37Var.toByteArray().length));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomEngineProxy", e17, "engine.Open exception", new java.lang.Object[0]);
            return -1;
        }
    }
}
