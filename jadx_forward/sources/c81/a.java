package c81;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f121188a = null;

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            return null;
        }
        java.lang.String str = n17 + "_WxExptAiMMKV";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f121188a, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiMMKV", "%s get mmkv change uin old[%s] new[%s]", hashCode() + "", this.f121188a, str);
            this.f121188a = str;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(this.f121188a);
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6354xa0c7aa56 b(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int a17 = a81.a.a(java.lang.System.currentTimeMillis());
        c81.b wi6 = c81.b.wi();
        wi6.m134976x2690a4ac();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = wi6.f121189d.a();
        java.lang.String string = a18 != null ? a18.getString(str, "") : "";
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6354xa0c7aa56 c6354xa0c7aa56 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6354xa0c7aa56(string) : null;
        if (c6354xa0c7aa56 != null && c6354xa0c7aa56.f137028d == a17) {
            return c6354xa0c7aa56;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6354xa0c7aa56 c6354xa0c7aa562 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6354xa0c7aa56();
        c6354xa0c7aa562.f137028d = a17;
        return c6354xa0c7aa562;
    }

    public void c(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a();
        if (a17 == null) {
            return;
        }
        a17.putLong(str, j17);
    }
}
