package ju3;

/* loaded from: classes10.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c f383541d;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c c17027xff3f401c) {
        this.f383541d = c17027xff3f401c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17027xff3f401c c17027xff3f401c = this.f383541d;
        android.content.Context context = c17027xff3f401c.getContext();
        if ((context instanceof android.app.Activity ? (android.app.Activity) context : null) != null) {
            android.content.Context context2 = c17027xff3f401c.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(c17027xff3f401c.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_p), null, (android.app.Activity) context2, null, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "report share");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7138x4892e88b c7138x4892e88b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7138x4892e88b();
        c7138x4892e88b.f144480e = 3L;
        c7138x4892e88b.f144482g = 1L;
        qk.o9 o9Var = c17027xff3f401c.getEditPhotoWrapper().f546893i;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        c7138x4892e88b.f144481f = (((f65.r) b17).g() && c17027xff3f401c.getEditPhotoWrapper().b()) ? 1L : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = c17027xff3f401c.getConfigProvider();
        c7138x4892e88b.p(configProvider != null ? configProvider.W : null);
        c7138x4892e88b.k();
    }
}
