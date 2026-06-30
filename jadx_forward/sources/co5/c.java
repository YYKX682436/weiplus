package co5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final co5.c f125347a = new co5.c();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f125348b;

    /* renamed from: c, reason: collision with root package name */
    public static yz5.a f125349c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f125350d;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f125351f;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f125350d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe>(a0Var) { // from class: com.tencent.mm.voipmp.helper.DeviceOccupyHelper$mCheckDeviceLsn$1
            {
                this.f39173x3fe91575 = 1403859438;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe event = c6229x2bb765fe;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                boolean z17 = co5.c.f125348b;
                am.w00 w00Var = event.f136476g;
                w00Var.f89778a = z17;
                yz5.a aVar = co5.c.f125349c;
                w00Var.f89779b = aVar != null ? ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue() : false;
                w00Var.f89780c = true;
                w00Var.f89781d = co5.c.f125351f;
                return false;
            }
        };
        f125351f = "";
    }

    public final void a(boolean z17, java.lang.String talkerUsername, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUsername, "talkerUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPDeviceOccupyHelper", "alive() called with: videoMode = " + z17 + ", talkerUsername: " + talkerUsername);
        f125349c = aVar;
        f125351f = talkerUsername;
        f125348b = z17;
        f125350d.mo48813x58998cd();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        c6231x4f3054ba.f136478g.f89948b = 7;
        c6231x4f3054ba.e();
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPDeviceOccupyHelper", "dead: ");
        f125350d.mo48814x2efc64();
        f125349c = null;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        c6231x4f3054ba.f136478g.f89948b = 11;
        c6231x4f3054ba.e();
    }
}
