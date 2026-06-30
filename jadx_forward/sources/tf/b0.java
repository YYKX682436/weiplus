package tf;

/* loaded from: classes7.dex */
public final class b0 implements tf.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f500315a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f500316b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.HandlerThread f500317c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f500318d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f500319e;

    public b0(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f500315a = name;
        this.f500316b = jz5.h.b(new tf.a0(this));
        this.f500318d = jz5.h.b(new tf.z(this));
        this.f500319e = jz5.h.b(new tf.y(this));
    }

    @Override // tf.o
    public boolean a() {
        ((xu5.b) ((jz5.n) this.f500316b).mo141623x754a37bb()).f538836b.g();
        android.os.HandlerThread handlerThread = this.f500317c;
        if (handlerThread == null) {
            return true;
        }
        boolean quitSafely = handlerThread.quitSafely();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + this.f500315a + " quited");
        return quitSafely;
    }

    @Override // tf.o
    public android.os.Handler b() {
        return (android.os.Handler) ((jz5.n) this.f500319e).mo141623x754a37bb();
    }

    @Override // tf.o
    /* renamed from: getHandler */
    public qu5.a mo166399x67189314() {
        return (qu5.a) ((jz5.n) this.f500318d).mo141623x754a37bb();
    }

    @Override // tf.o
    /* renamed from: start */
    public void mo166400x68ac462() {
    }
}
