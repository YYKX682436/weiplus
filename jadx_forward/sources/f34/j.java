package f34;

/* loaded from: classes11.dex */
public class j implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f34.m f340889d;

    public j(f34.m mVar) {
        this.f340889d = mVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return true;
        }
        f34.m mVar = this.f340889d;
        if (mVar.f340903r != -85.0f || mVar.f340904s != -1000.0f) {
            return false;
        }
        mVar.f340903r = f18;
        mVar.f340904s = f17;
        c34.h0.Bi().f340858d = mVar.f340903r;
        c34.h0.Bi().f340859e = mVar.f340904s;
        if (!mVar.f340901p) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService do netscen from onGetLocation()");
        mVar.f();
        return false;
    }
}
