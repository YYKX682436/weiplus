package cd1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f122150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cd1.i f122151e;

    public g(cd1.i iVar, android.content.ComponentName componentName) {
        this.f122151e = iVar;
        this.f122150d = componentName;
    }

    @Override // java.lang.Runnable
    public void run() {
        cd1.i iVar = this.f122151e;
        iVar.f122159d = true;
        android.content.Intent intent = new android.content.Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
        intent.putExtra("category", "payment");
        intent.putExtra("component", this.f122150d);
        android.app.Activity activity = iVar.f122162g;
        if (activity != null && intent.resolveActivity(activity.getPackageManager()) != null) {
            nf.g.a(iVar.f122162g).j(intent, new cd1.f(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEActivityMgr", "reuquestSetDefaultNFCApplication can not find activity");
        android.app.Activity activity2 = iVar.f122162g;
        if (activity2 != null) {
            iVar.f(13004, "not set default NFC application", activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573990gp4));
        }
    }
}
