package b03;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static kotlinx.coroutines.r2 f16865b;

    /* renamed from: a, reason: collision with root package name */
    public static final b03.u f16864a = new b03.u();

    /* renamed from: c, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f16866c = kotlinx.coroutines.z0.i(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), kotlinx.coroutines.t3.a(null, 1, null));

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FlutterIsInitializedEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FlutterIsInitializedEvent>(a0Var) { // from class: com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$checkWarmupListener$1
            {
                this.__eventId = -1350645124;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FlutterIsInitializedEvent flutterIsInitializedEvent) {
                com.tencent.mm.autogen.events.FlutterIsInitializedEvent event = flutterIsInitializedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                kotlinx.coroutines.r2 r2Var = b03.u.f16865b;
                if (r2Var != null) {
                    ((kotlinx.coroutines.c3) r2Var).A();
                }
                event.f54343g.getClass();
                return false;
            }
        };
        io.flutter.Log.setLogLevel(io.flutter.Log.VERBOSE);
        io.flutter.Log.setLogDelegate(new b03.c0());
        iListener.alive();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:1|(2:3|(27:5|6|(1:(1:9)(2:53|54))(26:55|(3:57|(1:59)(1:67)|(2:61|(2:63|(1:65)(1:66))))|68|11|(1:13)(1:52)|14|(1:16)(1:51)|17|(1:19)(1:50)|20|(1:22)|23|(1:25)|26|27|28|29|30|31|32|(1:33)|36|(1:38)|(1:40)(1:44)|41|42)|10|11|(0)(0)|14|(0)(0)|17|(0)(0)|20|(0)|23|(0)|26|27|28|29|30|31|32|(1:33)|36|(0)|(0)(0)|41|42))|69|6|(0)(0)|10|11|(0)(0)|14|(0)(0)|17|(0)(0)|20|(0)|23|(0)|26|27|28|29|30|31|32|(1:33)|36|(0)|(0)(0)|41|42) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0234, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, yz5.p r31, kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.u.a(java.lang.String, java.lang.String, java.lang.String, boolean, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final synchronized kotlinx.coroutines.r2 b() {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.CachedFlutterEngines", "warmUpEngine, warmUpJob:" + f16865b);
        if (f16865b == null) {
            f16865b = kotlinx.coroutines.l.d(f16866c, null, null, new b03.t(null), 3, null);
        }
        r2Var = f16865b;
        kotlin.jvm.internal.o.d(r2Var);
        return r2Var;
    }
}
