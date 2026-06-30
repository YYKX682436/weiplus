package su4;

/* loaded from: classes8.dex */
public class b3 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f494354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su4.e3 f494355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f494356c;

    public b3(su4.d3 d3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, su4.e3 e3Var) {
        this.f494356c = d3Var;
        this.f494354a = c22633x83752a59;
        this.f494355b = e3Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        su4.d3 d3Var = this.f494356c;
        java.lang.String str = d3Var.f494391a;
        java.lang.String obj2 = this.f494354a.toString();
        int i17 = d3Var.f494392b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "loadJS, sys:attach_runOn3rd_apis callback %s,view %s preloadBiz:%d", (java.lang.String) obj, obj2, java.lang.Integer.valueOf(i17));
        long currentTimeMillis = java.lang.System.currentTimeMillis() - d3Var.f494395e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15005, java.lang.Integer.valueOf(i17), 2, java.lang.Long.valueOf(currentTimeMillis), 2);
        java.util.LinkedList linkedList = (java.util.LinkedList) d3Var.f494394d;
        su4.e3 e3Var = this.f494355b;
        linkedList.add(e3Var);
        d3Var.f494393c.set(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d3Var.f494391a, "preload webview done, cost: %s scene:%s coreType:%s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(e3Var.f494410a), e3Var.f494411b.m120143xc7aa84d5());
    }
}
