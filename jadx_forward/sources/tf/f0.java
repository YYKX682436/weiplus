package tf;

/* loaded from: classes7.dex */
public final class f0 implements tf.n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f500338a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f500339b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f500340c;

    public f0(boolean z17, java.lang.String namePrefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(namePrefix, "namePrefix");
        this.f500338a = z17;
        this.f500339b = namePrefix;
        this.f500340c = new java.util.concurrent.atomic.AtomicInteger(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "<init>, usePooledImpl: " + z17);
    }

    public static final tf.n b(tf.g0 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        return new tf.f0(type != tf.g0.f500341d, type.name() + "Thread_");
    }

    public tf.o a() {
        java.lang.String str = this.f500339b + this.f500340c.getAndIncrement();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "create, name: " + str);
        return this.f500338a ? new tf.b0(str) : new tf.e0(str);
    }
}
