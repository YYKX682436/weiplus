package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f274583e;

    public w4(android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var) {
        this.f274582d = context;
        this.f274583e = f7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3 z3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
        android.content.Context context = this.f274582d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var = this.f274583e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "summerscreenshot setScreenShotCallback context[%s] callback[%s], stack[%s]", context, f7Var, z3Var);
        if (context == null) {
            return;
        }
        try {
            if (f7Var != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f = new java.lang.ref.WeakReference(f7Var);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e == null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z4(context, com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273987b);
                    context.getContentResolver().registerContentObserver(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e);
                    return;
                }
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e != null) {
                context.getContentResolver().unregisterContentObserver(com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273990e = null;
            }
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f;
            if (weakReference != null) {
                weakReference.clear();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a5.f273991f = null;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotUtil", "summerscreenshot fail e:" + th6.getMessage());
        }
    }
}
