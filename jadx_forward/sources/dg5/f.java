package dg5;

/* loaded from: classes11.dex */
public class f implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f313893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg5.g f313894e;

    public f(dg5.g gVar, long j17) {
        this.f313894e = gVar;
        this.f313893d = j17;
    }

    @Override // c01.da
    public boolean a() {
        return this.f313894e.f313897f;
    }

    @Override // c01.da
    public void c() {
        dg5.g gVar = this.f313894e;
        if (gVar.f313898g != null) {
            s01.m Ui = r01.q3.Ui();
            long j17 = this.f313893d;
            Ui.y0(j17);
            r01.q3.aj().D0(j17);
            if (r01.q3.aj().P0(gVar.f313900i) <= 0) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(gVar.f313900i);
            }
            gVar.f313898g.dismiss();
        }
    }
}
