package ao5;

/* loaded from: classes.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ao5.w f12580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f12581e;

    public v(ao5.w wVar, android.content.Intent intent) {
        this.f12580d = wVar;
        this.f12581e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i(this.f12580d.f12583e, "[onNewIntent] videoactivity: forceRebuild");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f12581e);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/voipmp/ILinkVoipVideoActivityProxy$onNewIntent$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/voipmp/ILinkVoipVideoActivityProxy$onNewIntent$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
