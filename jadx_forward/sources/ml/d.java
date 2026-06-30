package ml;

/* loaded from: classes13.dex */
public class d extends ll.n {

    /* renamed from: g, reason: collision with root package name */
    public final ml.h f408709g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f408710h;

    /* renamed from: i, reason: collision with root package name */
    public ql.c f408711i;

    public d(ml.h hVar, java.lang.String str, int i17) {
        super(str, i17);
        this.f408710h = false;
        this.f408709g = hVar;
    }

    @Override // ll.n
    public void h() {
        this.f408710h = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = {this.f400650d};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadTask", "run task %s", objArr);
        if (this.f408710h) {
            ((ml.c) this.f408709g).a(this);
            return;
        }
        android.os.Process.setThreadPriority(10);
        ml.h hVar = this.f408709g;
        ql.c cVar = this.f408711i;
        ml.c cVar2 = (ml.c) hVar;
        cVar2.f408706b = false;
        if (cVar == null) {
            ml.f fVar = cVar2.f408707c;
            if (fVar != null) {
                ((ml.a) fVar).a(null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDownloadProcess", "process source is null", null);
            cVar2.f408706b = true;
        } else {
            cVar2.f408705a = false;
            n01.b b17 = cVar.b();
            if (b17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadProcess", "audio:%s, url:%s", b17.f415369a, b17.f415370b);
            }
            cVar2.f408708d = b17;
            cVar.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadProcess", "source connect, stop:%b", java.lang.Boolean.valueOf(cVar2.f408706b));
            long j17 = -1;
            java.lang.String str = "";
            int i18 = 0;
            while (true) {
                if (i18 >= 3 || cVar2.f408706b) {
                    break;
                }
                i18++;
                if (j17 <= 0) {
                    j17 = cVar.mo124758xfb854877();
                }
                long j18 = j17;
                if (android.text.TextUtils.isEmpty(str)) {
                    str = cVar.c();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadProcess", "fileSize:%d, mimetype:%s, tryCount:%d", java.lang.Long.valueOf(j18), str, java.lang.Integer.valueOf(i18));
                if (j18 <= 0 || android.text.TextUtils.isEmpty(str)) {
                    j17 = j18;
                } else if (android.text.TextUtils.isEmpty(str) || !str.contains("text/")) {
                    byte[] bArr = new byte[8192];
                    int i19 = 0;
                    while (true) {
                        long j19 = i19;
                        if (j19 >= j18 || cVar2.f408706b) {
                            break;
                        }
                        int mo124759xc8455469 = cVar.mo124759xc8455469(j19, bArr, 0, 8192);
                        if (mo124759xc8455469 < 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDownloadProcess", "readSize:%d, terminal process or read end", java.lang.Integer.valueOf(mo124759xc8455469));
                            break;
                        }
                        i19 += mo124759xc8455469;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadProcess", "offSize:%d", java.lang.Integer.valueOf(i19));
                    cVar2.f408705a = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioDownloadProcess", "mimetype not support", null);
                }
            }
            cVar.mo124757x1f9d589c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadProcess", "source disconnect", null);
        }
        ((ml.c) this.f408709g).a(this);
        this.f408710h = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDownloadTask", "run task %s end", this.f400650d);
    }
}
