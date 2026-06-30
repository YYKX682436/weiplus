package ln1;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f401258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f401259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f401261g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ln1.g f401262h;

    public c(ln1.g gVar, int i17, byte[] bArr, int i18, long j17) {
        this.f401262h = gVar;
        this.f401258d = i17;
        this.f401259e = bArr;
        this.f401260f = i18;
        this.f401261g = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f401262h.f401289a.get() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupCEngine", "sendImp err mode!! seq:%d", java.lang.Integer.valueOf(this.f401258d));
            return;
        }
        if (this.f401262h.f401289a.get() == 1) {
            ln1.g gVar = this.f401262h;
            i17 = com.p314xaae8f345.mm.p814xbdd5bcd6.C10813xfabdd074.m46365x35cf88(gVar.f401290b, gVar.f401291c, this.f401259e);
        } else if (this.f401262h.f401289a.get() == 2) {
            ln1.g gVar2 = this.f401262h;
            i17 = com.p314xaae8f345.mm.p814xbdd5bcd6.C10811xd9a862ec.m46359x35cf88(gVar2.f401290b, gVar2.f401291c, this.f401259e);
        } else {
            i17 = 0;
        }
        byte[] bArr = this.f401259e;
        sn1.i.H(bArr == null ? -1 : bArr.length);
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(this.f401258d);
        byte[] bArr2 = this.f401259e;
        objArr[2] = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : -1);
        objArr[3] = java.lang.Integer.valueOf(this.f401262h.f401289a.get());
        objArr[4] = java.lang.Integer.valueOf(this.f401260f);
        objArr[5] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f401261g);
        objArr[6] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCEngine", "send result[%d], seq[%d], buff[%d], mode[%d], type[%d], time[%d,%d]", objArr);
    }
}
