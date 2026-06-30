package com.tencent.mm.plugin.appbrand.appusage;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class r1 extends i95.w implements com.tencent.mm.plugin.appbrand.appusage.b6 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.s0 f76549d = new com.tencent.mm.plugin.appbrand.appusage.j1(this);

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public java.util.List Ca(int i17, int i18) {
        return wi(i17, i18, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        add(q0Var, android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public int getCount() {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.appusage.k1.class);
        if (iPCInteger == null) {
            return 0;
        }
        return iPCInteger.f68404d;
    }

    @Override // l75.l0
    public void remove(l75.q0 q0Var) {
        this.f76549d.remove(q0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public java.util.List t0(int i17) {
        return Ca(i17, Integer.MAX_VALUE);
    }

    public final java.util.List wi(int i17, int i18, long j17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("count", i17);
        bundle.putInt("versionType", i18);
        bundle.putLong("maxUpdateTime", j17);
        android.os.Parcel parcel = (android.os.Parcel) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.appbrand.appusage.l1.class);
        if (parcel == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        parcel.readTypedList(arrayList, com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo.CREATOR);
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public boolean x0(java.lang.String str, int i17) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.appusage.AppIdentity(str, i17), com.tencent.mm.plugin.appbrand.appusage.q1.class);
        if (iPCBoolean == null) {
            return false;
        }
        return iPCBoolean.f68400d;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b6
    public java.util.List ze(long j17, int i17) {
        return wi(i17, Integer.MAX_VALUE, j17);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        this.f76549d.add(q0Var, looper);
    }
}
