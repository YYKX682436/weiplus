package t21;

/* loaded from: classes10.dex */
public class n2 implements java.lang.Runnable {
    public n2(t21.o2 o2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            t21.w2 Ui = t21.o2.Ui();
            Ui.getClass();
            java.lang.String str = "UPDATE videoinfo2 SET status = 198, lastmodifytime = " + (java.lang.System.currentTimeMillis() / 1000) + " WHERE masssendid > 0  AND status = 200";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoInfoStorage", "fail all massSendInfos, sql %s", str);
            Ui.f496590a.A("videoinfo2", str);
        }
    }
}
