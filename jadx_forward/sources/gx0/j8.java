package gx0;

/* loaded from: classes5.dex */
public final class j8 implements com.p314xaae8f345.p457x3304c6.p479x4179489f.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f358108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358109b;

    public j8(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, gx0.w8 w8Var) {
        this.f358108a = f0Var;
        this.f358109b = w8Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.m
    public final void a(int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f358108a;
        int i18 = f0Var.f391649d;
        gx0.w8 w8Var = this.f358109b;
        if (i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MovieComp.MainComposingUIC", "startExporting: totalFrameCount is " + f0Var.f391649d + ", Failed to calculate progress.");
            hx0.e eVar = w8Var.V;
            eVar.getClass();
            eVar.a(hx0.c.f367141h);
            w8Var.D7(new gx0.v8(w8Var, 100, null));
            return;
        }
        int i19 = (int) ((i17 / i18) * 100);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "startExporting: onProgress progress " + i19);
        hx0.e eVar2 = w8Var.V;
        eVar2.getClass();
        eVar2.a(hx0.c.f367141h);
        w8Var.D7(new gx0.v8(w8Var, i19, null));
    }
}
