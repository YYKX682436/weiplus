package aw4;

/* loaded from: classes.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f96384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f96385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f96386f;

    public c0(long j17, long j18, long j19) {
        this.f96384d = j17;
        this.f96385e = j18;
        this.f96386f = j19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7144xb77ae8ab c7144xb77ae8ab = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7144xb77ae8ab();
        c7144xb77ae8ab.f144520d = this.f96384d;
        c7144xb77ae8ab.f144521e = this.f96385e;
        c7144xb77ae8ab.f144522f = this.f96386f;
        c7144xb77ae8ab.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchUtils", "25208 ,action = " + c7144xb77ae8ab.f144520d + ",actionInfo = " + c7144xb77ae8ab.f144521e + ",actionInfo = " + c7144xb77ae8ab.f144522f);
    }
}
