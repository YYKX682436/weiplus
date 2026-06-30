package gx4;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f358986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f358987e;

    public z(int i17, android.os.Bundle bundle) {
        this.f358986d = i17;
        this.f358987e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f358987e;
        int i17 = this.f358986d;
        if (i17 != 1) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f = gx4.t.INSTANCE.f358976d;
                if (c19350xc6738d4f == null) {
                    return;
                }
                c19350xc6738d4f.setVisibility(8);
                return;
            }
            if (i17 == 3) {
                gx4.t.INSTANCE.i();
                return;
            }
            if (i17 == 4) {
                gx4.t.INSTANCE.j();
                return;
            } else {
                if (i17 != 9) {
                    return;
                }
                gx4.t.INSTANCE.n(bundle.getFloat("key_alpha", 1.0f));
                return;
            }
        }
        java.lang.String string = bundle.getString("key_url");
        java.lang.String string2 = bundle.getString("key_bag_icon");
        int i18 = bundle.getInt("key_scene", 0);
        boolean z17 = bundle.getBoolean("key_from_bag", false);
        android.os.Bundle bundle2 = bundle.getBundle("key_extras");
        gx4.t tVar = gx4.t.INSTANCE;
        tVar.getClass();
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            tVar.l(string, i18, string2, bundle2, z17);
            tVar.o(false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewBagMgr", "showBag: no float window permission");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5b);
        gx4.o oVar = new gx4.o(tVar, string, i18, string2, bundle2, z17);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.S6(context, string3, new j35.f0(oVar), true, a17);
    }
}
