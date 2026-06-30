package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f239463a;

    public static synchronized com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s1 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s1 s1Var;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s1.class) {
            s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r1.f239444a;
        }
        return s1Var;
    }

    public void a(android.content.Context context) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = context != null ? context.getClass().getSimpleName() : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiDialogMgr", "attach() %s", objArr);
        this.f239463a = new java.lang.ref.WeakReference(context);
    }

    public boolean b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiDialogMgr", "finishRemitF2fDCodeAndLMRemindUI()");
        android.content.Context context = (android.content.Context) this.f239463a.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
            return false;
        }
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceBusiDialogMgr", "check() is RemittanceF2fDynamicCodeUI");
            ((android.app.Activity) context).finish();
            return true;
        }
        if (!(context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceBusiDialogMgr", "check() is RemittanceF2fLargeMoneyUI");
        ((android.app.Activity) context).finish();
        return true;
    }

    public android.content.Context c() {
        android.content.Context context = (android.content.Context) this.f239463a.get();
        if (context != null) {
            return context;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
        return null;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 == null ? "" : str2;
        objArr[2] = str3 == null ? "" : str3;
        objArr[3] = str4 != null ? str4 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceBusiDialogMgr", "showAlert1() msg:%s, title:%s, yes:%s, no:%s", objArr);
        android.content.Context context = (android.content.Context) this.f239463a.get();
        if (context != null) {
            return db5.e1.A(context, str, str2, str3, str4, onClickListener, onClickListener2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
        return null;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f(java.lang.String str, java.lang.String str2, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 != null ? str2 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceBusiDialogMgr", "showAlert2() msg:%s, title:%s", objArr);
        android.content.Context context = (android.content.Context) this.f239463a.get();
        if (context != null) {
            return db5.e1.G(context, str, str2, z17, onClickListener);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
        return null;
    }

    public boolean g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemittanceBusiDialogMgr", "showSafeProgress()");
        android.content.Context context = (android.content.Context) this.f239463a.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
            return false;
        }
        if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17131x6f022b9b) || !(context instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e)) {
            return false;
        }
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) context).m83138x296ea477();
        return true;
    }
}
