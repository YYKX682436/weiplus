package rw2;

/* loaded from: classes10.dex */
public final /* synthetic */ class e extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.p {
    public e(java.lang.Object obj) {
        super(2, obj, rw2.j.class, "onFrameGenerated", "onFrameGenerated(Landroid/graphics/Bitmap;J)V", 0);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap p07 = (android.graphics.Bitmap) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        rw2.j jVar = (rw2.j) this.f72685xcfcbe9ef;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f482140c, "onFrameGenerated, " + p07 + ", " + longValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        g0Var.f391654d = -1L;
        synchronized (jVar.f482142e) {
            kz5.h0.B(jVar.f482142e, new rw2.i(longValue, g0Var, p07, jVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f482140c, "get " + jVar.hashCode() + ": " + g0Var.f391654d + (char) 65292 + longValue);
        jVar.f482143f = false;
        jVar.c();
        if (g0Var.f391654d >= 0) {
            rw2.j.f482137j.put(jVar.f482139b + '-' + g0Var.f391654d, p07);
        }
        return jz5.f0.f384359a;
    }
}
