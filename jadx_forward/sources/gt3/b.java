package gt3;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final gt3.b f356916a = new gt3.b();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        boolean contains = kz5.c0.i(1, 2, 4).contains(java.lang.Integer.valueOf(configProvider.F));
        st3.t tVar = st3.t.f494130a;
        if (contains) {
            if (configProvider.f237209n == null) {
                configProvider.f237209n = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(configProvider.F, 0).f230352f;
            }
            boolean z17 = configProvider.M.getBoolean("key_record_keep_ratio", false);
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = configProvider.f237209n;
            if (c11120x15dce88d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordConfig", "initLogic init SightRecordConfig ");
                if (z17) {
                    tVar.c(c11120x15dce88d, configProvider.F, false);
                } else {
                    int i17 = configProvider.F;
                    if (i17 == 2) {
                        tVar.c(c11120x15dce88d, configProvider.F, !t94.a.f498116a.a());
                    } else {
                        tVar.c(c11120x15dce88d, i17, true);
                    }
                }
            }
        }
        java.lang.Boolean valueOf = st3.t.f494134e ? java.lang.Boolean.valueOf(tVar.b()) : configProvider.f237203e;
        qr0.a aVar = qr0.a.f447588a;
        boolean z18 = !valueOf.booleanValue();
        qr0.a.f447589b = z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitConfig", "setTexturePreview:" + z18);
        configProvider.f237212q = 3;
    }
}
