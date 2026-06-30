package kd2;

/* loaded from: classes3.dex */
public final class g0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f388280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc f388281b;

    public g0(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc) {
        this.f388280a = imageView;
        this.f388281b = c14146x2a22facc;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        wu5.c cVar;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            android.widget.ImageView imageView = this.f388280a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1467x822d9a5b.C14146x2a22facc c14146x2a22facc = this.f388281b;
            ku5.u0 u0Var = ku5.t0.f394148d;
            kd2.f0 f0Var = new kd2.f0(bitmap, imageView, c14146x2a22facc);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            cVar = t0Var.k(f0Var, 0L);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFeedMiniView", "loadBackgroundImage resource is empty!");
        }
    }
}
