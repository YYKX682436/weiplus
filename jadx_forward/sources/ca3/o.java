package ca3;

/* loaded from: classes13.dex */
public final class o implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e f121338a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e c16226x881c42e) {
        this.f121338a = c16226x881c42e;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource
    /* renamed from: getMyLocation */
    public android.location.Location mo14571x7b085d77() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.map.C16226x881c42e c16226x881c42e = this.f121338a;
        android.location.Location location = c16226x881c42e.D;
        if (location == null) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(location);
        location.getLatitude();
        android.location.Location location2 = c16226x881c42e.D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(location2);
        location2.getLongitude();
        return c16226x881c42e.D;
    }
}
