package iy4;

/* loaded from: classes11.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f377482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f377483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f377484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f377485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ iy4.g f377486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f377487i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f377488m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, java.lang.String str, long j18, long j19, iy4.g gVar, long j27, int i17) {
        super(0);
        this.f377482d = j17;
        this.f377483e = str;
        this.f377484f = j18;
        this.f377485g = j19;
        this.f377486h = gVar;
        this.f377487i = j27;
        this.f377488m = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getChatPackageAsync taskId = ");
        sb6.append(this.f377482d);
        sb6.append(", conversationId = ");
        java.lang.String str = this.f377483e;
        sb6.append(str);
        sb6.append(", fromTime = ");
        sb6.append(this.f377484f);
        sb6.append(", toTime = ");
        sb6.append(this.f377485g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AffExtDeviceNativeUtilImpl", sb6.toString());
        long j17 = this.f377484f;
        long j18 = this.f377485g;
        iy4.g gVar = this.f377486h;
        if (j17 > j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AffExtDeviceNativeUtilImpl", "getChatPackageAsync fromTime > toTime, skip DB query, return");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.e eVar = gVar.f377496b;
            if (eVar != null) {
                eVar.a(this.f377482d, true, 0L, new bw5.w0());
            }
        } else {
            jz5.o a17 = co1.g.f125301a.a(this.f377483e, Long.MIN_VALUE, j17, j18, this.f377487i, this.f377488m, gVar.f377497c);
            bw5.w0 w0Var = (bw5.w0) a17.f384374d;
            boolean booleanValue = ((java.lang.Boolean) a17.f384375e).booleanValue();
            long longValue = ((java.lang.Number) a17.f384376f).longValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AffExtDeviceNativeUtilImpl", "onGetChatPackageComplete return, conversationId = " + str + ", isLast = " + booleanValue + ", realOffset = " + longValue);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.e eVar2 = gVar.f377496b;
            if (eVar2 != null) {
                eVar2.a(this.f377482d, booleanValue, longValue, w0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
