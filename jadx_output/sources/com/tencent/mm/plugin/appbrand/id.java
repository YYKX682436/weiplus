package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class id implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.md f78341e;

    public id(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.md mdVar) {
        this.f78340d = o6Var;
        this.f78341e = mdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.md.a(this.f78340d, this.f78341e);
    }
}
