package co5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final co5.c f43814a = new co5.c();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f43815b;

    /* renamed from: c, reason: collision with root package name */
    public static yz5.a f43816c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f43817d;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f43818f;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f43817d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent>(a0Var) { // from class: com.tencent.mm.voipmp.helper.DeviceOccupyHelper$mCheckDeviceLsn$1
            {
                this.__eventId = 1403859438;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent) {
                com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent event = voipCheckIsDeviceUsingEvent;
                kotlin.jvm.internal.o.g(event, "event");
                boolean z17 = co5.c.f43815b;
                am.w00 w00Var = event.f54943g;
                w00Var.f8245a = z17;
                yz5.a aVar = co5.c.f43816c;
                w00Var.f8246b = aVar != null ? ((java.lang.Boolean) aVar.invoke()).booleanValue() : false;
                w00Var.f8247c = true;
                w00Var.f8248d = co5.c.f43818f;
                return false;
            }
        };
        f43818f = "";
    }

    public final void a(boolean z17, java.lang.String talkerUsername, yz5.a aVar) {
        kotlin.jvm.internal.o.g(talkerUsername, "talkerUsername");
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPDeviceOccupyHelper", "alive() called with: videoMode = " + z17 + ", talkerUsername: " + talkerUsername);
        f43816c = aVar;
        f43818f = talkerUsername;
        f43815b = z17;
        f43817d.alive();
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        voipEvent.f54945g.f8415b = 7;
        voipEvent.e();
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPDeviceOccupyHelper", "dead: ");
        f43817d.dead();
        f43816c = null;
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        voipEvent.f54945g.f8415b = 11;
        voipEvent.e();
    }
}
