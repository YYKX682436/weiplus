package gs0;

/* loaded from: classes10.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.l f356525d;

    public j(gs0.l lVar) {
        this.f356525d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.l lVar = this.f356525d;
        synchronized (lVar.f356512i) {
            if (lVar.f356510g || lVar.f356511h || 0 == lVar.f356533p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f356527j, "finishEncode() already finish " + lVar.hashCode() + ", isFinishEncode:" + lVar.f356510g + ", isRelease:" + lVar.f356511h + ", startTime:" + lVar.f356533p);
                return;
            }
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356525d.f356527j, "finishEncode() hash:" + this.f356525d.hashCode() + "  isFinishEncode:" + this.f356525d.f356510g + "  startTime:" + this.f356525d.f356533p);
                this.f356525d.f356528k.w();
                this.f356525d.f356510g = true;
                gs0.l.g(this.f356525d);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f356525d.f356527j, e17, "finishEncode " + this.f356525d.hashCode() + " \n signalEndOfInputStream error:" + e17.getMessage(), new java.lang.Object[0]);
            }
        }
    }
}
