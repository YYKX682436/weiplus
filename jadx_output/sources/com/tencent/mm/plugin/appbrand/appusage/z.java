package com.tencent.mm.plugin.appbrand.appusage;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class z extends i95.w implements com.tencent.mm.plugin.appbrand.appusage.z5, l75.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.a0 f76662d = com.tencent.mm.plugin.appbrand.appusage.b0.f76388a;

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int Dc(java.lang.String str, int i17) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger;
        if ((str == null || str.length() == 0) || (iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.appusage.AppIdentity(str, i17), com.tencent.mm.plugin.appbrand.appusage.a.class)) == null) {
            return -1;
        }
        return iPCInteger.f68404d;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean Lg(java.util.List list, int i17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean Y1(java.lang.String str, int i17) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean;
        if ((str == null || str.length() == 0) || (iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) uk0.a.d(new com.tencent.mm.plugin.appbrand.appusage.AppIdentity(str, i17), com.tencent.mm.plugin.appbrand.appusage.y.f76652a)) == null) {
            return false;
        }
        return iPCBoolean.f68400d;
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        this.f76662d.add(q0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int ce(java.lang.String str, int i17, boolean z17) {
        return ce(str, i17, true);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int getCount() {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.appusage.q3.class);
        if (iPCInteger != null) {
            return iPCInteger.f68404d;
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean m2(java.lang.String str, int i17) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean;
        if ((str == null || str.length() == 0) || (iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.appusage.AppIdentity(str, i17), com.tencent.mm.plugin.appbrand.appusage.f6.class)) == null) {
            return false;
        }
        return iPCBoolean.f68400d;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public boolean nh(java.lang.String str, int i17) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean;
        if ((str == null || str.length() == 0) || (iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.appusage.AppIdentity(str, i17), com.tencent.mm.plugin.appbrand.appusage.m6.class)) == null) {
            return false;
        }
        return iPCBoolean.f68400d;
    }

    @Override // l75.l0
    public void remove(l75.q0 q0Var) {
        this.f76662d.remove(q0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public java.util.List xi(int i17, com.tencent.mm.plugin.appbrand.appusage.y5 y5Var) {
        return ye(i17, y5Var, Integer.MAX_VALUE);
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public int y7() {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.appusage.g6.class);
        return iPCInteger != null ? iPCInteger.f68404d : com.tencent.mm.plugin.appbrand.appusage.x2.h();
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.z5
    public java.util.List ye(int i17, com.tencent.mm.plugin.appbrand.appusage.y5 y5Var, int i18) {
        android.os.Parcel parcel = (android.os.Parcel) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.appusage.QueryParams(i17, y5Var, i18), com.tencent.mm.plugin.appbrand.appusage.k6.class);
        if (parcel == null) {
            return new java.util.ArrayList(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readTypedList(arrayList, com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo.CREATOR);
        return arrayList;
    }

    @Override // l75.l0
    public void add(java.lang.String str, l75.q0 q0Var) {
        this.f76662d.add(str, q0Var);
    }
}
