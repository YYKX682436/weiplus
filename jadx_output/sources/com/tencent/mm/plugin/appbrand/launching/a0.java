package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class a0 implements android.os.Parcelable.Creator {
    public com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction a(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.launching.k9 k9Var) {
        r45.o54 o54Var;
        com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction appBrandLaunchErrorAction = null;
        if (k9Var != null && (o54Var = k9Var.field_launchAction) != null) {
            int i18 = o54Var.f381942d;
            if (i18 == 2) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", k9Var.field_launchAction.f381943e);
                intent.putExtra("forceHideShare", true);
                appBrandLaunchErrorAction = new com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionStartActivity(str, i17, "webview", ".ui.tools.WebViewUI", intent);
            } else if (i18 == 3) {
                appBrandLaunchErrorAction = new com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionAlert(str, i17, o54Var.f381946h, o54Var.f381945g);
            } else if (i18 == 5) {
                appBrandLaunchErrorAction = new com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionBlockBackgroundLaunch(str, i17);
            } else if (i18 == 7) {
                appBrandLaunchErrorAction = new com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionShowFallbackErrorReloadUI(str, i17, u46.l.u(o54Var.f381948m));
            }
            if (appBrandLaunchErrorAction != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLaunchErrorAction", "createFromLaunchInfo hit error, appId:%s, versionType:%d, ActionCode:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k9Var.field_launchAction.f381942d));
            }
        }
        return appBrandLaunchErrorAction;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return (com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction) java.lang.Class.forName(readString).getDeclaredConstructor(android.os.Parcel.class).newInstance(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction[i17];
    }
}
