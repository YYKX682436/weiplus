package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.d f91953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f91954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f91955f;

    public c(com.tencent.mm.plugin.appbrand.widget.recent.d dVar, java.lang.String str, l75.w0 w0Var) {
        this.f91953d = dVar;
        this.f91954e = str;
        this.f91955f = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Set keySet = ((java.util.LinkedHashMap) this.f91953d.f91961e).keySet();
        com.tencent.mm.plugin.appbrand.widget.recent.d dVar = this.f91953d;
        java.util.Iterator it = keySet.iterator();
        while (it.hasNext()) {
            dVar.h((com.tencent.mm.plugin.appbrand.widget.recent.g2) it.next());
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.widget.recent.b(this.f91953d, this.f91954e, this.f91955f));
    }
}
