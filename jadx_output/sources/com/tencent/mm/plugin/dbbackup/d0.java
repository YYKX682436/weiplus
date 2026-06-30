package com.tencent.mm.plugin.dbbackup;

/* loaded from: classes11.dex */
public class d0 implements w11.e1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f96837a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f96838b;

    public d0(android.content.Context context) {
        this.f96838b = context;
    }

    @Override // w11.e1
    public void a(boolean z17) {
        boolean z18;
        android.content.Context context = this.f96838b;
        if (this.f96837a || z17) {
            return;
        }
        try {
            for (android.view.Display display : ((android.hardware.display.DisplayManager) context.getApplicationContext().getSystemService("display")).getDisplays()) {
                if (display.getState() == 2) {
                    z18 = true;
                    break;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreDBBackup", th6, "Fail to fetch status of displays.", new java.lang.Object[0]);
        }
        z18 = false;
        if (z18) {
            return;
        }
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        voipEvent.f54945g.f8415b = 2;
        voipEvent.e();
        if (voipEvent.f54946h.f8501b || iq.b.H()) {
            return;
        }
        this.f96837a = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreDBBackup", "app is background now, i can kill quietly");
        ((bt.b1) k35.p.f303943a).a(context, false);
    }
}
