package cl;

/* loaded from: classes7.dex */
public class a3 implements com.eclipsesource.mmv8.JavaVoidCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.l3 f42598b;

    public a3(cl.l3 l3Var, int i17) {
        this.f42598b = l3Var;
        this.f42597a = i17;
    }

    @Override // com.eclipsesource.mmv8.JavaVoidCallback
    public void invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        com.tencent.mm.plugin.appbrand.e9 e9Var;
        if (v8Array.length() < 1 || v8Array.getType(0) != 4) {
            return;
        }
        cl.m3 m3Var = this.f42598b.f42687c;
        java.lang.String string = v8Array.getString(0);
        com.tencent.mm.plugin.appbrand.x9 x9Var = ((com.tencent.mm.plugin.appbrand.z9) m3Var).f92451a;
        if (x9Var.f92390j.get()) {
            e9Var = null;
        } else {
            e9Var = x9Var.f92381a;
            java.util.Objects.requireNonNull(e9Var);
        }
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = e9Var != null ? e9Var.getF147808e() : null;
        int i17 = this.f42597a;
        if (f147808e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWorkerContainer", "onWorkerMessage(appId:%s, id:%d, msg:%s), mService.getJsRuntime() is null", x9Var.f92385e, java.lang.Integer.valueOf(i17), string);
        } else {
            f147808e.evaluateJavascript(java.lang.String.format(java.util.Locale.ENGLISH, "typeof WeixinWorker.workerMsgHandler !== 'undefined' && WeixinWorker.workerMsgHandler(%d, %s);", java.lang.Integer.valueOf(i17), string), null);
        }
    }
}
