package rw2;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f482133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f482134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f482135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rw2.j f482136g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, android.graphics.Bitmap bitmap, rw2.j jVar) {
        super(1);
        this.f482133d = j17;
        this.f482134e = g0Var;
        this.f482135f = bitmap;
        this.f482136g = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        rw2.g it = (rw2.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        long j17 = it.f482129a;
        if (j17 == this.f482133d) {
            this.f482134e.f391654d = j17;
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            yz5.p pVar = it.f482130b;
            android.graphics.Bitmap bitmap = this.f482135f;
            pVar.mo149xb9724478(valueOf, bitmap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482136g.f482140c, "callback " + j17 + ", " + bitmap);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
