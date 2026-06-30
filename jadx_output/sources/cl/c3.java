package cl;

/* loaded from: classes7.dex */
public class c3 implements com.tencent.mm.plugin.appbrand.jsruntime.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f42608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.l3 f42609e;

    public c3(cl.l3 l3Var, java.lang.ref.WeakReference weakReference) {
        this.f42609e = l3Var;
        this.f42608d = weakReference;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f42609e.b((cl.q0) this.f42608d.get(), str, valueCallback);
    }
}
