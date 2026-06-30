package f42;

/* loaded from: classes5.dex */
public class d implements yj0.b {
    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5660xf8f060d0 c5660xf8f060d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5660xf8f060d0();
        c5660xf8f060d0.f135986g.f87891a = 1;
        c5660xf8f060d0.e();
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KillselfMonitor", "on kill proc: " + str4 + ", args=" + java.util.Arrays.toString(objArr));
        if (str4.equals("exit")) {
            mm.g0.f410016a.d(kz5.b0.c(java.lang.Integer.valueOf(android.os.Process.myPid())));
        }
        if (str4.equals("killProcess") && objArr != null && objArr.length >= 1) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof java.lang.Integer) {
                mm.g0.f410016a.d(kz5.b0.c(java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue())));
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5660xf8f060d0 c5660xf8f060d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5660xf8f060d0();
        c5660xf8f060d0.f135986g.f87891a = 0;
        c5660xf8f060d0.e();
    }
}
