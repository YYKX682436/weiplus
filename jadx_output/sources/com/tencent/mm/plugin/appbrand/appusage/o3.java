package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class o3 extends com.tencent.mm.plugin.appbrand.ui.recents.d2 {
    public o3(java.util.List list, java.util.List list2) {
        super(f(list), f(list2));
    }

    public static java.util.ArrayList f(java.util.List list) {
        if (list instanceof java.util.ArrayList) {
            return (java.util.ArrayList) list;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return new java.util.ArrayList(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        arrayList.addAll(list);
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) this.f90065a.get(i17);
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) this.f90066b.get(i18);
        java.lang.String str = localUsageInfo.f76368n;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.equals(localUsageInfo2.f76368n);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) this.f90065a.get(i17);
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) this.f90066b.get(i18);
        java.lang.String str = localUsageInfo.f76361d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.equals(localUsageInfo2.f76361d) && localUsageInfo.f76363f == localUsageInfo2.f76363f;
    }

    @Override // androidx.recyclerview.widget.b0
    public java.lang.Object c(int i17, int i18) {
        java.util.List list = this.f90065a;
        if (i17 >= list.size()) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) list.get(i17);
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) this.f90066b.get(i18);
            java.lang.String str = localUsageInfo.f76368n;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            java.lang.String str3 = localUsageInfo2.f76368n;
            java.lang.String str4 = localUsageInfo2.f76365h;
            if (!str.equals(str3)) {
                bundle.putString("icon", localUsageInfo2.f76368n);
            }
            java.lang.String str5 = localUsageInfo.f76365h;
            if (str5 != null) {
                str2 = str5;
            }
            if (!str2.equals(str4)) {
                bundle.putString("nick_name", str4);
            }
        } catch (java.lang.Exception unused) {
            bundle.clear();
        }
        if (bundle.size() <= 0) {
            return null;
        }
        return bundle;
    }
}
