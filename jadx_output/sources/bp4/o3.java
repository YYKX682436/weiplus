package bp4;

/* loaded from: classes10.dex */
public final class o3 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f23312f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f23313g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f23314h;

    /* renamed from: i, reason: collision with root package name */
    public int f23315i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(android.widget.ImageView thumbView, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(thumbView, "thumbView");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23312f = thumbView;
        this.f23313g = thumbView.getContext();
        this.f23315i = -1;
    }

    public static void B(bp4.o3 o3Var, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem mediaItem, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        int i19 = i17;
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        o3Var.getClass();
        kotlin.jvm.internal.o.g(mediaItem, "mediaItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.ThumbLoadingPlugin", "showThumbLoading  path:" + mediaItem.f138430e);
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new bp4.n3(o3Var, i19, z18, mediaItem, null), 2, null);
    }

    public final void A(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ThumbLoadingPlugin", "showDialog, fromThumbLoading:" + z17);
        if (z17 && this.f23315i != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ThumbLoadingPlugin", "showDialog state error ignore");
            return;
        }
        android.content.Context context = this.f23313g;
        java.lang.String string = i17 < 0 ? context.getString(com.tencent.mm.R.string.ggc) : context.getString(i17);
        kotlin.jvm.internal.o.d(string);
        this.f23315i = 2;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).runOnUiThread(new bp4.j3(this, string));
    }

    public final void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ThumbLoadingPlugin", "hideLoading");
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new bp4.i3(this, null), 2, null);
    }
}
