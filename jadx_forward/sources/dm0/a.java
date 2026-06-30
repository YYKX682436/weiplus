package dm0;

/* loaded from: classes13.dex */
public abstract class a extends bm0.c {

    /* renamed from: b, reason: collision with root package name */
    public org.p3367x5a555907.p3368x32b0ae.d f323158b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f323159c;

    public a(zl0.a aVar) {
        this.f103273a = aVar;
    }

    @Override // bm0.c
    public boolean a() {
        boolean z17 = false;
        if (!am0.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.BasePredict", "PredictEnv not init");
            return false;
        }
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k || kl0.a.a()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_plugin_kara_predict_open", "1", false, true), 1) != 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.BasePredict", "init error");
            return false;
        }
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f103273a.c());
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(a17.m82499x9616526c(), "rw");
                java.nio.MappedByteBuffer map = randomAccessFile.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, randomAccessFile.getFilePointer(), randomAccessFile.length() + randomAccessFile.getFilePointer());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.BasePredict", "get mappedByteBuffer succ");
                this.f323158b = new org.p3367x5a555907.p3368x32b0ae.d(map.asReadOnlyBuffer());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.BasePredict", "get Interpreter succ");
                z17 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.BasePredict", "model file not exists:" + this.f103273a.c());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.BasePredict", "load model error!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Kara.BasePredict", e17, "", new java.lang.Object[0]);
        }
        this.f323159c = z17;
        return z17;
    }

    @Override // bm0.c
    public boolean b() {
        return this.f323159c;
    }

    @Override // bm0.c
    public void d() {
        synchronized (this) {
            org.p3367x5a555907.p3368x32b0ae.d dVar = this.f323158b;
            if (dVar != null) {
                dVar.close();
                this.f323158b = null;
            }
        }
    }
}
