package dg5;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.d f313890d;

    public c(dg5.d dVar) {
        this.f313890d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s01.g aj6 = r01.q3.aj();
        dg5.d dVar = this.f313890d;
        aj6.D0(dVar.f313891d.f313901m);
        if (r01.q3.aj().P0(dVar.f313891d.f313900i) <= 0) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(dVar.f313891d.f313900i);
        }
    }
}
