package gi3;

/* loaded from: classes10.dex */
public abstract class c {
    public static void a(gi3.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoEditReporter", "[report-VideoEditCountData] %s", aVar.m131648x9616526c());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14529, java.lang.Integer.valueOf(aVar.f353807a), java.lang.Integer.valueOf(aVar.f353808b));
    }

    public static void b(gi3.b bVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[14];
        objArr[0] = java.lang.Integer.valueOf(bVar.f353809a);
        objArr[1] = java.lang.Integer.valueOf(bVar.f353810b ? 2 : 1);
        objArr[2] = java.lang.Integer.valueOf(bVar.f353813e);
        objArr[3] = java.lang.Integer.valueOf(bVar.f353814f);
        objArr[4] = java.lang.Integer.valueOf(bVar.f353817i);
        objArr[5] = java.lang.Boolean.valueOf(bVar.f353815g);
        objArr[6] = java.lang.Integer.valueOf(bVar.f353816h);
        objArr[7] = java.lang.Integer.valueOf(bVar.f353811c);
        objArr[8] = java.lang.Integer.valueOf(bVar.f353812d);
        objArr[9] = java.lang.Integer.valueOf(bVar.f353818j);
        objArr[10] = 0;
        objArr[11] = java.lang.Integer.valueOf(bVar.f353819k);
        objArr[12] = str;
        objArr[13] = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        g0Var.d(14362, objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoEditReporter", "[report-VideoEditDetailData] %s", bVar.m131649x9616526c());
    }
}
