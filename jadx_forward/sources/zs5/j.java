package zs5;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f556946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f556947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zs5.y f556948f;

    public j(int i17, long j17, zs5.y yVar) {
        this.f556946d = i17;
        this.f556947e = j17;
        this.f556948f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "doInitQBar callback2 ret: " + this.f556946d + ", init cost: " + (java.lang.System.currentTimeMillis() - this.f556947e) + ", tryStartSessionWhenInited: " + this.f556948f.f557045m);
        zs5.y yVar = this.f556948f;
        int i17 = this.f556946d;
        yVar.f557038f = i17 == 0;
        zs5.b bVar = i17 == 0 ? zs5.b.f556854f : zs5.b.f556855g;
        yVar.f557039g = bVar;
        if (bVar == zs5.b.f556854f && yVar.f557045m) {
            yVar.f557045m = false;
            zs5.c cVar = yVar.f557049q;
            if (cVar != null) {
                this.f556948f.c(cVar.f556859a, cVar.f556860b, cVar.f556861c, cVar.f556862d);
            }
        }
    }
}
