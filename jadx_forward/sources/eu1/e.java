package eu1;

/* loaded from: classes2.dex */
public class e implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "begin to delelteAllIllegalStatusCard()");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardInfoStorage", "delelteAllIllegalStatusCard updateRet is " + (xt1.t0.nj().f348378d.A("ShareCardInfo", "delete from ShareCardInfo where (status=1 OR status=2 OR status=3 OR status=4 OR status=6)") ? 1 : 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "end to delelteAllIllegalStatusCard()");
    }
}
