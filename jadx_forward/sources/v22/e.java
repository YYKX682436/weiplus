package v22;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.f f514340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f514341e;

    public e(v22.f fVar, yz5.a aVar) {
        this.f514340d = fVar;
        this.f514341e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        v22.f fVar = this.f514340d;
        boolean b17 = fVar.f514344c.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f514342a, "finishEncode used " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", ret:" + b17 + ", totally used " + (android.os.SystemClock.elapsedRealtime() - fVar.f514345d) + "ms");
        fVar.f514343b.mo50299x35224f();
        yz5.a aVar = this.f514341e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
