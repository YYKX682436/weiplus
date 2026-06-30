package com.google.android.gms.common.moduleinstall;

/* loaded from: classes13.dex */
public final class ModuleInstall {
    private ModuleInstall() {
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.common.moduleinstall.internal.zay(activity);
    }

    public static com.google.android.gms.common.moduleinstall.ModuleInstallClient getClient(android.content.Context context) {
        return new com.google.android.gms.common.moduleinstall.internal.zay(context);
    }
}
