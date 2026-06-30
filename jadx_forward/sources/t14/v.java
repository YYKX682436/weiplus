package t14;

/* loaded from: classes.dex */
public final class v implements j45.k {
    @Override // j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.p314xaae8f345.mm.ui.x7 x7Var) {
        if (intent == null) {
            return false;
        }
        android.content.ComponentName component = intent.getComponent();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.ui.LauncherUI", component != null ? component.getClassName() : null)) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("intercept jump launcherUI called context:");
        sb6.append(context);
        sb6.append(" intent:");
        sb6.append(intent);
        sb6.append(" stack:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountActivityInterceptor", sb6.toString());
        return false;
    }
}
