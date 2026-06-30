package nz2;

/* loaded from: classes9.dex */
public class l implements mb.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nz2.m f423096a;

    public l(nz2.m mVar) {
        this.f423096a = mVar;
    }

    public void a(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "on result: %s, %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        nz2.m mVar = this.f423096a;
        nz2.b bVar = mVar.f423097d;
        if (bVar != null) {
            bVar.a(nz2.c.a(mVar.f423098e.f423088c, i17, i18, i19, i27));
        }
    }

    public void b(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "on status: %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }
}
