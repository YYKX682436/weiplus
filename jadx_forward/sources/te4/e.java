package te4;

/* loaded from: classes15.dex */
public class e extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f500131a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd activityC18454xe38657dd, te4.d dVar) {
        this.f500131a = null;
        this.f500131a = new java.lang.ref.WeakReference(activityC18454xe38657dd);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        int i17 = message.what;
        java.lang.ref.WeakReference weakReference = this.f500131a;
        switch (i17) {
            case 0:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: inform ok");
                re4.d0 d0Var = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd activityC18454xe38657dd = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd) weakReference.get();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd.f253285h;
                activityC18454xe38657dd.setResult(-1, activityC18454xe38657dd.U6(d0Var));
                activityC18454xe38657dd.T6(d0Var);
                activityC18454xe38657dd.finish();
                return;
            case 1:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: inform cancel");
                re4.d0 d0Var2 = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd activityC18454xe38657dd2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd) weakReference.get();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd.f253285h;
                activityC18454xe38657dd2.getClass();
                d0Var2.f476059a = 90008;
                d0Var2.f476060b = "user cancelled the authentication process";
                activityC18454xe38657dd2.setResult(0, activityC18454xe38657dd2.U6(d0Var2));
                activityC18454xe38657dd2.T6(d0Var2);
                activityC18454xe38657dd2.finish();
                return;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: inform fail");
                re4.d0 d0Var3 = (re4.d0) message.obj;
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd activityC18454xe38657dd3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd) weakReference.get();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd.f253285h;
                activityC18454xe38657dd3.setResult(1, activityC18454xe38657dd3.U6(d0Var3));
                activityC18454xe38657dd3.T6(d0Var3);
                activityC18454xe38657dd3.finish();
                return;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: request permission");
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                java.lang.String[] stringArray = message.getData().getStringArray("permissions");
                int i18 = message.getData().getInt("request_code");
                if (stringArray == null || stringArray.length <= 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: permission null");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd activityC18454xe38657dd4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd) weakReference.get();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(stringArray);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityC18454xe38657dd4, arrayList.toArray(), "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUIWC$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                activityC18454xe38657dd4.requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(activityC18454xe38657dd4, "com/tencent/mm/plugin/soter/ui/SoterAuthenticationUIWC$SoterMpAuthenHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                return;
            case 4:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: show progress");
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd activityC18454xe38657dd5 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd) weakReference.get();
                android.app.ProgressDialog progressDialog = activityC18454xe38657dd5.f253288e;
                if (progressDialog == null || !progressDialog.isShowing()) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 b17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4.b(activityC18454xe38657dd5, activityC18454xe38657dd5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jid), false, null);
                    activityC18454xe38657dd5.f253288e = b17;
                    b17.show();
                    return;
                }
                return;
            case 5:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: dismiss progress");
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd activityC18454xe38657dd6 = (com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd) weakReference.get();
                android.app.ProgressDialog progressDialog2 = activityC18454xe38657dd6.f253288e;
                if (progressDialog2 == null || !progressDialog2.isShowing()) {
                    return;
                }
                activityC18454xe38657dd6.f253288e.dismiss();
                return;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUIWC", "hy: show dialog");
                if (weakReference == null || weakReference.get() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    return;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18454xe38657dd.f253285h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) message.obj;
                    return;
                }
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: unidentified msg: %d", java.lang.Integer.valueOf(i17));
                return;
        }
    }
}
