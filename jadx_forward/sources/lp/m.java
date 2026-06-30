package lp;

/* loaded from: classes9.dex */
public class m implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401767a = 0;

    static {
        q25.b.b(new lp.m(), "//normsg");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (!z65.c.a() || strArr.length < 2) {
            return false;
        }
        try {
            if (strArr.length >= 3) {
                java.lang.Integer.valueOf(strArr[2]).intValue();
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String lowerCase = strArr[1].toLowerCase();
        long nanoTime = java.lang.System.nanoTime();
        lowerCase.getClass();
        if (lowerCase.equals("testrpp")) {
            w04.l.INSTANCE.f7(0, 1008);
            dp.a.m125854x26a183b(context, "info is reported.", 0).show();
        } else {
            if (!lowerCase.equals("oaid")) {
                return false;
            }
            java.lang.String k96 = fo3.s.INSTANCE.k9();
            dp.a.m125854x26a183b(context, "oaid: " + k96, 1).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NorMsgTest", "[+] oaid: %s", k96);
        }
        java.lang.String format = java.lang.String.format("[NorMsgTest] cmd: %s, time: %d ns.", strArr[1], java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NorMsgTest", format);
        dp.a.m125854x26a183b(context, format, 0).show();
        return true;
    }
}
