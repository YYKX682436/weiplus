package com.p314xaae8f345.mm.p606xf34bc14e;

/* renamed from: com.tencent.mm.accessibility.Util */
/* loaded from: classes13.dex */
public class C4831x286422 {
    /* renamed from: getActivityOfView */
    public static android.app.Activity m42191x57f3de01(android.view.View view) {
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

    /* renamed from: getViewIdName */
    public static java.lang.String m42192x6d408541(android.view.View view) {
        java.lang.String str;
        if (view == null) {
            return "NO_ID";
        }
        int id6 = view.getId();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        if (id6 != -1) {
            android.content.res.Resources resources = view.getResources();
            if (m42193x8f235efa(id6) && resources != null) {
                int i17 = (-16777216) & id6;
                if (i17 == 16777216) {
                    str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f;
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

    /* renamed from: resourceHasPackage */
    public static boolean m42193x8f235efa(int i17) {
        return (i17 >>> 24) != 0;
    }
}
