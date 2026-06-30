package a31;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f82493d;

    public j(a31.m mVar) {
        this.f82493d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z21.j0 j0Var;
        a31.m mVar = this.f82493d;
        if (mVar.f82499J) {
            return;
        }
        mVar.f82499J = true;
        z21.w wVar = mVar.f82518s;
        long j17 = (wVar == null || !wVar.C || (j0Var = wVar.A) == null) ? 0L : j0Var.f551165o;
        boolean z17 = j17 > 0 && mVar.H > 0;
        if (z17) {
            mVar.I = j17 - mVar.H;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeechInputHelper", "stopFlushTimeout: " + mVar.G + "ms expired, finishCost=" + mVar.I + "ms, wallCost=" + (mVar.H > 0 ? android.os.SystemClock.elapsedRealtime() - mVar.H : 0L) + "ms, workerBased=" + z17 + ", isSending=" + mVar.f82504e);
        if (!mVar.f82504e) {
            b31.l lVar = b31.l.f99146a;
            int i17 = mVar.G;
            long j18 = mVar.I;
            lVar.g(i17, j18 > 0, j18);
        }
        mVar.E = false;
    }
}
