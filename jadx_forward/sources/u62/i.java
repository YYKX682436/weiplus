package u62;

/* loaded from: classes12.dex */
public class i implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c f506490d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c c13503x6c65632c) {
        this.f506490d = c13503x6c65632c;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c c13503x6c65632c = this.f506490d;
        if (c13503x6c65632c.f181438w) {
            return false;
        }
        c13503x6c65632c.f181438w = true;
        if (z17) {
            gm0.j1.d().g(new an3.f(c13503x6c65632c.f181430o, f17, f18, (int) d18, i17, "", ""));
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderNearBy", "get location failed");
        com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13503x6c65632c.n(c13503x6c65632c);
        c13503x6c65632c.f181435t.countDown();
        return false;
    }
}
