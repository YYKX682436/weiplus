package h00;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f359342b = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(h00.a.class, "orderEntranceInfo", "getOrderEntranceInfo()Lcom/tencent/wechat/aff/proto/EcsCardHolderEntranceInfo;", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(h00.a.class, "ecsConfigInfo", "getEcsConfigInfo()Lcom/tencent/wechat/aff/proto/EcsConfig;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final h00.a f359341a = new h00.a();

    /* renamed from: c, reason: collision with root package name */
    public static final b30.c f359343c = new b30.c(new bw5.c6(), "key_ecs_card_holder_entrance_info");

    /* renamed from: d, reason: collision with root package name */
    public static final b30.c f359344d = new b30.c(new bw5.i6(), "key_ecs_config_info");

    public final bw5.i6 a() {
        return (bw5.i6) f359344d.b(this, f359342b[1]);
    }

    public final void b(int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConfigRepository", "setInitCmdNextRequestTime initCmd:" + i17 + ", nextRequestTime:" + j17);
        jz5.g gVar = b30.p.f99107a;
        java.lang.Object mo141623x754a37bb = ((jz5.n) b30.p.f99107a).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.lang.String format = java.lang.String.format("key_ecs_init_cmd_next_request_time_%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).B(format, j17);
    }
}
