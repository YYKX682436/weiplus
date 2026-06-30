package bd;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f19212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd.d f19213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f19214f;

    public h(bd.i iVar, java.lang.reflect.Method method, bd.d dVar, java.lang.Object[] objArr) {
        this.f19212d = method;
        this.f19213e = dVar;
        this.f19214f = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f19212d.invoke(this.f19213e, this.f19214f);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppModuleMgr", "callDynamicModule async " + e17.toString(), new java.lang.Object[0]);
        }
    }
}
