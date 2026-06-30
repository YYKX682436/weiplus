package nr4;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f420872a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f420873b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.StringBuffer f420874c = new java.lang.StringBuffer();

    public static nr4.a c(java.lang.String str, int i17) {
        nr4.a aVar = new nr4.a();
        aVar.f420872a = str + "," + i17;
        return aVar;
    }

    public static nr4.a d(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("WECHAT_PAY_LOG_REPORT_INDEX", -1);
        if (intExtra == -1) {
            return null;
        }
        nr4.a aVar = new nr4.a();
        aVar.f420873b = intExtra;
        java.lang.String stringExtra = intent.getStringExtra("WECHAT_PAY_LOG_REPORT_DATA");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVar.f420874c = new java.lang.StringBuffer(stringExtra);
        java.lang.String stringExtra2 = intent.getStringExtra("WECHAT_PAY_LOG_REPORT_BASEIFO");
        aVar.f420872a = stringExtra2 != null ? stringExtra2 : "";
        return aVar;
    }

    public static boolean e(nr4.a aVar, android.content.Intent intent) {
        if (aVar == null) {
            return false;
        }
        intent.putExtra("WECHAT_PAY_LOG_REPORT_INDEX", aVar.f420873b);
        intent.putExtra("WECHAT_PAY_LOG_REPORT_DATA", aVar.f420874c.toString());
        intent.putExtra("WECHAT_PAY_LOG_REPORT_BASEIFO", aVar.f420872a);
        return true;
    }

    public void a(int i17, java.lang.String str) {
        java.lang.String format = java.lang.String.format("{%d, %s, %d, %s},", java.lang.Integer.valueOf(this.f420873b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i17), str);
        this.f420873b++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayLogReport", "test for log " + format);
        this.f420874c.append(format);
    }

    public void b(int i17, java.lang.Object... objArr) {
        java.lang.String str;
        if (objArr == null || objArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PayLogReport", "vals is null, use '' as value");
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int length = objArr.length - 1;
            for (int i18 = 0; i18 < length; i18++) {
                sb6.append(java.lang.String.valueOf(objArr[i18]));
                sb6.append(',');
            }
            sb6.append(java.lang.String.valueOf(objArr[length]));
            str = sb6.toString();
        }
        a(i17, str);
    }
}
