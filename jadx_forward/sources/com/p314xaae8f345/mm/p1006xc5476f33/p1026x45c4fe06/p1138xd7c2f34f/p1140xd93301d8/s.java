package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.a {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f166554o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f166555i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f166556m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.v f166557n;

    public s(android.content.Context context, java.lang.String str, boolean z17) {
        this.f166555i = str;
        this.f166556m = new java.lang.ref.WeakReference(context);
        this.f166469f = z17;
        ((java.util.concurrent.ConcurrentHashMap) f166554o).put(str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.u(str);
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(300L);
        uVar.c(millis, millis);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s l(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s) ((java.util.concurrent.ConcurrentHashMap) f166554o).remove(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.a
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        super.e(c11809xbc286be4, c12559xbdae8559);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.v vVar = this.f166557n;
        if (vVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.f0) vVar;
            if (f0Var.f166516a.a()) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = f0Var.f166517b;
                java.lang.String str = c12362x460991bc.f166434d;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                java.lang.String str2 = c12362x460991bc.f166435e;
                objArr[1] = str2 != null ? str2 : "";
                objArr[2] = f0Var.f166518c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "LaunchProxyUIDelegate.cancelDeferredStartActivityRequest, username:%s, appId:%s, instanceId:%s", objArr);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(f0Var.f166519d);
        }
        if (c11809xbc286be4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a.c(c11809xbc286be4);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.s$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s.l(sVar.f166555i);
                sVar.d();
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.a
    public android.content.Context h() {
        return (android.content.Context) this.f166556m.get();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.a
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.v vVar = this.f166557n;
        if (vVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.f0) vVar;
            if (f0Var.f166516a.b()) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = f0Var.f166517b;
                java.lang.String str = c12362x460991bc.f166434d;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                java.lang.String str2 = c12362x460991bc.f166435e;
                objArr[1] = str2 != null ? str2 : "";
                objArr[2] = f0Var.f166518c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "LaunchProxyUIDelegate.fireStartActivityRequestImmediately, username:%s, appId:%s, instanceId:%s", objArr);
            }
        }
    }
}
