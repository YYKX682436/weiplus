package hk4;

/* loaded from: classes10.dex */
public final class p implements pk4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk4.x f363508a;

    public p(hk4.x xVar) {
        this.f363508a = xVar;
    }

    @Override // pk4.v
    public void a(dk4.a aVar, long j17) {
        hk4.x xVar = this.f363508a;
        long j18 = xVar.f363525r;
        long j19 = xVar.f363521n;
        if ((!(1 <= j19 && j19 <= j18) || j17 < j19) && j17 < j18) {
            yz5.p pVar = xVar.f363461g;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Long.valueOf(j17), this.f363508a);
            }
            if (this.f363508a.f363527t) {
                return;
            }
            hk4.x.q(this.f363508a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363508a.f363518k, "onProgress try invoke play start, video size:[" + this.f363508a.f363522o + ", " + this.f363508a.f363523p + "], rotate:" + this.f363508a.f363524q);
            hk4.x.p(this.f363508a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f363518k, "reach playRange end timeMs:" + j17 + ", playRange:[" + this.f363508a.f363520m + ',' + this.f363508a.f363521n + "], isLoop:" + this.f363508a.f363529v);
        hk4.x xVar2 = this.f363508a;
        if (xVar2.f363529v) {
            long j27 = xVar2.f363520m;
            if (j27 >= 0) {
                kk4.b.f(xVar2.f363519l, (int) j27, true, null, 4, null);
                return;
            }
        }
        xVar2.f363519l.mo143591x360802();
        hk4.x xVar3 = this.f363508a;
        synchronized (xVar3) {
            if (!xVar3.f363526s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar3.f363518k, "invokeOnPlayFinished");
                pm0.v.X(new hk4.u(xVar3));
                xVar3.f363526s = true;
            }
        }
    }
}
