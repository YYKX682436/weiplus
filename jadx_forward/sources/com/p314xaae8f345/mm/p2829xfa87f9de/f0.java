package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes8.dex */
final class f0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private f0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
                i17 = 0;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(29724, "6," + c10756x2a5d7b2d.f149939d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.GetHostByNameFromHttpTask", "httpdns: start get host ip:" + c10756x2a5d7b2d.f149939d);
                tr5.z a17 = kr5.r.b().a(c10756x2a5d7b2d.f149939d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.GetHostByNameFromHttpTask", "httpdns: end get host ip:" + c10756x2a5d7b2d.f149939d);
                java.lang.String[] strArr = a17.f503044f;
                if (strArr != null) {
                    int length = strArr.length;
                    int i18 = 0;
                    i17 = 0;
                    while (i18 < length) {
                        arrayList.add(strArr[i18]);
                        i18++;
                        i17 = 4;
                    }
                } else {
                    i17 = 0;
                }
                java.lang.String[] strArr2 = a17.f503042d;
                if (strArr2 != null) {
                    int length2 = strArr2.length;
                    int i19 = 0;
                    while (i19 < length2) {
                        arrayList.add(strArr2[i19]);
                        i19++;
                        i17 = 4;
                    }
                }
                java.lang.String[] strArr3 = a17.f503043e;
                if (strArr3 != null) {
                    int length3 = strArr3.length;
                    int i27 = 0;
                    while (i27 < length3) {
                        arrayList.add(strArr3[i27]);
                        i27++;
                        i17 = 4;
                    }
                }
            }
            if (arrayList.size() != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(29724, "7," + c10756x2a5d7b2d.f149939d);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(29724, "9," + c10756x2a5d7b2d.f149939d);
            }
            bundle.putStringArrayList("ipList", arrayList);
            bundle.putInt("result", i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.GetHostByNameFromHttpTask", "httpdns: host:" + c10756x2a5d7b2d.f149939d + ",result:" + i17 + ", ipList:" + arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("XWeb.MM.GetHostByNameFromHttpTask", e17, "httpdns error", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(29724, "8," + c10756x2a5d7b2d.f149939d);
        }
        return bundle;
    }
}
