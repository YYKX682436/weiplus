package la2;

/* loaded from: classes8.dex */
public final class c implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f399041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399042e;

    public c(boolean z17, java.lang.String str) {
        this.f399041d = z17;
        this.f399042e = str;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modMaterialPoiSwitchCallback, isEnable:");
        boolean z17 = this.f399041d;
        sb6.append(z17);
        sb6.append(" ret ");
        sb6.append(ret.m75939xb282bd08(1));
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiHelper", sb6.toString());
        if (ret.m75939xb282bd08(1) == 0) {
            ya2.g gVar = ya2.h.f542017a;
            ya2.b2 b17 = gVar.b(this.f399042e);
            long j17 = b17 != null ? b17.f69298x75e87a18 : 0L;
            long j18 = z17 ? j17 | 1024 : (-1025) & j17;
            if (b17 != null) {
                b17.f69298x75e87a18 = j18;
                gVar.o(b17);
            }
        }
    }
}
