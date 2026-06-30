package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f79532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f79534f;

    public z(com.tencent.mm.ipcinvoker.r rVar, int i17, int i18) {
        this.f79532d = rVar;
        this.f79533e = i17;
        this.f79534f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ipcinvoker.r rVar = this.f79532d;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(this.f79533e == 0 && this.f79534f == 0));
        }
    }
}
