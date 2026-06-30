package tf;

/* loaded from: classes7.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.b0 f500379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tf.b0 b0Var) {
        super(0);
        this.f500379d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tf.b0 b0Var = this.f500379d;
        java.lang.String str = b0Var.f500315a;
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(str, 5);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Thread ");
        java.lang.String str2 = b0Var.f500315a;
        sb6.append(str2);
        sb6.append(" created");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", sb6.toString());
        a17.start();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + str2 + " started");
        b0Var.f500317c = a17;
        return new android.os.Handler(a17.getLooper());
    }
}
