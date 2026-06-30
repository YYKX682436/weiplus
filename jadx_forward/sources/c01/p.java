package c01;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118909d;

    public p(c01.u uVar, java.lang.String str) {
        this.f118909d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.s sVar = c01.u.f119031f;
        if (sVar != null) {
            ((com.p314xaae8f345.mm.app.w7) sVar).getClass();
            java.lang.String str = this.f118909d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "summerdiz onReMoveNoticeId:%s", str);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679 c5206xdf10b679 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679();
            am.c1 c1Var = c5206xdf10b679.f135545g;
            c1Var.f87831a = 1;
            c1Var.f87832b = str;
            c5206xdf10b679.e();
        }
    }
}
