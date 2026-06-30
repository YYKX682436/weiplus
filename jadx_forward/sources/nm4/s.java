package nm4;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18738x2b7fba04 f420043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420044e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18738x2b7fba04 c18738x2b7fba04, int i17) {
        this.f420043d = c18738x2b7fba04;
        this.f420044e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f420043d.setBackgroundColor(this.f420044e);
    }
}
