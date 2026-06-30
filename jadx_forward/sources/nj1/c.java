package nj1;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419344f;

    public c(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.lang.String str) {
        this.f419342d = h0Var;
        this.f419343e = h0Var2;
        this.f419344f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wl1.h hVar = (wl1.h) this.f419342d.f391656d;
        if (hVar != null) {
            hVar.b();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f419343e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l) h0Var.f391656d;
        android.view.ViewParent parent = lVar != null ? lVar.getParent() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "removeWithParams params:" + this.f419344f + " parentView:" + parent);
        if (parent == null || !(parent instanceof android.view.ViewGroup)) {
            return;
        }
        ((android.view.ViewGroup) parent).removeView((android.view.View) h0Var.f391656d);
    }
}
