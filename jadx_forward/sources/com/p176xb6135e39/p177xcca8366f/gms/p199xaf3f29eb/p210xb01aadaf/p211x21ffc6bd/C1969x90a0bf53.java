package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest */
/* loaded from: classes13.dex */
public class C1969x90a0bf53 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53> f5983x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.zac();
    private static final java.util.Comparator zaa = new java.util.Comparator() { // from class: com.google.android.gms.common.moduleinstall.internal.zab
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 c1702x28db12d6 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6) obj;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 c1702x28db12d62 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6) obj2;
            android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53> creator = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53.f5983x681a0c0c;
            return !c1702x28db12d6.m17612xfb82e301().equals(c1702x28db12d62.m17612xfb82e301()) ? c1702x28db12d6.m17612xfb82e301().compareTo(c1702x28db12d62.m17612xfb82e301()) : (c1702x28db12d6.m17613x52c258a2() > c1702x28db12d62.m17613x52c258a2() ? 1 : (c1702x28db12d6.m17613x52c258a2() == c1702x28db12d62.m17613x52c258a2() ? 0 : -1));
        }
    };
    private final java.util.List zab;
    private final boolean zac;
    private final java.lang.String zad;
    private final java.lang.String zae;

    public C1969x90a0bf53(java.util.List list, boolean z17, java.lang.String str, java.lang.String str2) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(list);
        this.zab = list;
        this.zac = z17;
        this.zad = str;
        this.zae = str2;
    }

    /* renamed from: fromModuleInstallRequest */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53 m18446xa54b88ca(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.C1965x8179ea20 c1965x8179ea20) {
        return zaa(c1965x8179ea20.m18427xfb7d320f(), true);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53 zaa(java.util.List list, boolean z17) {
        java.util.TreeSet treeSet = new java.util.TreeSet(zaa);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.Collections.addAll(treeSet, ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1750x3d57946e) it.next()).m17812x51d89b33());
        }
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53(new java.util.ArrayList(treeSet), z17, null, null);
    }

    /* renamed from: equals */
    public final boolean m18447xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53 c1969x90a0bf53 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p210xb01aadaf.p211x21ffc6bd.C1969x90a0bf53) obj;
        return this.zac == c1969x90a0bf53.zac && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zab, c1969x90a0bf53.zab) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zad, c1969x90a0bf53.zad) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zae, c1969x90a0bf53.zae);
    }

    /* renamed from: getApiFeatures */
    public java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6> m18448xe7384f41() {
        return this.zab;
    }

    /* renamed from: hashCode */
    public final int m18449x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(java.lang.Boolean.valueOf(this.zac), this.zab, this.zad, this.zae);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 1, m18448xe7384f41(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 2, this.zac);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, this.zad, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 4, this.zae, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
