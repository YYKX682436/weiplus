package a13;

/* loaded from: classes14.dex */
public final class j implements io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a13.t f554e;

    public j(android.app.Activity activity, a13.t tVar) {
        this.f553d = activity;
        this.f554e = tVar;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        int i18 = 0;
        if (i17 != 19) {
            return false;
        }
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        android.app.Activity activity = this.f553d;
        a13.t tVar = this.f554e;
        int length = permissions.length;
        int i19 = 0;
        while (i18 < length) {
            java.lang.String str = permissions[i18];
            int i27 = i19 + 1;
            if (grantResults[i19] != 0) {
                db5.e1.C(activity, resources.getString(kotlin.jvm.internal.o.b(str, "android.permission.CAMERA") ? com.tencent.mm.R.string.hh8 : com.tencent.mm.R.string.hhn), resources.getString(kotlin.jvm.internal.o.b(str, "android.permission.CAMERA") ? com.tencent.mm.R.string.f490774aq2 : com.tencent.mm.R.string.gv_), resources.getString(com.tencent.mm.R.string.kct), resources.getString(com.tencent.mm.R.string.f490454vi), false, new a13.h(activity), new a13.i(tVar));
                return true;
            }
            if (gq4.v.Bi().f176559b != null) {
                com.tencent.mm.plugin.voip.model.d0 d0Var = (com.tencent.mm.plugin.voip.model.d0) gq4.v.Bi().f176559b;
                d0Var.getClass();
                gq4.v.Bi().b(d0Var.f176383p, d0Var.f176388s, false, d0Var.f176390u);
            }
            i18++;
            i19 = i27;
        }
        return true;
    }
}
