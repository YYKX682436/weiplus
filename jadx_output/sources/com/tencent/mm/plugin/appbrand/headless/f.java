package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.plugin.appbrand.headless.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.PowerManager.WakeLock f78296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.p f78297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78298c;

    public f(android.os.PowerManager.WakeLock wakeLock, com.tencent.mm.plugin.appbrand.headless.p pVar, java.lang.String str) {
        this.f78296a = wakeLock;
        this.f78297b = pVar;
        this.f78298c = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.headless.p
    public void a(int i17, java.lang.String str) {
        android.os.PowerManager.WakeLock wakeLock = this.f78296a;
        if (wakeLock != null) {
            com.tencent.mm.plugin.appbrand.headless.j.a(com.tencent.mm.plugin.appbrand.headless.j.f78304a, wakeLock, this.f78298c);
        }
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78297b;
        if (pVar != null) {
            pVar.a(i17, str);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.headless.p
    public void onSuccess(java.lang.String processName) {
        kotlin.jvm.internal.o.g(processName, "processName");
        android.os.PowerManager.WakeLock wakeLock = this.f78296a;
        if (wakeLock != null) {
            com.tencent.mm.plugin.appbrand.headless.j.a(com.tencent.mm.plugin.appbrand.headless.j.f78304a, wakeLock, this.f78298c);
        }
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78297b;
        if (pVar != null) {
            pVar.onSuccess(processName);
        }
    }
}
