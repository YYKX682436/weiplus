package ny4;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f422996a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f422997b = "";

    public final float[] a(java.nio.Buffer dataBuffer, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataBuffer, "dataBuffer");
        long j17 = this.f422996a;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatImageFeatureManager", "applyReq but handler is null");
            return new float[0];
        }
        float[] m83780xbf7da7a0 = com.p314xaae8f345.mm.p2825x7e128009.C22972xcf27a729.m83780xbf7da7a0(j17, dataBuffer, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m83780xbf7da7a0, "nApply(...)");
        return m83780xbf7da7a0;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatImageFeatureManager", "destroyFeatureEnv >> " + this.f422996a);
        long j17 = this.f422996a;
        if (j17 != 0) {
            com.p314xaae8f345.mm.p2825x7e128009.C22972xcf27a729.m83782x46fb07b9(j17);
            this.f422996a = 0L;
        }
    }

    public final boolean c(java.lang.String str) {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.a3 a3Var = p05.a3.f431972a;
        if (str == null) {
            str = "MODEL_PRETRAIN_IMAGE_FEATURE_NEWLIFE";
        }
        java.lang.String g17 = a3Var.g(str);
        if (g17 == null) {
            g17 = "";
        }
        this.f422997b = g17;
        if (g17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatImageFeatureManager", "initFeatureEnv model path is empty");
            return false;
        }
        long m83781x630f29e = com.p314xaae8f345.mm.p2825x7e128009.C22972xcf27a729.m83781x630f29e(this.f422997b, 2);
        this.f422996a = m83781x630f29e;
        if (m83781x630f29e == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatImageFeatureManager", "initFeatureEnv >> init error");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatImageFeatureManager", "init success >> " + this.f422996a);
        return true;
    }
}
