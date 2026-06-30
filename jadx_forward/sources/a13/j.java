package a13;

/* loaded from: classes14.dex */
public final class j implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.RequestPermissionsResultListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f82086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a13.t f82087e;

    public j(android.app.Activity activity, a13.t tVar) {
        this.f82086d = activity;
        this.f82087e = tVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.RequestPermissionsResultListener
    /* renamed from: onRequestPermissionsResult */
    public final boolean mo266x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        int i18 = 0;
        if (i17 != 19) {
            return false;
        }
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
        android.app.Activity activity = this.f82086d;
        a13.t tVar = this.f82087e;
        int length = permissions.length;
        int i19 = 0;
        while (i18 < length) {
            java.lang.String str = permissions[i18];
            int i27 = i19 + 1;
            if (grantResults[i19] != 0) {
                db5.e1.C(activity, resources.getString(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "android.permission.CAMERA") ? com.p314xaae8f345.mm.R.C30867xcad56011.hh8 : com.p314xaae8f345.mm.R.C30867xcad56011.hhn), resources.getString(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "android.permission.CAMERA") ? com.p314xaae8f345.mm.R.C30867xcad56011.f572307aq2 : com.p314xaae8f345.mm.R.C30867xcad56011.gv_), resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kct), resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, new a13.h(activity), new a13.i(tVar));
                return true;
            }
            if (gq4.v.Bi().f258092b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) gq4.v.Bi().f258092b;
                d0Var.getClass();
                gq4.v.Bi().b(d0Var.f257916p, d0Var.f257921s, false, d0Var.f257923u);
            }
            i18++;
            i19 = i27;
        }
        return true;
    }
}
