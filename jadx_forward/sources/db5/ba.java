package db5;

/* loaded from: classes13.dex */
public final class ba {

    /* renamed from: b, reason: collision with root package name */
    public boolean f309833b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f309832a = true;

    /* renamed from: c, reason: collision with root package name */
    public db5.aa f309834c = db5.aa.f309816d;

    public ba(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final android.graphics.drawable.Drawable a() {
        int f17;
        int ordinal = this.f309834c.ordinal();
        if (ordinal == 0) {
            f17 = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        } else if (ordinal == 1) {
            f17 = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            f17 = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        }
        boolean z17 = this.f309832a;
        android.graphics.drawable.Drawable e17 = m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), (!z17 || this.f309833b) ? (z17 && this.f309833b) ? this.f309834c == db5.aa.f309818f ? com.p314xaae8f345.mm.R.raw.f78827xb7a8fbd6 : com.p314xaae8f345.mm.R.raw.f78833xd2420566 : this.f309834c == db5.aa.f309818f ? com.p314xaae8f345.mm.R.raw.f78828x92afbd9e : com.p314xaae8f345.mm.R.raw.f78852xb0f3332e : this.f309834c == db5.aa.f309818f ? com.p314xaae8f345.mm.R.raw.f78826xe2c3ca19 : com.p314xaae8f345.mm.R.raw.f78832xf55ebe89, (f17 * 1.0f) / com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(r1).getIntrinsicWidth());
        boolean z18 = this.f309832a;
        java.lang.Integer valueOf = (z18 && this.f309833b) ? java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.age) : (z18 || this.f309833b) ? (z18 || !this.f309833b) ? null : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.agf) : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.agd);
        if (valueOf != null) {
            com.p314xaae8f345.mm.ui.uk.f(e17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(valueOf.intValue()));
        }
        return e17;
    }
}
