package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class p1 extends com.tencent.mm.plugin.appbrand.ui.recents.d2 {
    public p1(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        super(arrayList, arrayList2);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        java.util.List list = this.f90065a;
        if (!(list.get(i17) instanceof com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo)) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo = (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) list.get(i17);
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo2 = (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) this.f90066b.get(i18);
        long j17 = appBrandRecentTaskInfo.f76370p;
        long j18 = appBrandRecentTaskInfo2.f76370p;
        if (appBrandRecentTaskInfo.B == appBrandRecentTaskInfo2.B) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = appBrandRecentTaskInfo.f76357y;
            if (str == null) {
                str = "";
            }
            if (str.equals(appBrandRecentTaskInfo2.f76357y)) {
                java.lang.String str2 = appBrandRecentTaskInfo.f76356x;
                if ((str2 != null ? str2 : "").equals(appBrandRecentTaskInfo2.f76356x)) {
                    boolean z18 = appBrandRecentTaskInfo2.f76372r;
                    boolean z19 = appBrandRecentTaskInfo.f76372r;
                    if (z19 == z18 && (!z19 || u46.l.c(appBrandRecentTaskInfo.f76373s, appBrandRecentTaskInfo2.f76373s))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        java.util.List list = this.f90065a;
        java.lang.Class<?> cls = list.get(i17).getClass();
        java.util.List list2 = this.f90066b;
        if (!cls.equals(list2.get(i18).getClass()) || !(list.get(i17) instanceof com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo = (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) list.get(i17);
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo2 = (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) list2.get(i18);
        return appBrandRecentTaskInfo.A == appBrandRecentTaskInfo2.A && appBrandRecentTaskInfo.f76355w.equals(appBrandRecentTaskInfo2.f76355w);
    }

    @Override // androidx.recyclerview.widget.b0
    public java.lang.Object c(int i17, int i18) {
        java.util.List list = this.f90065a;
        if (i17 >= list.size()) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (list.get(i17) instanceof com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) {
            com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo = (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) list.get(i17);
            com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo2 = (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) this.f90066b.get(i18);
            boolean z17 = appBrandRecentTaskInfo.B;
            boolean z18 = appBrandRecentTaskInfo2.B;
            if (z17 != z18) {
                bundle.putBoolean("star", z18);
            }
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = appBrandRecentTaskInfo.f76357y;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = appBrandRecentTaskInfo2.f76357y;
            if (!str.equals(str2 == null ? "" : str2)) {
                bundle.putString("icon", str2);
            }
            java.lang.String str3 = appBrandRecentTaskInfo.f76356x;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = appBrandRecentTaskInfo2.f76356x;
            if (!str3.equals(str4 == null ? "" : str4)) {
                bundle.putString("nick_name", str4);
            }
            java.lang.String str5 = appBrandRecentTaskInfo.f76373s;
            if (str5 == null) {
                str5 = "";
            }
            java.lang.String str6 = appBrandRecentTaskInfo2.f76373s;
            if (!str5.equals(str6 == null ? "" : str6)) {
                bundle.putString("third_party_app_using_desc", str6);
            }
            boolean z27 = appBrandRecentTaskInfo.f76372r;
            boolean z28 = appBrandRecentTaskInfo2.f76372r;
            if (z27 != z28) {
                bundle.putInt("used_in_third_party_app", z28 ? 1 : 0);
                if (!z28) {
                    bundle.putString("third_party_app_using_desc", "");
                }
            }
        }
        if (bundle.size() <= 0) {
            return null;
        }
        return bundle;
    }
}
