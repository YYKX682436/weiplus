package nd2;

/* loaded from: classes10.dex */
public final class q extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 {

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f417999a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f418000b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f418001c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f418002d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8 f418003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, android.content.Context context) {
        super(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
        this.f417999a = binaryMessenger;
        this.f418000b = context;
        this.f418001c = new java.util.concurrent.ConcurrentHashMap();
        this.f418002d = new java.util.concurrent.ConcurrentHashMap();
        this.f418003e = new nd2.p(this);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12
    /* renamed from: create */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc(android.content.Context context, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "create viewId=" + i17 + " args=" + obj);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f418001c;
        long j17 = (long) i17;
        nd2.o oVar = (nd2.o) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            return oVar;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.C24300x7090825d c24300x7090825d = new com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.C24300x7090825d(this.f417999a, java.lang.String.valueOf(i17));
        this.f418002d.put(java.lang.Long.valueOf(j17), c24300x7090825d);
        if (context == null && (context = this.f418000b) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context context2 = context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        nd2.o oVar2 = new nd2.o(context2, j17, obj, c24300x7090825d);
        concurrentHashMap.put(java.lang.Long.valueOf(j17), oVar2);
        return oVar2;
    }
}
