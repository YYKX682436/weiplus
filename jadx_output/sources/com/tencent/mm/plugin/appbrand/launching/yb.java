package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class yb implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.vb f85443d;

    public yb(com.tencent.mm.plugin.appbrand.launching.vb vbVar) {
        this.f85443d = vbVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        boolean z17;
        k91.v5 v5Var;
        k91.v5 v5Var2;
        com.tencent.mm.plugin.appbrand.launching.wb wbVar = new com.tencent.mm.plugin.appbrand.launching.wb(this);
        com.tencent.mm.plugin.appbrand.launching.xb xbVar = new com.tencent.mm.plugin.appbrand.launching.xb(this);
        com.tencent.mm.plugin.appbrand.launching.vb vbVar = this.f85443d;
        if (!android.text.TextUtils.isEmpty(vbVar.f85283i)) {
            z17 = vbVar.A && !xbVar.invoke();
            return (z17 || (v5Var = vbVar.f85287p) == null) ? com.tencent.mm.plugin.appbrand.config.q.h(vbVar.f85283i, z17, new com.tencent.mm.plugin.appbrand.launching.bc(vbVar, null), wbVar) : android.util.Pair.create(v5Var, null);
        }
        z17 = vbVar.A && !xbVar.invoke();
        if (!z17 && (v5Var2 = vbVar.f85287p) != null) {
            return android.util.Pair.create(v5Var2, null);
        }
        java.lang.String str = vbVar.f85284m;
        return com.tencent.mm.plugin.appbrand.config.q.i(str, z17, new com.tencent.mm.plugin.appbrand.launching.bc(vbVar, null), new k91.q4(str, wbVar), null);
    }
}
