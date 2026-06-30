package ah4;

/* loaded from: classes4.dex */
public class u extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f86549h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f86550i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b f86551j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f86552k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f86553l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f86554m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f86555n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f86556o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ah4.y f86557p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ah4.y yVar, long j17, java.lang.Integer num, java.lang.String[] strArr, int[] iArr, com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b interfaceC18546xdab69d9b, int i17, int i18, int i19, long j18, int i27) {
        super(j17, num);
        this.f86557p = yVar;
        this.f86549h = strArr;
        this.f86550i = iArr;
        this.f86551j = interfaceC18546xdab69d9b;
        this.f86552k = i17;
        this.f86553l = i18;
        this.f86554m = i19;
        this.f86555n = j18;
        this.f86556o = i27;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        java.lang.String[] strArr = this.f86549h;
        try {
            r45.c37 c37Var = new r45.c37();
            java.util.LinkedList linkedList = c37Var.f452791d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomEngineProxy", "Open Engine svr cnt %d", java.lang.Integer.valueOf(strArr.length));
            for (int i17 = 0; i17 < strArr.length; i17++) {
                r45.hk6 hk6Var = new r45.hk6();
                java.lang.String str = strArr[i17];
                hk6Var.f457782d = str;
                if (str == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomEngineProxy", "Open Engine ip_str null skip");
                } else {
                    hk6Var.f457783e = this.f86550i[i17];
                    linkedList.add(hk6Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomEngineProxy", "Open Engine svr:[%s][%d] ", hk6Var.f457782d, java.lang.Integer.valueOf(hk6Var.f457783e));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomEngineProxy", "Open Engine valid svr cnt %d", java.lang.Integer.valueOf(linkedList.size()));
            return java.lang.Integer.valueOf(this.f86557p.f86564e.m71571x259a6a(this.f86551j, this.f86552k, this.f86553l, this.f86554m, this.f86555n, this.f86556o, c37Var.mo14344x5f01b1f6(), c37Var.mo14344x5f01b1f6().length));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomEngineProxy", e17, "engine.Open exception", new java.lang.Object[0]);
            return -1;
        }
    }
}
