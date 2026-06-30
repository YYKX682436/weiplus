package com.tencent.mm.plugin.appbrand.appusage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class l1 implements com.tencent.mm.ipcinvoker.k0 {
    private l1() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("count");
        int i18 = bundle.getInt("versionType", Integer.MAX_VALUE);
        long j17 = bundle.getLong("maxUpdateTime", com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            if (j17 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                obtain.writeTypedList(((com.tencent.mm.plugin.appbrand.appusage.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.b6.class)).ze(j17, i17));
            } else {
                obtain.writeTypedList(((com.tencent.mm.plugin.appbrand.appusage.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.b6.class)).Ca(i17, i18));
            }
        } catch (java.lang.Exception unused) {
            obtain.setDataPosition(0);
            obtain.writeTypedList(null);
        }
        return obtain;
    }
}
