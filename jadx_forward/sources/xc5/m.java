package xc5;

/* loaded from: classes10.dex */
public final class m extends lf3.n implements yf3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // yf3.a
    public void n3(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17 = iVar != null ? iVar.b() : null;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MsgHistoryGalleryFavoriteComponent", "addFavorite fail, mediaInfo is not IChatMsgMediaInfo");
            return;
        }
        ad5.e eVar = ad5.e.f84777a;
        android.app.Activity m80379x76847179 = m80379x76847179();
        ad5.t0 t0Var = new ad5.t0(null, 1, null);
        t0Var.f84847a.put(ad5.q0.f84833a, kz5.b0.c(b17));
        eVar.d(m80379x76847179, t0Var);
    }
}
