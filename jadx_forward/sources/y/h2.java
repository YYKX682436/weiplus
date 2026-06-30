package y;

/* loaded from: classes16.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2.h f539897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 f539898e;

    public h2(mi2.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6) {
        this.f539897d = hVar;
        this.f539898e = c14327xf6cdefc6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mi2.h hVar = this.f539897d;
        hVar.X(false);
        this.f539898e.setVisibility(8);
        hVar.L();
    }
}
