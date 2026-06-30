package c55;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.io.File f120250e;

    public a(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a, java.io.File file) {
        this.f120249d = activityC19821xb90ad83a;
        this.f120250e = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a = this.f120249d;
        sb6.append(activityC19821xb90ad83a.getPackageName());
        sb6.append(".external.recovery.provider");
        android.net.Uri m7220x706c42cf = p012xc85e97e9.p075x2eaf9f.p076x38b73479.C1088x835a77ad.m7220x706c42cf(activityC19821xb90ad83a, sb6.toString(), this.f120250e);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.setType("application/zip");
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", m7220x706c42cf);
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, activityC19821xb90ad83a.getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46219x277d8353));
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a2 = this.f120249d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(createChooser);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC19821xb90ad83a2, arrayList.toArray(), "com/tencent/mm/recovery/ui/RecoveryToolsUI$initForwardLogs$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19821xb90ad83a2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC19821xb90ad83a2, "com/tencent/mm/recovery/ui/RecoveryToolsUI$initForwardLogs$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
