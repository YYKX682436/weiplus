package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes8.dex */
public final class k1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f295461i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m1 f295462j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m1 m1Var, java.lang.String str, java.lang.String str2, int i17) {
        super(i17);
        this.f295462j = m1Var;
        this.f295461i = "SELECT * FROM " + str + " WHERE " + str2 + "=?;";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Boolean] */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.r2
    public java.lang.Object n(java.lang.Object obj) {
        try {
            android.database.Cursor f17 = this.f295462j.f295474d.f(this.f295461i, new java.lang.String[]{obj.toString()}, 2);
            try {
                if (!f17.moveToFirst()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCacheStorage", "GET: " + obj.toString() + " => (NOT EXIST)");
                    java.lang.Object obj2 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m1.f295473l;
                    f17.close();
                    return obj2;
                }
                int i17 = f17.getInt(1);
                java.lang.String string = f17.getString(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCacheStorage", "GET: " + obj.toString() + " => " + string);
                if (string != com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m1.f295473l) {
                    try {
                    } catch (java.lang.Exception e17) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCacheStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                    switch (i17) {
                        case 1:
                            string = java.lang.Integer.valueOf(string);
                            break;
                        case 2:
                            string = java.lang.Long.valueOf(string);
                            break;
                        case 3:
                            f17.close();
                            return string;
                        case 4:
                            string = java.lang.Boolean.valueOf(string);
                            break;
                        case 5:
                            string = java.lang.Float.valueOf(string);
                            break;
                        case 6:
                            string = java.lang.Double.valueOf(string);
                            break;
                    }
                    f17.close();
                    return string;
                }
                string = null;
                f17.close();
                return string;
            } finally {
            }
        } catch (java.lang.RuntimeException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletCacheStorage", e18, "Failed to query UserInfo, id: " + obj, new java.lang.Object[0]);
            return null;
        }
    }
}
