package h34;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h34.f f360033d;

    public e(h34.f fVar) {
        this.f360033d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h34.f fVar = this.f360033d;
        if (fVar.f360048q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicFingerPrintRecorder", "tryStartNetscene clientid: %d but netscene is running.", java.lang.Integer.valueOf(fVar.f360050s));
            return;
        }
        synchronized (fVar.f360038d) {
            h34.f fVar2 = this.f360033d;
            int i17 = fVar2.f360039e;
            if (i17 <= 0) {
                return;
            }
            byte[] bArr = new byte[i17];
            java.lang.System.arraycopy(fVar2.f360038d, 0, bArr, 0, i17);
            h34.f fVar3 = this.f360033d;
            fVar3.f360039e = 0;
            long j17 = fVar3.f360041g;
            fVar3.f360048q = true;
            int i18 = fVar3.f360042h;
            int i19 = fVar3.f360040f;
            int i27 = fVar3.f360050s;
            boolean z17 = fVar3.f360049r;
            int i28 = fVar3.f360051t;
            c01.d9.e().g(i18 == 367 ? new h34.k(bArr, i19, j17, i27, z17, i28) : i18 == 408 ? new h34.m(bArr, i19, j17, i27, z17, i28) : null);
        }
    }

    /* renamed from: toString */
    public java.lang.String m132827x9616526c() {
        return super.toString() + "|tryStartNetscene";
    }
}
