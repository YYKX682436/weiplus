package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class l1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private l1() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("count");
        int i18 = bundle.getInt("versionType", Integer.MAX_VALUE);
        long j17 = bundle.getLong("maxUpdateTime", com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            if (j17 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                obtain.writeTypedList(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6.class)).ze(j17, i17));
            } else {
                obtain.writeTypedList(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6.class)).Ca(i17, i18));
            }
        } catch (java.lang.Exception unused) {
            obtain.setDataPosition(0);
            obtain.writeTypedList(null);
        }
        return obtain;
    }
}
