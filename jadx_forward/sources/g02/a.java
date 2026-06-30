package g02;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f348948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f348949f;

    public a(java.lang.String str, long j17, long j18) {
        this.f348947d = str;
        this.f348948e = j17;
        this.f348949f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m k17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.k(this.f348947d, false);
        if (k17 == null || !k17.k()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(860L, this.f348948e, this.f348949f, false);
    }
}
