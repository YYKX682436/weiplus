package po3;

/* loaded from: classes4.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f438871d;

    public n(po3.o oVar, long j17) {
        this.f438871d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f438871d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendSnsFailNotification", "resend snsInfo id:%d", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5935xb93dc17d c5935xb93dc17d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5935xb93dc17d();
        c5935xb93dc17d.f136239g.f89744a = (int) j17;
        c5935xb93dc17d.e();
    }
}
