package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class i1 implements com.tencent.shadow.core.common.IWVAPermissionDelegate {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.minigame.i1 f69080a = new com.tencent.mm.minigame.i1();

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.appbrand.o6 f69081b;

    public final android.content.Context a() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = f69081b;
        android.app.Activity r07 = o6Var != null ? o6Var.r0() : null;
        if (r07 != null) {
            return r07;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // com.tencent.shadow.core.common.IWVAPermissionDelegate
    public int checkPermission(java.lang.String str, int i17, int i18) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        return a().checkPermission(str, i17, i18);
    }

    @Override // com.tencent.shadow.core.common.IWVAPermissionDelegate
    public int checkSelfPermission(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        return a().checkSelfPermission(str);
    }

    @Override // com.tencent.shadow.core.common.IWVAPermissionDelegate
    public void requestPermissions(java.lang.String[] strArr, int i17, com.tencent.shadow.core.common.IWVAPermissionListener iWVAPermissionListener) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context a17 = a();
        com.tencent.mm.minigame.h1 h1Var = new com.tencent.mm.minigame.h1(iWVAPermissionListener);
        if (strArr == null) {
            strArr = new java.lang.String[0];
        }
        ((sb0.f) jVar).getClass();
        j35.u.j(a17, i17, h1Var, strArr, null, null);
    }
}
