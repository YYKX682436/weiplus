package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f296388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f296389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f296390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f296391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f296392h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2829xfa87f9de.p0 f296393i;

    public n0(com.p314xaae8f345.mm.p2829xfa87f9de.p0 p0Var, double d17, double d18, double d19, double d27, double d28) {
        this.f296393i = p0Var;
        this.f296388d = d17;
        this.f296389e = d18;
        this.f296390f = d19;
        this.f296391g = d27;
        this.f296392h = d28;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.location.Location location = new android.location.Location("xweb");
        location.setLatitude(this.f296388d);
        location.setLongitude(this.f296389e);
        location.setAccuracy((float) this.f296390f);
        location.setAltitude(this.f296391g);
        location.setSpeed((float) this.f296392h);
        location.setTime(java.lang.System.currentTimeMillis());
        this.f296393i.f296400b.getClass();
        tx5.j.d(80030, new java.lang.Object[]{location});
    }
}
