package ho1;

/* loaded from: classes5.dex */
public final class z implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f364392b;

    public z(yz5.l lVar, android.app.Activity activity) {
        this.f364391a = lVar;
        this.f364392b = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.Object obj;
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
                yz5.l lVar = this.f364391a;
                if (e17 == null) {
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("error_path_not_support")));
                    return;
                }
                java.lang.String str = (java.lang.String) e17.f384366d;
                java.lang.String str2 = (java.lang.String) e17.f384367e;
                java.util.Iterator it = ro1.v.f479547a.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) obj).f438833f, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                po1.d dVar = (po1.d) obj;
                if (dVar == null) {
                    this.f364391a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("error_path_not_support")));
                    return;
                }
                java.util.List e07 = r26.n0.e0(str2, new char[]{'/'}, false, 0, 6, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : e07) {
                    if (((java.lang.String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                int indexOf = arrayList.indexOf("ChatBackup");
                if (indexOf != -1 && indexOf != kz5.c0.h(arrayList)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "not allow embedded path, segments=" + arrayList);
                    this.f364391a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("error_path_not_support")));
                    return;
                } else {
                    dVar.d(ro1.v.f479547a.d(str2, new to1.d(data)));
                    android.app.Activity activity = this.f364392b;
                    ((ku5.t0) ku5.t0.f394148d).q(new ho1.y(data, dVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activity, ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvy), false, 3, null), this.f364391a));
                    return;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resultCode=");
        sb6.append(i17);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
        this.f364391a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("")));
    }
}
