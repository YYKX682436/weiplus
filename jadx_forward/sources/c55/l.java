package c55;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a f120275d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a) {
        super(0);
        this.f120275d = activityC19821xb90ad83a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        c55.k kVar;
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19821xb90ad83a activityC19821xb90ad83a = this.f120275d;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = null;
        try {
            java.io.File a17 = p55.b.a((java.io.File) ((jz5.n) activityC19821xb90ad83a.f273720d).mo141623x754a37bb());
            h0Var.f391656d = a17;
            if (a17 != null) {
                fp.r.a(activityC19821xb90ad83a, a17, "wechat-logs.zip", "application/zip");
            }
            activityC19821xb90ad83a.runOnUiThread(new c55.i(activityC19821xb90ad83a, h0Var));
            java.lang.Object obj = h0Var.f391656d;
            if (obj != null && ((java.io.File) obj).exists()) {
                ((java.io.File) h0Var.f391656d).delete();
            }
            kVar = new c55.k(activityC19821xb90ad83a);
        } catch (java.lang.Throwable th6) {
            try {
                activityC19821xb90ad83a.runOnUiThread(new c55.j(activityC19821xb90ad83a, jz5.a.b(th6)));
                java.lang.Object obj2 = h0Var.f391656d;
                if (obj2 != null && ((java.io.File) obj2).exists()) {
                    ((java.io.File) h0Var.f391656d).delete();
                }
                kVar = new c55.k(activityC19821xb90ad83a);
            } catch (java.lang.Throwable th7) {
                java.lang.Object obj3 = h0Var.f391656d;
                if (obj3 != null && ((java.io.File) obj3).exists()) {
                    ((java.io.File) h0Var.f391656d).delete();
                }
                activityC19821xb90ad83a.runOnUiThread(new c55.k(activityC19821xb90ad83a));
                throw th7;
            }
        }
        activityC19821xb90ad83a.runOnUiThread(kVar);
        return jz5.f0.f384359a;
    }
}
