package b92;

/* loaded from: classes3.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.m2 f18453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f18455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f18456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18457h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18458i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18459m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f18460n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(b92.m2 m2Var, int i17, long j17, android.os.Bundle bundle, int i18, int i19, java.lang.String str, int i27) {
        super(0);
        this.f18453d = m2Var;
        this.f18454e = i17;
        this.f18455f = j17;
        this.f18456g = bundle;
        this.f18457h = i18;
        this.f18458i = i19;
        this.f18459m = str;
        this.f18460n = i27;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.v52 v52Var = new r45.v52();
        v52Var.set(0, java.lang.Long.valueOf(this.f18455f));
        android.os.Bundle bundle = this.f18456g;
        v52Var.set(1, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_WIDTH)));
        v52Var.set(2, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_HEIGHT)));
        v52Var.set(3, java.lang.Integer.valueOf(this.f18457h));
        v52Var.set(4, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_GOP)));
        v52Var.set(5, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_BITRATE)));
        v52Var.set(6, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AUDIO_BITRATE)));
        v52Var.set(7, java.lang.Integer.valueOf(this.f18458i));
        v52Var.set(8, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_CACHE)));
        v52Var.set(9, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AUDIO_CACHE)));
        v52Var.set(10, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE)));
        v52Var.set(11, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL)));
        v52Var.set(12, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL)));
        v52Var.set(13, java.lang.Integer.valueOf((int) bundle.getFloat(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD)));
        v52Var.set(14, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_NET_JITTER)));
        v52Var.set(15, java.lang.Integer.valueOf(bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_QUALITY_LEVEL)));
        long j17 = bundle.getLong("NET_STATUS_START_TIME", 0L);
        v52Var.set(19, java.lang.Integer.valueOf((int) (j17 / 1000)));
        v52Var.set(16, java.lang.Integer.valueOf((int) (c01.id.c() - j17)));
        if (bundle.getString(com.tencent.rtmp.TXLiveConstants.NET_STATUS_CPU_USAGE) != null) {
            v52Var.set(26, java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) kz5.n0.X(r26.n0.f0(r3, new java.lang.String[]{"/"}, false, 0, 6, null)), 0)));
            v52Var.set(27, java.lang.Float.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) kz5.n0.i0(r26.n0.f0(r3, new java.lang.String[]{"/"}, false, 0, 6, null)), 0)));
        }
        java.lang.String string = bundle.getString(com.tencent.rtmp.TXLiveConstants.NET_STATUS_SERVER_IP);
        if (string == null) {
            string = "";
        }
        v52Var.set(24, string);
        v52Var.set(31, this.f18459m);
        v52Var.set(32, java.lang.Integer.valueOf(this.f18460n));
        b92.m2 m2Var = this.f18453d;
        int size = m2Var.f18490p.size();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = m2Var.f18490p;
        int i17 = this.f18454e;
        if (size > i17) {
            int i18 = size - i17;
            for (int i19 = 0; i19 < i18; i19++) {
                fp.l.a(copyOnWriteArrayList);
            }
        }
        copyOnWriteArrayList.add(v52Var);
        return jz5.f0.f302826a;
    }
}
