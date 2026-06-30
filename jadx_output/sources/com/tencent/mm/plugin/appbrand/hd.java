package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class hd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.md f78276e;

    public hd(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.md mdVar) {
        this.f78275d = o6Var;
        this.f78276e = mdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.md.a(this.f78275d, this.f78276e);
    }
}
