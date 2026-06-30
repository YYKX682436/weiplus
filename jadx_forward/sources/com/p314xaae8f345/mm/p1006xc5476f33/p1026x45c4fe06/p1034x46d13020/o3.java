package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class o3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.d2 {
    public o3(java.util.List list, java.util.List list2) {
        super(f(list), f(list2));
    }

    public static java.util.ArrayList f(java.util.List list) {
        if (list instanceof java.util.ArrayList) {
            return (java.util.ArrayList) list;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return new java.util.ArrayList(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        arrayList.addAll(list);
        return arrayList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) this.f171598a.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) this.f171599b.get(i18);
        java.lang.String str = c11714x918fd2e4.f157901n;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return str.equals(c11714x918fd2e42.f157901n);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) this.f171598a.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) this.f171599b.get(i18);
        java.lang.String str = c11714x918fd2e4.f157894d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return str.equals(c11714x918fd2e42.f157894d) && c11714x918fd2e4.f157896f == c11714x918fd2e42.f157896f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public java.lang.Object c(int i17, int i18) {
        java.util.List list = this.f171598a;
        if (i17 >= list.size()) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) list.get(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) this.f171599b.get(i18);
            java.lang.String str = c11714x918fd2e4.f157901n;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            java.lang.String str3 = c11714x918fd2e42.f157901n;
            java.lang.String str4 = c11714x918fd2e42.f157898h;
            if (!str.equals(str3)) {
                bundle.putString("icon", c11714x918fd2e42.f157901n);
            }
            java.lang.String str5 = c11714x918fd2e4.f157898h;
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
