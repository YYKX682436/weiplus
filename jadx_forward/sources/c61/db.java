package c61;

/* loaded from: classes11.dex */
public final class db implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: g, reason: collision with root package name */
    public static final c61.bb f120476g = new c61.bb(null);

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f120477d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f120478e;

    /* renamed from: f, reason: collision with root package name */
    public long f120479f;

    public final void a(java.util.Map map, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterFoundationCrashPlugin", "reportStack: ");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\n#deviceParameters=" + map.get("deviceParameters"));
        sb6.append("\n#customParameters=" + map.get("customParameters"));
        sb6.append("\n#applicationParameters=" + map.get("applicationParameters"));
        sb6.append("\n#dateTime=" + map.get("dateTime"));
        sb6.append("\n#context=" + map.get("context"));
        sb6.append("\n#library=" + map.get("library"));
        sb6.append("\n" + a03.h.a());
        java.lang.String sb7 = sb6.toString();
        z65.d dVar = z65.c.f551990c;
        if (dVar != null) {
            dVar.a(sb7, str3, z17, str, str2);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(binding.m137983x3b5b91dc(), "com.tencent.mm.flutter.foundation_crash");
        this.f120477d = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(new c61.cb(this));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f120477d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }
}
