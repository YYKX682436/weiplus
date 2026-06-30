package du3;

/* loaded from: classes10.dex */
public final class a3 implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f325044a;

    public a3(du3.t3 t3Var) {
        this.f325044a = t3Var;
    }

    @Override // qk.y7
    public void a(qk.g6 features) {
        bn5.f m177310x5143ab24;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(features, "features");
        if (features == qk.g6.DOODLE || features == qk.g6.TEXT || features == qk.g6.MOSAIC) {
            du3.t3 t3Var = this.f325044a;
            if (!t3Var.f325266w) {
                ym5.x2 x2Var = t3Var.f325263t;
                if ((x2Var == null || (m177310x5143ab24 = x2Var.m177310x5143ab24()) == null || !m177310x5143ab24.g()) ? false : true) {
                    t3Var.f325266w = true;
                    android.view.ViewGroup viewGroup = t3Var.f325252f;
                    android.content.Context context = viewGroup.getContext();
                    int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var.f293309c = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ode);
                    e4Var.c();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "[onSelectedFeature] features:%s", features.name());
    }

    @Override // qk.y7
    public void b(qk.g6 features, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(features, "features");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "[onSelectedDetailFeature] features:%s index:%s", features.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
    }
}
