package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class p1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.d2 {
    public p1(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        super(arrayList, arrayList2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        java.util.List list = this.f171598a;
        if (!(list.get(i17) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) list.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) this.f171599b.get(i18);
        long j17 = c11712x63ef1ef4.f157903p;
        long j18 = c11712x63ef1ef42.f157903p;
        if (c11712x63ef1ef4.B == c11712x63ef1ef42.B) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = c11712x63ef1ef4.f157890y;
            if (str == null) {
                str = "";
            }
            if (str.equals(c11712x63ef1ef42.f157890y)) {
                java.lang.String str2 = c11712x63ef1ef4.f157889x;
                if ((str2 != null ? str2 : "").equals(c11712x63ef1ef42.f157889x)) {
                    boolean z18 = c11712x63ef1ef42.f157905r;
                    boolean z19 = c11712x63ef1ef4.f157905r;
                    if (z19 == z18 && (!z19 || u46.l.c(c11712x63ef1ef4.f157906s, c11712x63ef1ef42.f157906s))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        java.util.List list = this.f171598a;
        java.lang.Class<?> cls = list.get(i17).getClass();
        java.util.List list2 = this.f171599b;
        if (!cls.equals(list2.get(i18).getClass()) || !(list.get(i17) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) list.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) list2.get(i18);
        return c11712x63ef1ef4.A == c11712x63ef1ef42.A && c11712x63ef1ef4.f157888w.equals(c11712x63ef1ef42.f157888w);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public java.lang.Object c(int i17, int i18) {
        java.util.List list = this.f171598a;
        if (i17 >= list.size()) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (list.get(i17) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) list.get(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) this.f171599b.get(i18);
            boolean z17 = c11712x63ef1ef4.B;
            boolean z18 = c11712x63ef1ef42.B;
            if (z17 != z18) {
                bundle.putBoolean("star", z18);
            }
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = c11712x63ef1ef4.f157890y;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = c11712x63ef1ef42.f157890y;
            if (!str.equals(str2 == null ? "" : str2)) {
                bundle.putString("icon", str2);
            }
            java.lang.String str3 = c11712x63ef1ef4.f157889x;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = c11712x63ef1ef42.f157889x;
            if (!str3.equals(str4 == null ? "" : str4)) {
                bundle.putString("nick_name", str4);
            }
            java.lang.String str5 = c11712x63ef1ef4.f157906s;
            if (str5 == null) {
                str5 = "";
            }
            java.lang.String str6 = c11712x63ef1ef42.f157906s;
            if (!str5.equals(str6 == null ? "" : str6)) {
                bundle.putString("third_party_app_using_desc", str6);
            }
            boolean z27 = c11712x63ef1ef4.f157905r;
            boolean z28 = c11712x63ef1ef42.f157905r;
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
