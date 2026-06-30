package ca3;

/* loaded from: classes13.dex */
public final class q implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e f121340d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e c16226x881c42e) {
        this.f121340d = c16226x881c42e;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        double d27 = f18;
        if (d27 == 0.0d) {
            if (((double) f17) == 0.0d) {
                return true;
            }
        }
        java.lang.String str = "GPS";
        if (i17 != 0 && i17 == 1) {
            str = "NETWORK";
        }
        this.f121340d.D = new android.location.Location(str);
        android.location.Location location = this.f121340d.D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(location);
        location.setLatitude(d27);
        android.location.Location location2 = this.f121340d.D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(location2);
        location2.setLongitude(f17);
        android.location.Location location3 = this.f121340d.D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(location3);
        location3.setSpeed((float) d17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e c16226x881c42e = this.f121340d;
        if (c16226x881c42e.f225637h && !c16226x881c42e.G) {
            ((ku5.t0) ku5.t0.f394148d).B(new ca3.p(this.f121340d));
        }
        return true;
    }
}
