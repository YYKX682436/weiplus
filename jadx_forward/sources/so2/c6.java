package so2;

/* loaded from: classes2.dex */
public final class c6 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f491834a;

    public c6(so2.m6 m6Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f491834a = qVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f491834a;
        if (bitmap != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new android.graphics.drawable.BitmapDrawable(bitmap)));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncGetImageModel", "getImage resource :" + bitmap);
    }
}
