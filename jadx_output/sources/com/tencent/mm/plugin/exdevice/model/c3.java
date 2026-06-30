package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes12.dex */
public class c3 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.e3 f98861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.f3 f98862b;

    public c3(com.tencent.mm.plugin.exdevice.model.f3 f3Var, com.tencent.mm.plugin.exdevice.model.e3 e3Var) {
        this.f98862b = f3Var;
        this.f98861a = e3Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        com.tencent.mm.plugin.exdevice.model.f3 f3Var = this.f98862b;
        if (f3Var.f98903k) {
            f3Var.f98902j = false;
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.exdevice.model.b3(this));
        this.f98861a.a(f3Var.a(bVar.f359534d));
        f3Var.f98902j = false;
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
