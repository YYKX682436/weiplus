package sc3;

/* loaded from: classes7.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f487993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f487994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f487995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f487996h;

    public j(sc3.k1 k1Var, yz5.l lVar, boolean z17, int i17, int i18) {
        this.f487992d = k1Var;
        this.f487993e = lVar;
        this.f487994f = z17;
        this.f487995g = i17;
        this.f487996h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        yg.b bVar;
        yg.b bVar2;
        sc3.k1 k1Var = this.f487992d;
        boolean z17 = this.f487994f;
        int i17 = this.f487995g;
        int i18 = this.f487996h;
        synchronized (k1Var) {
            bitmap = null;
            if (z17) {
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = k1Var.f488021t;
                if (c4209xd2d3ddad != null && (bVar2 = c4209xd2d3ddad.f130124o) != null) {
                    bitmap = bVar2.a(i17, i18, true);
                }
            } else {
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad2 = k1Var.f488021t;
                if (c4209xd2d3ddad2 != null && (bVar = c4209xd2d3ddad2.f130124o) != null) {
                    bitmap = bVar.a(i17, i18, false);
                }
            }
        }
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f487992d.Q, "hy: can not capture using readPixels!!");
        }
        this.f487993e.mo146xb9724478(bitmap);
    }
}
