package ei3;

/* loaded from: classes10.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.f f334569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei3.g f334570e;

    public e(ei3.g gVar, ei3.f fVar) {
        this.f334570e = gVar;
        this.f334569d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.g gVar = this.f334570e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FrameBufProcessor", "process srcWidth %d srcHeight %d targetWidth %d targetHeight %d bufIndex: %d", java.lang.Integer.valueOf(gVar.f334580d), java.lang.Integer.valueOf(gVar.f334581e), java.lang.Integer.valueOf(gVar.f334582f), java.lang.Integer.valueOf(gVar.f334583g), java.lang.Integer.valueOf(gVar.f334579c));
        int i17 = gVar.f334584h;
        if (i17 == 21 || i17 == 2130706688) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69154xaa5b77e8(gVar.f334577a, gVar.f334578b, gVar.f334580d, gVar.f334581e, gVar.f334582f, gVar.f334583g, 1, gVar.f334588l, gVar.f334585i, gVar.f334587k, gVar.f334586j);
        } else if (i17 == 19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69154xaa5b77e8(gVar.f334577a, gVar.f334578b, gVar.f334580d, gVar.f334581e, gVar.f334582f, gVar.f334583g, 2, gVar.f334588l, gVar.f334585i, gVar.f334587k, gVar.f334586j);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        int length = gVar.f334577a.length;
        int length2 = gVar.f334578b.length;
        ei3.b bVar = (ei3.b) this.f334569d;
        bVar.f334527a.f334563e.mo50293x3498a0(new ei3.a(bVar, gVar));
        ei3.x.f334720d.o(gVar.f334577a);
    }
}
