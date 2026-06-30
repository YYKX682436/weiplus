package ho1;

/* loaded from: classes5.dex */
public final class c0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po1.d f364170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f364171c;

    public c0(yz5.l lVar, po1.d dVar, android.app.Activity activity) {
        this.f364169a = lVar;
        this.f364170b = dVar;
        this.f364171c = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamFloatWindowHelper", "Remove float window");
        java.lang.ref.WeakReference weakReference = wo1.l1.f529520b;
        if (weakReference != null && (view = (android.view.View) weakReference.get()) != null) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((android.view.WindowManager) systemService).removeView(view);
            wo1.l1.f529520b = null;
        }
        if (i17 == -1) {
            if (!(intent == null)) {
                android.net.Uri data = intent.getData();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(data);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "Selected uri = " + data);
                jz5.l e17 = to1.g.f502444a.e(data);
                yz5.l lVar = this.f364169a;
                if (e17 == null) {
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("error_path_not_support")));
                    return;
                }
                java.lang.String str = (java.lang.String) e17.f384366d;
                java.lang.String str2 = (java.lang.String) e17.f384367e;
                po1.d a17 = po1.d.a(this.f364170b, null, null, null, null, null, null, null, 127, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                a17.f438833f = str;
                a17.d(str2);
                java.lang.String uri = data.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
                a17.f438834g = uri;
                java.lang.String string = ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) this.f364171c).getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvy);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                ((ku5.t0) ku5.t0.f394148d).q(new ho1.b0(data, a17, this.f364170b, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this.f364171c, string, false, 3, null), this.f364169a));
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resultCode=");
        sb6.append(i17);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
        this.f364169a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("")));
    }
}
