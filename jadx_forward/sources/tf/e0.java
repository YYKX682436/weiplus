package tf;

/* loaded from: classes7.dex */
public final class e0 implements tf.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f500333a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.HandlerThread f500334b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f500335c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f500336d;

    public e0(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f500333a = name;
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(name, 5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + name + " created");
        this.f500334b = a17;
        this.f500335c = jz5.h.b(new tf.d0(this));
        this.f500336d = jz5.h.b(new tf.c0(this));
    }

    @Override // tf.o
    public boolean a() {
        boolean quitSafely = this.f500334b.quitSafely();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + this.f500333a + " quited");
        return quitSafely;
    }

    @Override // tf.o
    public android.os.Handler b() {
        return (android.os.Handler) ((jz5.n) this.f500336d).mo141623x754a37bb();
    }

    @Override // tf.o
    /* renamed from: getHandler */
    public qu5.a mo166399x67189314() {
        return (qu5.a) ((jz5.n) this.f500335c).mo141623x754a37bb();
    }

    @Override // tf.o
    /* renamed from: start */
    public void mo166400x68ac462() {
        this.f500334b.start();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + this.f500333a + " started");
    }
}
