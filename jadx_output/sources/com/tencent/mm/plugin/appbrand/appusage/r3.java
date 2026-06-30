package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes4.dex */
public final class r3 extends c01.i8 {
    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrand.DuplicateUsageUsernameSetFlagDataTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return (i17 != 0) & (i17 < 637927936);
    }

    @Override // c01.i8
    public void c(int i17) {
        if (b(i17)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.APPBRAND_PREDOWNLOAD_DONE_USAGE_USERNAME_DUPLICATE_BEFORE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        }
    }
}
