package yq1;

/* loaded from: classes4.dex */
public abstract class n {
    public static void a(java.lang.String str, java.lang.Runnable runnable, long j17) {
        if (j17 > 0) {
            ((ku5.t0) ku5.t0.f394148d).l(runnable, j17, str);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(runnable, str);
        }
    }

    public static void b(int i17, java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = obj == null ? "null" : obj.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceApplication", "set config, key[%d], value[%s]", objArr);
        gm0.j1.i();
        gm0.j1.u().c().w(i17, obj);
    }
}
