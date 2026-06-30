package bk4;

/* loaded from: classes11.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f21483a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f21484b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f21485c;

    static {
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        f21483a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_icon_resource_switch_and, bm5.h0.RepairerConfig_TextStatus_UseOldIconStrategy_Int, 0) == 1;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f21484b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.util.IStatusIconHelperKt$checkResUpdateCacheFileEventIListener$1
            {
                this.__eventId = 905296653;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = checkResUpdateCacheFileEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.r2 r2Var = event.f54053g;
                if (r2Var.f7759a != 86 || r2Var.f7760b != 2) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "checkResUpdateCacheFileEvent " + r2Var.f7761c);
                pm0.v.O("TextStatusThread", new bk4.g(event));
                return false;
            }
        };
        f21485c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.util.IStatusIconHelperKt$localCheckResUpdateCacheFileEventIListener$1
            {
                this.__eventId = 1381597624;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent) {
                com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent event = localCheckResUpdateCacheFileEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.dj djVar = event.f54480g;
                if (djVar.f6471a != 86 || djVar.f6472b != 2) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", "localCheckResUpdateCacheFileEvent " + djVar.f6473c);
                pm0.v.O("TextStatusThread", new bk4.h(event));
                return false;
            }
        };
    }

    public static final bk4.f a() {
        return f21483a ? bk4.y.f21618a : bk4.f0.f21465a;
    }
}
