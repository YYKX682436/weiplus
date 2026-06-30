package tz2;

/* loaded from: classes14.dex */
public class d implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz2.e f504794d;

    public d(tz2.e eVar) {
        this.f504794d = eVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "onGetLocation isOk: %b, %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        if (!z17) {
            return true;
        }
        tz2.e eVar = this.f504794d;
        eVar.B = f18;
        eVar.C = f17;
        ((i11.h) eVar.f504814z).m(eVar.A);
        return true;
    }
}
