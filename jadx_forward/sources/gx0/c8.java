package gx0;

/* loaded from: classes5.dex */
public final class c8 implements com.p314xaae8f345.p457x3304c6.p479x4179489f.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f357818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f357819b;

    public c8(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, gx0.w8 w8Var) {
        this.f357818a = f0Var;
        this.f357819b = w8Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.m
    public final void a(int i17) {
        int i18 = (int) ((i17 / this.f357818a.f391649d) * 100);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "startExporting: onProgress progress " + i18);
        gx0.w8 w8Var = this.f357819b;
        hx0.e eVar = w8Var.V;
        eVar.getClass();
        eVar.a(hx0.c.f367141h);
        w8Var.D7(new gx0.v8(w8Var, i18, null));
    }
}
