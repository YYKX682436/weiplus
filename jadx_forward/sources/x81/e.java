package x81;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f534022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f534023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f534024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd f534025g;

    public e(int i17, long j17, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd c12558x591103cd) {
        this.f534022d = i17;
        this.f534023e = j17;
        this.f534024f = j18;
        this.f534025g = c12558x591103cd;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f534022d;
        if (i17 != 1) {
            new x81.d(this, i17, this.f534023e, this.f534024f, this.f534025g).l();
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o a17 = x81.f.s(i17, this.f534023e, this.f534024f, this.f534025g).a();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new x81.c(this));
    }
}
