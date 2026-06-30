package vy0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final vy0.g f522947a = new vy0.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f522948b = jz5.h.b(vy0.a.f522938d);

    public boolean a(java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        boolean z17 = b().getBoolean(scene.concat("_enabled"), false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasPermissionCheckHelp", "checkPermission for " + scene + ", hasPermission: " + z17);
        return z17;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f522948b).mo141623x754a37bb();
    }

    public void c(java.lang.String scene, android.content.Context context, yz5.l resultOk, yz5.l resultFail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultOk, "resultOk");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultFail, "resultFail");
        d(scene, context, false, com.p314xaae8f345.mm.R.C30864xbddafb2a.c9b, resultOk, resultFail);
    }

    public final void d(java.lang.String str, android.content.Context context, boolean z17, int i17, yz5.l lVar, yz5.l lVar2) {
        android.view.View view;
        if (b().getBoolean(str + "_enabled", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasPermissionCheckHelp", "requestPermission has permission, no need to request for " + str);
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasPermissionCheckHelp", "requestPermission for " + str);
        b().putBoolean(str + "_requested", true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0, true);
        z2Var.m(context.getText(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getText(com.p314xaae8f345.mm.R.C30867xcad56011.hh_));
        android.widget.Button button = z2Var.f293601t;
        if (button != null) {
            com.p314xaae8f345.mm.ui.bk.s0(button.getPaint());
        }
        android.widget.Button button2 = z2Var.f293602u;
        if (button2 != null) {
            com.p314xaae8f345.mm.ui.bk.s0(button2.getPaint());
        }
        z2Var.i(i17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "scene_finder_v2") && (view = z2Var.f293591g) != null) {
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.q9l)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.lnd);
        }
        z2Var.l(new vy0.b(lVar2));
        vy0.d dVar = new vy0.d(lVar2, z2Var);
        vy0.f fVar = new vy0.f(str, lVar, z2Var);
        z2Var.D = dVar;
        z2Var.E = fVar;
        z2Var.C();
    }
}
