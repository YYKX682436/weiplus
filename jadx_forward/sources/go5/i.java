package go5;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go5.e f355669d;

    public i(go5.e eVar) {
        this.f355669d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = null;
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            j0Var = db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575005kc5), null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), new go5.h(this.f355669d));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoIPMPAudioCapturer", e17, "failed to show alert", new java.lang.Object[0]);
        }
        if (j0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPAudioCapturer", "new dialog failed");
            return;
        }
        j0Var.setCancelable(false);
        j0Var.setCanceledOnTouchOutside(false);
        j0Var.show();
    }
}
