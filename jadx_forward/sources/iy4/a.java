package iy4;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.c f377456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f377457e;

    public a(iy4.c cVar, long j17) {
        this.f377456d = cVar;
        this.f377457e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy4.c cVar = this.f377456d;
        cVar.a(com.p314xaae8f345.mm.R.C30867xcad56011.l3n);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.b bVar = cVar.f377468a;
        if (bVar != null) {
            bVar.v0(this.f377457e);
        }
    }
}
