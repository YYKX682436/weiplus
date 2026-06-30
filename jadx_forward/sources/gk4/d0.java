package gk4;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f354074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(gk4.h0 h0Var, yz5.a aVar) {
        super(0);
        this.f354073d = h0Var;
        this.f354074e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk4.h0 h0Var = this.f354073d;
        h0Var.getClass();
        h0Var.f354105q = new is0.c(true, 15L);
        h0Var.f354104p = new os0.e(0, 0, 0, 0, 1, 1, 12, null);
        this.f354073d.f354100l = new com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba();
        this.f354073d.f354100l.c();
        java.lang.String str = this.f354073d.f354089a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finished init and set effectManager, effectManager.nPtr:");
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = this.f354073d.f354101m;
        sb6.append(c22979xbb268bc != null ? java.lang.Long.valueOf(c22979xbb268bc.f296338a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        this.f354073d.E = true;
        gk4.h0 h0Var2 = this.f354073d;
        android.graphics.SurfaceTexture surfaceTexture = h0Var2.f354092d;
        if (surfaceTexture != null) {
            h0Var2.c(surfaceTexture);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new gk4.c0(this.f354074e));
        return jz5.f0.f384359a;
    }
}
