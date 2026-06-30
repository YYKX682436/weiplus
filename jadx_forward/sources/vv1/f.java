package vv1;

/* loaded from: classes9.dex */
public class f implements lo.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm.r f521944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vv1.g f521945b;

    public f(vv1.g gVar, dm.r rVar) {
        this.f521945b = gVar;
        this.f521944a = rVar;
    }

    @Override // lo.l
    public void a(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f521945b.f521946a.b(j17, j18);
    }

    @Override // lo.l
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_File", "DownloadCallback errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d c10396xb34a007d = new com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d();
            c10396xb34a007d.f146294d = this.f521945b.f521946a.f521938d.e();
            c10396xb34a007d.f146295e = this.f521944a.f68099xfeae815;
            c10396xb34a007d.f146296f = this.f521945b.f521946a.f521938d.d();
            c10396xb34a007d.f146298h = "file";
            c10396xb34a007d.f146299i = this.f521945b.f521946a.f521938d.c();
            c10396xb34a007d.f146297g = this.f521945b.f521946a.f521938d.g() / 1000;
            this.f521945b.f521946a.c(c10396xb34a007d);
            return;
        }
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_File", "download %s fail", this.f521945b.f521946a.f521938d);
            this.f521945b.f521946a.a();
            return;
        }
        vv1.h hVar = this.f521945b.f521946a;
        synchronized (hVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Base", "callStop");
            vv1.a aVar = hVar.f521939e;
            if (aVar != null) {
                aVar.e();
                hVar.f521939e = null;
            }
        }
    }
}
