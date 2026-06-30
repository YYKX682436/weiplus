package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f89499a = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.ui.a1.class, "forceCenterInside", "getForceCenterInside()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.ui.a1.class, "forceNotCenterInside", "getForceNotCenterInside()Z", 0))};

    public a1(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        return ((java.lang.Boolean) com.tencent.mm.plugin.appbrand.ui.b1.access$getForceCenterInside$delegate$cp().b(this, f89499a[0])).booleanValue();
    }

    public final boolean b() {
        return ((java.lang.Boolean) com.tencent.mm.plugin.appbrand.ui.b1.access$getForceNotCenterInside$delegate$cp().b(this, f89499a[1])).booleanValue();
    }

    public final boolean c(android.content.Context context) {
        boolean booleanValue;
        boolean z17;
        if (b()) {
            return true;
        }
        java.lang.String m17 = wo.w0.m();
        java.util.Locale US = java.util.Locale.US;
        kotlin.jvm.internal.o.f(US, "US");
        java.lang.String lowerCase = m17.toLowerCase(US);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (kotlin.jvm.internal.o.b(lowerCase, "M2011J18C")) {
            return true;
        }
        if (context != null && com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(context)) {
            booleanValue = false;
        } else {
            if (com.tencent.mm.plugin.appbrand.ui.b1.access$getMayDisableInHuaWeiDevices$cp() == null) {
                if (u75.c.a()) {
                    nf.y yVar = nf.x.f336616b;
                    if (!(yVar != null ? yVar.f() : false)) {
                        z17 = true;
                        com.tencent.mm.plugin.appbrand.ui.b1.access$setMayDisableInHuaWeiDevices$cp(java.lang.Boolean.valueOf(z17));
                    }
                }
                z17 = false;
                com.tencent.mm.plugin.appbrand.ui.b1.access$setMayDisableInHuaWeiDevices$cp(java.lang.Boolean.valueOf(z17));
            }
            java.lang.Boolean access$getMayDisableInHuaWeiDevices$cp = com.tencent.mm.plugin.appbrand.ui.b1.access$getMayDisableInHuaWeiDevices$cp();
            kotlin.jvm.internal.o.d(access$getMayDisableInHuaWeiDevices$cp);
            booleanValue = access$getMayDisableInHuaWeiDevices$cp.booleanValue();
        }
        return booleanValue;
    }
}
