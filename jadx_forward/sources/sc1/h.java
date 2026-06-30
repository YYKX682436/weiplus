package sc1;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f487208d;

    /* renamed from: e, reason: collision with root package name */
    public int f487209e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e f487210f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e) {
        this.f487210f = c12151x47b5a23e;
    }

    @Override // java.lang.Runnable
    public void run() {
        int m51026xcae2343f;
        this.f487209e++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePusherView", "[CheckRotateTask] number=" + this.f487209e + "  senorAngle=" + this.f487208d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e = this.f487210f;
        m51026xcae2343f = c12151x47b5a23e.m51026xcae2343f();
        if (m51026xcae2343f == this.f487208d) {
            c12151x47b5a23e.c(m51026xcae2343f);
        } else if (this.f487209e < 8) {
            c12151x47b5a23e.f163099e.postDelayed(this, 250L);
        }
    }
}
