package vh1;

/* loaded from: classes7.dex */
public class b extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh1.f f518543e;

    public b(vh1.f fVar) {
        this.f518543e = fVar;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AppBrandDownloadWorker#TimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        vh1.f fVar = this.f518543e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", "call cronet time out taskid:%s,timeout:%d,url:%s", fVar.f518566v, java.lang.Integer.valueOf(fVar.f518561q), this.f518543e.f518556i);
        if (this.f518543e.f518555h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", "call cronet time out already callback");
        } else {
            this.f518543e.f518555h = true;
            vh1.f fVar2 = this.f518543e;
            fVar2.f518553f.d(fVar2.f518557m, fVar2.f518556i, "fail:time out", 5);
        }
        uh1.j0.E(1197L, 6L, 1L);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f518543e.f518568x)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f518543e.f518568x);
    }
}
