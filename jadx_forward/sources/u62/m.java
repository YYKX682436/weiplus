package u62;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.database.Cursor f506495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v25.b f506496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13505x3266242b f506497f;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13505x3266242b c13505x3266242b, android.database.Cursor cursor, v25.b bVar) {
        this.f506497f = c13505x3266242b;
        this.f506495d = cursor;
        this.f506496e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r12v7 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r122;
        android.database.Cursor cursor = this.f506495d;
        com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13505x3266242b c13505x3266242b = this.f506497f;
        c13505x3266242b.getClass();
        d95.e eVar = new d95.e(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13505x3266242b.f181448p);
        com.p314xaae8f345.mm.p943x351df9c2.e eVar2 = null;
        try {
            if (cursor.moveToFirst()) {
                int i17 = 0;
                while (true) {
                    int i18 = 1;
                    i17++;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                    z3Var.mo9015xbf5d97fd(cursor);
                    if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                        android.graphics.Bitmap f17 = com.p314xaae8f345.mm.p943x351df9c2.d1.wi().f(z3Var.d1(), true, 0, eVar2);
                        if (f17 != null) {
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            f17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            r122 = byteArrayOutputStream;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderSearchContact", "get useravatar is null");
                            r122 = eVar2;
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9[] Q5 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).Q5(z3Var.d1(), 1);
                        if (Q5 == null || Q5.length != 1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderSearchContact", "get msginfo failed");
                            java.lang.Object[] objArr = new java.lang.Object[6];
                            objArr[0] = com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.b((int) z3Var.E2);
                            objArr[1] = z3Var.g2();
                            objArr[2] = r122 == 0 ? null : r122.toByteArray();
                            objArr[3] = "";
                            objArr[4] = "0";
                            objArr[5] = 0;
                            eVar.a(objArr);
                        } else {
                            java.lang.Object[] objArr2 = new java.lang.Object[6];
                            objArr2[0] = com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.b((int) z3Var.E2);
                            objArr2[1] = z3Var.g2();
                            objArr2[2] = r122 == 0 ? null : r122.toByteArray();
                            objArr2[3] = Q5[0].mo78013xfb85f7b0() == 1 ? Q5[0].j() : "";
                            objArr2[4] = com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.b(Q5[0].m124847x74d37ac6());
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = Q5[0];
                            if (f9Var.mo78013xfb85f7b0() == 34) {
                                i18 = 2;
                            } else if (f9Var.mo78013xfb85f7b0() != 1) {
                                i18 = 3;
                            }
                            objArr2[5] = java.lang.Integer.valueOf(i18);
                            eVar.a(objArr2);
                        }
                    }
                    if (!cursor.moveToNext() || i17 >= 15) {
                        break;
                    } else {
                        eVar2 = null;
                    }
                }
            }
            cursor.close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderSearchContact", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtControlProviderSearchContact", e17, "", new java.lang.Object[0]);
            if (cursor != null) {
                cursor.close();
            }
            eVar.close();
            eVar = null;
        }
        c13505x3266242b.f181450o = eVar;
        this.f506496e.a();
    }
}
