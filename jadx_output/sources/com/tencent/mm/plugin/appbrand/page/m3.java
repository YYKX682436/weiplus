package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86871f;

    public m3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var, java.lang.String str) {
        this.f86871f = i3Var;
        this.f86869d = w2Var;
        this.f86870e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int indexOf;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f86871f;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f86869d;
        synchronized (i3Var.f86709o) {
            indexOf = i3Var.f86710p.indexOf(w2Var);
        }
        com.tencent.mm.plugin.appbrand.page.i3.f(this.f86871f, indexOf, this.f86870e, null, null, null);
    }
}
