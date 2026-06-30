package tf;

/* loaded from: classes7.dex */
public abstract class r0 implements pd1.l {

    /* renamed from: c, reason: collision with root package name */
    public static final pd1.f f500375c = new tf.o0();

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.ref.WeakReference f500376d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f500377a = "MicroMsg.AppBrand.XWebVideoContainerChannel4AudioPlay#" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public final tf.q f500378b;

    public r0(tf.q qVar) {
        this.f500378b = qVar;
    }

    @Override // pd1.l
    public void c(android.view.View view, java.lang.Runnable runnable) {
        java.lang.String str = this.f500377a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferTo, view: " + view);
        if (runnable != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferTo, run afterTransferToTask");
            runnable.run();
        }
    }

    @Override // pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        java.lang.String str = this.f500377a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferFrom, view: " + view);
        if (runnable != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferFrom, run afterTransferFromTask");
            runnable.run();
        }
    }
}
