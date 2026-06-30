package te4;

/* loaded from: classes15.dex */
public class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f500130a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51 activityC18453x4c285d51, te4.a aVar) {
        this.f500130a = null;
        this.f500130a = new java.lang.ref.WeakReference(activityC18453x4c285d51);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        int i17 = message.what;
        java.lang.ref.WeakReference weakReference = this.f500130a;
        switch (i17) {
            case 0:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "hy: inform ok");
                re4.d0 d0Var = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51 activityC18453x4c285d51 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51) weakReference.get();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51.f253273q;
                android.os.Bundle Q6 = activityC18453x4c285d51.Q6(d0Var);
                zt5.r rVar = activityC18453x4c285d51.f253280i;
                if (rVar != null) {
                    Q6.putString("authkey_result_json", rVar.f557150e);
                    Q6.putString("authkey_result_json_signature", activityC18453x4c285d51.f253280i.f557152g);
                }
                activityC18453x4c285d51.f253282n.send(-1, Q6);
                activityC18453x4c285d51.O6(d0Var);
                activityC18453x4c285d51.finish();
                return;
            case 1:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "hy: inform cancel");
                re4.d0 d0Var2 = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51 activityC18453x4c285d512 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51) weakReference.get();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51.f253273q;
                activityC18453x4c285d512.getClass();
                d0Var2.f476059a = 90008;
                d0Var2.f476060b = "user cancelled the authentication process";
                activityC18453x4c285d512.f253282n.send(0, activityC18453x4c285d512.Q6(d0Var2));
                activityC18453x4c285d512.O6(d0Var2);
                activityC18453x4c285d512.finish();
                return;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "hy: inform fail");
                re4.d0 d0Var3 = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51 activityC18453x4c285d513 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51) weakReference.get();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51.f253273q;
                activityC18453x4c285d513.P6(d0Var3);
                return;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "hy: request permission");
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                java.lang.String[] stringArray = message.getData().getStringArray("permissions");
                int i18 = message.getData().getInt("request_code");
                if (stringArray == null || stringArray.length <= 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: permission null");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51 activityC18453x4c285d514 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51) weakReference.get();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(stringArray);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC18453x4c285d514, arrayList.toArray(), "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUI$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                activityC18453x4c285d514.requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(activityC18453x4c285d514, "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUI$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                return;
            case 4:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "hy: show progress");
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51 activityC18453x4c285d515 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51) weakReference.get();
                android.app.ProgressDialog progressDialog = activityC18453x4c285d515.f253276e;
                if (progressDialog == null || !progressDialog.isShowing()) {
                    activityC18453x4c285d515.f253276e = android.app.ProgressDialog.show(activityC18453x4c285d515, "", activityC18453x4c285d515.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jid), true, false, null);
                    return;
                }
                return;
            case 5:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "hy: dismiss progress");
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51 activityC18453x4c285d516 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51) weakReference.get();
                android.app.ProgressDialog progressDialog2 = activityC18453x4c285d516.f253276e;
                if (progressDialog2 == null || !progressDialog2.isShowing()) {
                    return;
                }
                activityC18453x4c285d516.f253276e.dismiss();
                return;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "hy: show dialog");
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    return;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18453x4c285d51.f253273q = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) message.obj;
                    return;
                }
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: unidentified msg: %d", java.lang.Integer.valueOf(i17));
                return;
        }
    }
}
