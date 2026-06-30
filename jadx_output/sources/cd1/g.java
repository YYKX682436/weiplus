package cd1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f40617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cd1.i f40618e;

    public g(cd1.i iVar, android.content.ComponentName componentName) {
        this.f40618e = iVar;
        this.f40617d = componentName;
    }

    @Override // java.lang.Runnable
    public void run() {
        cd1.i iVar = this.f40618e;
        iVar.f40626d = true;
        android.content.Intent intent = new android.content.Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
        intent.putExtra("category", "payment");
        intent.putExtra("component", this.f40617d);
        android.app.Activity activity = iVar.f40629g;
        if (activity != null && intent.resolveActivity(activity.getPackageManager()) != null) {
            nf.g.a(iVar.f40629g).j(intent, new cd1.f(this));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.HCEActivityMgr", "reuquestSetDefaultNFCApplication can not find activity");
        android.app.Activity activity2 = iVar.f40629g;
        if (activity2 != null) {
            iVar.f(13004, "not set default NFC application", activity2.getString(com.tencent.mm.R.string.f492457gp4));
        }
    }
}
