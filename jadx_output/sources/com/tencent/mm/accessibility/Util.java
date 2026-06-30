package com.tencent.mm.accessibility;

/* loaded from: classes13.dex */
public class Util {
    public static android.app.Activity getActivityOfView(android.view.View view) {
        if (view == null) {
            return null;
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }

    public static java.lang.String getViewIdName(android.view.View view) {
        java.lang.String str;
        if (view == null) {
            return "NO_ID";
        }
        int id6 = view.getId();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        if (id6 != -1) {
            android.content.res.Resources resources = view.getResources();
            if (resourceHasPackage(id6) && resources != null) {
                int i17 = (-16777216) & id6;
                if (i17 == 16777216) {
                    str = com.eclipsesource.mmv8.Platform.ANDROID;
                } else if (i17 != 2130706432) {
                    try {
                        str = resources.getResourcePackageName(id6);
                    } catch (java.lang.Throwable unused) {
                    }
                } else {
                    str = "app";
                }
                java.lang.String resourceTypeName = resources.getResourceTypeName(id6);
                java.lang.String resourceEntryName = resources.getResourceEntryName(id6);
                sb6.append(" ");
                sb6.append(str);
                sb6.append(":");
                sb6.append(resourceTypeName);
                sb6.append("/");
                sb6.append(resourceEntryName);
            }
        }
        return sb6.toString();
    }

    public static boolean resourceHasPackage(int i17) {
        return (i17 >>> 24) != 0;
    }
}
