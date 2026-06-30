package xq5;

/* loaded from: classes15.dex */
public final class a implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed f537656d;

    public a(com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed) {
        this.f537656d = c22991x5a0fbed;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        zq5.v vVar = (zq5.v) obj;
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed = this.f537656d;
        long j17 = ((zq5.g) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c22991x5a0fbed.m83887xb094d523().f337787o).mo144003x754a37bb()).f556600a;
        android.graphics.Matrix matrix = c22991x5a0fbed.f296433n;
        dr5.c.a(matrix, vVar, j17, false, 4, null);
        super/*android.widget.ImageView*/.setImageMatrix(matrix);
        fr5.q qVar = c22991x5a0fbed.f296435p;
        if (qVar != null) {
            qVar.f347548f.setAlpha(qVar.f347546d);
            fr5.j jVar = qVar.f347550h;
            jVar.a();
            if (!jVar.f347509j) {
                jVar.f347509j = true;
                long j18 = 800;
                jVar.f347508i = java.lang.System.currentTimeMillis() + j18;
                jVar.f347500a.postDelayed(jVar.f347507h, j18);
            }
        }
        return jz5.f0.f384359a;
    }
}
