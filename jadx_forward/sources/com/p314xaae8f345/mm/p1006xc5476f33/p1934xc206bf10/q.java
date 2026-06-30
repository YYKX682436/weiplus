package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* loaded from: classes13.dex */
class q implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private q() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        fo3.s sVar = fo3.s.INSTANCE;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            sVar.Ig();
            bundle.setClassLoader(com.p298x317108.p299xc9fb5b77.p300x8201b442.p301xdd28ddda.C2835xfd2e56d4.class.getClassLoader());
            int i17 = bundle.getInt("a_k_r_c");
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("a_k_c_r_r");
            int i18 = bundle.getInt("a_k_v_a_f_c");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (parcelableArrayList != null) {
                java.util.Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    com.p298x317108.p299xc9fb5b77.p300x8201b442.p301xdd28ddda.C2835xfd2e56d4 c2835xfd2e56d4 = (com.p298x317108.p299xc9fb5b77.p300x8201b442.p301xdd28ddda.C2835xfd2e56d4) it.next();
                    arrayList.add(new com.p314xaae8f345.mm.p975xc206bf10.j(c2835xfd2e56d4.f127346d, c2835xfd2e56d4.f127347e, c2835xfd2e56d4.f127348f));
                }
            }
            byte[] j17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.j(i17, arrayList, i18);
            if (j17 == null) {
                j17 = new byte[0];
            }
            bundle2.putByteArray("result", j17);
        } finally {
            try {
                return bundle2;
            } finally {
            }
        }
        return bundle2;
    }
}
