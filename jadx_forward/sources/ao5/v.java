package ao5;

/* loaded from: classes.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ao5.w f94113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f94114e;

    public v(ao5.w wVar, android.content.Intent intent) {
        this.f94113d = wVar;
        this.f94114e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94113d.f94116e, "[onNewIntent] videoactivity: forceRebuild");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f94114e);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/voipmp/ILinkVoipVideoActivityProxy$onNewIntent$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/voipmp/ILinkVoipVideoActivityProxy$onNewIntent$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
