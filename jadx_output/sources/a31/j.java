package a31;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f960d;

    public j(a31.m mVar) {
        this.f960d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z21.j0 j0Var;
        a31.m mVar = this.f960d;
        if (mVar.f966J) {
            return;
        }
        mVar.f966J = true;
        z21.w wVar = mVar.f985s;
        long j17 = (wVar == null || !wVar.C || (j0Var = wVar.A) == null) ? 0L : j0Var.f469632o;
        boolean z17 = j17 > 0 && mVar.H > 0;
        if (z17) {
            mVar.I = j17 - mVar.H;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SpeechInputHelper", "stopFlushTimeout: " + mVar.G + "ms expired, finishCost=" + mVar.I + "ms, wallCost=" + (mVar.H > 0 ? android.os.SystemClock.elapsedRealtime() - mVar.H : 0L) + "ms, workerBased=" + z17 + ", isSending=" + mVar.f971e);
        if (!mVar.f971e) {
            b31.l lVar = b31.l.f17613a;
            int i17 = mVar.G;
            long j18 = mVar.I;
            lVar.g(i17, j18 > 0, j18);
        }
        mVar.E = false;
    }
}
