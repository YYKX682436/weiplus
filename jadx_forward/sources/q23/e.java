package q23;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final q23.e f441345a = new q23.e();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f441346b;

    static {
        f441346b = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_PHOTO_SELECT_SHOW_INT, 0) == 1;
    }

    public final boolean a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLivePhotoTeaDialogHelper", "checkShowTeachDialog >> " + f441346b);
        if (f441346b) {
            return false;
        }
        f441346b = true;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_PHOTO_SELECT_SHOW_INT, 1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 0);
        z2Var.F = new q23.c(z2Var);
        z2Var.x(1);
        z2Var.y(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.eiv);
        z2Var.C();
        return true;
    }
}
