package uy2;

/* loaded from: classes5.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f513450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f513451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1688xc8466c51.C15514xec535794 f513452f;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1688xc8466c51.C15514xec535794 c15514xec535794, int i17, int i18) {
        this.f513452f = c15514xec535794;
        this.f513450d = i17;
        this.f513451e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1688xc8466c51.C15514xec535794 c15514xec535794 = this.f513452f;
        c15514xec535794.f218501d.startScroll(c15514xec535794.f218503f, 0, this.f513450d, 0, this.f513451e);
        c15514xec535794.invalidate();
        c15514xec535794.f218504g = false;
    }
}
