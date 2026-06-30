package bd;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f100745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd.d f100746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f100747f;

    public h(bd.i iVar, java.lang.reflect.Method method, bd.d dVar, java.lang.Object[] objArr) {
        this.f100745d = method;
        this.f100746e = dVar;
        this.f100747f = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f100745d.invoke(this.f100746e, this.f100747f);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppModuleMgr", "callDynamicModule async " + e17.toString(), new java.lang.Object[0]);
        }
    }
}
