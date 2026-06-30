package bp4;

/* loaded from: classes10.dex */
public final class o3 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f104845f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f104846g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f104847h;

    /* renamed from: i, reason: collision with root package name */
    public int f104848i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(android.widget.ImageView thumbView, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbView, "thumbView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104845f = thumbView;
        this.f104846g = thumbView.getContext();
        this.f104848i = -1;
    }

    public static void B(bp4.o3 o3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 mediaItem, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        int i19 = i17;
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        o3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItem, "mediaItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbLoadingPlugin", "showThumbLoading  path:" + mediaItem.f219963e);
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new bp4.n3(o3Var, i19, z18, mediaItem, null), 2, null);
    }

    public final void A(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbLoadingPlugin", "showDialog, fromThumbLoading:" + z17);
        if (z17 && this.f104848i != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbLoadingPlugin", "showDialog state error ignore");
            return;
        }
        android.content.Context context = this.f104846g;
        java.lang.String string = i17 < 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc) : context.getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        this.f104848i = 2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).runOnUiThread(new bp4.j3(this, string));
    }

    public final void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbLoadingPlugin", "hideLoading");
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new bp4.i3(this, null), 2, null);
    }
}
