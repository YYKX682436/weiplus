package sw4;

/* loaded from: classes8.dex */
public abstract class g {
    public static void a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.os.Bundle bundle, java.lang.Class cls, sw4.e eVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("task_class_name", cls.getName());
        intent.putExtra("input_data", bundle);
        intent.putExtra("orientation", -1);
        abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(new sw4.f(eVar));
        j45.l.n(abstractActivityC21394xb3d2c0cf, "webview", ".luggage.ipc.IpcProxyUI", intent, 3456);
    }
}
